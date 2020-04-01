package stepDefinition;

import PageOfModel.AbstractClass;
import PageOfModel.application;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import utilities.driver;

import javax.sound.midi.SysexMessage;
import java.util.concurrent.TimeUnit;

public class etsySteps  extends AbstractClass {

    private WebDriver Driver;
    application ap = new application();


    @Given("^go to website$")
    public void go_to_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        Driver= driver.getDriver();
        Driver.manage().window().maximize();
        Driver.get("https://www.etsy.com/");
        Driver.manage().timeouts().implicitlyWait( 20, TimeUnit.SECONDS );

    }

    @Given("^click einloggen button$")
    public void click_einloggen_button() throws Throwable {
        ap.akzeptieren();
        Thread.sleep(1000);
        ap.clickEinloggin();

        // Write code here that turns the phrase above into concrete actions

    }


    @And("^type the \"([^\"]*)\" and \"([^\"]*)\"$")
    public void typeTheAnd(String email, String valueP) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
            ap.clickemail();
            Thread.sleep(1000);
            ap.sendEmail(email);
        Thread.sleep(1000);
        ap.clickPass();
        Thread.sleep(1000);
        ap.sendPass(valueP);
    }

    @Given("^click the remember_me button$")
    public void click_the_remember_me_button() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ap.clickRememberMe();
    }

    @Given("^click the einloggen button$")
    public void click_the_einloggen_button() throws Throwable {
        ap.clickLogin();
        // Write code here that turns the phrase above into concrete actions

    }

    @Given("^navigate over the titles$")
    public void navigate_over_the_titles() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        ap.menuBarr();
    }

    @When("^click to product$")
    public void clickToProduct() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) Driver;
        js.executeScript("window.scrollBy(0,400)", "");

        Thread.sleep(2000);
        ap.random();



    }

    @Then("^window should be switch$")
    public void windowShouldBeSwitch() throws InterruptedException {
    ap.windows();
    Thread.sleep(3000);


    }
}
