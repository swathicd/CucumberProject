package cucumber.features;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Google {
	
	WebDriver driver=null;
	
	@Given("^The user is on the google page$")
	public void The_user_is_on_the_google_page() throws Throwable {
	    driver=new FirefoxDriver();
	    driver.navigate().to("https://www.google.co.uk");
	   
	}

	@When("^The user cliks  i am feeling lucky button$")
	public void The_user_cliks_i_am_feeling_lucky_button() throws Throwable {
	    driver.findElement(By.name("btnI")).click();
	}

	@Then("^The user is in the doodle page$")
	public void The_user_is_in_the_doodle_page() throws Throwable {
	   Assert.assertTrue("Failure",driver.getTitle().equals("Google Doodles"));
	}


}
