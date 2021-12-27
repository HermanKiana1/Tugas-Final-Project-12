import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://banksystem-demoshop.herokuapp.com/')

WebUI.click(findTestObject('Object Repository/Register/a_Register'))

WebUI.setText(findTestObject('Object Repository/Register/input_Email_Input.Email'), 'herman.kiana@finansia.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/input_Password_Input.Password'), 'sNWMs0TOWSeT1rC5oZgDbA==')

WebUI.setEncryptedText(findTestObject('Object Repository/Register/input_Confirm password_Input.ConfirmPassword'), 'sNWMs0TOWSeT1rC5oZgDbA==')

WebUI.click(findTestObject('Object Repository/Register/button_Register'))

texterror = WebUI.waitForElementPresent(findTestObject('Register/Text Error'), 5)

if (texterror.equals(true)) {
    WebUI.setText(findTestObject('Object Repository/Register/input_Email_Input.Email'), email)

    WebUI.setEncryptedText(findTestObject('Object Repository/Register/input_Password_Input.Password'), 'sNWMs0TOWSeT1rC5oZgDbA==')

    WebUI.setEncryptedText(findTestObject('Object Repository/Register/input_Confirm password_Input.ConfirmPassword'), 'sNWMs0TOWSeT1rC5oZgDbA==')

    WebUI.click(findTestObject('Object Repository/Register/button_Register'))
}

WebUI.delay(3)

WebUI.closeBrowser()

