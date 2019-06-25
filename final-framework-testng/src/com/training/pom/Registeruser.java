package com.training.pom;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registeruser {
	private WebDriver driver; 
	
	public Registeruser(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"post-133\"]/div/div/div/ul/li[2]/a")
	private WebElement reg; 
	
	public void ClickRegisterTab() {
		this.reg.click(); 
	}
	
	@FindBy(id="email")
	private WebElement email; 
	
	@FindBy(id="first-name")
	private WebElement firstname;
	
	@FindBy(id="last-name")
	private WebElement lastname; 
	
	public void sendEmail(String email) {
		this.email.clear();
		this.email.sendKeys(email);
	}
	
	public void sendFirstname(String firstname) {
		this.firstname.clear(); 
		this.firstname.sendKeys(firstname); 
	}
	public void sendLastname(String lastname) {
		this.lastname.clear(); 
		this.lastname.sendKeys(lastname); 
	}
	
	@FindBy(name="submit")
	private WebElement sub; 
	
	public void ClickRegister() {
		this.sub.click(); 
	}
		}
