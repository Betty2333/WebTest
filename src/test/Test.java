package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse-jee\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		try {
			String baseurl = "http://www.baidu.com";
			driver.get(baseurl);
			WebElement username = driver.findElement(By.name("wd"));
			username.sendKeys("baidu");
			Thread.sleep(2000);
			username.sendKeys(Keys.ENTER);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			driver.close();
			System.out.println("thx u");
		}
	}

}
