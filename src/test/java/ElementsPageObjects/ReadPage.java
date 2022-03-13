package ElementsPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ReadPage {
    WebDriver driver;

    @FindBy(how = How.XPATH, using = "//a[@href='/me']")
    @CacheLookup
    WebElement myprofileElement;

    public ReadPage(WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public MyProfilePage clickMyProfile() {
        myprofileElement.click();
        return new MyProfilePage(driver);
    }
}
