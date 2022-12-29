package RunnerFile;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/features",glue="stepDefinations",monochrome=true,
plugin= {"pretty","json:target/json-reprt/cucumber.json","html:target/htmlreport/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

		



public class TestNgRunner extends AbstractTestNGCucumberTests{


	}


