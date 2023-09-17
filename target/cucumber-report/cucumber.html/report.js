$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Homepage.feature");
formatter.feature({
  "line": 2,
  "name": "Verify user login functionality",
  "description": "",
  "id": "verify-user-login-functionality",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "duration": 19089854100,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User is on Home Page",
  "description": "",
  "id": "verify-user-login-functionality;user-is-on-home-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is on Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I verify URL",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I verify SignIn button is visible",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify Copyright Text is visible",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I click on Accept All Cookies Button",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "I click on Sign in",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "I click on Accept All Cookies Button",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "I enter invalid Email address \"test@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I enter invalid Password \"xyz\"",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I verify error message",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I clear text from email text box field",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "I click on enter Email Address \"samlog_1919@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on enter Password \"Sam1919@\"",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I click on Login Button",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "I verify URL after login",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "I click on Search field for \"2019 campaign Nike Dream Crazy\"",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Select from Dropdown list Cannes Lions Campaigns",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "Select Nike Dream Crazy video",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I Click on Save",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I Create new Playlist",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I enter playlist Name \"MyPlaylist\"",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "I Click on create button",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.userIsOnHomePage()"
});
formatter.result({
  "duration": 838724300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iVerifyURL()"
});
formatter.result({
  "duration": 598554300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iVerifySignInButtonIsVisible()"
});
formatter.result({
  "duration": 215409500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iVerifyCopyrightTextIsVisible()"
});
formatter.result({
  "duration": 111743500,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAcceptAllCookiesButton()"
});
formatter.result({
  "duration": 293791600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSignIn()"
});
formatter.result({
  "duration": 6173975300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnAcceptAllCookiesButton()"
});
formatter.result({
  "duration": 480006600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "test@gmail.com",
      "offset": 31
    }
  ],
  "location": "MyStepdefs.iEnterInvalidEmailAddress(String)"
});
formatter.result({
  "duration": 1249832800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "xyz",
      "offset": 26
    }
  ],
  "location": "MyStepdefs.iEnterInvalidPassword(String)"
});
formatter.result({
  "duration": 228368400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 3969830000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iVerifyErrorMessage()"
});
formatter.result({
  "duration": 98047000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClearTextFromEmailTextBoxField()"
});
formatter.result({
  "duration": 205464600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "samlog_1919@gmail.com",
      "offset": 32
    }
  ],
  "location": "MyStepdefs.iClickOnEnterEmailAddress(String)"
});
formatter.result({
  "duration": 197354700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sam1919@",
      "offset": 27
    }
  ],
  "location": "MyStepdefs.iClickOnEnterPassword(String)"
});
formatter.result({
  "duration": 257654400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 9464059800,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iVerifyURLAfterLogin()"
});
formatter.result({
  "duration": 77304800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2019 campaign Nike Dream Crazy",
      "offset": 29
    }
  ],
  "location": "MyStepdefs.iClickOnSearchFieldFor(String)"
});
formatter.result({
  "duration": 551258200,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.selectFromDropdownListCannesLionsCampaigns()"
});
formatter.result({
  "duration": 1717385000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.selectNikeDreamCrazyVideo()"
});
formatter.result({
  "duration": 4383112400,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnSave()"
});
formatter.result({
  "duration": 4132066600,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iCreateNewPlaylist()"
});
formatter.result({
  "duration": 326419500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "MyPlaylist",
      "offset": 23
    }
  ],
  "location": "MyStepdefs.iEnterPlaylistName(String)"
});
formatter.result({
  "duration": 444230000,
  "status": "passed"
});
formatter.match({
  "location": "MyStepdefs.iClickOnCreateButton()"
});
formatter.result({
  "duration": 218657100,
  "status": "passed"
});
formatter.after({
  "duration": 209600,
  "status": "passed"
});
});