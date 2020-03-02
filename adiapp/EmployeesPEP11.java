package pom.adiapp;
import java.util.HashMap;
import java.util.List;
import org.openqa.selenium.By; 
import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.ui.ExpectedConditions; 
import org.openqa.selenium.support.ui.WebDriverWait; 
import com.prolifics.ProlificsSeleniumAPI;
import org.openqa.selenium.Keys; 
import org.testng.annotations.Parameters; 
import org.testng.annotations.BeforeClass; 
import org.testng.annotations.Test; 
import org.testng.annotations.AfterClass; 
import org.openqa.selenium.Alert; 
import org.openqa.selenium.JavascriptExecutor;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


public class EmployeesPEP11
{
	ProlificsSeleniumAPI oPSelFW;
	String currentWindow="";
	String flag="";
	static Properties properties = new Properties();
	
	 static Properties prop = new Properties();
	   

	public  EmployeesPEP11(ProlificsSeleniumAPI oPSelFW)
	{
		this.oPSelFW = oPSelFW;
		currentWindow = oPSelFW.driver.getWindowHandle();
	}

	
	public void  EC_ADIAPP_EmployeesPEP11(String webserviceURL,String sDOADataSetId,String sDOAStepNo, String strEffectaOutKeyDataService,String sEffectaParameters) throws Exception 
	{
		webserviceURL=webserviceURL+"/4809";
		oPSelFW.sDOAStepNumberReport=sDOAStepNo;
		oPSelFW.setEffectaParametersInPOMLevel(sEffectaParameters);

flag=oPSelFW.checkForFrames("id=EmployeeEmailOfficial&&id=EmployeeEmailOfficial&&name=data[Employee][email_official]&&css=#EmployeeEmailOfficial&&xpath=//input[@id='EmployeeEmailOfficial']&&xpath=//form[@id='EmployeeLoginForm']/div[2]/input&&xpath=//div[2]/input", currentWindow); 
oPSelFW.prolifics("clickAndWait",  "id=EmployeeEmailOfficial&&id=EmployeeEmailOfficial&&name=data[Employee][email_official]&&css=#EmployeeEmailOfficial&&xpath=//input[@id='EmployeeEmailOfficial']&&xpath=//form[@id='EmployeeLoginForm']/div[2]/input&&xpath=//div[2]/input", "EmployeeEmailOfficial"); 


	flag=oPSelFW.checkForFrames("id=submitBtn&&id=submitBtn&&css=#submitBtn&&xpath=//button[@id='submitBtn']&&xpath=//form[@id='EmployeeLoginForm']/div[4]/label/div/button&&xpath=//button&&xpath=//button[contains(.,' ')]", currentWindow); 
oPSelFW.prolifics("verifyText","id=submitBtn&&id=submitBtn&&css=#submitBtn&&xpath=//button[@id='submitBtn']&&xpath=//form[@id='EmployeeLoginForm']/div[4]/label/div/button&&xpath=//button&&xpath=//button[contains(.,' ')]" ," "); 


	flag=oPSelFW.checkForFrames("id=submitBtn&&id=submitBtn&&css=#submitBtn&&xpath=//button[@id='submitBtn']&&xpath=//form[@id='EmployeeLoginForm']/div[4]/label/div/button&&xpath=//button&&xpath=//button[contains(.,' ')]", currentWindow); 
oPSelFW.prolifics("clickAndWait",  "id=submitBtn&&id=submitBtn&&css=#submitBtn&&xpath=//button[@id='submitBtn']&&xpath=//form[@id='EmployeeLoginForm']/div[4]/label/div/button&&xpath=//button&&xpath=//button[contains(.,' ')]", "submitBtn"); 


	}


}

