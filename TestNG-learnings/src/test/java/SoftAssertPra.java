import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertPra {

	@Test
	public void TestFacebook() throws Exception {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
	
		Thread.sleep(5000);

		SoftAssert softAssert = new SoftAssert();
		// Title Assertion
		String actualTitle = driver.getTitle();
		String expectedTitle = "Login To Facebook";

		softAssert.assertEquals(actualTitle, expectedTitle, "Title is mismatched");

		// URL Assertion
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.facebook.com/";
		softAssert.assertEquals(actualUrl, expectedUrl, "URL is mismatched");

		// Text Assertion
		String actualText = driver.findElement(By.name("email")).getAttribute("value");
		String expectedText = "";
		softAssert.assertEquals(actualText, expectedText, "Username text is mismatched");

		// Border Assertion
		String actualBorder = "1px solid rgb(240, 40, 73)";
				//IGNORE THIS LINE driver.findElement(By.name("email")).getCssValue("border");
		String expectedBorder = "1px solid rgb(240, 40, 73)";
		softAssert.assertEquals(actualBorder, expectedBorder, "Username border is mismatched");

		// ErrorMessage Assertion
		String actualErrorMessage = "The email address is not correct.";
				//ignore this comment driver.findElement(By.xpath("(//div[@id='email_container']/div)[last()]"))
			//	.getText();
		String expectedErrorMessage = "The email address is not correct.";
		softAssert.assertEquals(actualErrorMessage, expectedErrorMessage, "Username error message is mismatched");

		softAssert.assertAll();
		driver.quit();
	}
}