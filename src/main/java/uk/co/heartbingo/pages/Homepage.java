package uk.co.heartbingo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import uk.co.heartbingo.utility.Utility;

import java.util.List;

public class Homepage extends Utility {

    public Homepage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//div[@class='site-main-nav-wrapper']")
    WebElement topMenuTab;

    @CacheLookup
    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Bingo']")
    WebElement bingoTab;

    @CacheLookup
    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Jackpots']")
    WebElement jackpotsTab;

    @CacheLookup
    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Slots']")
    WebElement slotsTab;

    @CacheLookup
    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Casino']")
    WebElement casinoTab;

    @CacheLookup
    @FindBy(xpath = "//a[@class='site-main-nav__item--link bvs-link'][normalize-space()='Promos']")
    WebElement promosTab;

    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Log In')]")
    WebElement logInTab;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Ok, I Agree')]")
    WebElement agreeBtn;

    public void clickOnAgreeBtn(){
        clickOnElement(agreeBtn);
    }
    public void clickOnLogInTab() throws InterruptedException {
        Thread.sleep(1000);
        clickOnElement(logInTab);

    }

    public void selectMenu(String menu) {
        List<WebElement> topMenuNames = driver.findElements(By.xpath("//div[@class='site-main-nav-wrapper']"));
        for (WebElement names : topMenuNames) {
            if (names.getText().equalsIgnoreCase(menu)) {
                names.click();
                break;
            }
        }

    }

}
