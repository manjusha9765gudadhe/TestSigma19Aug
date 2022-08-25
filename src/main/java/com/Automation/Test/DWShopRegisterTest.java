package com.Automation.Test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.Automation.GenericUtils.DriverUtils;
import com.Automation.Pages.DWShopRegisterPage;
import com.Automation.Pages.LoginPage;

public class DWShopRegisterTest extends BaseTest {
	@Test
	public void verifyRegister()
	{
	DriverUtils.getDriver().get("http://demowebshop.tricentis.com/");
	DriverUtils.getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	DWShopRegisterPage rp= new DWShopRegisterPage();
	rp.GoRegister();
	rp.selectgender(1);
	rp.enterFname("Jade");
	rp.enterLname("West");
	rp.enterEmail("jade@gmail.com");
	rp.enterPassword("J@dewest12");
	rp.enterconfpass("J@dewest12");
	rp.clickRegister();
	
	}
}
