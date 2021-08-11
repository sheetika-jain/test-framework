package Utils;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelHelper {
	
	private static Logger Log = LogManager.getLogger(ExcelHelper.class);
	
	public static Object[][] getExcelData(String fileName, String sheetName) {
		
		Object[][] data = null;
		XSSFWorkbook wb = null;
		try {
			wb = new XSSFWorkbook ("/Users/sheetikajain/Documents/test-framework/Resources/" + fileName);
			XSSFSheet sheet = wb.getSheet(sheetName);
			//int rowsIndex = sheet.getLastRowNum();
			int rowsIndex = 2;
			Log.info("total rows:" + rowsIndex);
			data = new Object[rowsIndex][];
			
			for (int i = 1; i<=rowsIndex; i++) {
				XSSFRow row = sheet.getRow(i);
				//int cols = row.getLastCellNum();
				int cols = 2;
				Log.info("total cols:" + cols);
				Object[] colData = new Object[cols];
				for (int j = 0; j < cols; j++) {
					colData[j] = row.getCell(j).toString();
				}
				data[i-1] = colData;
			}
		}
		
		catch (IOException e) {
			Log.error("ExcelHelper exception: " +e);
		}
		finally {
			try {
				wb.close();
			}
			catch (IOException e) {
				Log.error(e);
			}
		}
		
		return data;
	}

}
