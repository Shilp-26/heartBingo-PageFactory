package uk.co.heartbingo.testSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import uk.co.heartbingo.pages.*;
import uk.co.heartbingo.testBase.TestBase;

public class LoginTest extends TestBase {
    Homepage homepage;
    LogInPage logInPage;

    @BeforeMethod
    public void initialize() {
        homepage = new Homepage();
        logInPage = new LogInPage();
    }

    @Test
    public void verifyUserCannotLoginWithInvalidCredentials() throws InterruptedException {
        //homepage.clickOnAgreeBtn();
        homepage.clickOnLogInTab();
        logInPage.enterUsername(getRandomEmail());
        logInPage.enterPassword("Prime2590");
        logInPage.clickOnLoginBtn();
        logInPage.verifyIfErrorMsgIsDisplayed("The username or password you entered is incorrect. Please try again.");

    }
}