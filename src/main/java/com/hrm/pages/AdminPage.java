package com.hrm.pages;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdminPage {

	 WebDriver driver;
	 GetExelData gd;
	 WebDriverWait wait1;

	public void adminSearchFunction() throws InterruptedException, IOException {
		String filePath = "C:\\\\Users\\\\pre-loaded\\\\eclipse-workspace\\\\OrangeHRMProject\\\\Test Data.xlsx";
		String sheetName= "data2";
		
		XSSFWorkbook wb = new XSSFWorkbook(filePath);
		XSSFSheet sheet = wb.getSheet(sheetName);
		
		int rCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		
		
		Object[][] data = new Object[rCount][colCount];
		Row ro=sheet.getRow(0);
		Cell cell = ro.getCell(0);
		System.out.println(sheet.getRow(0).getCell(0));
		DataFormatter formatter = new DataFormatter();
		Cell  ad=sheet.getRow(0).getCell(0);
		String strVal = formatter.formatCellValue(ad);
		Cell  pwd=sheet.getRow(0).getCell(1);
		String strVal1 = formatter.formatCellValue(pwd);
		
		ChromeOptions options=new ChromeOptions();    
		options.addArguments("--remote-allow-origins=*");    
		//Launching the browser
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		gd=new GetExelData();
		gd.getData();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index");
		Thread.sleep(2000);
		WebElement a= driver.findElement(By.xpath("//span[text()='Admin']"));
		a.click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement userName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input"));
		WebElement uRole = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/div/div"));
		WebElement empName = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/input"));
		WebElement status = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[4]/div/div[2]/div/div"));
		
		
		userName.sendKeys(strVal);

		Actions act = new Actions(driver);
		act.sendKeys(uRole, Keys.ARROW_DOWN.ARROW_DOWN).click().build().perform();
		empName.sendKeys(strVal1);
		act.sendKeys(empName, Keys.ARROW_DOWN).click().build().perform();
		act.sendKeys(status, Keys.ARROW_DOWN.ARROW_DOWN).click().build().perform();
			driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
	

}
