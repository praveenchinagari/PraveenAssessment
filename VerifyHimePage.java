package com.HomeLoans.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.Homeloans.pages.HomePage;

public class VerifyHimePage {

	@Test
	public void verifyHome () {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		HomePage obj= new HomePage(driver);
		obj.fill();
		obj.method();
		driver.quit();
		
	}
	
	
}
