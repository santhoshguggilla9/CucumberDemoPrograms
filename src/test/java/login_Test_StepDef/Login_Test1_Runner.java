package login_Test_StepDef;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features",
		glue={"login_Test_StepDef","StepDefenations"},
		plugin= {"pretty","html:target/htmlReport.html"}
		
		)
public class Login_Test1_Runner {

}
