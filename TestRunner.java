package Runner;

import org.junit.runner.RunWith;

/*import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;*/

import io.cucumber.junit.Cucumber;  
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( 
			features = "C:\\Users\\Swati\\eclipse-workspace\\FreeCRM_BDD\\src\\main\\java\\Features\\login.feature",
			glue = "stepDefinitions",
			plugin = {"html:target/cucumber-html-report", "json:target/cucumber-json-report.json" }		
			
		 )


public class TestRunner {

}
