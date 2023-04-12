package com.actitime.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.events.WebDriverEventListener;

public class TaskListPage {
	
	

	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addNew;
	
	//New Customer
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement newCustomer;
	
	@FindBy(xpath="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement enterCutomerName;
	
	@FindBy(xpath="//textarea[@placeholder='Enter Customer Description']")
	private WebElement enterCustomerDescription;
	
	@FindBy(xpath="(//div[text()='- Select Customer -'])[1]")
	private WebElement selectCustomerDD;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement ourCompany;
	
	@FindBy(xpath="//div[text()='Create Customer']")
	private WebElement createCustomer;
	
	@FindBy(xpath="//div[@class='titleEditButtonContainer']/div[1]")
	private WebElement actualCustomerCreated;
	
	
	
	
	//New Project
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement newProject;
	
	@FindBy(xpath="(//input[@placeholder='Enter Project Name'])[2]")
	private WebElement enterProjectName;
	
	@FindBy(xpath="(//div[text()='-- New Customer --'])[1]")
	private WebElement newProjectCustomerDropDown;
	
	@FindBy(xpath="//div[text()='Our company' and @class='itemRow cpItemRow ']")
	private WebElement selectOurCompany;
	
	@FindBy(xpath="//textarea[@placeholder='Add Project Description']")
	private WebElement addProjectDiscription;
	
	@FindBy(xpath="//div[text()='Create Project']")
	private WebElement createProject;
	
	@FindBy(xpath="(//div[@class='titleEditButtonContainer'])/div[1]")
	private WebElement actualProjectCreated;
	
	
	
	
	//New Tasks
	@FindBy(xpath="//div[text()='+ New Tasks']")
	private WebElement newTasks;
	
	@FindBy(xpath="//div[@class='customerSelector customerOrProjectSelector selectorWithPlaceholderContainer']/div[1]/div[1]/div[1]")
	private WebElement selectedCustomerNameDropDown;
	
	@FindBy(xpath="//div[@class='itemRow cpItemRow selected' and text()='Our company']")
	private WebElement selectedCustomerName;
	
	@FindBy(xpath="//div[@class='projectSelector customerOrProjectSelector selectorWithPlaceholderContainer']/div[1]/div[1]/div[1]")
	private WebElement selectedProjectNameDropDown;
	
	@FindBy(xpath="//div[@class='selectedItem' and text()='Accounting']")
	private WebElement selectedProjectName;
	
	@FindBy(xpath="(//input[@class='inputFieldWithPlaceholder' and @placeholder='Enter task name'])[4]")
	private WebElement enterTaskName;
	
	@FindBy(xpath="//div[text()='Create Tasks']")
	private WebElement createTasks;
	
	@FindBy(xpath="(//div[@class='titleEditButtonContainer'])/div[1]")
	private WebElement actualTasksCreated;
	
	
	
	
	public TaskListPage(WebDriver drievr) {
		PageFactory.initElements (drievr,this);
	}
	
	public WebElement getAddNew() {
		return addNew;
	}

	public WebElement getNewCustomer() {
		return newCustomer;
	}

	public WebElement getEnterCutomerName() {
		return enterCutomerName;
	}

	public WebElement getEnterCustomerDescription() {
		return enterCustomerDescription;
	}

	public WebElement getSelectCustomerDD() {
		return selectCustomerDD;
	}

	public WebElement getOurCompany() {
		return ourCompany;
	}

	public WebElement getCreateCustomer() {
		return createCustomer;
	}

	public WebElement getActualCustomerCreated() {
		return actualCustomerCreated;
	}
	
	public WebElement getNewProject() {
		return newProject;
	}

	public WebElement getEnterProjectName() {
		return enterProjectName;
	}

	public WebElement getNewProjectCustomerDropDown() {
		return newProjectCustomerDropDown;
	}

	public WebElement getSelectOurCompany() {
		return selectOurCompany;
	}

	public WebElement getAddProjectDiscription() {
		return addProjectDiscription;
	}

	public WebElement getCreateProject() {
		return createProject;
	}

	public WebElement getActualProjectCreated() {
		return actualProjectCreated;
	}

	public WebElement getNewTasks() {
		return newTasks;
	}

	public WebElement getSelectedCustomerNameDropDown() {
		return selectedCustomerNameDropDown;
	}

	public WebElement getSelectedCustomerName() {
		return selectedCustomerName;
	}

	public WebElement getSelectedProjectNameDropDown() {
		return selectedProjectNameDropDown;
	}

	public WebElement getSelectedProjectName() {
		return selectedProjectName;
	}

	public WebElement getEnterTaskName() {
		return enterTaskName;
	}

	public WebElement getCreateTasks() {
		return createTasks;
	}

	public WebElement getActualTasksCreated() {
		return actualTasksCreated;
	}

	
}
