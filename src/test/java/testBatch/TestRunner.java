package testBatch;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber .class)
@CucumberOptions(features="5feb.feature",glue= {"Gluestep"},tags= {"@login"},plugin= {"json:target/cucumber-report.json"})

public class TestRunner {
	

}
