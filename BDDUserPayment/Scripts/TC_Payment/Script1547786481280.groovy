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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:60854/Account/Login')

WebUI.setText(findTestObject('Page_Login - My ASP.NET Application/input_Username_Username'), 'sabareesh')

WebUI.setEncryptedText(findTestObject('Page_Login - My ASP.NET Application/input_Password_Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Page_Login - My ASP.NET Application/input_Password_btn btn-default'))

WebUI.setText(findTestObject('Object Repository/Page_MakePayment - My ASP.NET Appli/Page_MakePayment - My ASP.NET Appli/input_DayOfPayment_DayOfPaymen'), 
    '15/01/2019')

WebUI.setText(findTestObject('Object Repository/Page_MakePayment - My ASP.NET Appli/Page_MakePayment - My ASP.NET Appli/input_Amount_Amount'), 
    '1500')

WebUI.setText(findTestObject('Page_MakePayment - My ASP.NET Appli/input_SwiftCode_SwiftCode'), 
    'FD124')

WebUI.click(findTestObject('Page_MakePayment - My ASP.NET Appli/input_SwiftCode_btn btn-defaul'))

WebUI.setText(findTestObject('Page_EnterOTP - My ASP.NET Applicat/input_OTP_OTP'), '4567')

WebUI.click(findTestObject('Page_EnterOTP - My ASP.NET Applicat/input_OTP_btn btn-default'))

WebUI.closeBrowser()

