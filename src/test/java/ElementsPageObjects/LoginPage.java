package ElementsPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    WebDriver driver;

    @FindBy(how = How.ID, using = "usernameOrEmail")
    @CacheLookup
    WebElement usernameElement;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    @CacheLookup
    WebElement Loginbutton;

    @FindBy(how = How.ID, using = "password")
    @CacheLookup
    WebElement passwordElement;

    public LoginPage() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\sirip\\OneDrive\\Documents\\Drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://wordpress.com/log-in");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void fillusername(String username) {
        usernameElement.sendKeys(username);
    }

    public void clickContinue() {
        Loginbutton.click();
    }

    public ReadPage clickLogin() {
        Loginbutton.click();
        return new ReadPage(driver);
    }

    public void fillpassword(String password) {
        passwordElement.sendKeys(password);
        Loginbutton.click();
    }

    public void close() {
        driver.quit();
    }
}

