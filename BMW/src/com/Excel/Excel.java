package com.Excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel
{
	public void write_excel(int r, int c, String data) throws IOException
	{
		String filename="Testdata\\Book2.xlsx";
		String sheetname = "Sheet1";
		File f = new File(filename);
		FileInputStream fis = new FileInputStream(f);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sh = wb.getSheet(sheetname);
		XSSFRow row = sh.createRow(r);
		XSSFCell cell = row.createCell(c);
		FileOutputStream fos = new FileOutputStream(f);
		cell.setCellValue(data);
		wb.write(fos); 
	}
}
