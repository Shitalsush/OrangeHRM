package com.hrm.test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.pages.AdminPage;
import com.hrm.pages.LoginPage;

public class AdminTest {
	
	LoginPage lp;
	AdminPage ap;
	@BeforeMethod
	public void initialization() throws InterruptedException
	{
		ap=new AdminPage();
		lp=new LoginPage();
		lp.initialization();
		lp.loginPage();
	}
	
	@Test
	public void adminSearch() throws InterruptedException {
		ap.adminSearchFunction();
	}
	
	@AfterMethod
	public void closeBrowser()
	{
		lp.tearDown();
	}

}
