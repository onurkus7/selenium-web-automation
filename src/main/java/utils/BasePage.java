package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class BasePage {
    public WebDriver driver;


    public BasePage(WebDriver driver)
    {
        System.setProperty("webdriver.chrome.driver", "webdrivers/chromedriver.exe");
        driver = (WebDriver) new ChromeDriver();
        this.driver=driver;
    }

    public WebElement element(By locator)
    {
        return driver.findElement(locator);
    }

    public void veriyiDoldurma (By locator, String deger)
    {
        element(locator).sendKeys(deger);
    }
    public void elementSec(WebElement element,String value)
    {
        Select select = new Select(element);
        select.selectByValue(value);
    }
}
