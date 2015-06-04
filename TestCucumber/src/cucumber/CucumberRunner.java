package cucumber;

import org.junit.runner.RunWith;

import cucumber.api.junit.Cucumber;


@SuppressWarnings("deprecation")
@RunWith(Cucumber.class) //RUN CucumberRunner as a part of Cucumber class
@Cucumber.Options(
	format={"pretty","json:target/cucumber.json"},//report mechanism of the tests
	features={"src/cucumber/"}		//path of feature files
)
public class CucumberRunner {
	
	
	

}
