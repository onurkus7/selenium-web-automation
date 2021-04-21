package testCases;

import org.junit.Test;
import testCaseFonksiyon.loginKontrol;
import utils.BaseTest;


public class Test_loginKontrol extends BaseTest {

    @Test
    public void TestLoginKontrol()
    {
        loginKontrol loginKontrol=new loginKontrol(driver);
        loginKontrol.login_Kontrol();
    }
}
