package SearchFunctionality;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.*;

import POM.HomePage;
import POM.SearchPage;
import TestBase.Base;
@Listeners(Utilities.Listener.class)

public class TC_01 {

	public static HomePage hp;
	public static SearchPage Sp;
@BeforeClass
public void initialise() throws IOException
{  
	Base.initialise();
}

@Test
public void searchbook()
{   hp=new HomePage();
    Sp=new SearchPage();
	hp.Search(Base.Searchvalue);

	//Assert.assertEquals(Sp.validate(), Base.Searchvalue);
	Assert.assertEquals(Sp.validate(),"Test");
	
}


@AfterClass
public void quit()
{
	Base.quit();
}
}
