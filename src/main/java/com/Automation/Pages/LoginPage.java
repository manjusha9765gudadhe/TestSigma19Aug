package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

	@FindBy(id="txtUsername")
	private WebElement userInput;
	
	@FindBy(id="txtPassword")
	private WebElement passwordInput;
	
	@FindBy(id="btnLogin")
	private WebElement loginButton;
	
	
	public void enterUsername(String username)
	{
		userInput.sendKeys(username);
		
		
	}
	
	public void enterPassword(String password)
	{
		passwordInput.sendKeys(password);
		
		
	}
	
	
	
	public void clickbtnLogin()
	{
		loginButton.click();
	}
	
}
