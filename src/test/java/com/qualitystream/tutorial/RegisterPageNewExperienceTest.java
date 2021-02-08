package com.qualitystream.tutorial;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterPageNewExperienceTest {
	private WebDriver driver;	
	
	
	By linkLocator = By.linkText("Sign in");
	
	//	Localizado del formulario para la validacion de email para la creacion de usuario
	By registerPageLocator = By.id("create-account_form");
	By userLocator = By.id("email_create");
	By btn = By.id("SubmitCreate");
	
	By registerUserPageLocator = By.xpath("//form[@action='http://automationpractice.com/index.php?controller=authentication']");
	
	//Localizando los campos para el registro de usuarios
	By genderLocationMr = By.id("id_gender1");
	
	By genderLocationMs = By.id("id_gender2");
	By firsthNameLocation = By.id("customer_firstname");
	By lastNameLocation = By.id("customer_lastname");
	By emailLocation = By.id("email");
	By paswordLocation = By.id("passwd");
	By daydateLocation = By.id("uniform-days");
	By monthdateLocation = By.id("months");
	By yeardateLocation = By.id("years");
	By nameLocation = By.id("firstname");
	By lastnameLocation = By.id("lastname");
	By companyLocation = By.id("company");
	By adressLocation = By.id("address1");
	By adress2Location = By.id("address2");
	By cityLocation = By.id("city");
	By stateLocation = By.id("id_state");
	By zipCodeLocation = By.id("postcode");
	By coutryCodeLocation = By.id("id_country");
	By otherLocation = By.id("other");
	By phoneHomeLocation = By.id("phone");
	By phoneMobilLocation = By.id("phone_mobile");
	By aliasLocation = By.id("alias");
	By submitBtnLocation = By.id("submitAccount");
	
	
	
	//setUp carga los componentes para ejecutar el chromedriver (abrir navegador, maximizar y ingresar url de pagina a testear)
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/chromedriver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	@After
	public void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	public void validEmailyRegistrar() throws InterruptedException {
		driver.findElement(linkLocator).click();
		Thread.sleep(2000);
		
		if(driver.findElement(registerPageLocator).isDisplayed()) {
			driver.findElement(userLocator).sendKeys("javichos@gmail.com");
			driver.findElement(btn).click();
			if(driver.findElement(registerUserPageLocator).isDisplayed()) {
				Thread.sleep(2000);
				  driver.findElement(genderLocationMr).click();
				  driver.findElement(firsthNameLocation).sendKeys("Flor");		  
				  driver.findElement(lastNameLocation).sendKeys("Martinez");		 
				  driver.findElement(paswordLocation).sendKeys("12345");		  
				  //driver.findElement(daydateLocation).("19");
				  //driver.findElement(monthdateLocation).sendKeys("Febraury");
				  //driver.findElement(yeardateLocation).sendKeys("1992");
				  driver.findElement(nameLocation).sendKeys("David");
				  driver.findElement(lastnameLocation).sendKeys("Martinez");
				  driver.findElement(companyLocation).sendKeys("Los Martinez eirl");
				  driver.findElement(adressLocation).sendKeys("Los acebos 200");
				  driver.findElement(adress2Location).sendKeys("");
				  driver.findElement(cityLocation).sendKeys("Lima");
				  driver.findElement(stateLocation).sendKeys("Alabama");
				  driver.findElement(zipCodeLocation).sendKeys("15401");
				  driver.findElement(otherLocation).sendKeys("Los Martinez eirl");
				  driver.findElement(phoneHomeLocation).sendKeys("+83323134");
				  driver.findElement(phoneMobilLocation).sendKeys("+51941252323");
				  driver.findElement(aliasLocation).sendKeys("los jardines");
				  //driver.findElement(submitBtnLocation).click();				  
				}else {System.out.println("No entro en aqui");}
		}
			
	}			

}
