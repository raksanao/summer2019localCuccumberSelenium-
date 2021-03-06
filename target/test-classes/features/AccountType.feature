Feature: Login as different user types

  # WARM UP : implement the following scenarios
  # you can reuse previous step defs classes or create a new one
  # use any tag

  Scenario: Driver user
Given the user logs in as a "driver"
When  user goes to "Activities" "Calendar Events"
Then the title should contain "Calendar Events - Activities"

Scenario: Sales manager user
Given the user logs in as a "sales manager"
When  user goes to "Customers" "Accounts"
Then the title should contain "Accounts - Customers"

Scenario: Store manager user
Given the user logs in as a "store manager"
When user goes to "Customers" "Accounts"
Then the title should contain "Accounts - Customers"
@wip
  Scenario Outline: Test login with different types
    Given the user logs in as "driver"
    Examples:
  |usertype|
  |driver  |
  |sales manager|
  |store manager|
