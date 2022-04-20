package testCases;

import io.testproject.sdk.drivers.web.ChromeDriver;
import io.testproject.sdk.internal.exceptions.AgentConnectException;
import io.testproject.sdk.internal.exceptions.InvalidTokenException;
import io.testproject.sdk.internal.exceptions.ObsoleteVersionException;
import org.testng.annotations.Test;
import pages.LoginPage;
import java.io.IOException;

public class TendergyTest extends BaseClass{
    LoginPage loginPage;

    public TendergyTest(){
        loginPage = new LoginPage(driver);
    }

    @Test
    public void openPage() throws InterruptedException, InvalidTokenException, ObsoleteVersionException, AgentConnectException, IOException {
        driver.get("https://tendergy.development.tendergy.com/");
        Thread.sleep(3000);
        loginPage.clickAcceptCookie();
        Thread.sleep(3000);
        loginPage.clickInstallerBtn();
        Thread.sleep(3000);

    }
}