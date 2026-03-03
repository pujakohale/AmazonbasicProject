package com.amazon.amazon_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AmazonTest {

	    @Test
	    public void openTest() throws InterruptedException {

	        WebDriver driver = new ChromeDriver();
	        driver.get("https://www.amazon.com/");
            driver.manage().window().maximize();
            Thread.sleep(3000);
	        System.out.println("Title: " + driver.getTitle());
	        driver.navigate().to("https://mail.google.com/");

	        driver.quit();
	    }
}

