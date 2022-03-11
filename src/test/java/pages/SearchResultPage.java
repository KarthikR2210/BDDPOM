package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import base.TestBase;

public class SearchResultPage extends TestBase{
	
	@FindBy(xpath="//h1[contains(text(),'Search')]")
	WebElement searchHeading;
	
	@FindBy(xpath = "//span[contains(text(),'Add')]")
	WebElement addToCart;
	
	
	@FindBy(id = "card-total")
	WebElement cartTotal;
	
	@FindBy(css="div.product-thumb")
	List <WebElement> items;
	
	
	
	
	
  
  public SearchResultPage() {
	  PageFactory.initElements(driver, this);
  }
  
  //Actions
  public void addItemToCart() {
	  addToCart.click();
  }
  
  public boolean isItemAdded() {
	  try {
		  Thread.sleep(3000);
		  
	  }catch (InterruptedException e) {
		  e.printStackTrace();
	  }
	  String total = cartTotal.getText();
	  System.out.println(total);
	  String itemCount = total.split(" ")[0];
	  int intCount = Integer.parseInt(itemCount);
	  if(intCount > 0)
	  return true;
	  else
		  return false;
	  
  }
  public boolean isResultPageDisplayed() {
	  return searchHeading.isDisplayed();
  }
}
