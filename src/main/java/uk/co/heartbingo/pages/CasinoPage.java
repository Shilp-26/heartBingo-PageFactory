package uk.co.heartbingo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utility.Utility;

public class CasinoPage extends Utility {

    public CasinoPage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Game Shows')]")
    WebElement casinoTxt;

    public void verifyCasinoTxt(String expMsg){
        verifyThatTextIsDisplayed(casinoTxt,expMsg);
    }
}
