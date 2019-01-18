#-------------------------------------------------------------------------------------------------------------
# Author : Saravana Sabareesh V                                                               Reviewer    : Kamal
# Date   : 18-01-2019                                                              						Reviewed On : 18-01-2019
# Last Updated By:
# Last Updated On:
# Feature Name:
# Feature Dexcription
# CR #1 :
#---------------------------------------------------------------------------------------------------------------------
Feature: To resgister a new user , login and then make payment with otp.

  //@tag1
  Scenario: To register a user
    Given User is in Register Page
    When User enters the First Name
    And  User enters the NameID
    And  User enters the Email
    And  User enters the UserName
    And  User enters the Password
    And  User enters the Confirm Password
    Then User clicks on Register button
    And User clicks on click here to login
    
  Scenario: To login a user
  	Given User is in Login Page
  	When User enters username
  	And user enters password
  	And user clicks on Login button
  	Then Validate the username and password
  	And user should be logged in 
  	
  Scenario: To make a payment
  	Given User is in Login Page
  	When User enters username
  	And user enters password
  	And user clicks on Login button
  	And user is redirected to paybill page
  	Then user enters dayofpayment
  	And user enters amount  	
		
  	And user clicks on make payment
  	And user is redirected to otp page
  	And user enters the otp 
  	And user clicks on submit otp
  	And user should see the payment successful page
  	
  	
  	
    