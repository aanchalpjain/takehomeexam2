package propertiesfile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.io.*;

public class ReadPropertiesfile {

	public static void main(String[] args) {
		String filePath = "data\\Word.properties";

		if (doesfileExist(filePath)) {
			System.out.println("File exsists");
			Properties prop = new Properties();
			FileInputStream fs = null;
			try {

				fs = new FileInputStream(filePath);
			} catch (Exception e) {

				e.printStackTrace();
			}
			try {
				prop.load(fs);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Apple: " + prop.getProperty("Apple"));
			System.out.println("Table: " + prop.getProperty("Table"));
			System.out.println("Orange: " + prop.getProperty("Orange"));
		}
		else {
			System.out.println("File Does not exsist");
			
		}
	}

	public static boolean doesfileExist(String filePath) {
		File tempFile = new File(filePath);
		return tempFile.exists();
	}
}
