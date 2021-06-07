package com.demowebshop.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import com.demowebshop.utilities.PageUtility;

public class RegisterPage extends PageUtility {
	WebDriver driver;
	public RegisterPage(WebDriver driver) //constructor (driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//div[@class='page registration-page']")
	WebElement regPage;
	@FindBys(
	@FindBy(xpath="//div[@class='gender']"))
	List<WebElement> gender;
	@FindBy(id="gender-female")
	WebElement genderButton;
	@FindBy(id="FirstName")
	WebElement firstName;
	@FindBy(id="LastName")
	WebElement lastName;
	@FindBy(id="Email")
	WebElement email;
	@FindBy(id="Password")
	WebElement password;
	@FindBy(id="ConfirmPassword")
	WebElement confirmPassword;
	@FindBy(id="register-button")
	WebElement registerButton;
	
	public void selectGender(String gend) {
		for(int i=0;i<gender.size();i++)
		{
			if(gender.get(i).getText().equals(gend))
			{
				clickOnElement(gender.get(i));
				
			}
			
		}
		
	}
	public void enterFirstName(String fname)
	{
	enterText(firstName,fname);	
	}
	public void enterLastName(String lname)
	{
		
		enterText(lastName,lname);
	}
	public void enterEmail(String emailid)
	{
		
		enterText(email,emailid);
	}
	public void enterPassword(String pass)
	{
		
		enterText(password,pass);
	}
	public void enterconfirmPassword(String cpass)
	{
		
		enterText(confirmPassword,cpass);
	}
	public UserAccountPage clickOnRegisterButton() {
		clickOnElement(registerButton);
		return new UserAccountPage(driver);
	}
	
		
		
	}

