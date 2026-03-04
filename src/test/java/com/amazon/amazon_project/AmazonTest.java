package com.amazon.amazon_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;


public class AmazonTest {
	
	
	@Test
	public void openTest() throws InterruptedException {

	    String browser = System.getProperty("browser");
	    if(browser == null || browser.isEmpty())
	    {
	    	browser = "chrome";
	    }

	    WebDriver driver = null;

	    if(browser.equalsIgnoreCase("chrome")) {
	        ChromeOptions options = new ChromeOptions();
	        options.addArguments("--headless=new");
	        driver = new ChromeDriver(options);
	    }
	    else if(browser.equalsIgnoreCase("edge")) {
	        driver = new EdgeDriver();
	    }
	   
	    driver.get("https://www.amazon.com/");
	    driver.manage().window().maximize();
	    Thread.sleep(3000);

	    System.out.println("Title: " + driver.getTitle());

	    driver.navigate().to("https://mail.google.com/");
	    driver.navigate().back();

	    driver.quit();
	}

}

