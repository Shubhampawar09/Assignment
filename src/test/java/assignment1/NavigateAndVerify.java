package assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NavigateAndVerify {

	public static WebDriver driver;

	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void navigateAndVerify() {
		driver.get("https://www.randallreilly.com");

		String ActualTitle = driver.getTitle();
		String ExpectedTitle = "Randall Reilly | The Growth Platform for Vital Industries";
		Assert.assertEquals(ExpectedTitle, ActualTitle);

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
