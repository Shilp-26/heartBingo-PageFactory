package uk.co.heartbingo.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.customlisteners.CustomListeners;
import uk.co.heartbingo.utility.Utility;

public class LogInPage extends Utility {

    public LogInPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(id = "username")
    WebElement username;

    @CacheLookup
    @FindBy(id = "password")
    WebElement password;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement logInBtn;

    @CacheLookup
    @FindBy(xpath = "//div[@class='login_errorMessageWrapper__2ZcGx']//span")
    WebElement errorMsg;

    @CacheLookup
    @FindBy(xpath = "//iframe[@class='oneauth-iframe']")
    WebElement logIniFrame;


    public void verifyIfErrorMsgIsDisplayed(String expMsg){
        verifyThatTextIsDisplayed(errorMsg,expMsg);
    }
    public void enterUsername(String userName) {
        sendTextToElement(username, userName);
        CustomListeners.test.log(Status.PASS, "Enter Username " + userName);
    }

    public void enterPassword(String passWord) {
        sendTextToElement(password, passWord);
        CustomListeners.test.log(Status.PASS, "Enter Password " + passWord);
    }

    public void clickOnLoginBtn() {
        clickOnElement(logInBtn);
        driver.switchTo().frame(logIniFrame);
        CustomListeners.test.log(Status.PASS, "Clicking on loginButton");
    }
}
