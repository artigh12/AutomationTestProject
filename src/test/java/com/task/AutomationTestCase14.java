package com.task;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationTestCase14 {

	ChromeDriver driver;
	
	@BeforeMethod
	public void oprnBrowser() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
	}
	
	@Test
	public void automateTest() throws Exception {
		
		
		//to verify homepage is loaded
		String ExpectedTitle ="Automation Exercise";
		String ActualTitle =driver.getTitle();
		Assert.assertEquals(ActualTitle, ExpectedTitle);
		
		//to add products to cart
		TestPom TestElements=PageFactory.initElements(driver,TestPom.class);
		TestElements.getProducts().click();
		
		JavascriptExecutor js=driver;
		js.executeScript("window.scrollBy(0,400)"," ");
		
		TestElements.getTop().click();
		Thread.sleep(5000);
		TestElements.getTopCart().click();
		Thread.sleep(2000);
		TestElements.getContinueBtn().click();
		driver.navigate().back();
		
		TestElements.getTshirt().click();
		Thread.sleep(5000);
		TestElements.getTshirtCart().click();
		Thread.sleep(2000);
		TestElements.getContinueBtn().click();
		
		//view cart
		TestElements.getViewCart().click();
		boolean cartVal=TestElements.getCartText().isDisplayed();
		Assert.assertTrue(cartVal);                     //verify cart is loaded
		
	   TestElements.getCheckoutBtn().click();
	   TestElements.getLogin().click();

	  //signUp
	   
	   TestElements.getName().sendKeys("Arti");
	   TestElements.getEmail().sendKeys("artigh0100@gmail.com");
	   TestElements.getSignUpBtn().click();
	   TestElements.getPssword().sendKeys("xyz123");
	   TestElements.getGender().click();
	   TestElements.getFname().sendKeys("Arti");
	   TestElements.getLname().sendKeys("Gharjale");
	   TestElements.getCompany().sendKeys("Bugsoptter PVt Limited");
	   TestElements.getAddress().sendKeys("Gajanan Nagar");
	   TestElements.getState().sendKeys("Maharashtra");
	   TestElements.getCity().sendKeys("Parbhani");
	   TestElements.getZipcode().sendKeys("431401");
	   TestElements.getMobile().sendKeys("908167");
	   TestElements.getCrateBtn().click();
	   
	   //verify account created
	   boolean accVal=TestElements.getVerifyAcc().isDisplayed();
	   Assert.assertTrue(accVal);
	   
	   TestElements.getViewCart().click();
	   TestElements.getCheckoutBtn().click();
	   
	   boolean orderVal=TestElements.getReviewOrder().isDisplayed();
	   Assert.assertTrue(orderVal);
	 
	   TestElements.getTextArea().sendKeys("Order comments added");
	   TestElements.getPlaceOrder().click();
	 
	   //payment details
	   Thread.sleep(2000);
	   TestElements.getNameOnCard().sendKeys("Arti Gharjale"); 
	   TestElements.getCardNumber().sendKeys("67651234");
	   TestElements.getCVC().sendKeys("567");
	   TestElements.getExpMonth().sendKeys("03");
	   TestElements.getExpYear().sendKeys("2026");
	   TestElements.getConfirmPayment().click();
	   
	   //Delete account
	   TestElements.getDeleteAcc().click();
	   
	}
	
	/*
	 * @AfterMethod public void tearDown() throws Exception { Thread.sleep(10000);
	 * driver.close(); }
	 */
}
