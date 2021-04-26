package testCaseFonksiyon;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.BasePage;

public class loginKontrol extends BasePage {
    public loginKontrol(WebDriver driver) {
        super(driver);
    }

    private By kullaniciAdi=By.id("L-UserNameField");
    private By sifre=By.name("sifre");
    private By girisButon=By.id("gg-login-enter");

    private String username="";
    private String passwd="";

    public void login_Kontrol()
    {
        driver.get("https://www.gittigidiyor.com");
        WebElement login = driver.findElement(By.xpath("//div[@title='Giriş Yap']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(login).perform();
        WebDriverWait wait = new WebDriverWait(driver , 2);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-cy='header-user-menu']/div[2]/div[1]"))).click();

        veriyiDoldurma(kullaniciAdi,username);
        veriyiDoldurma(sifre,passwd);


        element(girisButon).click();
        String girisKontrol=driver.findElement(By.xpath("/html/body/div[1]/header/div[3]/div/div/div/div[3]/div/div[1]/div/div[2]/span")).getText();
        Assert.assertEquals(girisKontrol,username);



    }
}
