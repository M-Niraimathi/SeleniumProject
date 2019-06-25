package com.training.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewLaunch {
	private WebDriver driver; 
	
	public NewLaunch(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//*[@id=\"menu-item-354\"]/a")
	private WebElement NewLaunch1; 
	
	public void ClickNewLaunch1() {
		this.NewLaunch1.click(); 
	}
	
	@FindBy(id="keyword_search") 
	private WebElement keywordsearch;
	
	public void sendkeywordsearch(String keywordsearch) {
		this.keywordsearch.clear();
		this.keywordsearch.sendKeys(keywordsearch);
	} 

	@FindBy(xpath="//*[@id=\"realteo-search-form\"]/div[3]/div/button")
	private WebElement search; 
	
	public void ClickSearch() {
		this.search.click(); 
	}
	
	@FindBy(xpath="//*[@id ='ajaxsearchlite2']/div/div[3]/form/input[1]")
	private WebElement SearchProperties; 
	
	public void clickSearchProperties() {
		this.SearchProperties.click(); 
	}
	@FindBy(xpath="//*[@id=\"ajaxsearchlite2\"]/div/div[3]/form/input[1]") 
	private WebElement SearchPropertie;
	
	public void sendSearchPropertie(String SearchPropertie) {
		this.SearchPropertie.clear();
		this.SearchPropertie.sendKeys(SearchPropertie);
	}
	@FindBy(xpath="//*[@class = 'resdrg']/div[1]")
	private WebElement SearchResult; 
	
	public void clickSearchResult() {
		this.SearchResult.click(); 
	} 
	
	@FindBy(name="your-name") 
	private WebElement yourname;
	
	public void sendyourname(String yourname) {
		this.yourname.clear();
		this.yourname.sendKeys(yourname);
	}
	@FindBy(name="your-email") 
	private WebElement youremail;
	
	public void sendyouremail(String youremail) {
		this.youremail.clear();
		this.youremail.sendKeys(youremail);
	}
	
	
	@FindBy(name="your-subject") 
	private WebElement yoursubject;
	
	public void sendyoursubject(String yoursubject) {
		this.yoursubject.clear();
		this.yoursubject.sendKeys(yoursubject);
	}
	
	@FindBy(name="your-message") 
	private WebElement yourmessage;
	
	public void sendyourmessage(String yourmessage) {
		this.yourmessage.clear();
		this.yourmessage.sendKeys(yourmessage);
	}
	@FindBy(xpath="//*[@class='wpcf7-form-control wpcf7-submit']")
	private WebElement Sendbutton; 
	
	public void clickSendbutton() {
		this.Sendbutton.click(); 
	}

	
}
