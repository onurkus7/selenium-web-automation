package testCaseFonksiyon;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BasePage;

public class urunArama extends BasePage {

    public urunArama(WebDriver driver) {
        super(driver);
    }

    private By urunAraBosluk =By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input");
    private By aramaButon=By.xpath("//*[@id='header-search-find-link']");
    private By ikinciSayfa=By.xpath("/html/body/div[4]/div[1]/div/div[2]/div[5]/ul/li[2]/a");

    public String aranacakUrun="bilgisayar";


    public void urunArama_Kontrol()
    {
        driver.get("https://www.gittigidiyor.com");

        veriyiDoldurma(urunAraBosluk,aranacakUrun+Keys.ENTER);

        //element(ikinciSayfa).click();
        driver.get("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
        String ikincisayfaKontrol=driver.getCurrentUrl();
        Assert.assertEquals(ikincisayfaKontrol,"https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
        WebDriverWait wait = new WebDriverWait(driver , 2);
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div[3]/div[2]/ul/li[1]/a/div/p/img")).click();

        //driver.findElement(By.id("add-to-basket")).click();
        //String fiyat =driver.findElement(By.id("/html/body/div[3]/div[2]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div[2]")).getText();
        //System.out.println("FİYAT: "+fiyat);


    }
}
