//import java.util.ArrayList;
//import java.util.*;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenKart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		/*TO get one type of vegatble in to cart
		 * 
		 * driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		 *  List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		 * for (int i=0; i<products.size(); i++) 
		 * { String name = products.get(i).getText(); 
		 * if(name.contains("Cucumber"))
		 *  {
		 * driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click( );
		 *  break;
		 *   } 
		 *   }
		 */

		
		// To add multiple vegetable to cart
		//We need to Arrays
		
	/*String[] vegatablesNeed = {"Brocolli","Cucumber","Beetroot"};				// Declaring array
	driver.get("https://rahulshettyacademy.com/seleniumPractise/");
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	
	for(int i=0; i<products.size();i++)
	{
		String name= products.get(i).getText();
		 //List itemsAddtoCart = Arrays.asList(VegatablesNeed); 	 //Converting array to array list
		List itemsAddtoCart = Arrays.asList(vegatablesNeed);
		
		 if(itemsAddtoCart.contains(name))
		 {
			 driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click( ); 
		 }
	}
	
	*/
		
		
		//TO get multiple vegetables without providing - 1kg
	/*
		String[] itemsNeeded = {"Brocolli", "Beetroot", "Tomato"};	
  	    int j=0;		// To iterate the for loop only above items number
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");	// hit the url
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));	// to find the all elements with same code
		
		for(int i=0; i<products.size(); i++)		// to check product count and to iterate all
		{
			String[]  name= products.get(i).getText().split("-"); 		// split method is used to separate the name by index 
			String formattedName = name[0].trim();    					//   Trim method is used to remove spaces
			
			// Format to get actual vegetable name instead of vegetable name0 - 1 kg
			// First need to convert array in to array list
			// Check weather name you extracted is present in the array list or not
			List itemsAddtoCart = Arrays.asList(itemsNeeded);	// adding item from array to array list

			
			if(itemsAddtoCart.contains(formattedName))			// checking array list contain item or not
			{
				j++;											// increase the iteration for break statement
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click( ); 	// to click add cart button Xpath byusign parent child relation
				if(j==itemsNeeded.length)
				{
					break;
				}
			}*/
		}
		
		
		
		
	}

