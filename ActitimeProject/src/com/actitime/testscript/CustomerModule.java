package com.actitime.testscript;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.FileLib;
import com.actitime.pom.EnterTImeTrackPage;
import com.actitime.pom.TaskListPage;
//@Listeners(com.actitime.generic.ListenersImplementation.class)
public class CustomerModule {

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public WebDriver driver;

	@Test
	public void testCreateCustomer() throws InterruptedException, IOException {
		Reporter.log("CreateCustoemr", true);
		FileLib f=new FileLib();
		String customername = f.GetExcelData("CreateCustomer", 1, 2);
		EnterTImeTrackPage e=new EnterTImeTrackPage(driver);
		e.setTasktab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddnewBtn().click();
		t.getNewCustOption().click();
		t.getCxNenterCusttBx().sendKeys(customername);
		t.getCxDesctBx().sendKeys("Banking project");
		t.getExistingCX().click();
		t.getSelectcompany().click();
		t.getCreateCxBtn().click();
		
		Thread.sleep(5000);
		String actualRes = t.getSearchCx().getText();
		Assert.assertEquals(actualRes, customername);
	}

}
