package amzPom;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import config.Configuration;

public class BigBasket {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/basket/");
		driver.manage().window().maximize();
		WebElement onion = driver.findElement(By.xpath("//input[@id='input']"));
		onion.sendKeys("Onion");
		onion.sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//div[@qa='product'])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'ADD TO BASKET')]")).click();
		
		
		WebElement basket = driver.findElement(By.xpath("//span[contains(text(),'My Basket')]"));
		Actions act=new Actions(driver);
		act.moveToElement(basket).perform();
		act.click().perform();
		//basket.click();   //button[contains(text(),'View Basket & Checkout')]/////href="/auth/login/"
		WebElement view = driver.findElement(By.xpath("//a[contains(text(),'View Basket & Checkout')]"));
		//WebElement view = driver.findElement(By.xpath("//a[@href='/auth/login/]"));
		//WebElement view = driver.findElement(By.xpath("//button[contains(text(),'View Basket & Checkout')]"));
		Thread.sleep(2000);
		act.moveToElement(view).perform();
		act.click().perform();
		
	}

}
