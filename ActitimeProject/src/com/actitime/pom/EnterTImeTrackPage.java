package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTImeTrackPage {

	@FindBy(id="container_tasks")
	private WebElement task;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	public EnterTImeTrackPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void setTasktab() {
		task.click();
	}
	public void setLogout() {
		logout.click();
	}
	
	public WebElement getTask() {
		return task;
	}


	public WebElement getLogout() {
		return logout;
	}
	public void logout() {
		logout.click();
	}
}
