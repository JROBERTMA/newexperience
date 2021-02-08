package com.qualitystream.tutorial;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewExperienceTest {
	private WebDriver driver;	

	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		
	}
	
	@Test
	public void testNewExperience(){
		WebElement searchbox = driver.findElement(By.id("search_query_top"));
		searchbox.clear();
		searchbox.sendKeys("Dresses");
		searchbox.submit();
		
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		  
		
		
	}
		
	@After
	public void tearDown() {
		//driver.quit();
	}
}