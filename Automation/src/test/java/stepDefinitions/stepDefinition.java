package stepDefinitions;

import org.junit.runner.RunWith;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
public class stepDefinition {
	
	 @Given("^API Testing Sample1$")
	    public void api_testing_sample1() throws Throwable {
	        System.out.println("Sample Testing1");
	    }

	 @And("^API Testing Sample2$")
	 public void api_testing_sample2() throws Throwable {
	    	System.out.println("Sample Testing2");
	    }
	 
	 @Then("^API Testing Sample3$")
	    public void api_testing_sample3() throws Throwable {
		 System.out.println("Sample Testing3");
	    }

}
