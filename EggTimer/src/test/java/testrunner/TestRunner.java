package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-htmlreport","json:target/cucumber-report.json"},
features = "src/test/java/features",
glue = "stepDefinitions",
monochrome = true)

public class TestRunner {


}