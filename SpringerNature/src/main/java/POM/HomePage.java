package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.Base;

public class HomePage extends Base {

@FindBy(xpath="//*[@id='query']")
public static WebElement searchbox;

@FindBy(xpath="//*[@id='search']")
public static WebElement searchbutton;

public HomePage()
{
	PageFactory.initElements(driver,this);
}
	

public  void Search(String searchvalue)
{
	searchbox.sendKeys(searchvalue);
	searchbutton.click();
}

}
