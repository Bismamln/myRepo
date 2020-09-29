package testBasePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityClass{
	static WebDriver driver ;
	//TestBase testBase = new TestBase(); // Un-comment when not using Singleton Design Pattern

	public void ChromeBrowserInstantiation() {
		System.setProperty(FileReaderManager.getInstance().getTestBaseReader().getProperties("ChromeProperties"),
				FileReaderManager.getInstance().getTestBaseReader().getProperties("ChromeDriverPath"));
		//System.setProperty(testBase.getProperties("ChromeProperties"), testBase.getProperties("ChromeDriverPath"));// Un-comment when not using Singleton Design Pattern
		driver = new ChromeDriver();
	}

	public void openURL() {

		driver.get(FileReaderManager.getInstance().getTestBaseReader().getProperties("BrowserURL"));
	}

	public void maximizeWindow() {
		driver.manage().window().maximize();
	}

	public void closeBrowser() {
		driver.close();
	}

	public void explicitWait(String locatorPath , Long waitTimeInSeconds) {

		WebDriverWait wait = new WebDriverWait(driver , waitTimeInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locatorPath)));
	}

	public void implicitWait() {
		Long implicitWait = Long.parseLong(FileReaderManager.getInstance().getTestBaseReader().getProperties("implicitlyWait"));
		driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
	}

	public  WebElement clickOnElement(String elementLocator) {
		WebElement elementToBeClicked = null ;
		try {
			elementToBeClicked = driver.findElement(By.xpath(FileReaderManager.getInstance().getTestBaseReader().getProperties(elementLocator)));

			if(elementToBeClicked.isDisplayed()) {
				elementToBeClicked.click();
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		return elementToBeClicked ;
	}

	public WebElement sendKeysMethod(String elementLocator, String value) {
		WebElement elementToBeSent = null ;
		try {
			elementToBeSent = driver.findElement(By.xpath(FileReaderManager.getInstance().getTestBaseReader().getProperties(elementLocator)));

			if(elementToBeSent.isDisplayed()) {
				elementToBeSent.sendKeys(value);
			}
		}catch(Exception e ) {

		}
		return elementToBeSent;
	}

	public WebElement selectValueFromDropdown(String elementLocator , String value) {
		WebElement element = null ;
		try {
			element = driver.findElement(By.xpath(FileReaderManager.getInstance().getTestBaseReader().getProperties(elementLocator)));
			if(element.isEnabled()) {
				Select select = new Select(element);
				select.selectByValue(value);
			}

		}catch(Exception e) {
			e.printStackTrace();
		}

		return element;
	}





}
