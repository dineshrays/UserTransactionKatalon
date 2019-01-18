package common
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable

import MobileBuiltInKeywords as Mobile
import WSBuiltInKeywords as WS
import WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When


class Registration_Login_Payment {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("User is in Register Page")
	def User_is_in_Register_Page() {
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('http://localhost:60854/Account/Register')
		println "User is in Register Page"
	}

	@When("User enters the First Name")
	def User_enters_the_First_Name() {
		
		WebUI.setText(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/input_FirstName_FirstName'), 'Ramanan1')
			println "User entered the first name"
	}
	
	@When("User enters the NameID")
	def User_enters_the_NameID() {
		
		WebUI.setText(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/input_NameId_NameId'), 'GEB567HDC')
		
		println "User entred the NameId"
	}
	
	@When("User enters the Email")
	def User_enters_the_Email() {
		
		WebUI.setText(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/input_Email_Email'), 'ramanan1@gmail.com')
		
		println "User entered the email"
	}
	
	@When("User enters the UserName")
	def User_enters_the_UserName() {
		
		WebUI.setText(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/input_Username_Username'), 'Ramanan1')
		println "User entred the username"
	}
	
	@When("User enters the Password")
	def User_enters_the_Password() {
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/input_Password_Password'),
			'tzH6RvlfSTg=')
			
		println "User entered the password"
	}
	
	@When("User enters the Confirm Password")
	def User_enters_the_Confirm_Password() {
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/input_ConfirmPassword_ConfirmP'),
			'tzH6RvlfSTg=')
		
		println "User entered the confirm password"
	}

	@Then("User clicks on Register button")
	def User_clicks_on_Register_button() {
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/input_ConfirmPassword_btn btn-'))
		
		println "User clicks on the register button"
	}
		
	@Then("User clicks on click here to login")
	def User_clicks_on_click_here_to_login() {
		
		WebUI.delay(5)
		
		WebUI.click(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/a_Click here to Login'))
		
		//WebUI.delay(5)
		println "User clicks on login here button"
		
		WebUI.closeBrowser()
	}
	
	
	// Scenario Login
	
	@Given("User is in Login Page")
	def User_is_in_Login_Page() {
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('http://localhost:60854/Account/Login')
		println "User is in Login Page"
	}

	@When("User enters username")
	def User_enters_username() {
		
		WebUI.setText(findTestObject('Page_Login - My ASP.NET Application/input_Username_Username'), 'Ramanan1')
			println "User entered the username"
	}
	
	@When("user enters password")
	def User_enters_password() {
		
		WebUI.setEncryptedText(findTestObject('Page_Login - My ASP.NET Application/input_Password_Password'), 'tzH6RvlfSTg=')
		WebUI.delay(5)
			println "User entered the password"
	}
	
	@When("user clicks on Login button")
	def user_clicks_on_Login_button() {
		
		WebUI.delay(5)
		WebUI.click(findTestObject('Page_Login - My ASP.NET Application/input_Password_btn btn-default'))
		
			println "User clicks on login button"
	}
	
	@Then("Validate the username and password")
	def Validate_the_username_and_password() {
		
	println "Validate the username and password"
	}
	
	@Then("user should be logged in")
	def user_should_be_logged_in() {
		
	println "user has logged in"
	WebUI.closeBrowser()
	}
	
	///  Scenario Payment
	
	@When("user is redirected to paybill page")
	def user_is_redirected_to_paybill_page() {
		
		//WebUI.click(findTestObject('Page_Login - My ASP.NET Application/input_Password_btn btn-default'))
		//WebUI.delay(5)
			println "User is on paybill page"
	}
	
	@Then("user enters dayofpayment")
	def user_enters_dayofpayment() {
		
		WebUI.setText(findTestObject('Page_MakePayment - My ASP.NET Appli/input_DayOfPayment_DayOfPaymen'), '11/01/2019')
		
		println "user enters dayofpayment"
		
	}
	
	@Then("user enters amount")
	def user_enters_amount() {
		
		WebUI.setText(findTestObject('Page_MakePayment - My ASP.NET Appli/input_Amount_Amount'), '145')

		WebUI.delay(5)
		println "user enters amount"
		
	}
	
	
	@Then("user enters SwiftCode")
	def user_enters_SwiftCode() {

		WebUI.setText(findTestObject('Page_MakePayment - My ASP.NET Appli/input_SwiftCode_SwiftCode'),'FD124')

		WebUI.delay(5)
		println "user enters amount"

	}
	
	@Then("user clicks on make payment")
	def user_clicks_on_make_payment() {
		
		//WebUI.click(findTestObject('Page_MakePayment - My ASP.NET Appli/input_Amount_btn btn-default'))
WebUI.click(findTestObject('Page_MakePayment - My ASP.NET Appli/input_SwiftCode_btn btn-defaul'))

		WebUI.delay(5)
		println "user clicks on make payment"
		
	}
		
	
	@Then("user is redirected to otp page")
	def user_is_redirected_to_otp_page() {		
		
		println "user is redirected to otp page"
		
	}
	
	@Then("user enters the otp")
	def user_enters_the_otp() {
		
		WebUI.setText(findTestObject('Page_EnterOTP - My ASP.NET Applicat/input_OTP_OTP'), '32728')
		WebUI.delay(5)
		println "user enters the otp"
		
	}
	
	@Then("user clicks on submit otp")
	def user_clicks_on_submit_otp() {
		
		WebUI.click(findTestObject('Page_EnterOTP - My ASP.NET Applicat/input_OTP_btn btn-default'))
		WebUI.delay(5)
		println "user clicks on submit otp"
		
	}
	
	@Then("user should see the payment successful page")
	def user_should_see_the_payment_successful_page() {
		WebUI.delay(5)

		WebUI.closeBrowser()
		
		println "user sees the payment successful page"
		
	}
	
	
	
	
}