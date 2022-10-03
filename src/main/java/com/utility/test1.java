package com.utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test1 {
	public static WebDriver driver; 
	
	
	@Parameters({"Browsername"})
	@BeforeMethod
	public void BM(String Browsername) {
		if(Browsername.equalsIgnoreCase("chrome")) {
		
		WebDriverManager.chromedriver().setup();
	    driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		}else if(Browsername.equalsIgnoreCase("edge")) {
			
			WebDriverManager.chromedriver().setup();
		    driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			
			}
		
		driver.manage().window().maximize();
		
	}
	@AfterMethod
	public void AM() {
		driver.close();
		
	}
	@Test
	void test01() {
		
		System.out.println("test pass");
		
		
	}
	

}
