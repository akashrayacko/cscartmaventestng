package temp.product.cscart.utils;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;

public class BrowserManager {

    public static WebDriver getDriver(String type) {

        WebDriver driver = null;
        if (type.equalsIgnoreCase("chrome")) {
             driver = new ChromeDriver();
        } else if (type.equalsIgnoreCase("firefox")) {
             driver = new FirefoxDriver();
        } else if (type.equalsIgnoreCase("safari")) {
             driver = new SafariDriver();
        } else {
            Assert.assertEquals(true, "No Browser type sent");
        }

        //WebDriver driver = new ChromeDriver();
        Thread.sleep(2000);
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        return driver;
    }
}
