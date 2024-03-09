package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {".//Features//MemSelection.feature"},
//		features = ".//Features",
		glue = "StepDefinition",
		dryRun = false,
		monochrome = true,
		tags = "@Sanity",    // execute only those scenario which write under sanity tags
		plugin = {"pretty","html:target/CucumberReport/Member_Rel_Comb.html"}
		)


public class Runner {

}
