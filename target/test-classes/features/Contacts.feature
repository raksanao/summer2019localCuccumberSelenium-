Feature: Contact page

  Scenario: Default page number
    Given a driver logged in
    When user goes to "Customers" "Contacts"
    Then default page number should be 1

  Scenario: Menu options
    Given a driver logged in
    Then user should see the following menu options
  |Fleet|
  |Customers|
  |Activities|
  |System   |

  @wip
  Scenario: Login as given user
    Given the user in login page
    When user  login using following credentials
    |username|user1|
    |password|UserUser123|
    |fname   |ruxa       |
    |lname   |olim       |
Then the user should be able to  login
