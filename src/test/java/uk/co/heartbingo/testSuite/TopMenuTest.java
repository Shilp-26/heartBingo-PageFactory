package uk.co.heartbingo.testSuite;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import uk.co.heartbingo.customlisteners.CustomListeners;
import uk.co.heartbingo.pages.*;
import uk.co.heartbingo.testBase.TestBase;

@Listeners(CustomListeners.class)
public class TopMenuTest extends TestBase {
    Homepage homepage;
    CasinoPage casinoPage;
    JackpotsPage jackpotsPage;

    @BeforeMethod
    public void initialize() {
        homepage = new Homepage();
        casinoPage = new CasinoPage();
        jackpotsPage = new JackpotsPage();

    }

    @Test
    public void navigateToJackpotsPageSuccessfully() {
        homepage.selectMenu("Jackpots");
        jackpotsPage.verifyJackpotsTxt("Daily Jackpots");
    }


    @Test
    public void navigateToCasinoPageSuccessfully() {
        homepage.selectMenu("Casino");
        casinoPage.verifyCasinoTxt("Game Shows");
    }

}
