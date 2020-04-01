package PageOfModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.driver;

import java.util.List;
import java.util.Random;

public  abstract class AbstractClass {


private WebDriver Driver = driver.getDriver();



    WebDriverWait wait = new WebDriverWait(Driver, 10);

    public void clickFunction(WebElement clickElement){

        clickElement.click();
    }


    public void sendkeysFunction(WebElement sendkeysElement, String value) {

        wait.until(ExpectedConditions.visibilityOf(sendkeysElement));
        sendkeysElement.sendKeys(value);

    }


    public void handleDropdown( List<WebElement> producktss) {

        int randomNum = randomGenerator(producktss.size());
        clickFunction(producktss.get(randomNum));


    }

    public int randomGenerator(int max) {

        Random random = new Random();
        int randomNum = random.nextInt(max);
        return randomNum;
    }

}
