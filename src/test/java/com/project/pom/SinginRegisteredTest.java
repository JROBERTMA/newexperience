package com.project.pom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class SinginRegisteredTest {
	
	WebDriver driver;
	SinginRegisteredPage registerPage;

	@Before
	public void setUp() throws Exception {
		registerPage = new SinginRegisteredPage(driver);
		driver = registerPage.chromeDriverConnection();
		registerPage.visit("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() throws InterruptedException {
		registerPage.registeredUser();;
		assertEquals("MY ACCOUNT", registerPage.registeredMessage());
	}

}
