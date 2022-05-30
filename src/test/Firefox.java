package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse-jee\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		try {
			String baseurl = "https://www.baidu.com/";
			String exceptedtitle = "百度一下，你就知道";
			String actualtitle = "";
			
			driver.get(baseurl);
			actualtitle = driver.getTitle();
			Thread.sleep(5000);
			
			if(actualtitle.contentEquals(exceptedtitle)) {
				System.out.println("test passed");
			}
			else {
				System.out.println("test failed");
			}
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
