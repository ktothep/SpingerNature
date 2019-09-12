package TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.codoid.products.exception.FilloException;

/*Base class which consist of the initialisation and quitting of the webdriver*/

public class Base {

public static WebDriver driver;
public static String Searchvalue;
	
	public static void initialise() throws IOException
	{
		driver=new ChromeDriver();
		File f=new File(System.getProperty("user.dir")+"//Properties.properties");
		FileInputStream fis=new FileInputStream(f);
		Properties prop=new Properties();
		prop.load(fis);
		String URL=prop.getProperty("URL");		
		Searchvalue=prop.getProperty("searchvalue");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(URL);
		
	}
	
	public static void quit()
	{
		driver.quit();
	}
}
