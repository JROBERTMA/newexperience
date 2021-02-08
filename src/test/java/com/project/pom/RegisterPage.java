package com.project.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage extends Base {

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
	//By emailLocation = By.id("email");
	By paswordLocation = By.id("passwd");
	By daydateLocation = By.id("days");
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
	
	By myAccounLocator= By.xpath("//*[@id=\"center_column\"]/h1");
	public RegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void registerUser() throws InterruptedException {
		click(linkLocator);
		Thread.sleep(2000);
		if(isDisplayed(registerPageLocator)) {
			type("javierc@gmail.com", userLocator);
			click(btn);
			if(isDisplayed(registerUserPageLocator)) {
				Thread.sleep(2000);
				  click(genderLocationMr);
				  type("Flor", firsthNameLocation);		  
				  type("Martinez", lastNameLocation);		 
				  type("12345", paswordLocation);
				  

				  selectDropDown(daydateLocation, "19  ");
				  selectDropDown(monthdateLocation, "February ");
				  selectDropDown(yeardateLocation, "1992  ");
				
				  
				  type("David", nameLocation);
				  type("Martinez", lastnameLocation);
				  type("Los Martinez eirl", companyLocation);
				  type("Los acebos 200", adressLocation);
				  type("",adress2Location);
				  type("Lima", cityLocation);
				  type("Alabama", stateLocation);
				  type("15401", zipCodeLocation);
				  type("Los Martinez eirl", otherLocation);
				  type("+83323134", phoneHomeLocation);
				  type("+51941252323", phoneMobilLocation);
				  type("los jardines", aliasLocation);
				  click(submitBtnLocation);

			}
		}else {
			System.out.println("Usuario registrado");
		}
	}
	
	public String registeredMessage() {
		return getText(myAccounLocator);		
	}
	
	public String selectDropDown(By locator,String texto) {
		Select selectList = new Select(findElement(locator));
		selectList.selectByVisibleText(texto);		
		return getText(selectList.getFirstSelectedOption());		
	}
	
	/*
	 * public String dropDownSelected(By locator,String texto) { WebElement
	 * dropdownList = findElement(locator); List<WebElement> options =
	 * dropdownList.findElements(By.tagName("option")); for(int
	 * i=0;i<options.size();i++) { if(getText(options.get(i)).equals(texto)) {
	 * click(options.get(i)); } } String selectedOption =""; for (int i = 0; i <
	 * options.size(); i++) { if (options.get(i).isSelected()) {
	 * selectedOption=getText(options.get(i)); } } return selectedOption; }
	 */
	

}
