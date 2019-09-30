package Gradebook;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;

public class Gradebook {

	public void run() throws IOException {
		
    	String directory = "C:\\Users\\killerhampsters\\Desktop\\";
    	
    	try {
    		Reader in = new FileReader(directory+"sheet.csv");
			Iterable<CSVRecord> records = CSVFormat.EXCEL.parse(in);
			
			for(CSVRecord rec : records) {
				System.out.println(rec.get(0));
			}
    	} catch (FileNotFoundException e2) {
			e2.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
