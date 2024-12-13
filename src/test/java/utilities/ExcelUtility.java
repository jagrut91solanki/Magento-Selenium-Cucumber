package utilities;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class ExcelUtility {

    public static void writeToExcel(String path, String testResult) {
        File file = new File(path);

        if (!file.exists()) {
            XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("Scenarios");

            Row newRow = sheet.createRow(0);
            Cell newCell = newRow.createCell(0);
            newCell.setCellValue(testResult);

            try {
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }
            System.out.println("File Created");
        } else {
            FileInputStream inputStream = null;
            Workbook workbook = null;
            Sheet sheet = null;

            try {
                inputStream = new FileInputStream(path);
                workbook = WorkbookFactory.create(inputStream);
                sheet = workbook.getSheetAt(0);
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            int rowTotal = sheet.getPhysicalNumberOfRows();
            Row newRow = sheet.createRow(rowTotal);
            Cell newRowCell = newRow.createCell(0);
            newRowCell.setCellValue(testResult);

            try {
                inputStream.close();
                FileOutputStream outputStream = new FileOutputStream(path);
                workbook.write(outputStream);
                workbook.close();
                outputStream.close();
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

            System.out.println("File already exist");
        }
    }

}
