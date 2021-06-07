package com.demowebshop.testscript;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.demowebshop.automationcore.Base;
import com.demowebshop.pages.HomePage;
import com.demowebshop.pages.LoginPage;
import com.demowebshop.pages.RegisterPage;
import com.demowebshop.pages.UserAccountPage;

public class RegisterTest extends Base{
HomePage home;
LoginPage login;
RegisterPage register;
UserAccountPage useraccount;
@Test
public void verifyRegister()
{
	home=new HomePage(driver);
	register=home.clickOnRegister();
	register.selectGender("Female");
	register.enterFirstName("Dro");
	register.enterLastName("go");
	register.enterEmail("drogo@gmail.com");
	register.enterPassword("123456");
	register.enterconfirmPassword("123456");
	
	useraccount=register.clickOnRegisterButton();
	String actualResult=useraccount.getUserName();
	String expectedResult="drogo@gmail.com";
	Assert.assertEquals(actualResult, expectedResult,"Not registered Successfully");
	
}
}
