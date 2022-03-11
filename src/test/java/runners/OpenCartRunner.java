package runners;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
		publish = true,
		features="src//test/resources//features//",
		glue = {"stepDefs"},
		dryRun = false,
		monochrome = true, //more readable form
		plugin = {"pretty",
				"html:target/reports/HtmlReport.html"
				
				} 
		)

public class OpenCartRunner extends AbstractTestNGCucumberTests{

}
