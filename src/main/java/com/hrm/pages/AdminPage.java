package com.hrm.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AdminPage {

	 WebDriver driver;
	LoginPage lp;
//	public static void main(String[] args) throws InterruptedException {
//		// TODO Auto-generated method stub
//		  WebDriver driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		driver.manage().window().maximize();
//		driver.findElement(By.name("username")).sendKeys("Admin");
//		driver.findElement(By.name("password")).sendKeys("admin123");
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")).click();
//		Thread.sleep(3000);
//		
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")).sendKeys("Admin");
//
//		Actions act = new Actions(driver);
//
//		
//		WebElement uRole = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div"));
//		act.sendKeys(uRole, Keys.ARROW_DOWN.ARROW_DOWN).click().build().perform();
//		
//		WebElement empName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input"));
//		empName.sendKeys("Paul ");
//		act.sendKeys(empName, Keys.ARROW_DOWN).click().build().perform();
//		
//		WebElement status = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div"));
//		act.sendKeys(status, Keys.ARROW_DOWN.ARROW_DOWN).click().build().perform();
//		
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	}
	
	public void adminSearchFunction() throws InterruptedException {
		 driver = new ChromeDriver();
		 lp=new LoginPage();
		 lp.initialization();
		 lp.loginPage();
//		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")).click();
//		Thread.sleep(3000);
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
		WebElement uRole = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div"));
		WebElement empName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input"));
		WebElement status = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div"));
		
		
		userName.sendKeys("Admin");

		Actions act = new Actions(driver);

		
		
		act.sendKeys(uRole, Keys.ARROW_DOWN.ARROW_DOWN).click().build().perform();
		
		
		empName.sendKeys("Paul ");
		act.sendKeys(empName, Keys.ARROW_DOWN).click().build().perform();
		
		
		act.sendKeys(status, Keys.ARROW_DOWN.ARROW_DOWN).click().build().perform();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}

}
