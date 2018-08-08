Feature: Validate mandatory fields

  Scenario: Mandatory fields display the correct validation message
    Given the user is on the kalibrate home page
    When the user clicks on careers
    And the user clicks on contact us
    Then the mandatory fields display the correct messages
