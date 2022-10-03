package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.File;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class test_1 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String emailid=getData("Sheet1", 0, 0);
		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Akshay");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(emailid);
//		driver.findElement(By.xpath("//input[contains(@type, 'password')]")).sendKeys("123456");
		driver.findElement(By.xpath("//input[contains(@type, 'password')]")).sendKeys(getData("Sheet1", 1, 0));
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
//		String str=RandomString.make(2);
//		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		File dest=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Project1\\screenshote\\"+str+".png");
//		FileHandler.copy(src, dest);
		
		
//		driver.close();
	}
	public static String getData(String sheetname, int row, int cell) throws IOException {
		File file=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Project1\\TestData\\Excel_sheet.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}

		
}
