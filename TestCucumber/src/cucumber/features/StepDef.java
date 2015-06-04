package cucumber.features;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef {
	
	@Given("^The user is on the home page$")
	public void The_user_is_on_the_home_page() throws Throwable {
		if(true)
		{
			System.out.println("The system is in home page ");
		}
		else
		{
	    throw new PendingException();
		}
	  
	}

	@When("^The user name is entered correctly$")
	public void The_user_name_is_entered_correctly() throws Throwable {
		if(true)
		{
			System.out.println("The user name is entered  ");
		}
		else
		{
	    throw new PendingException();
		}
	}

	@When("^The pwd is  entered correctly$")
	public void The_pwd_is_entered_correctly() throws Throwable {
		if(true)
		{
			System.out.println("The pwd is  entered correctly ");
		}
		else
		{
	    throw new PendingException();
		}
	}

	@Then("^The user is in the landing page$")
	public void The_user_is_in_the_landing_page() throws Throwable {
		if(true)
		{
			System.out.println("The system is inlanding page ");
		}
		else
		{
	    throw new PendingException();
		}
	}

	@Then("^The user has yellow theme$")
	public void The_user_has_yellow_theme() throws Throwable {
		if(true)
		{
			System.out.println("The  user has yellow theme ");
		}
		else
		{
	    throw new PendingException();
		}
	}

	
	

}
