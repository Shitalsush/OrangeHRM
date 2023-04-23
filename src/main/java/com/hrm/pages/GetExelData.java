package com.hrm.pages;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class GetExelData {

	WebDriver driver;
public void getData() throws IOException {
		
		String filePath = "C:\\\\Users\\\\pre-loaded\\\\eclipse-workspace\\\\OrangeHRMProject\\\\Test Data.xlsx";
		String sheetName= "data1";
		
		XSSFWorkbook wb = new XSSFWorkbook(filePath);
		XSSFSheet sheet = wb.getSheet(sheetName);
		
		int rCount = sheet.getPhysicalNumberOfRows();
		int colCount = sheet.getRow(0).getLastCellNum();
		
		System.out.println("Row Count is"+ rCount);
		System.out.println("Col Count is"+colCount);
		
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
		
		driver=new ChromeDriver(options);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		driver.manage().window().maximize();


driver.findElement(By.xpath("//input[@name='username']")).sendKeys(strVal);
driver.findElement(By.name("password")).sendKeys(strVal1);
driver.findElement(By.xpath("//button[text()=' Login ']")).click();

	}


}
