package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class MyAccountPage extends TestBase{
	@FindBy(name = "search")
	WebElement searchbox;
	
	@FindBy(css="span.input-group-btn")
	WebElement searchBtn;
	
	public MyAccountPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	//Actions
		//login
		public SearchResultPage searchItem(String strItem) {
			searchbox.sendKeys(strItem);
			searchBtn.click();
			return new SearchResultPage();
		}
		
		public String getAcctPage() {
			
			return driver.getTitle();
		}
}
