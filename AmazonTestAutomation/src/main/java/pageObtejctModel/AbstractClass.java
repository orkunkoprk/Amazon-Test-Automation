package pageObtejctModel;

import cucumber.api.java.eo.Se;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utilities.Driver;

public class AbstractClass {
    private WebDriver driver = Driver.getDriver();
    WebDriverWait wait = new WebDriverWait(driver,10);

    public void clickFunction(WebElement clickElement) throws InterruptedException {
        wait.until(ExpectedConditions.elementToBeClickable(clickElement));
        clickElement.click();
        Thread.sleep(2000);
    }
    public void sendKeysFunction(WebElement sendElement , String value) throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(sendElement));
        sendElement.sendKeys(value);
        Thread.sleep(2000);
    }
    public void Assertion(WebElement actual, String expected){
        wait.until(ExpectedConditions.visibilityOf(actual));
        Assert.assertEquals(actual.getText(),expected);
    }
    public void isElementExist(WebElement actual){
        wait.until(ExpectedConditions.visibilityOf(actual));
        boolean flag=false;
        if (actual == null)
        { flag = false; }
        flag=true;
        Assert.assertTrue(flag);
    }
    public void selectElementFromDropdown(WebElement dropdown,String element){
        wait.until(ExpectedConditions.visibilityOf(dropdown));
        Select slc = new Select(dropdown);
        slc.selectByVisibleText(element);
    }

}
