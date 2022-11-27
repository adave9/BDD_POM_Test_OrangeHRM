package orange.step;

import java.io.IOException;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import orange.pages.OrangeLoginPage;
import orange.util.OrangeTestBase;

public class OrangeLoginStepDefinitions extends OrangeTestBase{

	public OrangeLoginStepDefinitions() throws IOException {
		super();
	}

	public OrangeLoginPage objlp = new OrangeLoginPage();

	
	@Given("^User is able to access Orange HRM Login Webpage final$")
	public void user_is_able_to_access_Orange_HRM_Login_Webpage() throws IOException {
		initializeOrange();
		PageFactory.initElements(driver, objlp);
	}

	@When("^Title of the website is OrangeHRM final$")
	public void title_of_the_website_is_OrangeHRM() throws IOException{
		String actual_title=objlp.getTitleOfOrangeHRM();
		System.out.println(actual_title);
		String expected_title = "OrangeHRM";
		Assert.assertEquals(actual_title,expected_title);
	}

	@When("^User enters \"(.*)\" and user enters \"(.*)\" final$")
	public void user_enters_and_user_enters(String arg1, String arg2) throws IOException, InterruptedException {
		objlp.enterUserAndPassword(arg1,arg2);
	}

	@Then("^User clicks on Login Button final$")
	public void user_clicks_on_Login_Button() {
		objlp.clickOnLoginBtn();
	}

	@Then("^User is on Dashboard final$")
	public void user_is_on_Dashboard() throws IOException {
		objlp.validateOnDash();
	}

	@Then("^User quit$")
	public void user_quit(){
		driver.quit();
	}
}
