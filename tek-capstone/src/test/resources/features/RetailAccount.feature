Feature: Retail Account

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'testuser@test.us' and password 'Tek@12345'
    And User click on login button
    And User should be logged into Account

	@updateProfile
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Dragons' and Phone '202-101-9900'
    And User click on Update button
    Then user profile information should be updated
