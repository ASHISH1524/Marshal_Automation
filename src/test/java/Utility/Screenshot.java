package Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static void Screenshot_Function(WebDriver driver) throws IOException {
		// Taking screenshot
		TakesScreenshot ts = (TakesScreenshot) driver; // For taking screenshot
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./ScreenshotMarshallsPetzone/Homepage.png")); // Name and path of the file given
		System.out.println("Successfully taken the screenshot");

	}
}
