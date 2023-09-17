package love.the.work.pages;

import love.the.work.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssertionVariable extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public AssertionVariable() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/header/div[1]/div[2]/div[1]/nav/a/span")
    WebElement signInButtonAssertObj;

    @CacheLookup
    @FindBy (xpath = "//*[@id=\"root\"]/div/div[3]/footer/div[3]/div/p")
    WebElement copyRightTextObj;

    @CacheLookup
    @FindBy (xpath = "//*[@id=\"error-element-password\"]")
    WebElement invalidLoginErrorMessageObj;

    public String signInButtonAssert() {
        return getTextFromElement(signInButtonAssertObj);
    }

    public String getTitle() {
        return driver.getCurrentUrl();
    }

    public String copyRightText(){
        return getTextFromElement(copyRightTextObj);
    }

    public String invalidLoginErrorMessage(){
        return getTextFromElement(invalidLoginErrorMessageObj);
    }
}
