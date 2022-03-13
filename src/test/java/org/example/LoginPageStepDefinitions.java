package org.example;

import ElementsPageObjects.LoginPage;
import ElementsPageObjects.MyProfilePage;
import ElementsPageObjects.ReadPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageStepDefinitions {
    LoginPage loginPage;
    ReadPage readPage;
    MyProfilePage myProfilePage;

    @Given("I am on login page")
    public void i_am_on_login_page() {
        loginPage = new LoginPage();
    }

    @When("I type in {string} for user name")
    public void i_type_in_for_user_name(String string) {
        loginPage.fillusername(string);
    }

    @When("I type in {string} for password")
    public void i_type_in_for_password(String string) {
        loginPage.fillpassword(string);
    }

    @When("I click continue button")
    public void i_click_continue_button() {
        loginPage.clickContinue();
    }

    @When("I click login button")
    public void i_click_login_button() {
        readPage = loginPage.clickLogin();
    }

    @And("I close the browser")
    public void iCloseTheBrowser() {
        loginPage.close();
    }

    @Then("I login unsuccessfully")
    public void iLoginUnsuccessfully() {
    }

    @And("I click my profile link")
    public void iClickMyProfileLink() {
        myProfilePage = readPage.clickMyProfile();
    }

    @And("I enter {string} as first name")
    public void iEnterFirstAsFirstName(String string) {
        myProfilePage.enterFirstName(string);
    }

    @And("I enter {string} as last name")
    public void iEnterLastAsLastName(String string) {
        myProfilePage.enterLastName(string);
    }

    @And("I enter {string} as about me")
    public void iEnterAsAboutMe(String string) {
        myProfilePage.enterAboutMe(string);
    }

    @And("I click on save button")
    public void iClickOnSaveButton() {
        myProfilePage.clickSaveDetailsButton();
    }

    @Then("I see success notice")
    public void iSeeSuccessNotice() {
        Assert.assertTrue(myProfilePage.isSuccess());
    }
}
