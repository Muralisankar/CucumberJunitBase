package StepDefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^Testing API Sample1 \"([^\"]*)\"$")
    public void testing_api_sample1(String str1) throws Throwable {
    	
    	 System.out.println("sample1 "+str1);
    	 
      
       
    }

    @Then("^Testing API Sample2 \"([^\"]*)\"$")
    public void testing_api_sample2(String str1) throws Throwable {
    	
    	 System.out.println("sample2 "+str1);
    	 
        
    }

}