package com.demowebshop.testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demowebshop.automationcore.Base;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.LoginPage;
import com.demowebshop.pages.UserAccountPage;

public class LoginTest extends Base {
	HomePage home;
	LoginPage login;
	UserAccountPage useraccount;
    @Test
	public void verifyLoginPageLoadedOrNot()
	{
		home=new HomePage(driver);
		login=home.clickOnloginMenu();
		boolean result=login.isLoginPageLoaded();
		Assert.assertTrue(result, "Login Page not Loaded");
		
	}
    @Test
    public void verifyValidLogin() {
    	home=new HomePage(driver);
		login=home.clickOnloginMenu();
    	login.enterUsername("tomcat@gmail.com");
    	login.enterPassword("tomtom");
    	useraccount=login.clickOnLoginButton();
    	String actualUserName=useraccount.getUserName();
    	String expectedUserName="tomcat@gmail.com";
    	Assert.assertEquals(actualUserName, expectedUserName,"User name Mismatch");
    	useraccount.clickOnLogOutButton();
    	
    }
   
}
