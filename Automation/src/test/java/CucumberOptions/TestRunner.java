package CucumberOptions;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/java/features",
		glue = "StepDefinitions",
		plugin = {"pretty", "html:target/cucumber"},
		monochrome = true,
		dryRun=true)
public class TestRunner {

}
