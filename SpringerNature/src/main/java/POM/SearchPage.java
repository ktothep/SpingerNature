package POM;
/*Page object model for SearchPage*/
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class SearchPage extends Base {

	@FindBy(xpath="//*[@id='number-of-search-results-and-search-terms']/strong[2]")
	WebElement searchedvalue;
	
	
	
	public SearchPage()
	{
		PageFactory.initElements(driver,this);
	}
		
	
	public String  validate() {
		
		
		String value=searchedvalue.getText();
		value=value.replace("'","").trim();
		return value;
		
	}
}
