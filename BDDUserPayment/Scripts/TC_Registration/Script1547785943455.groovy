import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:60854/Account/Register')

WebUI.setText(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/input_FirstName_FirstName'), 'Sabare')

WebUI.setText(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/input_NameId_NameId'), 'SAB567HDC')

WebUI.setText(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/input_Email_Email'), 'saba1@gmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/input_Username_Username'), 'Sabaree')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/input_Password_Password'), 
    'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/input_ConfirmPassword_ConfirmP'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/input_ConfirmPassword_btn btn-'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_Register - My ASP.NET Applicat/a_Click here to Login'))

WebUI.delay(5)

WebUI.setText(findTestObject('Page_Login - My ASP.NET Application/input_Username_Username'), 'sabar')

WebUI.setEncryptedText(findTestObject('Page_Login - My ASP.NET Application/input_Password_Password'), 'tzH6RvlfSTg=')

WebUI.delay(5)

WebUI.click(findTestObject('Page_Login - My ASP.NET Application/input_Password_btn btn-default'))



WebUI.setText(findTestObject('Page_MakePayment - My ASP.NET Appli/input_DayOfPayment_DayOfPaymen'), '15/01/2019')

WebUI.setText(findTestObject('Page_MakePayment - My ASP.NET Appli/input_Amount_Amount'), '145')

WebUI.delay(5)

WebUI.click(findTestObject('Page_MakePayment - My ASP.NET Appli/input_Amount_btn btn-default'))



WebUI.setText(findTestObject('Page_EnterOTP - My ASP.NET Applicat/input_OTP_OTP'), '4536')

WebUI.click(findTestObject('Page_EnterOTP - My ASP.NET Applicat/input_OTP_btn btn-default'))

WebUI.delay(5)

WebUI.closeBrowser()

