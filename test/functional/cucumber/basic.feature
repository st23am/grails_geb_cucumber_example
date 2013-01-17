Feature: Basic Feature
  As a developer
  In order to write cucumber features
  I want cucumber to run

  Scenario: Running this scenario
    Given I am running this with:
      |something| something else|
      | foo     |  bar          |
    When I run it
    Then it should pass
