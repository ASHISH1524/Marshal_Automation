package Utility;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import POMRepos.Homepage;

public class Excel {

	// Storing the name and price of the first product in the excel sheet
	public void Excel_Function(WebDriver driver) throws IOException {
		XSSFWorkbook wb = new XSSFWorkbook();
		XSSFSheet sheet = wb.createSheet("Marshall Sheet");

		// Create a row and put some cells in it. Rows are 0 based.
		XSSFRow row1 = sheet.createRow(0);

		// Create a cell
		String Name = driver.findElement(By.xpath(Homepage.ToyName)).getText();
		row1.createCell(0).setCellValue(Name);

		XSSFRow row2 = sheet.createRow(1);

		String Price = driver.findElement(By.xpath(Homepage.ToyPrice)).getText();
		row2.createCell(0).setCellValue(Price);

		// Write the output to a file
		FileOutputStream fileOut = new FileOutputStream("workbook.xlsx");
		wb.write(fileOut);
		fileOut.close();
		System.out.println("Successfully Created workbook");
	}

	public static String getvalue1() throws IOException {

		FileInputStream f = new FileInputStream("workbook.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(f);
		XSSFSheet sh = wb.getSheet("Marshall Sheet");
		String value1 = sh.getRow(0).getCell(0).getStringCellValue(); // Storing the value from the excel sheet to a
																		// string
		return value1;
	}
}
