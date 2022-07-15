package com.actitime.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.actitime.pom.EnterTImeTrackPage;
import com.actitime.pom.LoginPage;


public class BaseClass {
static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	static WebDriver driver;
	@BeforeTest
	public void OpenBrowser() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void CloseBrowser() {
		driver.close();
	}

	@BeforeMethod
	public void LogIn() throws IOException {
		FileLib f=new FileLib();
		String url=f.GetPropertyData("url");
		String un=f.GetPropertyData("un");
		String pwd=f.GetPropertyData("pwd");
		
		driver.get(url);
		LoginPage lgin=new LoginPage(driver);
		lgin.setLogin(un, pwd);
	}

	@AfterMethod
	public void LogOut() {
		EnterTImeTrackPage tp=new EnterTImeTrackPage(driver);
		tp.setLogout();
	}
}
