package DriverSetup;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSetup {
	public static WebDriver driverSetup()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("1)ChromeBrowser");
		System.out.println("2)FirefoxBrowser");
		System.out.println("Please enter the browser of your choice :");
		int ch = sc.nextInt();
		WebDriver driver;
			
		switch(ch)
		{
		case 1:
			 //System.setProperty(“propertyName”, “value”). It implies that it sets the system property name to its value.
			 System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");//Path of Chrome driver
			 driver = new ChromeDriver();
			 break;
		 
		 
		 
		case 2:
			System.setProperty("webdriver.gecko.driver", "./Browsers/geckodriver.exe");//Path of Firefox driver in the project
			driver = new FirefoxDriver(); 
			 break;
		
		 
		 default:
		 
			 System.setProperty("webdriver.chrome.driver", "./Browsers/chromedriver.exe");//Path of Chrome driver 
			 driver = new ChromeDriver();
			 break;
		 
		}
		 return driver;  
	}	
	}