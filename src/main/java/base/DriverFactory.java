package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import utilities.ConfigReader;

public class DriverFactory {

    private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

    public static WebDriver initDriver(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {

            System.setProperty("webdriver.chrome.driver",
                    ConfigReader.getProperty("chromeDriverPath"));
            driver.set(new ChromeDriver());

        } else if (browser.equalsIgnoreCase("edge")) {

            System.setProperty("webdriver.edge.driver",
                    ConfigReader.getProperty("edgeDriverPath"));
            driver.set(new EdgeDriver());

        } else if (browser.equalsIgnoreCase("firefox")) {

            System.setProperty("webdriver.gecko.driver",
                    ConfigReader.getProperty("firefoxDriverPath"));
            driver.set(new FirefoxDriver());

        } else {
            throw new IllegalArgumentException("Invalid browser: " + browser);
        }

        getDriver().manage().window().maximize();
        return getDriver();
    }

    public static WebDriver getDriver() {
        return driver.get();
    }

    public static void quitDriver() {
        if (driver.get() != null) {
            driver.get().quit();
            driver.remove();
        }
    }
}
