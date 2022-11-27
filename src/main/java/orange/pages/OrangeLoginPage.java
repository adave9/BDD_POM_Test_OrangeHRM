package orange.pages;

import java.io.IOException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import orange.util.OrangeTestBase;

public class OrangeLoginPage extends OrangeTestBase{
		
		@FindBy(name = "username")
		public WebElement uname;
		
		@FindBy(name = "password")
		public WebElement pwd;	
		
		@FindBy(xpath = "//button[@type='submit']")
		public WebElement loginBtn;
		
		@FindBy(className = "oxd-userdropdown-img")
		public WebElement dash;
		
		public OrangeLoginPage() throws IOException {
			super();
		}
		
		public String getTitleOfOrangeHRM() {
			return driver.getTitle();
		}
		
		public void enterUserAndPassword(String user_name, String pass_word) throws IOException, InterruptedException {
			System.out.println(user_name);
			System.out.println(pass_word);
			uname.sendKeys(user_name);
			pwd.sendKeys(pass_word);
		}
		
		public void clickOnLoginBtn() {
			loginBtn.click();
		}
		
		public OrangeHomePage validateOnDash() throws IOException {
			boolean flag1 = dash.isDisplayed();
			if(flag1) {
				return new OrangeHomePage();
			}
			return null;
		}
}
