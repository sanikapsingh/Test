package pageObject;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}


     @FindBy(xpath="//input[@name='email']")
     WebElement username;
     
     
     
     @FindBy(xpath="//input[@id='current-password']")
     WebElement password;
     
     
     @FindBy(xpath="(//*[text()='Log in'])[2]")
     WebElement loginbutton; 
     
     public void username() {
    	 username.sendKeys("rtoor204@gmail.com");
     }
    	 
    	 public void password() {
        	 password.sendKeys("Abcde@12345");
    	 }
        	 
        	 public void loginbutton() {
            	 loginbutton.click();
        	 }
        	 
        	 public void getURL() {
        		 driver.get("http://profile.w3schools.com/");
        	 }
        	 
        	 public String getTitle() {
        		return driver.getTitle();
        	 }
        	 public void wrongCredentials() {
        		 username.sendKeys("rtoor2");
        	     password.sendKeys("Abcde@12345");
        	     loginbutton.click();
        	     
        	     
        	 }
        	 
        	 public String geturlString() {
        		 return driver.getCurrentUrl();        			 
        		 }
        		
        		 
        	 
        	 }
     
     
     

     
     
     
     
     
     
     
