package orange.step;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import orange.pages.OrangeHomePage;
import orange.util.OrangeTestBase;

public class OrangeHomeStepDefinitions extends OrangeTestBase{

	public OrangeHomePage ohp = new OrangeHomePage();
	
	public OrangeHomeStepDefinitions() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("User is already logged in with username {string} and password {string}")
	public void user_is_already_logged_in_with_username_and_password(String string, String string2) {
	    initializeOrange();
	    PageFactory.initElements(driver, ohp);
	    ohp.userLoggedIn(string, string2);
	}

	@Then("User click on PIM")
	public void user_click_on_pim() {
		boolean flag2 = ohp.user_click_on_PIM();
		Assert.assertTrue(flag2);
	}

	@Then("user click on AddEmployee")
	public void user_click_on_add_employee() {
	    boolean flag3 = ohp.user_click_on_AddEmployee();
	    Assert.assertTrue(flag3);
	}

	@Then("user enters firstname and lastname and user click on save")
	public void user_enters_firstname_and_lastname_and_user_click_on_save(DataTable credentials) {
	   ohp.add_emp_info(credentials);
	}

	@Then("user exits")
	public void user_exits() {
	    driver.quit();
	}
}
