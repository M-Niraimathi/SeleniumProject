package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChangePwd {
	private WebDriver driver; 
	
	public ChangePwd(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user_login")
	private WebElement userName; 
	
	@FindBy(id="user_pass")
	private WebElement password;
	
	@FindBy(name="login")
	private WebElement loginBtn; 
	
	public void sendUserName(String userName) {
		this.userName.clear();
		this.userName.sendKeys(userName);
	}
	
	public void sendPassword(String password) {
		this.password.clear(); 
		this.password.sendKeys(password); 
	}
	
	public void clickLoginBtn() {
		this.loginBtn.click(); 
	}
	
	@FindBy(xpath="//a[contains(@href,'change-password')]")
	//@FindBy(partiallinktext="")		
	private WebElement change_pass; 
	
	public void clickchange_pass() {
		this.change_pass.click(); 
	}
	
	@FindBy(name="current_pass")
	private WebElement curruserpass; 
	
	public void sendCurrUserPass(String curruserpass) throws AWTException {
		/*Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_UP);*/
		this.curruserpass.clear();
		this.curruserpass.sendKeys(curruserpass);
	}
	
	@FindBy(name="pass1")
	private WebElement newpassword;
	
	public void sendnewPassword(String newpassword) {
		this.newpassword.clear(); 
		this.newpassword.sendKeys(newpassword); 
	}
	
	@FindBy(name="pass2")
	private WebElement confirmpassword;
	
	public void sendConfPassword(String confirmpassword) {
		this.confirmpassword.clear(); 
		this.confirmpassword.sendKeys(confirmpassword); 
	}
	
	@FindBy(id="wp-submit")
	private WebElement submitbtn;
	

	public void clickSubmitBtn() {
		this.submitbtn.click(); 
	}
	}
