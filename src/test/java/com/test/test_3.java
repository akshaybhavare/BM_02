package com.test;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		WebElement list= driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));		
		WebElement listdest=driver.findElement(By.xpath("(//li[@class='placeholder'])[3]"));
//		
		Actions act=new Actions(driver);
		act.dragAndDrop(list, listdest).perform();
		
		WebElement amount=driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]"));
		act.moveToElement(amount).click().build().perform();
		
		
//		driver.close();
		
		

	}

}
