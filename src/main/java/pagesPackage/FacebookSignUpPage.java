package pagesPackage;

import testBasePackage.FileReaderManager;

public class FacebookSignUpPage {


	public void clickOnCreateAccount() {
		FileReaderManager.getInstance().getUtilityReader().clickOnElement("FbCreateNewAccountButton");
	}

	public void enterFirstName(int rowNum , int colNum) {

		FileReaderManager.getInstance().getUtilityReader().sendKeysMethod("FbSignUpFirstName", FileReaderManager.getInstance().getTestBaseReader()
				.readExcelFile(rowNum, colNum));
	}

	public void enterLastName(int rowNum , int colNum) {

		FileReaderManager.getInstance().getUtilityReader().sendKeysMethod("FbSignUpLastName", FileReaderManager.getInstance().getTestBaseReader()
				.readExcelFile(rowNum, colNum));
	}

	public void enterEmail(int rowNum , int colNum) {

		FileReaderManager.getInstance().getUtilityReader().sendKeysMethod("FbSignUpEmail", FileReaderManager.getInstance().getTestBaseReader()
				.readExcelFile(rowNum, colNum));
	}

	public void enterPassword(int rowNum , int colNum) {

		FileReaderManager.getInstance().getUtilityReader().sendKeysMethod("FbSignUpPassword", FileReaderManager.getInstance().getTestBaseReader()
				.readExcelFile(rowNum, colNum));
	}

	public void selectDayOfBirth(String enterValueForDropdown) {

		FileReaderManager.getInstance().getUtilityReader().selectValueFromDropdown("FbSignUpDayOfBirth", enterValueForDropdown);

	}

	public void selectMonthOfBirth(String enterValueForDropdown) {

		FileReaderManager.getInstance().getUtilityReader().selectValueFromDropdown("FbSignUpMonthOfBirth", enterValueForDropdown);

	}

	public void selectYearOfBirth(String enterValueForDropdown) {

		FileReaderManager.getInstance().getUtilityReader().selectValueFromDropdown("FbSignUpYearOfBirth", enterValueForDropdown);

	}

	public void selectGender() {

		FileReaderManager.getInstance().getUtilityReader().clickOnElement("FbSignUpGenderMale");

	}

	public void enterPronoun() {

		FileReaderManager.getInstance().getUtilityReader().sendKeysMethod("FbSignUpPronoun", "Selenium Project");
	}

	public void clickOnSignUp() {

		FileReaderManager.getInstance().getUtilityReader().clickOnElement("FbSignUpButton");
	}

}
