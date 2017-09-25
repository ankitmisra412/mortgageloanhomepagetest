package com.test.cucumber.selenium.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.thoughtworks.selenium.Wait;

import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.And;
import junit.framework.Assert;


public class MortageLoanHomePageSteps {
	
	
	WebDriver driver;
	
//	//HOM MUCH WILL MY PAYMENTS BE WIDGET ELEMENTS
//	
//		@FindBy(how=How.CSS, using="#calculator_widget_amount")
//		private WebElement loanamountTextBox;
//
//		@FindBy(how=How.CSS, using="#calculator_widget_interest")
//		public static WebElement interestrateTextBox;
//
//		@FindBy(how=How.CSS, using="#calculator_widget_Length")
//		public static WebElement lengthTextBox;
//
//		@FindBy(how=How.CSS, using="#calculator_widget_HomeValue")
//		public static WebElement homevalueTextBox;
//
//		@FindBy(how=How.CSS, using="#wizard-pager > li:nth-child(2) > a")
//		public static WebElement nextButton;
//		
//		//HOM MUCH WILL MY PAYMENTS BE - TAXES AND INSURANCE WIDGET ELEMENTS
//		
//		@FindBy(how=How.CSS, using="#calculator_widget_PropertyTaxes")
//		public static WebElement propertytaxesTextBox;
//		
//		@FindBy(how=How.CSS, using="#calculator_widget_Insurance")
//		public static WebElement annualinsuranceTextBox;
//		
//		@FindBy(how=How.CSS, using="#calculator_widget_PMI")
//		public static WebElement annualpmiTextBox;
//		
//		@FindBy(how=How.CSS, using="#wizard-pager > li.next.finish > a")
//		public static WebElement showresultButton;
//		
//		//YOUR MONTHLY PAYMENTS WILL BE WIDGET
//		
//		@FindBy(how=How.CSS, using="#analysisDiv > table > thead > tr:nth-child(1) > td")
//		public static WebElement monthlyprincipalresultTableValue;
//		
//		@FindBy(how=How.CSS, using="#analysisDiv > table > thead > tr:nth-child(4) > td")
//		public static WebElement loantvalueratioTableValue;
//		
//		@FindBy(how=How.CSS, using="#analysisDiv > table > thead > tr:nth-child(7) > td")
//		public static WebElement totalmonthlyPaymentsTableValue;
	

	 @Given("^I open home mortgage loan home page$")
	    public void openMortgageLoanCalculatorHomePage() throws Throwable {
		 
		 	System.setProperty("webdriver.chrome.driver","C:\\Users\\A\\Desktop\\chromedriver.exe");
			driver = new ChromeDriver();
	    	driver.get("https://www.mortgageloan.com/calculator");
	    	
	    	
	    	
	    }
	 
	 @And("^I input loan amount as \"(.*)\"$")
	    public void inputLoanAmount(String loanamount) throws Throwable {
		 	
		 	WebElement loanamountTextBox = driver.findElement(By.cssSelector("#calculator_widget_amount"));
		 	loanamountTextBox.clear();
		 	loanamountTextBox.sendKeys(loanamount);
		 
	    }
	 @And("^I input interest rate as \"(.*)\"$")
	    public void inputInterestRate(String interestrate) throws Throwable {
		 
		 	WebElement interestrateTextBox = driver.findElement(By.cssSelector("#calculator_widget_interest"));
		 	interestrateTextBox.clear();
		 	interestrateTextBox.sendKeys(interestrate);
		 
	    }
	 
	 @And("^I input mortgage term as \"(.*)\"$")
	    public void inputMortgageTerm(String length) throws Throwable {
		 	
		 	WebElement lengthTextBox = driver.findElement(By.cssSelector("#calculator_widget_Length"));
		 	lengthTextBox.clear();
		 	lengthTextBox.sendKeys(length);
		 
	    }
	 
	 @And("^I input home value as \"(.*)\"$")
	    public void inputHomeValue(String homevalue) throws Throwable {
		 	
		 	WebElement homevalueTextBox = driver.findElement(By.cssSelector("#calculator_widget_HomeValue"));
		 	homevalueTextBox.clear();
		 	homevalueTextBox.sendKeys(homevalue);
		 
	    }
	 
	 @And("^I click next$")
	    public void clickNext() throws Throwable {
		 	
		 	WebElement nextButton = driver.findElement(By.cssSelector("#wizard-pager > li:nth-child(2) > a"));
		 	nextButton.click();
		 
	    }
	 
	 @And("^I input annual taxes as \"(.*)\"$")
	    public void inputAnnualTax(String homevalue) throws Throwable {
		 	
		 	WebElement propertytaxesTextBox = driver.findElement(By.cssSelector("#calculator_widget_PropertyTaxes"));
		 	propertytaxesTextBox.clear();
		 	propertytaxesTextBox.sendKeys(homevalue);
		 
	    }
	 
	 @And("^I input annual insurance as \"(.*)\"$")
	    public void inputAnnualInsurance(String homevalue) throws Throwable {

		 	WebElement annualinsuranceTextBox = driver.findElement(By.cssSelector("#calculator_widget_Insurance"));
		 	annualinsuranceTextBox.clear();
		 	annualinsuranceTextBox.sendKeys(homevalue);
		 
	    }
	 
	 @And("^I input pmi as \"(.*)\"$")
	    public void inputPmi(String homevalue) throws Throwable {
		 
		 	WebElement annualpmiTextBox = driver.findElement(By.cssSelector("#calculator_widget_PMI"));
		 	annualpmiTextBox.clear();
		 	annualpmiTextBox.sendKeys(homevalue);
		 
	    }
	 
	 @And("^I click show result button$")
	    public void clickShowResult() throws Throwable {
		 
		 	WebElement showresultButton = driver.findElement(By.cssSelector("#wizard-pager > li.next.finish > a"));	
		 	showresultButton.click();
		 
	    }
	 
	 @Then("^I verify monthly principal and value payments to be \"(.*)\"$")
	    public void verifyPrincipalValue(String prinicipalvalue) {
		 	
		 	WebDriverWait wait= new WebDriverWait(driver, 10);
		 	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#analysisDiv > table > thead > tr:nth-child(1) > td")));
		 	WebElement prinicipalcolumnvalue = driver.findElement(By.cssSelector("#analysisDiv > table > thead > tr:nth-child(1) > td"));	
		 	String prinicipalcolumnvaluetext= prinicipalcolumnvalue.getText();
	    	Assert.assertEquals(prinicipalcolumnvaluetext, prinicipalvalue); 
	    	
	    }
	 
	 @Then("^I verify monthly loan to value ratio to be \"(.*)\"$")
	    public void verifyMonthlyLoanToValue(String loantovalue) throws Throwable {
		 	
		 	WebElement loantocolumnvalue = driver.findElement(By.cssSelector("#analysisDiv > table > thead > tr:nth-child(4) > td"));	
		 	String loantocolumnvaluetext=loantocolumnvalue.getText();
	    	Assert.assertEquals(loantocolumnvaluetext, loantovalue); 
	    	
	    }
	 
	 @Then("^I verify total monthly payments to be \"(.*)\"$")
	    public void verifyTotalMonthlyPayment(String monthlypayment) throws Throwable {
		 	
		 	WebElement monthlycolumnpayment = driver.findElement(By.cssSelector("#analysisDiv > table > thead > tr:nth-child(7) > td"));	
		 	String monthlycolumnpaymenttext= monthlycolumnpayment.getText();
	    	Assert.assertEquals(monthlycolumnpaymenttext, monthlypayment); 
	    	
	    }
}
