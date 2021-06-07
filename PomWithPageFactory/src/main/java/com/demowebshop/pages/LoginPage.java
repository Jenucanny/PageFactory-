package com.demowebshop.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.utilities.PageUtility;

public class LoginPage extends PageUtility {
	WebDriver driver;
	public LoginPage(WebDriver driver) //constructor (driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}@FindBy(xpath="//div[@class='page login-page']")
	WebElement loginPage;
	//WebElement loginPage=driver.findElement(By.xpath("//div[@class='page login-page']"));
	@FindBy(id="Email")
	WebElement userName;
	//WebElement userName=driver.findElement(By.id("Email"));
	@FindBy(id="Password")
	WebElement password;
	//WebElement password=driver.findElement(By.id("Password"));
	@FindBy(xpath="//input[@Value='Log in']")
	WebElement login;
	//WebElement login=driver.findElement(By.xpath("//input[@Value='Log in']"));
	public boolean isLoginPageLoaded()
	{
		waitForElementToBeVisible(driver,loginPage,15);
		return getElementDisplayStatus(loginPage);
	}
	public void enterUsername(String uname)
	{
		enterText(userName,uname);
	}
	public void enterPassword(String pw)
	{
		enterText(password,pw);
	}
	public UserAccountPage clickOnLoginButton()
	{
		clickOnElement(login);
		sleep(200);
		return new UserAccountPage(driver);
		
	}
	
}
