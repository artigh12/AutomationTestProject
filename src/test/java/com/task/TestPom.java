package com.task;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TestPom {

	@FindBy(how=How.XPATH,using="//a[@href='/products']") private WebElement Products;
	@FindBy(how=How.XPATH,using="//a[@href='/product_details/1']") private WebElement Top;
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-default cart']") private WebElement TopCart;
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-success close-modal btn-block']")  
	private WebElement ContinueBtn;
	@FindBy(how=How.XPATH,using="//a[@href='/product_details/2']") private WebElement Tshirt;
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-default cart']") private WebElement TshirtCart;
	@FindBy(how=How.XPATH,using="//a[@href='/view_cart']") private WebElement ViewCart;
	@FindBy(how=How.XPATH,using="//li[@class='active']") private WebElement cartText;
	@FindBy(how=How.XPATH,using="//a[@class='btn btn-default check_out']") private WebElement CheckoutBtn;
	@FindBy(how=How.XPATH,using="//u[text()='Register / Login']") private WebElement login;

	@FindBy(how=How.XPATH,using="//input[@name='name']") private WebElement name;
	@FindBy(how=How.XPATH,using="(//input[@name='email'])[2]") private WebElement email;
	@FindBy(how=How.XPATH,using="//button[text()='Signup']") private WebElement signUpBtn;
	@FindBy(how=How.XPATH,using="//label[@for='id_gender2']") private WebElement gender;
	@FindBy(how=How.XPATH,using="//input[@id='password']") private WebElement pssword;
	@FindBy(how=How.XPATH,using="//input[@id='first_name']") private WebElement Fname;
	@FindBy(how=How.XPATH,using="//input[@id='last_name']") private WebElement Lname;
	@FindBy(how=How.XPATH,using="//input[@id='company']") private WebElement company;
	@FindBy(how=How.XPATH,using="//input[@id='address1']") private WebElement address;
	@FindBy(how=How.XPATH,using="//input[@id='state']") private WebElement state;
	@FindBy(how=How.XPATH,using="//input[@id='city']") private WebElement city;
	@FindBy(how=How.XPATH,using="//input[@id='zipcode']") private WebElement zipcode;
	@FindBy(how=How.XPATH,using="//input[@id='mobile_number']") private WebElement mobile;
	@FindBy(how=How.XPATH,using="//button[text()='Create Account']") private WebElement CrateBtn;
	@FindBy(how=How.XPATH,using="//b[text()='Account Created!']") private WebElement verifyAcc;
	@FindBy(how=How.XPATH,using="//h2[text()='Review Your Order']") private WebElement reviewOrder;
	@FindBy(how=How.XPATH,using="//textarea[@class='form-control']") private WebElement textArea;
	@FindBy(how=How.XPATH,using="//a[@href='/payment']") private WebElement PlaceOrder;
	@FindBy(how=How.XPATH,using="//input[@name='name_on_card']") private WebElement nameOnCard;
	@FindBy(how=How.XPATH,using="//input[@name='card_number']") private WebElement cardNumber;
	@FindBy(how=How.XPATH,using="//input[@name='expiry_month']") private WebElement expMonth;
	@FindBy(how=How.XPATH,using="//input[@name='expiry_year']") private WebElement expYear;
	@FindBy(how=How.XPATH,using="//input[@name='cvc']") private WebElement CVC;
	@FindBy(how=How.XPATH,using="//button[@id='submit']") private WebElement ConfirmPayment;
	@FindBy(how=How.XPATH,using="//a[@href=\"/delete_account\"]") private WebElement deleteAcc;
	

	public WebElement getDeleteAcc() {
		return deleteAcc;
	}

	public WebElement getNameOnCard() {
		return nameOnCard;
	}

	public WebElement getCardNumber() {
		return cardNumber;
	}

	public WebElement getExpMonth() {
		return expMonth;
	}

	public WebElement getExpYear() {
		return expYear;
	}

	public WebElement getCVC() {
		return CVC;
	}

	public WebElement getConfirmPayment() {
		return ConfirmPayment;
	}

	public WebElement getReviewOrder() {
		return reviewOrder;
	}

	public WebElement getTextArea() {
		return textArea;
	}

	public WebElement getPlaceOrder() {
		return PlaceOrder;
	}

	public WebElement getVerifyAcc() {
		return verifyAcc;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getName() {
		return name;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getSignUpBtn() {
		return signUpBtn;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getPssword() {
		return pssword;
	}

	public WebElement getFname() {
		return Fname;
	}

	public WebElement getLname() {
		return Lname;
	}

	public WebElement getCompany() {
		return company;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getState() {
		return state;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getCrateBtn() {
		return CrateBtn;
	}

	public WebElement getCheckoutBtn() {
		return CheckoutBtn;
	}

	public WebElement getViewCart() {
		return ViewCart;
	}

	public WebElement getCartText() {
		return cartText;
	}

	public void setViewCart(WebElement viewCart) {
		ViewCart = viewCart;
	}

	public WebElement getContinueBtn() {
		return ContinueBtn;
	}

	public WebElement getProducts() {
		return Products;
	}
	
	public WebElement getTop() {
		return Top;
	}
	
	public WebElement getTopCart() {
		return TopCart;
	}

	public WebElement getTshirtCart() {
		return TshirtCart;
	}

	public WebElement getTshirt() {
		return Tshirt;
	}
	
	
}
