package amzPom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import config.Configuration;

public class ABC {
	public static void main(String[] args) throws IOException {
		Properties obj=new Properties();
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Java\\kishor.properties");
		obj.load(file);
		/*String value=obj.getProperty("URL");
		System.out.println(value);
		String v1=obj.getProperty("UN");
		String v2=obj.getProperty("PWD");
		System.out.println(v1);
		System.out.println(v2);*/
		System.setProperty("webdriver.chrome.driver", Configuration.driverPath);
		WebDriver driver=new ChromeDriver();
		driver.get(obj.getProperty("URL"));
		driver.manage().window().maximize();
	}

}
