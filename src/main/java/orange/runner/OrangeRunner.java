package orange.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
			features = {"C:\\Selenium_WorkSpace\\BDD_POM_Test_OrangeHRM\\src\\main\\java\\orange\\features\\orangelogin.feature","C:\\Selenium_WorkSpace\\BDD_POM_Test_OrangeHRM\\src\\main\\java\\orange\\features\\orangehome.feature"},
			glue = "orange.step",
			plugin = "pretty",
			monochrome = true,
			dryRun = false
		)
public class OrangeRunner {

}
