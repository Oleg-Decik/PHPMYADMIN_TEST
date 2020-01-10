package Tools;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class WebDriver {
    static public ChromeDriver driver;

    public WebDriver() {

        System.setProperty("webdriver.chrome.driver", "..\\webdrriver\\chromedriver.exe");

        driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximize test browser window
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://localhost/phpmyadmin/index.php");
    }
}