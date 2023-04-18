Feature: Login Feature
  Verify if user is able to Login in to the site
@tag1
  Scenario: Login as a authenticated user
    Given user is  on homepage
    When user navigates to Login Page
    And user enters username and Password
   
    Then success message is displayed
   
    @tag2
  Scenario: Home page default login
   Given user is  on homepage
   When user navigates to Login Page
    And User login with username "Navya" and password "tttt"
     Then success message is displayed
   