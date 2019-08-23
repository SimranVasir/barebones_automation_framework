@example
Feature: Example feature
  As an automation architect
  I want to develop automation framework
  So that we can write UI tests in the framework

  @ExampleScenario
  Scenario: example scenario
    Given I am on the "salesforce" login page
    When I fill in username "simran.vasir@sap.com" and password "abcdefgh"
    And I click on the "login" button
    Then I should see the "salesforce" page
    And I should see the Accounts tab


# Scenario Outline: title
#  Given .... <placeholder 1> .....
#  When .... <placeholder 2> ...
#  Then ... <placeholder 3> ...
#
#  Examples:
#    | placeholder 1 | placeholder 2 | placeholder 3 |
#    |  value        |   value       |  value        |
#    |  value        |   value       |  value        |