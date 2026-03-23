package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.DriverFactory;
import utilities.WaitUtils;

public class BasePageActions {

    protected WebDriver driver;

    public BasePageActions() {
        this.driver = DriverFactory.getDriver();
    }

    public void click(By locator) {
        WaitUtils.waitForElementClickable(locator, 10);
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        WaitUtils.waitForElementVisible(locator, 10);
        driver.findElement(locator).sendKeys(text);
    }

    public String getText(By locator) {
        WaitUtils.waitForElementVisible(locator, 10);
        return driver.findElement(locator).getText();
    }
}
