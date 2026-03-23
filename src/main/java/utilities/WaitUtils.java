package utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;

import base.DriverFactory;
import java.time.Duration;

public class WaitUtils {

    public static void waitForElementVisible(By locator, int time) {
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public static void waitForElementClickable(By locator, int time) {
        WebDriverWait wait = new WebDriverWait(DriverFactory.getDriver(), Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
