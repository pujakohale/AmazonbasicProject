package com.amazon.amazon_project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class AmazonTest {

    @Test
    public void openTest() throws InterruptedException {

        String browser = System.getProperty("browser");
        if (browser == null || browser.isEmpty()) {
            browser = "chrome";  // default to Chrome
        }

        WebDriver driver = null;

        if (browser.equalsIgnoreCase("chrome1")) {
            // Chrome setup
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");  // Headless for Jenkins
            options.addArguments("--disable-gpu");   // Recommended in headless
            options.addArguments("--remote-allow-origins=*"); // Avoid errors with newer Chrome
            driver = new ChromeDriver(options);

        } else if (browser.equalsIgnoreCase("chrome2")) {
            // Chrome setup
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless=new");  // Headless for Jenkins
            options.addArguments("--disable-gpu");   // Recommended in headless
            options.addArguments("--remote-allow-origins=*"); // Avoid errors with newer Chrome
            driver = new ChromeDriver(options);

   

        // Open Amazon
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        System.out.println("Title: " + driver.getTitle());

        // Navigate to Gmail and back
        driver.navigate().to("https://mail.google.com/");
        driver.navigate().back();

        driver.quit();
    }
}
}