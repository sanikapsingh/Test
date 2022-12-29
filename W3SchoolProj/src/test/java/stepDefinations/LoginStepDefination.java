package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LoginPage;

public class LoginStepDefination extends TestBase{
	
	//static {
		//try {launchDriver();}catch(Exception e) {}
	//}
	//public WebDriver driver;
	
	LoginPage lp=new LoginPage(driver);
	
	@Given("Navigate to URL")
    public void navigate_to_URL() throws IOException {
		
		lp.getURL();
		
		//launchDriver();
		//driver.get("https://profile.W3schools.com/");
		
		//driver=new ChromeDriver();
	   //driver.get("https://profile.w3Schools.com/log-in");
	}
	@When("Enter username and Password and click on Login button")
	public void Enter_username_and_Password_and_click_on_Login_button() {
		
	//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rtoor204@gmail.com");
	//driver.findElement(By.xpath("//input[@id='current-password']")).sendKeys("Abcde@12345");
	//driver.findElement(By.xpath("(//*[text()='Log in'])[2]")).click();
		
		lp.username();
		lp.password();
		lp.loginbutton();
	}
	
    @Then("user should land on Homepage")
  
    
    public void user_should__land_on_homepage() {
    	  String actual=lp.getTitle();
    	Assert.assertEquals(actual,"Log in - W3Schools");
    	
    }
    
    @When("Enter incorrect username and Password and click on Login button")
    public void Enter_incorrect_username_and_Password_and_click_on_Login_button() {
    	lp.wrongCredentials();
    }
		
    @Then("user should land on Homepage and verify url")
  public void Then_user_should_land_on_Homepage_and_verify_url() {
	String actual=lp.geturlString();
	Assert.assertEquals(actual,"");
}
}