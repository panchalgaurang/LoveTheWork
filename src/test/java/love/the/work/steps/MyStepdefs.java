package love.the.work.steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import love.the.work.pages.AssertionVariable;
import love.the.work.pages.HomePage;
import org.testng.Assert;


public class MyStepdefs {
    @Given("^User is on Home Page$")
    public void userIsOnHomePage() {
    }

    @When("^I click on Accept All Cookies Button$")
    public void iClickOnAcceptAllCookiesButton() {
        new HomePage().clickOnAcceptCookie();
    }

    @Then("^I click on Sign in$")
    public void iClickOnSignIn() {
        new HomePage().clickOnsignInButton();
    }

    @And("^I click on enter Email Address \"([^\"]*)\"$")
    public void iClickOnEnterEmailAddress(String email) {
        new HomePage().userName(email);
    }


    @And("^I click on enter Password \"([^\"]*)\"$")
    public void iClickOnEnterPassword(String password) {
        new HomePage().passWord(password);
    }

    @Then("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new HomePage().loginButton();
    }

    @And("^I click on Search field for \"([^\"]*)\"$")
    public void iClickOnSearchFieldFor(String data) {
        new HomePage().searchField(data);
    }

    @And("^Select from Dropdown list Cannes Lions Campaigns$")
    public void selectFromDropdownListCannesLionsCampaigns() {
        new HomePage().cannesLion();
    }

    @And("^Select Nike Dream Crazy video$")
    public void selectNikeDreamCrazyVideo() {
        new HomePage().nikeDreamCrazy();
    }

    @And("^I Click on Save$")
    public void iClickOnSave() {
        new HomePage().saveList();
    }

    @And("^I Create new Playlist$")
    public void iCreateNewPlaylist() {
        new HomePage().createNewPlayList();
    }

    @And("^I enter playlist Name \"([^\"]*)\"$")
    public void iEnterPlaylistName(String playList) {
        new HomePage().playListName(playList);
    }

    @And("^I Click on create button$")
    public void iClickOnCreateButton() {
        new HomePage().createButton();
    }

    @Then("^I verify URL$")
    public void iVerifyURL() {
        String expected = "https://www.lovethework.com/en-GB/";
        Assert.assertEquals(expected, new AssertionVariable().getTitle());
    }

    @And("^I verify SignIn button is visible$")
    public void iVerifySignInButtonIsVisible() {
        Assert.assertEquals("Sign in", new AssertionVariable().signInButtonAssert());
    }

    @And("^I verify Copyright Text is visible$")
    public void iVerifyCopyrightTextIsVisible() {
        String expected = "© Copyright Ascential Events (Europe) Limited";
        Assert.assertEquals(expected, new AssertionVariable().copyRightText());
    }

    @And("^I enter invalid Email address \"([^\"]*)\"$")
    public void iEnterInvalidEmailAddress(String invalidEmail) {
        new HomePage().userName(invalidEmail);
    }


    @And("^I enter invalid Password \"([^\"]*)\"$")
    public void iEnterInvalidPassword(String invalidPassword) {
        new HomePage().passWord(invalidPassword);
    }

    @And("^I verify error message$")
    public void iVerifyErrorMessage() {
        String expected = "The email address or password entered is invalid. Please use the Forgot Password link to reset your password or click Sign Up to create an account.";
        Assert.assertEquals(expected, new AssertionVariable().invalidLoginErrorMessage());
    }

    @Then("^I clear text from email text box field$")
    public void iClearTextFromEmailTextBoxField() {
        new HomePage().clearText();
    }

    @And("^I verify URL after login$")
    public void iVerifyURLAfterLogin() {
        String expected = "https://www.lovethework.com/en-GB/home";
        Assert.assertEquals(expected, new AssertionVariable().getTitle());
    }
}
