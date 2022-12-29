package stepDefinations;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks  extends TestBase{
	//public WebDriver driver;
	@Before
	public void setup() throws IOException {
		launchDriver();
		
	}
	@After
	public void teatdown(Scenario sc) {
		if (sc.isFailed()) {
			TakesScreenshot ts=(TakesScreenshot)driver;
		  byte[]src=ts.getScreenshotAs(OutputType.BYTES);
		sc.attach(src,"image/png",sc.getName());
			
			
		}
		
			closedriver();
		
	}
	}


