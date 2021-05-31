package Tests;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import DriverSetup.BrowserSetup;
import Library.StandardLibrary;
import Library.TestLibrary;
import Utility.Excel;
import Utility.Screenshot;

//It is main driver class
public class Driver {
	    //Object for all the method libraries are created.
	    BrowserSetup b1 = new BrowserSetup();
		StandardLibrary s1 = new StandardLibrary();
		TestLibrary t1 = new TestLibrary();
		Excel ex=new Excel();
		Screenshot ss=new Screenshot();
		WebDriver driver;

			
		@BeforeMethod //The annotated method will be run before each test method.
		public void f1() throws IOException
		{
			driver = b1.driverSetup(); //For choosing the browser 
			s1.invoke(driver);  //Invoking the page
			driver.manage().deleteAllCookies();   //Deleting the browser cookies
			driver.manage().window().maximize();   //This method is used to maximize the current browser.
		}
		
		@Test //Marks a class or a method as a part of the test.
		public void f2() throws InterruptedException, IOException
		{
			t1.DogClick_Function(driver);       //DogClick function is called to click on Dog
			t1.DogToy_Function(driver);        //DogToy function is called to click on Toy, then click on second product and obtaining the name and price of first product
			ex.Excel_Function(driver);        //Excel function is called For storing the name and price of the first product in the excel sheet
			t1.Cart_Function(driver);        //Cart function is called to add the product to cart and proceed for checkout
			ss.Screenshot_Function(driver);  //Screenshot was captured
			t1.Verify_Function(driver);	      //Verify function is called for verifying the stored value from excel and the product in the shopping cart page		
		}
		
		@AfterTest //The annotated method will be run after all the test methods belonging to the classes inside the <test> tag have run.
		public void f3()
		{
			driver.quit(); //Used to exit the browser
		}  
}
