package com.Automation.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;

public class AddUsersmavenPage extends BasePage {
	@FindBy(xpath="//a[@id='menu_admin_viewAdminModule']")
	private WebElement mouseAdmin;
	@FindBy(xpath="//a[@id='menu_admin_UserManagement']")
	private WebElement mouseUserManagement;
	@FindBy(xpath="//a[@id='menu_admin_viewSystemUsers']")
	private WebElement clickUsers;
	@FindBy (xpath="//input[@id='btnAdd']")
	private WebElement clickAdd;
	@FindBy(xpath="//input[@id='systemUser_employeeName_empName']")
	private WebElement empname;
	@FindBy(xpath="//input[@id='systemUser_userName']")
	private WebElement usrname;
	@FindBy(xpath="//input[@name='systemUser[password]']")
	private WebElement password;
	@FindBy(xpath="//input[@name='systemUser[confirmPassword]']")
	private WebElement confpass;
	@FindBy(xpath="//input[@name='btnSave']")
	private WebElement btnSave;
	//Initialization not needed...
	
	//Utilization
	public void Action()
	{
		Actions act= new Actions(driver);
		act.moveToElement(mouseAdmin).perform();
		act.moveToElement(mouseUserManagement).perform();
		clickUsers.click();
	}
	public void clickAdd()
	{
		clickAdd.click();
	}
	public void enterempname(String str)
	{
		empname.sendKeys(str);
	}
	public void enterusrname(String str)
	{
		usrname.sendKeys(str);
	}
	public void enterpass(String str)
	{
		password.sendKeys(str);
	}
	public void enterconfpass(String str)
	{
		confpass.sendKeys(str);
	}
	public void clickSavebtn()
	{
		btnSave.click();
	}
}
