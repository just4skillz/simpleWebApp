import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TestWebApp {

    private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void firstTest() throws InterruptedException {
        driver.get("http://localhost:9090/webapp/index.html");
//        driver.get("https://www.google.ro/");
        Thread.sleep(5000);

        driver.quit();
        assertFalse(false);
    }

}
