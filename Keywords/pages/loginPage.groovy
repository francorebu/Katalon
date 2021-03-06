package pages
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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

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


class loginPage {

	private userName       = findTestObject('Object Repository/loginPage/userName')
	private password       = findTestObject('Object Repository/loginPage/password')
	private loginButton    = findTestObject('Object Repository/loginPage/loginButton')
	private errorMessage   = findTestObject('Object Repository/loginPage/invalidCredentials')
	private forgotPassword = findTestObject('Object Repository/loginPage/forgotPassword')

	public loginPage(){
		WebUI.waitForElementVisible(loginButton, GlobalVariable.shortTimeOut)
	}

	@Keyword
	def loginUser(String userName, String password) {
		enterUserName(userName)
		enterPassword(password)
		clickOnLogin()
	}

	@Keyword
	def getErrorMessage() {
		WebUI.waitForElementVisible(errorMessage, GlobalVariable.shortTimeOut)
		return WebUI.getText(errorMessage)
	}

	@Keyword
	def clickOnForgotPassword() {
		WebUI.waitForElementVisible(forgotPassword, GlobalVariable.shortTimeOut)
		WebUI.click(forgotPassword)
	}

	@Keyword
	def userNameExist() {
		return WebUI.verifyElementVisible(userName)
	}

	def enterUserName(String user) {
		WebUI.setText(userName, user)
	}

	def enterPassword(String pass) {
		WebUI.setText(password, pass)
	}

	def clickOnLogin() {
		WebUI.click(loginButton)
	}
}