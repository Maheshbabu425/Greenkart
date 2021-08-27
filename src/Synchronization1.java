import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization1 {

	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Softwares\\WebDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	//	driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);			// Giving implicitly wait globally
		WebDriverWait w = new WebDriverWait(driver,5);	// Explicitly Web Driver Wait- Need to add globally
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		
		//Thread.sleep(3000);
		listProduct(driver);		// Here we need to call real driver and arrays if we declare an array in main method when need to call that array
		//Synchronization1	mahi = new Synchronization1();		// For non static methods by using object we access the element.
		//Synchronization1.listProduct(driver);		// calling method to main method by using object
		//mahi.listProduct(driver);	// calling method to main method by using object
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));	// Explicitly Wait
		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();	
		
		//WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));	// Explicitly Wait
		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
		
		
	}

	public static void listProduct(WebDriver driver) {

		// driver.get("https://rahulshettyacademy.com/seleniumPractise/");

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));		

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			if (name.contains("Cucumber")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}
		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText();
			if (name.contains("Tomato")) {
				driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
				break;
			}
		}

	}
}