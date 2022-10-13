package temp.product.cscart.tc;

import com.beust.jcommander.Parameter;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;


import temp.product.cscart.po.PO_Search;
import temp.product.cscart.utils.BrowserManager;

import java.util.concurrent.TimeUnit;


public class TC_HealthCheck {

    String url = "";
    @Test
    @Parameter({"browser"},{"url"})
    public void t_01_cscart_search(String browser, String url) {
        WebDriver driver = BrowserManager.getDriver(browser);
        driver.get(url);
        PO_Search obj = PageFactory.initElements(driver, PO_Search.class);
        obj.SearchProduct("computer");
       // driver.findElement(By.name("q")).sendKeys("computer");
        //driver.findElement(By.className("ut2-icon-search")).click();

    }
}
