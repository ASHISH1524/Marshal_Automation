package Library;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import POMRepos.Homepage;

public class TestLibrary {
	
	//Clicking Dog in the main category
	public void DogClick_Function(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);   //The Implicit Wait in Selenium is used to tell the web driver to wait for a certain amount of time
		driver.findElement(By.xpath(Homepage.DogClick)).click();        //Dog clicked 
		
	}
	
	//Toys under sub-category is to be clicked, clicking the second product and obtaining the name and price of first product
	public void DogToy_Function(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //Implicit wait
		driver.findElement(By.xpath(Homepage.ToyClick)).click();         //Clicking the subcategory Toys under Dog 
		driver.findElement(By.xpath(Homepage.SecondToy)).click();       //Clicking on the second toy  
		driver.findElement(By.xpath(Homepage.Toy)).click();           //Going back to the toy page
		driver.findElement(By.xpath(Homepage.FirstToy)).click();       //Clicking on the first toy of the page
	}
	
	//First product added to cart and then proceed to chekout
	public void Cart_Function(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);  //Implicit wait
		driver.findElement(By.xpath(Homepage.Cart)).click(); //Clicking on the add to cart
		driver.findElement(By.xpath(Homepage.Checkout)).click(); //Clicking on the checkout button
	}
	
	//Verifying the stored value from excel and the product in the shopping cart page
	public void Verify_Function(WebDriver driver) throws IOException
	{
		String ProductName = driver.findElement(By.xpath(Homepage.CartName)).getText(); //Taking the name of the product in the summary page and storing it in a string
		String Stored=Utility.Excel.getvalue1(); //Taking the name of the product from excel sheet and storing it in a string
		Assert.assertEquals(ProductName, Stored); //Validating the values by using assert		
	}
}
