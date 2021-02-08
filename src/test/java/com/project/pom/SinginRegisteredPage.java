package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SinginRegisteredPage extends Base {

	public SinginRegisteredPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	By linkLocator = By.linkText("Sign in");
	By pageLocator = By.xpath("//*[@id=\"login_form\"]");
	
	By emailLocator = By.id("email");
	By paswdLocator = By.id("passwd");
	By btnSinginLocator = By.id("SubmitLogin");
	
	By labelPageDetector = By.cssSelector("#center_column > h1");
	
	public void registeredUser() throws InterruptedException {
		click(linkLocator);
		Thread.sleep(2000);
		if (isDisplayed(pageLocator)) {
			type("jaimelgrande@gmail.com", emailLocator);
			type("12345", paswdLocator);
			click(btnSinginLocator);
		}
	}
	public String registeredMessage() {
		return getText(labelPageDetector);		
	}
}
