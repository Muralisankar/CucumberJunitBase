package StepDefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefinition {

    @Given("^Testing API Sample1$")
    public void testing_api_sample1() throws Throwable {
    	
    	 System.out.println("sample1");
    	 
      
       
    }

    @And("^Testing API Sample2$")
    public void testing_api_sample2() throws Throwable {
    	
    	 System.out.println("sample2");
    	 
        
    }

}