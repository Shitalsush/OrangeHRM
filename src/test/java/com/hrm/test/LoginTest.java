package com.hrm.test;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrm.pages.GetExelData;
import com.hrm.pages.LoginPage;




public class LoginTest {
	
	LoginPage lp;
	GetExelData gd;
	WebDriver driver;
	

	@Test
	public void validateLogin() throws IOException {
		gd=new GetExelData();
		gd.getData();
	}

	@Test
	public void adminSearchTest() throws InterruptedException {
		lp.adminSearch();
	}
	
	@Test
	public void addFuction() throws InterruptedException {
		lp.addFuction();
	}
	
	@Test
	public void addSkillTest() throws InterruptedException {
		lp.addSkill();
		
	}
	
	
	
	@Test
	public void pIMFunctionTest() throws InterruptedException {
		lp.pIMFunction();
	}
	
	@Test
	public void createLoginDetailsTest() throws InterruptedException {
		lp.createLoginDetails();
	}
	
	@Test
	public void validationForm() throws InterruptedException {
		String exptErrorMsg = "Required";
		String actError = lp.validationOfForm();
		Assert.assertEquals(exptErrorMsg, actError);
	}
	
	@Test
	public void verifyCancleBtn() throws InterruptedException {
		String expMsg = "Employee Information";
		String actMsg = lp.verifyCancleBtn();
		System.out.println(actMsg);
		Assert.assertEquals(actMsg, expMsg);;
	}
	
	@Test
	public void verifyPasswordTest() throws InterruptedException {
		lp.verifyPasswordField();
	}
	
	@Test
	public void displayEmpName() throws InterruptedException {
		lp.displayEmpName();
	}
	
	
	@AfterSuite
	public void closeBrowser()
	{
		lp.tearDown();
	}

}
