package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		tags 		= "@smoke or @sanity or @regression",
		features 	= "src/test/java/feature",
		glue 		= {"stepDefinition", "baseUtil"},
		monochrome 	= false,
		dryRun 		= false,
		plugin 		= {"pretty", "html:target/report.html", "json:target/report.json", "junit:target/report.xml"}
		)

public class TestRunner {

}
// we have to use or in line 10, to run simultaneous tag
