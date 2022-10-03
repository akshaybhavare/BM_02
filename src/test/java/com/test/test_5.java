package com.test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test_5 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		
		String pwa=driver.getWindowHandle();
		driver.findElement(By.xpath("//a[text()='Click Here']")).click();
		
		Set<String> alladdres=driver.getWindowHandles();
		
		
		Iterator<String> it=alladdres.iterator();
		
		while(it.hasNext()){
		String cwa=	it.next();
		
		if(!pwa.equalsIgnoreCase(cwa)) {
			driver.switchTo().window(cwa);
			driver.findElement(By.xpath("//input [@type='text']")).sendKeys("abc@pqr");
			Thread.sleep(3000);
			driver.close();
		}
		}
		driver.switchTo().window(pwa);
		driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[1]")).click();
		Thread.sleep(3000);
		
	
		
	}

}
