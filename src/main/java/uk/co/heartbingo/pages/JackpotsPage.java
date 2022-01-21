package uk.co.heartbingo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utility.Utility;

public class JackpotsPage extends Utility {

    public JackpotsPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Daily Jackpots')]")
    WebElement jackpotsTxt;

    public void verifyJackpotsTxt(String expMsg){
        verifyThatTextIsDisplayed(jackpotsTxt,expMsg);
    }
}
