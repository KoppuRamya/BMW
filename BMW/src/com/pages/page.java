package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class page 
{
	WebDriver driver;
	By model=By.xpath("//*[@id=\"the-top-navigation\"]/div/div/div/div[1]/div/div[1]/div[1]/div/div[1]/a");
	By sevenseries=By.xpath("//*[@id=\"the-top-navigation\"]/div/div/div/div[1]/div/div[1]/div[2]/div/div/div/div/div[1]/div/nav/div/div/div[4]/a");
	By image=By.xpath("//*[@id=\"the-top-navigation\"]/div/div/div/div[1]/div/div[1]/div[2]/div/div/div/div/div[2]/div/div[1]/div/div/div[1]/img");
	By techdata=By.xpath("//*[@id=\"content-navigation\"]/div/div/div/div/div/div[4]/nav/div/div[3]/a");
	By speed=By.xpath("//*[@id=\"top-of-content\"]/div/div[3]/div/div/div[2]/section[1]/div[3]/div/div[2]/div/table/tbody/tr[1]/td[2]/div");
	public page(WebDriver driver)
	{
		this.driver=driver;
	}
	public String clicks() throws InterruptedException
	{
		driver.findElement(model).click();
		driver.findElement(sevenseries).click();
		WebElement w=driver.findElement(image);
		Actions act=new Actions(driver);
		act.moveToElement(w).click().build().perform();
		driver.findElement(techdata).click();
		String s=driver.findElement(speed).getText();
		System.out.println("Speed:" +s);
		return s;
		
	}
}
