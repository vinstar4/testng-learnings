import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertions {

	@Test
	public void TestGoogleAssert() throws Exception {
		
		WebDriver driver = new ChromeDriver();
		//Assert basics...
		//Other assertions like Assert.assertTrue/False/Null/notNull are popular
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
	//	driver.findElement(By.name("q")).sendKeys("Hello Testng", Keys.ENTER);
	//	System.out.println(driver.getCurrentUrl());
		String actualURL= driver.getCurrentUrl();
		String expectedURL="https://www.gooogle.com";
		Assert.assertEquals(actualURL, expectedURL,"failed");
		//
		Thread.sleep(1000);
		driver.quit();
	}

	

}
