package testCaseFonksiyon;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BasePage;

import java.util.List;

public class urunArama extends BasePage {

    public urunArama(WebDriver driver) {
        super(driver);
    }

    private By urunAraBosluk =By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input");
    private By aramaButon=By.xpath("//*[@id='header-search-find-link']");
    private By ikinciSayfa=By.name("2");

    public String aranacakUrun="bilgisayar";

   // loginKontrol loginKontrol=new loginKontrol(driver);


    public void urunArama_Kontrol()
    {
        //loginKontrol.login_Kontrol();
        driver.get("https://www.gittigidiyor.com");
        /* WebElement login = driver.findElement(By.xpath("//div[@title='Giriş Yap']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(login).perform();
        WebDriverWait wait = new WebDriverWait(driver , 2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-cy='header-user-menu']/div[2]/div[1]"))).click();
*/
        //veriGonderme(kullaniciAdi,"abc123xyz456klm@gmail.com");
        //veriGonderme(kullaniciAdi,"Pi3RUcGpkQMQtJf");
        //driver.findElement(urunAraBosluk).sendKeys(aranacakUrun + Keys.ENTER);
        veriyiDoldurma(urunAraBosluk,aranacakUrun+Keys.ENTER);


        //driver.findElement(ikinciSayfa).click();
        //element(ikinciSayfa).click();
        driver.get("https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
        String ikincisayfaKontrol=driver.getCurrentUrl();
        Assert.assertEquals(ikincisayfaKontrol,"https://www.gittigidiyor.com/arama/?k=bilgisayar&sf=2");
        WebDriverWait wait = new WebDriverWait(driver , 2);
        driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div[2]/div[3]/div[2]/ul/li[1]/a/div/p/img")).click();
        WebDriverWait wait1 = new WebDriverWait(driver , 2);

        driver.findElement(By.id("add-to-basket")).click();
        //String deney =driver.findElement(By.id("/html/body/div[3]/div[2]/div/div[1]/div[1]/div[2]/div[2]/div[1]/div/div[1]/div[1]/div/div/div[2]")).getText();
        //System.out.println("FİYATI   "+deney);



    }
}
