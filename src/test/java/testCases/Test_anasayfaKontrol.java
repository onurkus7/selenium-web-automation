package testCases;

import org.junit.Test;
import testCaseFonksiyon.*;
import utils.BaseTest;

public class Test_anasayfaKontrol extends BaseTest {
    @Test
    public void Test_tittleKontrol()
    {
        anasayfaKontol titleKontrol=new anasayfaKontol(driver);
        titleKontrol.title_Kontrol();
    }

}
