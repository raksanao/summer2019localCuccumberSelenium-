@nav-menu
Feature: Navigation menu

  Scenario: Fleet-> Vehicle
    Given the user in login page
    And the user enters the sales-manager information
    When  user goes to Fleet  Vehicles
    Then  the url should be https://qa3.vytrack.com/calendar/entity

  Scenario: Marketing-> Campaign
    Given the user in login page
    And the user enters the sales-manager information
    When  user goes to Marketing,Campaign
    Then the url should be https://qa3.vytrack.com/calendar/event

     Scenario: Activity->Calendar,Events
    Given the user in login page
    And the user enters the sales-manager information
    When  user goes to Activity,Calendar
    Then the url should be https://qa3.vytrack.com/calendar/activity