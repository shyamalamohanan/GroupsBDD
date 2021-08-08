package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {"src/main/java/features/Groups.feature"},
glue = "steps",
monochrome = true)


public class RunGroupsTest extends AbstractTestNGCucumberTests{
	
}
