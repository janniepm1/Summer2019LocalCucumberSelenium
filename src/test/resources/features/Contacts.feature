Feature: Contacts page

  Scenario: Default page number
    Given a driver is logged in
    When the user goes to"Customers" "Contacts"
    Then default page number should be 1


Scenario: Menu options
  Given a driver is logged in
  Then the user should see the following menu options
  |Fleet|
|Customers|
|Activities|
|System    |

@wip
Scenario: login as a given user
  Given the user is on the login page
  When the user logs in using following credentials
  |fname|Mizgin|
  |username|user1|
  |password|UserUser123|
  |lname   |Ayaz       |

  Then the user should be able to login






