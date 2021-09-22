//##DAJ
package co.com.choucair.certification.retotecnico.stepdefinitions;

import co.com.choucair.certification.retotecnico.model.Data;
import co.com.choucair.certification.retotecnico.questions.Answer;
import co.com.choucair.certification.retotecnico.task.Login;
import co.com.choucair.certification.retotecnico.task.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage (){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Diego wants to create a user on Utest.com$")
    public void diegoWantsToCreateAUserOnUtestCom() {
        OnStage.theActorCalled("Diego").wasAbleTo(OpenUp.thePage());
    }

    @When("^He logs in Join Today to register as user$")
    public void heLogsInJoinTodayToRegisterAsUser(List<Data> datalist) throws Exception  {
        OnStage.theActorInTheSpotlight().attemptsTo(Login.onThePage(
                datalist.get(0).getStrName(),
                datalist.get(0).getStrLastName(),
                datalist.get(0).getStrEmail(),
                datalist.get(0).getStrCity(),
                datalist.get(0).getStrZip(),
                datalist.get(0).getStrPassword(),
                datalist.get(0).getStrPassword2()
                ));
    }

    @Then("^He registers as a new Utest.com user$")
    public void heRegistersAsANewUtestComUser(List<Data> datalist) throws Exception {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(datalist.get(0).getStrWelcome())));
    }
}
