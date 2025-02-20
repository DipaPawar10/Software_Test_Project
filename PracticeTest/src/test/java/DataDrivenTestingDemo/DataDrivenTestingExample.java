package DataDrivenTestingDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivenTestingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook ExcelWBook = null;
		XSSFSheet ExcelWSheet;
//		XSSFRow Row;
//		XSSFCell Cell;
		
		//create an object of file class to open an file
		File excelFile =  new File("E:\\TestDataFile.xlsx");
		FileInputStream inputStream = null;
		//create an object of FileInputStream to read data from file
		try {
		 inputStream = new FileInputStream(excelFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Excel->workbook>Sheet->row->cell
		//Create object of XSSworkbook to handle xslx file
		try {
			ExcelWBook = new XSSFWorkbook(inputStream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//to access workbook sheet
		ExcelWSheet = ExcelWBook.getSheetAt(0);
		
		//get total row count
		int ttlRows = ExcelWSheet.getLastRowNum()+1;
		
		int ttlCells = ExcelWSheet.getRow(0).getLastCellNum();
		
		for(int currentRow = 0; currentRow<ttlRows; currentRow++) 
		{
			for(int currentCell = 0; currentCell<ttlCells; currentCell++) 
			{
				System.out.print(ExcelWSheet.getRow(currentRow).getCell(currentCell).toString());
				System.out.print("\t");
			}
			
			System.out.println();
		}
	try {
		ExcelWBook.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	

}

