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
public class TasksModule extends BaseClass{
	
	@Test
	
	public void testCreateTasks() throws IOException {
		Reporter.log("Create Tasks",true);
		FileLibClass f=new FileLibClass();
		String taskName = f.getPropertyData("TaskName")	;
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNew().click();
		t.getNewTasks().click();
		t.getSelectedCustomerNameDropDown().click();
		t.getSelectedCustomerName().click();
		t.getSelectedProjectNameDropDown().click();
		t.getSelectedProjectName().click();
		t.getEnterTaskName().sendKeys(taskName);
		t.getCreateTasks().click();
		String actualTasknameText = t.getActualTasksCreated().getText();
		Assert.assertEquals(actualTasknameText, taskName);
		
	}

}
