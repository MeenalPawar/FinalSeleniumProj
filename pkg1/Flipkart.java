package pkg1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com");
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[1]/input")).sendKeys("8237921950");
		
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[2]/div/form/div[3]/button")).click();
		
		Thread.sleep(2000);
		
		
		
		//Searching
		WebElement searchBox = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[2]/form/div/div/input"));
		searchBox.sendKeys("SmartWatch");
		Thread.sleep(2000);
		searchBox.sendKeys(Keys.ENTER);
		

		//click on product 
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[4]/div/div")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[1]/div/div[1]/div/section[4]/div[2]/div[1]/div[3]/div/label/div[1]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div[2]/div/div[3]/div/div")).click();
		Thread.sleep(2000);
		
		
		String mainWindowHandle = driver.getWindowHandle();
			for(String windowHandle: driver.getWindowHandles())
			{
				if(!windowHandle.equals(mainWindowHandle)) {
					driver.switchTo().window(windowHandle);
				}
			}
		
		//add to cart inside new tab
			driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")).click();
			driver.findElement(By.xpath("//*[@id=\"swatch-1-display_size\"]/a")).click();
			
			Thread.sleep(1000);
		//return to main tab
			driver.close();
			driver.switchTo().window(mainWindowHandle);
			
		
		//main page actions continue
			
	//	driver.findElement(By.xpath("")).click();
			
		//logout
			
			
			
	}

}
