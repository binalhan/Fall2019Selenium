package Day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BasicNavigation {
    public static void main(String[] args) {
        WebDriverManager.chromedriver() .setup();

        //ChromeDriver driver = new ChromeDriver();
        RemoteWebDriver driver = new SafariDriver() ;
       driver.get("http://google.com");
   }
}