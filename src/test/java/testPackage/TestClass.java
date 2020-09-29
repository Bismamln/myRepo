package testPackage;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import testBasePackage.FileReaderManager;


public class TestClass {
	//FacebookLoginPage fbPage = new FacebookLoginPage();
	
	@BeforeTest
	public void openBrowser() {
		//ChromeBrowserInstantiation(); //Un-comment when Utility class to be extended here
		//openURL(); //Un-comment when Utility class to be extended here
		//maximizeWindow(); //Un-comment when Utility class to be extended here
		//implicitWait(); //Un-comment when Utility class to be extended here
		
		FileReaderManager.getInstance().getUtilityReader().ChromeBrowserInstantiation();
		FileReaderManager.getInstance().getUtilityReader().openURL();
		FileReaderManager.getInstance().getUtilityReader().maximizeWindow();
		FileReaderManager.getInstance().getUtilityReader().implicitWait();
	}
	
	@AfterTest
	public void closeConnection() {
		//closeBrowser();	//Un-comment when Utility class to be extended here
		
		//FileReaderManager.getInstance().getUtilityReader().closeBrowser();
	}
	
	@Test(invocationCount = 0)
	public void LogInToFacebookPage() {
		//fbPage.enterUserName(1,0); //Un-comment when Facebook Login Page class Object needs to be created
		//fbPage.enterPassword(1,1); //Un-comment when Facebook Login Page class Object needs to be created
		//fbPage.clickOnLogin(); //Un-comment when Facebook Login Page class Object needs to be created
		
		FileReaderManager.getInstance().getFbLoginPageReader().enterUserName(2, 0);
		FileReaderManager.getInstance().getFbLoginPageReader().enterPassword(2, 1);
		FileReaderManager.getInstance().getFbLoginPageReader().clickOnLogin();
	}
	
	@Test
	public void FacebookSignUp() {
		
		FileReaderManager.getInstance().getFbSignUpPageReader().clickOnCreateAccount();
		FileReaderManager.getInstance().getFbSignUpPageReader().enterFirstName(1, 2);
		FileReaderManager.getInstance().getFbSignUpPageReader().enterLastName(1, 3);
		FileReaderManager.getInstance().getFbSignUpPageReader().enterEmail(1, 4);
		FileReaderManager.getInstance().getFbSignUpPageReader().enterPassword(1, 5);
		FileReaderManager.getInstance().getFbSignUpPageReader().selectDayOfBirth("5");
		FileReaderManager.getInstance().getFbSignUpPageReader().selectMonthOfBirth("02");
		FileReaderManager.getInstance().getFbSignUpPageReader().selectYearOfBirth("1990");
		FileReaderManager.getInstance().getFbSignUpPageReader().selectGender();
		FileReaderManager.getInstance().getFbSignUpPageReader().enterPronoun();
		FileReaderManager.getInstance().getFbSignUpPageReader().clickOnSignUp();
	}

}
