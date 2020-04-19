import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver browser;

    @Before
    public void setUp() {
        browser = new ChromeDriver();
        browser.manage().window().maximize();
        browser.navigate().to("http://qaontime.com");
    }

    @After
    public void tearDown() {
        browser.quit();
    }
}


