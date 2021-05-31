package Library;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class StandardLibrary {
	// Step1: Method to invoke
	public void invoke(WebDriver driver) throws IOException {
		FileReader fr = new FileReader("DataMarshall\\MarshallTestData.properties"); // File containing url of the
																						// application
		Properties p = new Properties();
		p.load(fr); // Loads the file
		driver.get(p.getProperty("MarshallURL")); // Invoking the application
	}
}
