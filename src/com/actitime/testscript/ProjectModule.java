package com.actitime.testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLibClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;

@Listeners(com.actitime.generic.ListenerImplementationClass.class)
public class ProjectModule extends BaseClass{

	@Test
	public void testCreateProject() throws IOException {
		Reporter.log("Create Project", true);
		FileLibClass f=new FileLibClass();
		String projectName = f.getPropertyData("ProjectName");
		String projectDescription = f.getPropertyData("ProjectDescription");
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNew().click();
		t.getNewProject().click();
		t.getEnterProjectName().sendKeys(projectName);
		t.getNewProjectCustomerDropDown().click();
		t.getSelectOurCompany().click();
		t.getAddProjectDiscription().sendKeys(projectDescription);
		t.getCreateProject().click();
		String actualtext = t.getActualProjectCreated().getText();
		Assert.assertEquals(actualtext, projectName);
		
		
	}
	
}
