package assignment2and3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase extends BaseClass {

	Page p;

	@BeforeClass
	public void init() {
		p = new Page(driver);
	}

	@Test
	public void navigateAboutUsAndVerifyTitle() {

		p.HoverAndClickAboutUs();
		p.verifyAboutUsTitle();

	}

	@Test
	public void navigateServicesAndVerifyTitle() {

		p.hoverAndClickServices();
		p.verifyRecruitmentTitle();
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
}
