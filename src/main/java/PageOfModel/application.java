package PageOfModel;

import okhttp3.WebSocketListener;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import utilities.driver;

import java.util.List;
import java.util.Set;

public class application extends AbstractClass {

    private WebDriver Driver;
    private String firstWin;


    public application() {
        Driver = driver.getDriver();
        PageFactory.initElements(Driver, this);

    }


    @FindBy(xpath = "//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")
    private WebElement einloggen;

    @FindBy(xpath = "//button[text()='Akzeptieren']")
    private WebElement akzept;

    @FindBy(xpath = "//input[@id='join_neu_email_field']")
    private WebElement email;

    @FindBy(xpath = "//input[@id='join_neu_password_field']")
    private WebElement pass;

    @FindBy(xpath = "//span[@class='checkbox-label']")
    private WebElement rememberMe;


    @FindBy(xpath = "//button[@value='sign-in']")
    private WebElement loggin;


    @FindAll({
            @FindBy(xpath = "//li[@data-linkable='true']")
    })
    private List<WebElement> menuBar;


    @FindAll({
            @FindBy(xpath = "//li[@class='js-merch-stash-check-listing block-grid-item v2-listing-card position-relative flex-xs-none ']")
    })
    private List<WebElement> listOfPruducts;


    @FindBy(xpath = "//title[text()='Etsy - Kaufe Handgefertigtes, Vintage-Sachen, Spezialanfertigungen und einzigartige Geschenke für alle ein.']")
    private WebElement Title;


    public void random() {

        handleDropdown(listOfPruducts);

    }


    public void clickEinloggin() {

        clickFunction(einloggen);
    }

    public void akzeptieren() {

        clickFunction(akzept);


    }

    public void clickemail() throws InterruptedException {
        clickFunction(email);

    }

    public void sendEmail(String value) {
        sendkeysFunction(email, value);

    }

    public void clickPass() {
        clickFunction(pass);
    }

    public void sendPass(String valueP) {

        sendkeysFunction(pass, valueP);
    }

    public void clickRememberMe() {
        clickFunction(rememberMe);
    }

    public void clickLogin() {

        clickFunction(loggin);
    }

    public void menuBarr() throws InterruptedException {
        Actions ac = new Actions(Driver);

        for (int i = 0; i < menuBar.size(); i++) {
            ac.moveToElement(menuBar.get(i)).perform();
            Thread.sleep(1000);

        }
    }

    public void windows() {

        Set<String> windowAllWindows = Driver.getWindowHandles();
        for (String window : windowAllWindows) {

            Driver.switchTo().window(window);
        }
        Driver.close();


    }




}



