package org.action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreensCartTask1 {
	
	public static void main(String[] args) throws InterruptedException {
    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Mohammed Rafiullah\\\\eclipse-workspace\\\\Selenium Project\\\\driver\\\\chromedriver.exe");
    
    WebDriver driver = new ChromeDriver();
    driver.get("http://greenscart.in/");
    driver.manage().window().maximize();
    Thread.sleep(3000);
   
    
    WebElement username = driver.findElement(By.xpath("//input[@id='loginEmailId']"));
    username.sendKeys("mohammedrafiullah16@gmail.com");
    Thread.sleep(3000);
    
   WebElement Pass = driver.findElement(By.xpath("//input[@id='loginPassword']"));
    Pass.sendKeys("Symphony@16");
    Thread.sleep(3000);
    
    WebElement login = driver.findElement(By.xpath("//input[@class='btnRegister form-control']"));
    Pass.click();
    
    System.out.println("dvbnsm");
    
    System.out.println("ghjk");
    System.out.println("jdjhdjdj");
    
    
    
    
    
    
    
    
    
    
    
    
    
		
		
	}

}
