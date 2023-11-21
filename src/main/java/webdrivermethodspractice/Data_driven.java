package webdrivermethodspractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Data_driven {

	public static void main(String[] args) throws InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		File f= new File("C:\\Users\\Admin\\Desktop\\New XLS Worksheet.xlsx");
		FileInputStream fin=new FileInputStream(f);
       XSSFWorkbook wb=new XSSFWorkbook(fin);
        XSSFSheet sh=wb.getSheet("New XLS Worksheet");
        Row r=sh.getRow(1);
        Cell c1=r.getCell(1);
        System.out.println(c1);
      int  rowcount=sh.getPhysicalNumberOfRows();
       int columncount=r.getPhysicalNumberOfCells() ;
       System.out.println(rowcount);
       System.out.println(columncount);
       for(int i=1;i<=rowcount;i++)
       {
    	   for(int j=0;j<=columncount;j++)
    	   {
    		  r=sh.getRow(i);
    		 c1=r.getCell(j);
    		   System.out.println(c1);
    	   }
       }
	}

}
