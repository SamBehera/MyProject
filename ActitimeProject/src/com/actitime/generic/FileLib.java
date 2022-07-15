package com.actitime.generic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FileLib {
/**
 * Take input from Propertyfile.
 * @param key
 * @return
 * @throws IOException
 */
	public String GetPropertyData(String key) throws IOException {
		FileInputStream fis=new  FileInputStream("./data/PropertyFIle.property");
		Properties p=new Properties();
		p.load(fis);
		String data=p.getProperty(key);
		return data;
	}
	
	/**
	 * Read from Excel File. 
	 * @param sheetname
	 * @param row
	 * @param cell
	 * @return
	 * @throws IOException
	 */
	public String GetExcelData(String sheetname, int row, int cell) throws IOException {
		FileInputStream fis=new  FileInputStream("./data/testscript.xlsx");
		Workbook wb= WorkbookFactory.create(fis);
		String data=wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
	}
}	
