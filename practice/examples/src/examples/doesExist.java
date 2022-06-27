package examples;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class doesExist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		doesFileExist("apple");
		doesFileExist("table");
	}
	public static void doesFileExist(String a) {
	Properties prop = new Properties();
	try {
		InputStream input = new FileInputStream("src\\examples\\"+a+".properties");
		prop.load(input);
		String what = prop.getProperty(a+1);
		System.out.println( a);
		System.out.println( what);
		what = prop.getProperty(a+2);
		System.out.println( what);	

	} catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
