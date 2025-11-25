package org.dwsapp.genericlibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelLibrary implements ProjectConstant{
	public FileInputStream fis;
	public FileOutputStream fos;
	public Workbook book;

	public String readSingleData(String Sheetname, int rownum, int columnnum) {

		try {
			fis = new FileInputStream(excelpath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		try {
			book=WorkbookFactory.create(fis);
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return book.getSheet(Sheetname).getRow(rownum).getCell(columnnum).getStringCellValue();
	}

}
