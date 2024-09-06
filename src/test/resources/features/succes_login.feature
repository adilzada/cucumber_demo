Feature: succes login trendyol
  @succes
  Scenario: login trendyol
    Given go to trendyol site
    And click the login button
    When fill username and password
    When click the submit button
