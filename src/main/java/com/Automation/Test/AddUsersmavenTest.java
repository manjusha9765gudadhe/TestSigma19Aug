package com.Automation.Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.GenericUtils.ReaderAddUsers;
import com.Automation.Pages.AddUsersmavenPage;
import com.Automation.Pages.LoginPage;


public class AddUsersmavenTest extends BaseTest{
		
	@Test
	public void VerifyAddUsers()
	{
		DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/");
		DriverUtils.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		LoginPage lp= new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickbtnLogin();
		//WebDriver obj1= DriverUtils.getDriver();
		AddUsersmavenPage addu= new AddUsersmavenPage();
		addu.Action();
		addu.clickAdd();
		addu.enterempname(ReaderAddUsers.getProperty("empname"));
		addu.enterusrname(ReaderAddUsers.getProperty("usrname"));
		addu.enterpass(ReaderAddUsers.getProperty("password"));
		addu.enterconfpass(ReaderAddUsers.getProperty("confpassword"));
	/*	addu.enterempname("Jade");
		addu.enterusrname("Jade");
		addu.enterpass("J@dewest123");
		addu.enterconfpass("J@dewest123");*/
		
		addu.clickSavebtn();
	}
}
