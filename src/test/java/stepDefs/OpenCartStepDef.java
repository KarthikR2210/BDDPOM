package stepDefs;

import java.util.List;

import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.en.*;
import pages.HomePage;
import pages.LoginPage;
import pages.MyAccountPage;

public class OpenCartStepDef extends TestBase{
	HomePage homePage;
	LoginPage loginPage;
	MyAccountPage acctPage;
	@When("User is on opencart home page")
	public void user_is_on_opencart_home_page() {
		initialize();
	}
	
	@When("User navigates to login page")
	public void user_navigates_to_login_page() {
		homePage = new HomePage();
		homePage.navigateToLogin();
		Assert.assertEquals(driver.getTitle(), "Account Login");
	}
	
	@Given("User login with {string} and {string}")
	public void user_login_with_and(String strUser, String strPwd) {
		loginPage = new LoginPage();
		acctPage = loginPage.login(strUser, strPwd);
	}
	
	@Then("User navigate to My Account page")
	public void user_navigate_to_my_account_page() {
		acctPage = new MyAccountPage();
		String strTitle = acctPage.getAcctPage();
		Assert.assertEquals(strTitle, "My Account");
		}
	
	
	@Given("User search item")
	public void user_search_item(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> items= dataTable.asLists();
		String strItem = items.get(0).get(0);
		acctPage.searchItem(strItem);
	}
	
	@Then("User navigate to search result page")
	public void should_navigate_to_search_result_page() {
		
	}
	
	
	@When("User Add Item to cart")
	public void user_add_item_to_cart() {
		
	}
	
	@Then("Item must be available in cart")
	public void item_must_be_available_in_cart() {
		
	}
}
