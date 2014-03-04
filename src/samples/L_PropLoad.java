package samples;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

// http://www.mkyong.com/java/java-properties-file-examples/
public class L_PropLoad {

	public static void main(String[] args) throws IOException {
		// Path to the property file
		InputStream in = null;
		in = new FileInputStream("/home/abu/Desktop/a.config");

		// Get the data from the file to the Properties
		Properties prop = new Properties();
		prop.load(in);

		String website = prop.getProperty("website");
		int number = Integer.parseInt(prop.getProperty("number"));
		String gh = prop.getProperty("lop");

		number = number + 10;

		System.out.println("The website is: " + website);
		System.out.println("The number+10 is " + number);

	}
}
