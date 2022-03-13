package ElementsPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {
    WebDriver driver;

    @FindBy(how = How.ID, using = "first_name")
    @CacheLookup
    WebElement firstNameElement;

    @FindBy(how = How.ID, using = "last_name")
    @CacheLookup
    WebElement lastNameElement;

    @FindBy(how = How.ID, using = "description")
    @CacheLookup
    WebElement aboutMeElement;

    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    @CacheLookup
    WebElement saveButton;

    @FindBy(how = How.XPATH, using = "//div[@class='notice is-success is-dismissable']")
    @CacheLookup
    WebElement successNotice;

    public MyProfilePage(WebDriver webDriver) {
        this.driver = webDriver;
        PageFactory.initElements(driver, this);
    }

    public void enterFirstName(String firstName){
        firstNameElement.sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        lastNameElement.sendKeys(lastName);
    }

    public void enterAboutMe(String description){
        aboutMeElement.sendKeys(description);
    }

    public void clickSaveDetailsButton() {
        saveButton.click();
    }

    public boolean isSuccess(){
        return successNotice != null;
    }
}
