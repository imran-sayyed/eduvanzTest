package com.test.practise.suites;

import com.github.jsdevel.testng.selenium.annotations.driverconfig.UserAgent;
import com.github.jsdevel.testng.selenium.annotations.screensizes.LargeDesktop;
import com.github.jsdevel.testng.selenium.annotations.screensizes.Phone;
import com.github.jsdevel.testng.selenium.config.Config;
import com.github.jsdevel.testng.selenium.exceptions.PageInitializationException;
import com.github.jsdevel.testng.selenium.exceptions.PageInstantiationException;
import com.test.practise.pages.HomePage;
import com.test.practise.pages.Utils;

import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class EmiCalculator  {
  String os = System.getProperty("os.name").toLowerCase(); 
	
	@Test
  public void calculateEmi() {
		WebDriver driver = new ChromeDriver();
		
		if(os.contains("mac")) {
			
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
		}
		else
		{
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\chromedriver.exe");
			
		}
		driver.get(Utils.url);
		
		HomePage.emi_calculator.click();
		HomePage.loan_amount_field.sendKeys(String.valueOf(Utils.loan_amount));
		HomePage.rate_of_interest.sendKeys(String.valueOf(Utils.rate_of_interest));
		HomePage.emiTenure.sendKeys(String.valueOf(Utils.tenure));
		HomePage.calculateEmi.click();
		
		String actual =HomePage.loan_amount_field.getText();
		
		Assert.assertEquals(actual, Utils.expected);
		
		
		
  }

  
}