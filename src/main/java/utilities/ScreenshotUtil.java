package utilities;

import org.openqa.selenium.*;
import base.DriverFactory;
import java.io.File;
import org.apache.commons.io.FileUtils;
import java.time.LocalDateTime;

public class ScreenshotUtil {

    public static String takeScreenshot(String testName) {
        TakesScreenshot ts = (TakesScreenshot) DriverFactory.getDriver();
        File src = ts.getScreenshotAs(OutputType.FILE);

        String path = "screenshots/" + testName + "_" + LocalDateTime.now() + ".png";
        try {
            FileUtils.copyFile(src, new File(path));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return path;
    }
}
