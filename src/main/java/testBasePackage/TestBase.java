package testBasePackage;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class TestBase {

	private File src ;
	private FileInputStream fis ;
	private XSSFWorkbook wb ;
	private XSSFSheet sh ;
	private Properties prop;

	public TestBase() {
		
		try {
			src = new File("C://Users//DELL//eclipse-workspace//MavenProject_Selenium_6_july_2020//PropertiesFile.properties");

			fis = new FileInputStream(src);

			prop = new Properties();
			prop.load(fis);
			//fis.close();
			//System.out.println("File Loaded");

		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public String getProperties(String propertyValue) {
		String properties =prop.getProperty(propertyValue);
		if(properties!=null)
		return properties;
		else throw new RuntimeException("Properties file not found");
	}
	public String readExcelFile(int rowNum , int colNum) {
		String cellData = null ;
		//String[][] arrayExcelData = null;
		try {
			src = new File("C:\\Users\\DELL\\eclipse-workspace\\MavenProject_Selenium_6_july_2020\\TestData.xlsx");

			fis = new FileInputStream(src) ;
			wb = new XSSFWorkbook(fis);
			sh = wb.getSheet("Sheet1");
			int totalRows = sh.getPhysicalNumberOfRows();
			//System.out.println(totalRows);
			//int rows = sh.getLastRowNum() - sh.getFirstRowNum();
			//System.out.println(rows);
			int totalColumns = sh.getRow(0).getPhysicalNumberOfCells();
			if(rowNum < totalRows && colNum < totalColumns) {
			cellData = sh.getRow(rowNum).getCell(colNum).getStringCellValue() ;
			}else {
				throw new Exception("Either Rows or Columns Exceeded total number of Rows and Columns in test Data sheet");
			}
			//arrayExcelData = new String[totalRows][totalColumns];
//			int ci = 0 ;
//			//to iterate for all the value present in Excel , we use for loop
//			for(int i = 1 ;i<totalRows;i++,ci++) {
//				int cj =0 ;
//				for(int j = 0 ;j<totalColumns;j++,cj++) {
//					arrayExcelData[ci][cj] = getCellData(i,j);
//				}
//			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return cellData;
	}
	

}
