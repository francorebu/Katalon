package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class mainMenuPage {
	
	private admin       = findTestObject('Object Repository/mainMenuPage/admin')
	private pim         = findTestObject('Object Repository/mainMenuPage/pim')
	private leave       = findTestObject('Object Repository/mainMenuPage/leave')
	private time  		= findTestObject('Object Repository/mainMenuPage/time')
	private recruitment = findTestObject('Object Repository/mainMenuPage/recruitment')
	private myInfo      = findTestObject('Object Repository/mainMenuPage/myInfo')
	private performance = findTestObject('Object Repository/mainMenuPage/performance')
	private dashboard   = findTestObject('Object Repository/mainMenuPage/dashboard')
	private directory   = findTestObject('Object Repository/mainMenuPage/directory')
	private maintenance = findTestObject('Object Repository/mainMenuPage/maintenance')
	private buzz        = findTestObject('Object Repository/mainMenuPage/buzz')
	
	@Keyword
	def clickOnAdmin() {
		WebUI.click(admin)
	}
	
	@Keyword
	def clickOnPim() {
		WebUI.click(pim)
	}
	
	@Keyword
	def clickOnLeave() {
		WebUI.click(leave)
	}
	
	@Keyword
	def clickOnTime() {
		WebUI.click(time)
	}
	
	@Keyword
	def clickOnRecruitment() {
		WebUI.click(recruitment)
	}
	
	@Keyword
	def clickOnMyInfo() {
		WebUI.click(myInfo)
	}
	
	@Keyword
	def clickOnPerformance() {
		WebUI.click(performance)
	}
	
	@Keyword
	def clickOnDashboard() {
		WebUI.click(dashboard)
	}
	
	@Keyword
	def clickOnDirectory() {
		WebUI.click(directory)
	}
	
	@Keyword
	def clickOnMaintenance() {
		WebUI.click(maintenance)
	}
	
	@Keyword
	def clickOnBuzz() {
		WebUI.click(buzz)
	}
	
	
}
