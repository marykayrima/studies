import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AboutUsPage extends BaseTest{
    @Test
    public void navigateToAbout(){

        browser.findElement(By.linkText("About")).click();

        String actualURL = browser.getCurrentUrl();
        System.out.println(actualURL);
        String expectedURL = "http://qaontime.com/about-us/";
        Assert.assertTrue("I expected to be URL/about-us",expectedURL.equals(actualURL));
    }
}
