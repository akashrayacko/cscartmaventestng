package temp.product.cscart.po;

import jdk.javadoc.doclet.Reporter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import dev.failsafe.internal.util.Assert;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PO_Search {

    WebDriver driver;
    public PO_Search(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(how=How.NAME,using = "q")
    private WebElement txtbx_search;
    //driver.findElement(By.name("q")).sendKeys("computer");
    //Reporter.log("Product entered in Search Box", true);

    @FindBy(how=How.CLASS_NAME,using = "ut2-icon-search")
    private WebElement btn_search;
    //driver.findElement(By.className("ut2-icon-search")).click();
    //Reporter.log("Search Box Button Clicked:", true);

    //Methods
    public SetSearchTextBox(String arg) {
        txtbx_search.sendKeys(arg);
    }

    public ClickSearchButton() {
        btn_search.click();
    }

    //Bussiness Method
    public void SearchProduct(String arg) {
        SetSearchTextBox(arg);
        ClickSearchButton();
        String actual = driver.getTitle();
        String expected = "Search results";
        Reporter.log("Able to Search for the Product Successfully.", true);
        Assert.isTrue(actual,expected+ arg);

    }

}
