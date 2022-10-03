package com.test;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class test_8 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
			
		File file=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Project1\\TestData\\Excel_sheet.xlsx");
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		String data=wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(data);
	}

}
