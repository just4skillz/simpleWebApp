import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Date;

import static java.lang.Thread.sleep;
import static org.testng.Assert.assertTrue;

public class StagingWebTests {

    private WebDriver driver;

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.gecko.driver", "src/test/resources/driver/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @Test
    public void stagingTest() throws InterruptedException {
        driver.get("http://localhost:9090/stagingWebApp/index.html");
        sleep(1000);

        try {
            Boolean isDisplayed = driver.findElement(By.id("main_table")).isDisplayed();
            assertTrue(isDisplayed);
        } finally {
            driver.quit();
        }

        Date dateTime = new Date();
        System.out.println("Staging test ran successfully at: " + dateTime);
    }

}
