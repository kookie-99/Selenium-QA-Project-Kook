package base;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import utilities.ConfigReader;

public class BaseTest {

    @BeforeMethod
    public void setup() {
        String browser = ConfigReader.getProperty("browser");
        String url = ConfigReader.getProperty("url");

        DriverFactory.initDriver(browser);   // Launch browser
        DriverFactory.getDriver().get(url);  // Open URL
    }

    @AfterMethod
    public void tearDown() {
       // DriverFactory.quitDriver();          // Close browser
    }
}
