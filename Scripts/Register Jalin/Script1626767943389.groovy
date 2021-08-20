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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

Mobile.startApplication('C:\\Users\\IKHWAN\\Downloads\\JalinV0.6_dev.apk', true)

Mobile.tap(findTestObject('Object Repository/android.widget.TextView - Register'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Input your e-mail address'), 'wann@gmail.com', 
    0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText'), '81324567890', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - A1719153020'), 'Alya1719153020', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - A1719153020 (1)'), 'Alya1719153020', 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT (1)'), 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Input your NIK KTP'), '1234567898812122', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter your full name as written on your ID'), 
    'alya rayhan', 0)

Mobile.setText(findTestObject('Object Repository/android.widget.EditText - Enter your address as written on your ID'), 'bla bla bla', 
    0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT (2)'), 0)

Mobile.tap(findTestObject('Object Repository/android.widget.Button - NEXT (3)'), 0)

Mobile.closeApplication()

