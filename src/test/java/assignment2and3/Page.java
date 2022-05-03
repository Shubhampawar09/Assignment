package assignment2and3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Page {

	WebDriver driver;

	public Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()='About Us']")
	WebElement aboutUs;

	@FindBy(xpath = "(//span[text()='About Us'])[2]")
	WebElement clickAboutUs;

	@FindBy(xpath = "(//span[text()='Services'])[1]")
	WebElement services;

	@FindBy(xpath = "(//span[text()='Recruitment'])[1]")
	WebElement recuritment;
	
	@FindBy(xpath="(//span[text()='Diversity'])[1]")
	WebElement diversity;

	/**
	 * This method is used to hover aboutUs and click on element
	 */
	public void HoverAndClickAboutUs() {
		ElementUtility.hoverList(aboutUs);
		ElementUtility.waitTillElement(clickAboutUs);
		ElementUtility.click(clickAboutUs);

	}

	/**
	 * This method is used to verify title
	 */
	public void verifyAboutUsTitle() {
		String AboutTitle = driver.getTitle();
		Assert.assertEquals(AboutTitle, "Global Hiring Consultant - The Smarter Solution | Talent Intelligence");

	}

	/**
	 * This method is used to hover services and click element
	 */
	public void hoverAndClickServices() {
		ElementUtility.hoverList(services);
		ElementUtility.waitTillElement(recuritment);
		ElementUtility.click(recuritment);

	}

	/**
	 * This method is used to verify recruitment title
	 */
	public void verifyRecruitmentTitle() {
		String recruitmentTitle = driver.getTitle();
		Assert.assertEquals(recruitmentTitle, "Recruitment - Talent Sourcing | Talent Intelligence");
	}
	
	/**
	 * This method is used to hover services and click element
	 */
	public void hoverAndClickDiversity() {
		ElementUtility.hoverList(services);
		ElementUtility.waitTillElement(diversity);
		ElementUtility.click(diversity);
		
	}
	
	/**
	 * This method is used to verify diversity title
	 */
	public void verifyDiversityTitle() {
		String diversityTitle = driver.getTitle();
		System.out.println(diversityTitle);
		Assert.assertEquals(diversityTitle, "Diversity & Inclusion Practices - D&I Strategy | Talent Intelligence");
		
	}

}
