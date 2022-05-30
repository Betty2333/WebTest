package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Basictest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "D:\\eclipse-jee\\geckodriver-v0.30.0-win64\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		try {
			ExtentHtmlReporter reporter = new ExtentHtmlReporter("D:\\MyReport.html");
			driver = new FirefoxDriver();
			
			ExtentReports extent = new ExtentReports();
			extent.attachReporter(reporter);
			
			ExtentTest test1 = extent.createTest("baidu Search Test","this is to baidu");
			test1.log(Status.INFO, "starting test case");//1
			
			driver.get("https://www.baidu.com");
			String title = "百度一下，你就知道";
			
			if (driver.getTitle().equals(title)) {
				test1.pass("sucess to baidu"); //2
			}
			else {
				test1.fail("something wrong: "+driver.getTitle());
				
			}
			
			WebElement searchbar = driver.findElement(By.name("wd"));
			searchbar.sendKeys("extent reports");
			
			test1.pass("enter search content ");//3
			
			searchbar.sendKeys(Keys.ENTER);
			test1.pass("enter key press");//4
			
			//driver.close();
			test1.pass("close browser");//5
			
			extent.flush();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		

	}

}
