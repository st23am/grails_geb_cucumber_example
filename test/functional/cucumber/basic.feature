Feature: Basic Feature
  As a developer
  In order to write cucumber features
  I want cucumber to run

  Scenario: Running this scenario
    Given I am running this with:
      |title          | heading       |
      | Book List     |  Books I like |
    When I run it
    Then it should pass
