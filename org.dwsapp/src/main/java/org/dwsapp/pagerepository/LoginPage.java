package org.dwsapp.pagerepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "Email")
	private WebElement emailtxtfield;

	@FindBy(id = "Password")
	private WebElement passwordtxtfield;

	@FindBy(xpath = "//input[@value='Log in']")
	private WebElement loginbtn;
	
	

	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getemailtextfield() {

		return emailtxtfield;
	}

	public WebElement getpasswordtextfield() {

		return passwordtxtfield;
	}

	public WebElement getloginbutton() {

		return loginbtn;
	}
}
