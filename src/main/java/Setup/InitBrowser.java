package Setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class InitBrowser{


    public static WebDriver initBrowser() {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
        driver.get("https://docs.google.com/forms/d/e/1FAIpQLScQ7Ej_21M73p2Qf1SaRQt8LgUKGMmPcJt35K8odJKEXzCSMA/viewform?vc=0&c=0&w=1");
        driver.manage().window().maximize();
        return driver;
    }

}
