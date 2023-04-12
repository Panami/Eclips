package com.actitime.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.actitime.generic.BaseClass;
import com.actitime.generic.FileLibClass;
import com.actitime.pom.HomePage;
import com.actitime.pom.TaskListPage;


@Listeners(com.actitime.generic.ListenerImplementationClass.class)
public class CustomerModule  extends BaseClass{
	
	@Test
	public void testCreateCustomer() throws EncryptedDocumentException, IOException, InterruptedException {
		Reporter.log("Create Customer",true);
		FileLibClass f=new FileLibClass();
		String customerName = f.getExcelData("CreateCustomer",1, 3);
		String customerDiscription = f.getExcelData("CreateCustomer",1, 4);
		HomePage h=new HomePage(driver);
		h.setTaskTab();
		TaskListPage t=new TaskListPage(driver);
		t.getAddNew().click();
		t.getNewCustomer().click();
		t.getEnterCutomerName().sendKeys(customerName);
		t.getEnterCustomerDescription().sendKeys(customerDiscription);
		t.getSelectCustomerDD().click();
		t.getOurCompany().click();
		t.getCreateCustomer().click();
		Thread.sleep(4000);
		String actualText = t.getActualCustomerCreated().getText();
		Assert.assertEquals(actualText, customerName);
		
		
	}

}
