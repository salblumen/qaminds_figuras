package org.qaminds.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.qaminds.figuras.Circulo;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FiguraTest {
    WebDriver driver;

    @BeforeTest
    public void openBrowser(){

        WebDriverManager.safaridriver().setup();
       driver = new SafariDriver();

        driver.get("https://google.com");
        driver.manage().window().maximize();
        driver.navigate().to("https://mvnrepository.com");

    }




    @Test
    public void validarCalcularAreaCirculo() throws InterruptedException {
        WebElement element = driver.findElement(By.id("query"));
        element.sendKeys("selenium");

        WebElement submitButton =driver.findElement((By.cssSelector(("#search > form > input.button"))));
        submitButton.click();

        WebElement result = driver.findElement(By.cssSelector(("div.content > div:nth-child(3) > div.im-header > h2 > a:nth-child(2)")));
        //Thread.sleep(10000);
        Assert.assertTrue(result.getText().contains("selenium"));

    }


    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }


}
