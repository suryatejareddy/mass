package Expressions;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {
			
				"json:src/test/java/Expressions/output/cucumber.json"
		})
public class calRunnerFile2 {

}
