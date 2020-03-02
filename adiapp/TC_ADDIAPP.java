package scripts;

import pom.adiapp.*;
  
import java.io.IOException;
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
import java.util.concurrent.TimeUnit;
import org.apache.commons.exec.ExecuteException;  

public class TC_ADDIAPP
{
	ProlificsSeleniumAPI oPSelFW =null;
	String effectaBaseServiceURl="http://localhost:64643/ExecutionService.svc/";
	String effectWebserviceData=effectaBaseServiceURl+"GetComponentDataForSelenium/2051/TC_5934/";
	String sKEY_MapParameters="@sDOAMainclassParmas,2051,TC_5934,1646,1,7565, 1,0";
	String strEffectaOutKeyDataService = effectaBaseServiceURl + "GetExportKeyValue/2051/TC_5934/7565/";

@Parameters({ "prjName", "testEnvironment","instanceName","sauceUser","moduleName","testSetName"}) 	
	
	@BeforeClass
	
	public void oneTimeSetUp(String prjName,String testEnvironment,String instanceName,String sauceUser,String moduleName,String testSetName) throws InterruptedException, IOException
	{
		String[] environment = new ProlificsSeleniumAPI().getEnvironment(testEnvironment,this.getClass().getName());
		String os=environment[0];
		String browser=environment[1];
		String testCasename=this.getClass().getSimpleName(); 
		moduleName=moduleName+effectaBaseServiceURl+sKEY_MapParameters;
		oPSelFW = new ProlificsSeleniumAPI(prjName,testCasename,browser,os,instanceName,sauceUser,moduleName,testSetName);
		
		try {
		oPSelFW.startSelenium("https://pep.prolifics.com/");
		} catch (ExecuteException e) {
                     // TODO Auto-generated catch block
                     e.printStackTrace();
              }

	}
	
	@Test //(dataProvider = "oPSelFW")

	public void testCase() throws Exception
	{
		try
		{

			HashMap<String, String> hm = new HashMap<String, String>();
			hm.put("Prolifics", "VMWare");
			oPSelFW.driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);	
			
			String aEffectaDataSet[]= {"1"} ;

			for(int i=0;i<aEffectaDataSet.length;i++){

			
			EmployeesPEP11  objEmployeesPEP11=  new EmployeesPEP11(oPSelFW); 

			objEmployeesPEP11.EC_ADIAPP_EmployeesPEP11(effectWebserviceData+aEffectaDataSet[i]+"/1",aEffectaDataSet[i],"1", strEffectaOutKeyDataService+aEffectaDataSet[i]+"/1/1/","1,0");

			
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	@AfterClass 

	public void closebrowser()  
	{ 
		oPSelFW.stopSelenium();
	}
}
