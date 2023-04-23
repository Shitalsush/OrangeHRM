package com.hrm.pages;

import java.awt.Desktop.Action;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	
	public  WebDriver driver;
	
	public void initialization()
	{
		ChromeOptions options=new ChromeOptions();    
		options.addArguments("--remote-allow-origins=*");    
		driver=new ChromeDriver(options);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();
	}
		public void loginPage() throws InterruptedException {
			driver.findElement(By.name("username")).sendKeys("Admin");
			driver.findElement(By.name("password")).sendKeys("admin123");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();

		}
		public void adminSearch()  {
			initialization();
			try {
				loginPage();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")).click();
     		try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
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
		
		public void addFuction()  {
			initialization();
			try {
				loginPage();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")).click();
     		try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			Actions act = new Actions(driver);
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")).click();
		WebElement uRole =	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[1]/div/div[2]/div/div/div[1]"));
		act.sendKeys(uRole, Keys.ARROW_DOWN.ARROW_DOWN).click().build().perform();
		
		WebElement empName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div/input"));
		empName.sendKeys("Paul ");
		act.sendKeys(empName, Keys.ARROW_DOWN).click().build().perform();
		
		WebElement status = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[3]/div/div[2]/div/div/div[1]"));
		act.sendKeys(status, Keys.ARROW_DOWN.ARROW_DOWN);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[1]/div/div[2]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/div/div[2]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		}
		
		public void addSkill()  {
			initialization();
			try {
				loginPage();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]")).click();
     		try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			Actions act = new Actions(driver);
		WebElement qualification =	driver.findElement(By.xpath("//span[text()='Qualifications ']"));
		qualification.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		act.sendKeys(qualification, Keys.ARROW_DOWN).click().build().perform();
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys("Java Skill");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys("I have experianced in java");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		}
		
		public void pIMFunction()  {
			initialization();
			try {
				loginPage();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			JavascriptExecutor js = (JavascriptExecutor)driver;
			
			
			js.executeScript("window.scrollBy(0,1000)");
			System.out.println(driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div/div[1]/div/div/div[1]/div[2]/div/div/button[2]/i")).isEnabled());
		}
		
		public void createLoginDetails()  {
			initialization();
			try {
				loginPage();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			JavascriptExecutor js = (JavascriptExecutor)driver;
			driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			js.executeScript("window.scrollBy(0,1000)");
			System.out.println(driver.findElement(By.xpath("//span[@class='oxd-switch-input oxd-switch-input--active --label-right']")).isDisplayed());
		}
		
		public String validationOfForm()  {
			initialization();
			try {
				loginPage();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			JavascriptExecutor js = (JavascriptExecutor)driver;
			driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			js.executeScript("window.scrollBy(0,1000)");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();
		String actError =	driver.findElement(By.xpath("//span[text()='Required']")).getText();
		return actError;
	
		}
		
		public String verifyCancleBtn()  {
			initialization();
			try {
				loginPage();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			JavascriptExecutor js = (JavascriptExecutor)driver;
			driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			js.executeScript("window.scrollBy(0,1000)");
			driver.findElement(By.xpath("//button[text()=' Cancel ']")).click();
		String actMsg =	driver.findElement(By.xpath("//h5[text()='Employee Information']")).getText();
			return actMsg;
		}
		
		public void verifyPasswordField()  {
			initialization();
			try {
				loginPage();
			} catch (InterruptedException e) {
			
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			JavascriptExecutor js = (JavascriptExecutor)driver;
			driver.findElement(By.xpath("//a[text()='Add Employee']")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			js.executeScript("window.scrollBy(0,1000)");
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[2]/div/label/span")).click();
		WebElement pwd =	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[1]/div/div[2]/input"));
		WebElement confirmpwd =	driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[4]/div/div[2]/div/div[2]/input"));
		
		pwd.sendKeys("abc123");
		confirmpwd.sendKeys("abc123");
		String pwd1= pwd.getText();
		String cpwd = confirmpwd.getText();
		if(pwd1.equalsIgnoreCase(cpwd)) {
			System.out.println("password and confirm password is matching");
		}
		
		
		}
		
		public void displayEmpName()  {
			initialization();
			try {
				loginPage();
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//span[text()='Leave']")).click();
			
		WebElement empName =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/div/div[1]/div/div[2]/div/div/input"));
		empName.sendKeys("P");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		Actions act = new Actions(driver);
		act.sendKeys(empName, Keys.ARROW_DOWN.ENTER).build().perform();
		
		
		}
		
		public void assignLeave()  {
			WebElement empName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div/div/div[2]/div/div/input"));
			empName.sendKeys("P");
			Actions act = new Actions(driver);
			act.sendKeys(empName, Keys.ARROW_DOWN.ENTER).build().perform();
			
			driver.findElement(By.xpath("//div[text()='US - Personal']")).click();
			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/div/div[1]/div/div[2]/div/div/i")).click();
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
	
		}
		
		public void tearDown()
		{
			driver.quit();
		}
}

