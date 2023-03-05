package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"Features"},
		glue = {"stepDefinations","myHooks"},
		monochrome = true, 
		tags = "@ABCD",
		plugin = {"pretty", "html:target/cucumber-reports/report.html" }
		)

public class LoginPageRunner2 {

}
