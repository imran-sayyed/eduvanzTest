package com.test.practise.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	@FindBy(className  = "btn btnLoanCalculator")
	  public static WebElement emi_calculator;

	@FindBy(name = "loanAmount")
public static WebElement loan_amount_field;
	
	@FindBy(name ="roi")
	public static WebElement rate_of_interest;
	
	@FindBy(id = "emiTenure")
	public static WebElement emiTenure;

	@FindBy (className = "btn btnBlueColor")
	public static WebElement calculateEmi;

	@FindBy (className = "textBoxInstallment")
public static WebElement output;

}
