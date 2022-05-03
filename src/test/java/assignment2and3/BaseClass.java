package assignment2and3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;

	@BeforeTest
	public void setup() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.talentintelligence.com");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void navigateDiversity() {
		WebElement hoverServices = driver.findElement(By.xpath("(//span[text()='Services'])[1]"));
		ElementUtility.hoverList(hoverServices);
		WebElement diversity = driver.findElement(By.xpath("(//span[text()='Diversity'])[1]"));
		ElementUtility.waitTillElement(diversity);
		ElementUtility.click(diversity);
		String diversityTitle = driver.getTitle();
		System.out.println(diversityTitle);
		Assert.assertEquals(diversityTitle, "Diversity & Inclusion Practices - D&I Strategy | Talent Intelligence");
	}

	@Test
	public void navigateResearch() {
		WebElement hoverServices = driver.findElement(By.xpath("(//span[text()='Services'])[1]"));
		ElementUtility.hoverList(hoverServices);
		WebElement research = driver.findElement(By.xpath("(//span[text()='Research'])[1]"));
		ElementUtility.waitTillElement(research);
		ElementUtility.click(research);
		String ResearchTitle = driver.getTitle();
		System.out.println(ResearchTitle);
		Assert.assertEquals(ResearchTitle, "Research - Data That Helps You Find Great Talent");

	}

	@AfterTest
	public void tearDown() {
		driver.quit();
	}

}
