package testCaseFonksiyon;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import utils.BasePage;

public class anasayfaKontol extends BasePage {

    public anasayfaKontol(WebDriver driver) {
        super(driver);
    }

    public String title()
    {
        return driver.getTitle();
    }

    public void title_Kontrol()
    {
        driver.get("https://www.gittigidiyor.com");
        Assert.assertEquals(title(),"GittiGidiyor - Türkiye'nin Öncü Alışveriş Sitesi");
    }


}
