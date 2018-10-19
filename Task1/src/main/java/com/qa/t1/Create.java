package com.qa.t1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Create {
	
	
	
	
	//login fields
	@FindBy(xpath = "//*[@id=\"j_username\"]")
	WebElement mainuser;
	
	@FindBy(xpath = "/html/body/div/div/form/div[2]/input")
	WebElement mainpass;
	
	
	@FindBy(xpath = "/html/body/div/div/form/div[3]/input")
	WebElement mainsign;
	
	
	
	// Create user fields
		@FindBy(xpath = "//*[@id=\"username\"]")
		WebElement create_username;
				
		@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[2]/td[2]/input")
		WebElement create_password;		
		
		@FindBy(xpath = "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[3]/td[2]/input")
		WebElement create_confirm;	
		
		
		@FindBy(xpath =  "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[4]/td[2]/input")
		WebElement create_fullname;	
		
		@FindBy(xpath =  "//*[@id=\"main-panel\"]/form/div[1]/table/tbody/tr[5]/td[2]/input")
		WebElement create_email;	
		
		@FindBy(xpath = "//*[@id=\"yui-gen1-button\"]")
		WebElement apply;
	
	
	public void muser(String usered) {
		mainuser.sendKeys(usered);
	}
	
	public void mpass(String passed) {
		mainpass.sendKeys(passed);
		mainsign.click();
	}
	
	
	//go to manage settings
	@FindBy(xpath="//*[@id=\"tasks\"]/div[4]/a[2]")
	WebElement manage;
	
	public void managed() {
		manage.click();
	
	}
	
	//go to manage users
	@FindBy(xpath= "//*[@id=\"main-panel\"]/div[16]/a")
	WebElement button2;

	public void managedu() {
		if (button2.getText().contains("Manage Users")) {
			button2.click();
		}
		
	
	}
	
	


	
	public void uname(String username) {
		create_username.sendKeys(username);
	}
	
	public void pword(String password) {
		create_password.sendKeys(password);
	}
	
	public void con(String confirm) {
		create_confirm.sendKeys(confirm);
	}
	
	public void fname(String fullname) {
		create_fullname.sendKeys(fullname);
	}
	
	public void email(String el) {
		create_email.sendKeys(el);
		apply.submit();
	}
	
	
	public String get_username() {
		return create_username.getText();
	}
	
	public String get_password() {
		return create_password.getText();
	}
	
	public String get_confirm() {
		return create_confirm.getText();
	}
	
	public String get_full() {
		return create_fullname.getText();
	}
	
	public String get_email() {
		return create_email.getText();
	}
	
	
	// Check if user name are present in database
	@FindBy(xpath= "//*[@id=\"people\"]/tbody/tr[2]/td[2]")
	WebElement userpres;
	
	@FindBy(xpath= "//*[@id=\"people\"]/tbody/tr[2]/td[4]/a[1]/img")
	WebElement configure;
	
	String get_userid() {
		return userpres.getText();
	}
	
	public void presentid(String username) {
		if (userpres.getText().contains(username)) {
			configure.click();
		}
		
	
	}
	
	//changing name in database
			@FindBy(xpath="//*[@id=\"main-panel\"]/form/table/tbody/tr[1]/td[3]/input")
			WebElement change;
			
			@FindBy(xpath= "//*[@id=\"yui-gen2-button\"]")
			WebElement savebutton;
			
			public void change_name(String fn) {
				change.sendKeys(fn);
				savebutton.submit();
				
			}
	
	
}
