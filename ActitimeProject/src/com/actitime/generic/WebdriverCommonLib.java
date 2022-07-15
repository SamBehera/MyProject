package com.actitime.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Generic class for WebDriver element
 * @author Saumtitri Behera
 */
public class WebdriverCommonLib {

	/**
	 * generic method for Implicit wait
	 * @param driver
	 */
	public void waitforLoadImplicit(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * 
	 * @param driver
	 * @param title
	 */
	public void waitForPageLoadExplicit(WebDriver driver, String title) {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.titleIs(title));
	}

	/**
	 * Generic method for customer wit
	 * @param element
	 */
	public void custo90merwaitforelementdisplayed(WebElement element) {
		int i=0;
		while(i<100) {
			try {
				element.isDisplayed();
				break;
			}
			catch (Exception e) {
				i++;
			}
		}
	}
	/**
	 * Generic method for select the options form lisbox using index
	 * @param element
	 */
	public void selectValue(WebElement element, int i) {
		Select s=new Select(element);
		s.selectByIndex(i);
	}
	/**
	 * @param element
	 * @param text
	 */
	
	public void selectValue(WebElement element, String text) {
		Select s=new Select(element);
		s.selectByVisibleText(text);
	}
}
