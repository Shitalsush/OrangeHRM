package com.hrm.test;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.hrm.pages.AdminPage;
import com.hrm.pages.GetDataForAdmin;
import com.hrm.pages.GetExelData;
import com.hrm.pages.LoginPage;

public class AdminTest {
	
	AdminPage ap;
	@Test
	public void adminSearch() throws InterruptedException, IOException {
		ap=new AdminPage();
		ap.adminSearchFunction();
	}

}
