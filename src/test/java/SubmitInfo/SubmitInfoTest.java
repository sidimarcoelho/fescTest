package SubmitInfo;

import Page.ProductPage;
import Page.SubmitPage;
import Setup.InitBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;


public class SubmitInfoTest{
    public static WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLScQ7Ej_21M73p2Qf1SaRQt8LgUKGMmPcJt35K8odJKEXzCSMA/viewform?vc=0&c=0&w=1");
        driver.manage().window().maximize();
    }

    @Test(priority = 1)
    public void fieldFileStandard() throws Exception {
        driver.findElement(By.name("entry.1643251653")).clear();
        sleep(300);
        driver.findElement(By.name("entry.1643251653")).sendKeys("Sidimar Garcia Coelho");
        driver.findElement(By.name("entry.17350902")).sendKeys("sidimar.coelho@msn.com");
        driver.findElement(By.name("entry.975579715")).sendKeys("Joinville SC");
    }



    @AfterMethod
    public void close() throws Exception {
        //driver.close();
    }

}
