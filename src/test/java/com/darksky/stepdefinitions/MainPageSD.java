package com.darksky.stepdefinitions;
import com.darksky.pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class MainPageSD {
    private final MainPage mainPage = new MainPage();

    @Given("^user at main page$")
    public void User_at_main_page(){
        Assert.assertTrue(mainPage.verifyTitle().contains("Dark Sky "));
    }

    @When("^user enters location$")
    public void enterLocation() throws InterruptedException {
        mainPage.enterLocationText("24 Union Blvd, Wallington, NJ");
        mainPage.clickSearchBtn();
    }
    @And ("^user find minimum temperature and verify it's value$")
    public void verifyMinTemperatures(){
        Assert.assertEquals(mainPage.lowTemp1String(), mainPage.lowTemp2String());
        System.out.println("Lowest temperatures are the same");
    }
    @Then("^user find maximum temperature and verify it's value$")
    public void verifyMaxTemperatures(){
        Assert.assertEquals(mainPage.maxTemp1String(), mainPage.maxTemp2String());
        System.out.println("Max temperatures are the same");
    }

}