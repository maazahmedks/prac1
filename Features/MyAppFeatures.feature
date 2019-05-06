Feature: Login Action

 @login
 Scenario Outline: Successful Login with InValid Credentials
  Given User is on Home Page
  When User Navigate to LogIn Page "<Email>" "<Password>"
  Then Message displayed not Login Successfully

  Examples:
   | Email    | Password |
   | ja@d.com | click123 |


 Scenario: Successful Login with Valid Credentials
  Given User is on Home Page
  When User Navigate to LogIn Page invalid
  Then Message displayed Login Successfully


