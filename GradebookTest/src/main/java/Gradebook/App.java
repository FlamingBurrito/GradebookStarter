package Gradebook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;
import org.apache.commons.csv.CSVRecord;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.io.RandomAccessBufferedFileInputStream;
import org.apache.pdfbox.io.RandomAccessRead;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

public class App 
{	
	
    public static void main( String[] args ) throws IOException
    {
    	//Ruskin ruskin = new Ruskin();
    	//ruskin.run();
    	//Guadalupe g = new Guadalupe();
    	//g.run();
    	//Center center = new Center();
    	//center.run();
    	//KCK kck = new KCK();
    	//kck.run();
    	
    	Gradebook missingAssignments = new Gradebook();
    	missingAssignments.run();
    }
    
}
