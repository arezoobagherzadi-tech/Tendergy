package testCases;

import io.testproject.sdk.drivers.web.ChromeDriver;
import io.testproject.sdk.internal.exceptions.AgentConnectException;
import io.testproject.sdk.internal.exceptions.InvalidTokenException;
import io.testproject.sdk.internal.exceptions.ObsoleteVersionException;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
import pages.LoginPage;
import java.io.IOException;

public class Tendergy {
    ChromeDriver driver;
    LoginPage loginPage;
    String token = "pmIPlJ4zq0bZI3QLx3e3Q01Gdtf_8ImQkn3dlkxEu6w1";

    public Tendergy() throws Exception{
        this.driver = new ChromeDriver(token, new ChromeOptions());
        loginPage = new LoginPage(driver);
        driver.get("https://tendergy.development.tendergy.com/");

    }

    @Test
    public void openPage() throws InterruptedException, InvalidTokenException, ObsoleteVersionException, AgentConnectException, IOException {
        Thread.sleep(10000);
        loginPage.clickAcceptCookie();
        Thread.sleep(3000);
        loginPage.clickInstallerBtn();
        Thread.sleep(3000);






    }


}