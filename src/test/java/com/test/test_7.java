package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_7 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://learn.iprep.in/");
		driver.manage().window().maximize();

		WebElement em=driver.findElement(By.xpath("//input[@class='emailInput']"));
		em.sendKeys("abc@pqr");
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		pass.sendKeys("1234");

	}
}
