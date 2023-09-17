@Smoke
  Feature: Verify user login functionality

    Scenario: User is on Home Page
      Given User is on Home Page
      Then I verify URL
      And I verify SignIn button is visible
      And I verify Copyright Text is visible
      When I click on Accept All Cookies Button
      Then I click on Sign in
      And  I click on Accept All Cookies Button
      And I enter invalid Email address "test@gmail.com"
      And I enter invalid Password "xyz"
      And I click on Login Button
      And I verify error message
      Then I clear text from email text box field
      And I click on enter Email Address "samlog_1919@gmail.com"
      And I click on enter Password "Sam1919@"
      Then I click on Login Button
      And I verify URL after login
      And I click on Search field for "2019 campaign Nike Dream Crazy"
      And Select from Dropdown list Cannes Lions Campaigns
      And Select Nike Dream Crazy video
      And I Click on Save
      And I Create new Playlist
      And I enter playlist Name "MyPlaylist"
      And I Click on create button




