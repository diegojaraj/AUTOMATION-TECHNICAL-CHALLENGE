//##DAJ
package co.com.choucair.certification.retotecnico.task;

import co.com.choucair.certification.retotecnico.userinterface.UtestLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;

public class Login implements Task {

    private String strName;
    private String strLastName;
    private String strEmail;
    private String strCity;
    private String strZip;
    private String strPassword;
    private String strPassword2;

    public Login (String strName, String strLastName, String strEmail, String strCity, String strZip, String strPassword, String strPassword2 ) {

        this.strName = strName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
        this.strCity = strCity;
        this.strZip = strZip;
        this.strPassword = strPassword;
        this.strPassword2 = strPassword2;

    }

    public static Login onThePage(String strName, String strLastName, String strEmail, String strCity, String strZip, String strPassword, String strPassword2){
        return Tasks.instrumented(Login.class, strName , strLastName, strEmail, strCity, strZip, strPassword, strPassword2);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(UtestLoginPage.LOGIN_BUTTON),
                Enter.theValue(strName).into(UtestLoginPage.INPUT_NAME),
                Enter.theValue(strLastName).into(UtestLoginPage.INPUT_LASTNAME),
                Enter.theValue(strEmail).into(UtestLoginPage.INPUT_EMAIL),
                Click.on(UtestLoginPage.SELECT_MONTH),
                Click.on(UtestLoginPage.SELECT_DAY),
                Click.on(UtestLoginPage.SELECT_YEAR),
                Click.on(UtestLoginPage.BUTTON_NEXT),

                Enter.theValue(strCity).into(UtestLoginPage.INPUT_CITY),
                Hit.the(Keys.ARROW_DOWN).into(UtestLoginPage.INPUT_CITY),
                Hit.the(Keys.ENTER).into(UtestLoginPage.INPUT_CITY),
                Enter.theValue(strZip).into(UtestLoginPage.INPUT_ZIP),
                Click.on(UtestLoginPage.BUTTON_NEXT_2),

                Click.on(UtestLoginPage.BUTTON_NEXT_3),

                Enter.theValue(strPassword).into(UtestLoginPage.INPUT_PASSWORD),
                Enter.theValue(strPassword2).into(UtestLoginPage.INPUT_PASSWORD_CONFIRM),

                Click.on(UtestLoginPage.SELECT_CHECK_TERMS),
                Click.on(UtestLoginPage.SELECT_CHECK_PRIV),
                Click.on(UtestLoginPage.BUTTON_COMPLETE)
        );
    }
}