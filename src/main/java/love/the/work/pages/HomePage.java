package love.the.work.pages;

import love.the.work.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"onetrust-accept-btn-handler\"]")
    WebElement acceptCookiesobj;

    //https://github.com/panchalgaurang/LoveTheWork

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/header/div[1]/div[2]/div[1]/nav/a/span")
    WebElement signInButtonobj;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[1]/main/section/div/div/div/div[1]/p/a")
    WebElement signUpButtonobj;

    @CacheLookup
    @FindBy(id = "username")
    WebElement usernameObj;

    @CacheLookup
    @FindBy(id = "password")
    WebElement passwordObj;

    @CacheLookup
    @FindBy(xpath = "/html/body/div[1]/div/div[2]/div/div/div[1]/main/section/div/div/div/form/div[3]/button")
    WebElement loginObj;

    @CacheLookup
    @FindBy(name = "search")
    WebElement searchFieldObj;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]/div/header/div/div[1]/div/div[1]/div/div/div/div/div/div[2]/div[3]/div/div[2]")
    WebElement cannesLionsObj;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[2]/div/div[4]/div[2]/div/div/div/div[1]/div/div/div/div/a/span/div")
    WebElement nikeDreamCrazyObj;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/header/div/div[2]/div/div[2]/button")
    WebElement saveListObj;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/header/div/div[2]/div/div[2]/div/div/div[3]/div")
    WebElement createNewPlaylistObj;

    @CacheLookup
    @FindBy(id = "new-playlist-form-582095")
    WebElement playListNameObj;

    @CacheLookup
    @FindBy(xpath = "//*[@id=\"root\"]/div/div/div[1]/header/div/div[2]/div/div[2]/div/div/div[3]/form/button")
    WebElement createObj;

    @CacheLookup
    @FindBy(id = "username")
    WebDriver cleartextObj;

    public void clickOnAcceptCookie() {
        clickOnElement(acceptCookiesobj);
        log.info("Click On Accept Cookies");
    }

    public void clickOnsignInButton() {
        clickOnElement(signInButtonobj);
        log.info("Click on Sign in Button");
    }


    public void clickOnSignUpButton() {
        mouseHoverToElementAndClick(signUpButtonobj);
        log.info("Click on Sign Up Button");
    }

    public void userName(String email) {
        sendTextToElement(usernameObj, email);
    }

    public void passWord(String password) {
        sendTextToElement(passwordObj, password);
    }

    public void loginButton() {
        clickOnElement(loginObj);
    }

    public void searchField(String data) {
        sendTextToElement(searchFieldObj, data);
    }

    public void cannesLion() {
        mouseHoverToElementAndClick(cannesLionsObj);
    }

    public void nikeDreamCrazy() {
        clickOnElement(nikeDreamCrazyObj);
    }

    public void saveList() {
        clickOnElement(saveListObj);
    }

    public void createNewPlayList() {
        mouseHoverToElementAndClick(createNewPlaylistObj);
    }

    public void playListName(String playlist) {
        sendTextToElement(playListNameObj, playlist);
    }

    public void createButton(){
        clickOnElement(createObj);
    }

   public void clearText(){
        clearTextFromField(usernameObj);
   }
}
