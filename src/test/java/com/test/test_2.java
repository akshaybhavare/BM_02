package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		
		WebElement drodoawn=driver.findElement(By.xpath("//select[@id='dropdown-class-example']"));
		Select s=new Select(drodoawn);
//		s.selectByIndex(1);
//		s.selectByValue("option3");
//		s.selectByVisibleText("Option2");
		System.out.println(s.getFirstSelectedOption().getText());  //Select
//		WebElement option=s.getFirstSelectedOption();
//		System.out.println(option.getText());
		
		
		System.out.println(s.getOptions().size());         //4
		
		driver.close();
		
	}

}
