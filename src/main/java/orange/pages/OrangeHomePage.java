package orange.pages;

import java.io.IOException;
import java.util.Map;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.cucumber.datatable.DataTable;
import orange.util.OrangeTestBase;

public class OrangeHomePage extends OrangeTestBase{

	@FindBy(name = "username")
	public WebElement uname;
	
	@FindBy(name = "password")
	public WebElement pwd;	
	
	@FindBy(xpath = "//button[@type='submit']")
	public WebElement loginBtn;
	
	@FindBy(linkText = "PIM")
	public WebElement pim;
	
	@FindBy(linkText = "Add Employee")
	public WebElement addemp;
	
	@FindBy(name = "firstName")
	public WebElement first_name;
	
	@FindBy(name = "lastName")
	public WebElement last_name;
	
	public OrangeHomePage() throws IOException {
		super();
	}
	
	public void userLoggedIn(String args1,String args2) {
		uname.sendKeys(args1);
		pwd.sendKeys(args2);
		loginBtn.click();	
	}
	
	public boolean user_click_on_PIM() {
		if(pim.isDisplayed()) {
			pim.click();
			return true;
		}
		return false;
	}
	
	public boolean user_click_on_AddEmployee() {
		if(addemp.isDisplayed()) {
			addemp.click();
			return true;
		}
		return false;
	}
	
	public void add_emp_info(DataTable credentials) {
		for(Map<String,String> data : credentials.asMaps(String.class, String.class))
		{
			first_name.sendKeys(data.get("fname"));
			last_name.sendKeys(data.get("lname"));
			loginBtn.click();
			addemp.click();
		}
	}
	
}
