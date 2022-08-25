package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DWShopRegisterPage extends BasePage {
			//Declaration
		@FindBy(xpath="//a[.='Register']")
		private WebElement GoRegister;
		@FindBy(xpath="//input[@id='gender-female']")
		private WebElement female;
		@FindBy(xpath="//input[@id='gender-male']")
		private WebElement male;
		@FindBy(xpath="//input[@id='FirstName']")
		private WebElement Fname;
		@FindBy(xpath="//input[@id='LastName']")
		private WebElement Lname;
		@FindBy(xpath="//input[@id='Email']")
		private WebElement Email;
		@FindBy(xpath="//input[@id='Password']")
		private WebElement Password;
		@FindBy(xpath="//input[@id='ConfirmPassword']")
		private WebElement confpass;
		@FindBy(xpath="//input[@id='register-button']")
		private WebElement ClickbtnRegister;
		
		public void GoRegister()
		{
			GoRegister.click();
		}
		public void selectgender (int a)
		{
			if(a==0)
			{
				male.click();
			}
			if(a==1)
			{
				female.click();
			}
		}
		public void enterFname(String str)
		{
			Fname.sendKeys(str);
		}
		public void enterLname(String str)
		{
			Lname.sendKeys(str);
		}
		public void enterEmail(String str)
		{
			Email.sendKeys(str);
		}
		public void enterPassword(String str)
		{
			Password.sendKeys(str);
		}
		public void enterconfpass(String str)
		{
			confpass.sendKeys(str);
		}
		public void clickRegister()
		{
			ClickbtnRegister.click();
		}
	

}
