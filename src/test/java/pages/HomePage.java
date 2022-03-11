package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class HomePage extends TestBase {
	
	@FindBy(xpath="//span[contains(text(),'My Account')]")
	WebElement myAcct;
	
	@FindBy(linkText = "Login")
	WebElement loginLink;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	//Actions
	public void navigateToLogin() {
		myAcct.click();
		loginLink.click();
		System.out.println("Changed");
		System.out.println("New changes");
	}
	
	
}
