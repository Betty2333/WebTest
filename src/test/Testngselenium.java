package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Testngselenium {
	@Test
	public static void test() {
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse-jee\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		try {
			String baseurl = "http://localhost:8080/Lego/index.jsp";
			
			driver.get(baseurl);
			WebElement username = driver.findElement(By.id("name"));
			username.sendKeys("111");//???
			//username.sendKeys(Keys.ENTER);			
			WebElement text = driver.findElement(By.tagName("h1"));
			System.out.println(text.getText());
			WebElement login = driver.findElement(By.id("login"));
			Thread.sleep(3000);
			login.click();
			Thread.sleep(5000);
			
			String pageurl = driver.getCurrentUrl();
			System.out.println("current page is: "+pageurl);
			Thread.sleep(1000);
			
			driver.navigate().back();
			String backurl = driver.getCurrentUrl();
			System.out.println("now current page is: "+backurl+",title is "+driver.getTitle());
			Thread.sleep(8000);
			
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
