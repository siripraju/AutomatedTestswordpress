Feature: Login page
  I want to test login page

  Scenario: Valid  login test
    Given I am on login page
    When I type in 'ragsiri@gmail.com' for user name
    And I click continue button
    And I type in 'HanuMan77Ram!' for password
    And I click login button
    And I click my profile link
    And I enter 'First' as first name
    And I enter 'Last' as last name
    And I enter 'I am a QA engineer' as about me
    And I click on save button
    Then I see success notice
    And I close the browser


