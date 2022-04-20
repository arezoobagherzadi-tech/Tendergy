package pages;

import io.testproject.sdk.drivers.web.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.w3c.dom.Text;

public class LoginPage {
    ChromeDriver driver;

    public LoginPage(ChromeDriver driver) {
        this.driver = driver;
        PageFactory.initElements(this.driver,this);
    }

    @FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[2]/div[1]/div[1]/div[2]/button[1]")
    WebElement installerBtn;

    @FindBy(xpath = "//button[@class='ant-btn ant-btn-primary ant-btn-lg ant-btn-block Button_button__NAemG Button_blue__1ahxJ']")
    WebElement acceptCookie;

    public void clickAcceptCookie(){
        acceptCookie.click();
    }

    public void clickInstallerBtn(){
        installerBtn.click();
    }

}
