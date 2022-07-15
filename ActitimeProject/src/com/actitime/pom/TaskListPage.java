package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TaskListPage {

	@FindBy(xpath = "//div[@class='addNewContainer']")
	private WebElement addnewBtn;
	
	@FindBy(xpath = "//div[@class='item createNewCustomer']")
	private WebElement 	NewCustOption;
	
	@FindBy(xpath = "//input[@class='inputFieldWithPlaceholder newNameField inputNameField']")
	private WebElement cxNenterCusttBx;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement cxDesctBx;
	
	@FindBy(xpath = "//span[@class='customerSelectorPlaceholder selectorWithPlaceholderContainer']")
	private WebElement GetselectCX;

	@FindBy(xpath= "//div[@class='itemRow cpItemRow '][text()='Our company']")
	private WebElement selectcompany;
	
	@FindBy(xpath = "(//div[@class='components_button_label'])[17]")
	private WebElement createCxBtn;
	
	@FindBy(xpath = "(//div[@class='titleEditButtonContainer']/div)[1]")
	private WebElement searchCx;
	
	
	public TaskListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	
	public WebElement getAddnewBtn() {
		return addnewBtn;
	}

	public WebElement getNewCustOption() {
		return NewCustOption;
	}

	public WebElement getCxNenterCusttBx() {
		return cxNenterCusttBx;
	}

	public WebElement getCxDesctBx() {
		return cxDesctBx;
	}

	public WebElement getExistingCX() {
		return GetselectCX;
	}

	public WebElement getSelectcompany() {
		return selectcompany;
	}

	public WebElement getCreateCxBtn() {
		return createCxBtn;
	}

	public WebElement getSearchCx() {
		return searchCx;
	}


	public WebElement getGetselectCX() {
		return GetselectCX;
	}	
	
	
}
