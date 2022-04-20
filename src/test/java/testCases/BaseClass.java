package testCases;

import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;

public class BaseClass {
    static ChromeDriver driver;
    String token = "ZjuIfVde9ZdSPyNP-I9w17zVhn5b_l0A26zPl0iPCl41";

    public BaseClass(){
        try {
            driver = new ChromeDriver(token, new ChromeOptions());
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
