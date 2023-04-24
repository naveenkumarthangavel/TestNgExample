package org.code;

import org.helper.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Priority extends BaseClass {
	
	
	
@BeforeClass
private void stBrowser() {
	System.out.println("launch browser");
	launchBrowser(" chrome");
	

}
@BeforeMethod
private void stTime() {
	System.out.println("start time");
	dateAndTime();

}

@Test
private void tc1() {
	System.out.println("tc1");
	launchUrl("https://www.facebook.com/");
	WebElement username=driver.findElement(By.id("email"));
	WebElement password=driver.findElement(By.id("pass"));
	WebElement loginBtn=driver.findElement(By.name("login"));
	fillvalue(username,"naveen");
	fillvalue(password,"naveen@12569");
	loginBtn.click();
	

	
	

}
@AfterMethod
private void endTime() {
	System.out.println("end time");
	dateAndTime();

}

@AfterClass
private void endBrowser() {
	System.out.println("quit browser");
	closeBrowser();

}

}
