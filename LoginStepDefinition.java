package stepDefinitions;

//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {
	
	WebDriver driver;

	@Given("^User is already on Login Page$")
	public void user_already_on_login_page() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Swati\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.freecrm.com");
		
	}
	
	@When("^title of Login Page is Free CRM$")
	public void title_of_Login_Page_is_Free_CRM() {
		
		String Title = driver.getTitle();
		System.out.println( Title );
		Assert.assertEquals("Cogmento Free CRM with AI Customer Relationship Management", Title);
	}
	@Then("^user enters user name and password$")
	public void user_enters_user_name_and_password() throws InterruptedException {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.findElement(By.cssSelector("[aria-label=Login]")).click();
		driver.findElement(By.xpath("//a[contains(@href,'ui.')]")).click();      


		    Set<String> handles = driver.getWindowHandles();
		    String currentHandle = driver.getWindowHandle();
		    for (String handle : handles) {

		     if (!handle .equals(currentHandle))
		     {
		         driver.switchTo().window(handle);
		     }
		   }	                
		    
	    driver.findElement(By.name("email")).sendKeys("swatipujari515@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");		    
	}

	        

	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		driver.findElement(By.xpath("//div[contains(text(),'Login')]")).click();
		String Newtitle = driver.getTitle();
		Assert.assertEquals("Cogmento CRM123", Newtitle);
		
	    
	   
	}

}
