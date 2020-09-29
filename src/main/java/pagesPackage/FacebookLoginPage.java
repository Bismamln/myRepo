package pagesPackage;

import testBasePackage.FileReaderManager;

public class FacebookLoginPage {
	//TestBase testBase = new TestBase(); // Un-comment when not using Singleton Design Pattern
	//UtilityClass utility = new UtilityClass(); // Un-comment when not using Singleton Design Pattern
	
	public void enterUserName(int rowNum , int colNum) {
		FileReaderManager.getInstance().getUtilityReader().sendKeysMethod("FacebookUsername", FileReaderManager.getInstance().getTestBaseReader()
				.readExcelFile(rowNum, colNum));
		//utility.sendKeysMethod("FacebookUsername", testBase.readExcelFile(rowNum, colNum)); // Un-comment when not using Singleton Design Pattern
	}
	
	public void enterPassword(int rowNum , int colNum) {
		FileReaderManager.getInstance().getUtilityReader().sendKeysMethod("FacebookPassword", FileReaderManager.getInstance().getTestBaseReader()
				.readExcelFile(rowNum, colNum));
		//utility.sendKeysMethod("FacebookPassword", testBase.readExcelFile(rowNum, colNum)) ; // Un-comment when not using Singleton Design Pattern
		
	}
	
	public void clickOnLogin() { 
		FileReaderManager.getInstance().getUtilityReader().clickOnElement("FacebookLoginButton"); 
		//utility.clickOnElement("FacebookLoginButton"); // Un-comment when not using Singleton Design Pattern
	}

}
