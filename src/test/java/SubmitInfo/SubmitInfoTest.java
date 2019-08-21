package SubmitInfo;

import Setup.InitBrowser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;


public class SubmitInfoTest{
    private WebDriver driver;

    @BeforeMethod
    public void init() {
        driver = InitBrowser.initBrowser();
    }

    @Test(priority = 1)
    public void fieldFileStandard() throws Exception {
        sleep(500);
        driver.findElement(By.name("entry.1643251653")).clear();
        sleep(300);
        driver.findElement(By.name("entry.1643251653")).sendKeys("Sidimar Garcia Coelho");
        driver.findElement(By.name("entry.17350902")).sendKeys("sidimar.coelho@msn.com");
        driver.findElement(By.name("entry.975579715")).sendKeys("Joinville SC");
        driver.findElement(By.name("entry.2005929968")).sendKeys("Não foi possivel " +
                "Estruturar da forma que foi solicitado no tempo que me foi dado por isso" +
                "estou enviando o git conforme esta no momento e vou atualizando conforme for possivel " +
                "https://github.com/sidimarcoelho/fescTest");
        driver.findElement(By.xpath("//div[@role=\"button\"]//span[*=\"Enviar\"]" +
                "")).click();
        Assert.assertEquals("Sua resposta foi registrada.",driver.findElement(By.xpath("//div" +
                "[@class=\"freebirdFormviewerViewResponseConfirmationMessage\"]")).getText());
    }



    @AfterMethod
    public void close() throws Exception {
        driver.close();
    }

}
