package testBasePackage;

import pagesPackage.FacebookLoginPage;
import pagesPackage.FacebookSignUpPage;

public class FileReaderManager {
	
	private static FileReaderManager fileReader = new FileReaderManager();
	private static TestBase testBase = new TestBase();
	private static UtilityClass utility = new UtilityClass() ;
	private static FacebookLoginPage fbLoginPage = new FacebookLoginPage();
	private static FacebookSignUpPage fbSignUpPage = new FacebookSignUpPage();
	
	private FileReaderManager() {

	}
	
	public static FileReaderManager getInstance() {
		
		return fileReader;
	}
	
	public TestBase getTestBaseReader() {
		return(testBase == null) ? new TestBase() : testBase ;
	}
	
	public UtilityClass getUtilityReader() {
		return(utility == null) ? new UtilityClass() : utility ;
	}
	
	public FacebookLoginPage getFbLoginPageReader() {
		return(fbLoginPage == null) ? new FacebookLoginPage() : fbLoginPage ;
	}
	
	public FacebookSignUpPage getFbSignUpPageReader() {
		return(fbSignUpPage == null) ? new FacebookSignUpPage() : fbSignUpPage ;
	}

}
