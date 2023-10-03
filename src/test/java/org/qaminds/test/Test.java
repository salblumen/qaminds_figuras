package org.qaminds.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class Test {
    public void openBrowser(){
        WebDriverManager.safaridriver().setup();
        WebDriver driver = new SafariDriver();

        driver.get("https://google.com");
        driver.quit();

    }



    @org.testng.annotations.Test
    public void OpenBrowserTest(){
        openBrowser();
    }

}
