package testCases;

import org.junit.Test;
import testCaseFonksiyon.urunArama;
import utils.BaseTest;

public class Test_urunArama extends BaseTest {

    @Test
    public void TestArama()
    {
        urunArama urunArama=new urunArama(driver);
        urunArama.urunArama_Kontrol();
    }
}
