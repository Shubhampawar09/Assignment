package assignment2and3;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtility extends BaseClass {

	/**
	 * This method is used to hover on element
	 * 
	 * @param element
	 */

	public static void hoverList(WebElement element) {
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	/**
	 * This method is used to click on element
	 * 
	 * @param element
	 */

	public static void click(WebElement element) {
		try {
			if (element.isDisplayed()) {
				element.click();
			}

		} catch (Exception e) {
			System.out.println("element not found");
		}
	}

	/**
	 * This method is used to wait till element is found
	 * 
	 * @param element
	 * @return
	 */

	public static WebElement waitTillElement(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, 10);
		return wait.until(ExpectedConditions.visibilityOf(element));

	}

}
