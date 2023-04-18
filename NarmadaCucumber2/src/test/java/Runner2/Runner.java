package Runner2;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import cucumber.api.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/Feature2",
                  glue={"StepDefinition2"},
				plugin= {"pretty","html:target/HtmlReports"})
				//plugin= {"pretty","json:target/jsonReport/report.json"}
				//plugin= {"pretty","junit:target/junitReport/report.xml"}
public class Runner {

	
}
