//##DAJ
package co.com.choucair.certification.retotecnico.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UtestLoginPage {

    public static final Target LOGIN_BUTTON;

    static {
        LOGIN_BUTTON = Target.the("Button that shows us the form to login")
                .located(By.className("unauthenticated-nav-bar__sign-up"));
    }

    public static final Target INPUT_NAME;

    static {
        INPUT_NAME = Target.the("Where do we write the first name")
                .located(By.id("firstName"));
    }
    public static final Target INPUT_LASTNAME;

    static {
        INPUT_LASTNAME = Target.the("Where do we write the last name")
                .located(By.id("lastName"));
    }

    public static final Target INPUT_EMAIL;

    static {
        INPUT_EMAIL = Target.the("Where do we write the email")
                .located(By.id("email"));
    }

    public static final Target SELECT_MONTH;

    static {
        SELECT_MONTH = Target.the("Where do we select the month of the birth")
                .located(By.xpath("//*[@id=\"birthMonth\"]/option[13]"));
    }

    public static final Target SELECT_DAY;

    static {
        SELECT_DAY = Target.the("Where do we select the day of the birth")
                .located(By.xpath("//*[@id=\"birthDay\"]/option[14]"));
    }

    public static final Target SELECT_YEAR;

    static {
        SELECT_YEAR = Target.the("Where do we select the year of the birth")
                .located(By.xpath("//*[@id=\"birthYear\"]/option[10]"));
    }

    public static final Target BUTTON_NEXT;

    static {
        BUTTON_NEXT = Target.the("Click to continue to next page")
                .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));
    }

    //--------------------------------- NEXT PAGE - ADDRESS -------------------------------------------------

    public static final Target INPUT_CITY;

    static {
        INPUT_CITY = Target.the("Where do we write the email")
                .located(By.id("city"));
    }

    public static final Target INPUT_ZIP;

    static {
        INPUT_ZIP = Target.the("Where do we write the email")
                .located(By.id("zip"));
    }

    public static final Target BUTTON_NEXT_2;

    static {
        BUTTON_NEXT_2 = Target.the("Click to continue to next page")
                .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));
    }

    //-------------------------------------- NEXT PAGE - DEVICES ---------------------------------------------

    public static final Target BUTTON_NEXT_3;

    static {
        BUTTON_NEXT_3 = Target.the("Click to continue to next page")
                .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/div[2]/div/a"));
    }

    //------------------------------------------ LAST PAGE ------------------------------------------

    public static final Target INPUT_PASSWORD;

    static {
        INPUT_PASSWORD = Target.the("Where do we write the password")
                .located(By.id("password"));
    }

    public static final Target INPUT_PASSWORD_CONFIRM;

    static {
        INPUT_PASSWORD_CONFIRM = Target.the("Where do we write the password confirm")
                .located(By.id("confirmPassword"));
    }

    public static final Target SELECT_CHECK_TERMS;

    static {
        SELECT_CHECK_TERMS = Target.the("Click to select Terms of use check")
                .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    }

    public static final Target SELECT_CHECK_PRIV;

    static {
        SELECT_CHECK_PRIV = Target.the("Click to select Privacity & Security Policy check")
                .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    }

    public static final Target BUTTON_COMPLETE;

    static {
        BUTTON_COMPLETE = Target.the("Button that completed the form to login")
                .located(By.xpath("//*[@id=\"laddaBtn\"]"));
    }

    //------------------------------------------ REGISTER COMPLETED -----------------------------------------

    public static final Target REGISTER_COMPLETED;

    static {
        REGISTER_COMPLETED = Target.the("Extracts the welcome text")
                .located(By.xpath("//*[@id=\"mainContent\"]/div/div/div[1]/div/h1"));
    }
}
