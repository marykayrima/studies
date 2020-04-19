import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SearchField extends BaseTest {
    @Test
    public void seachWord(){

        WebElement search = browser.findElement(By.cssSelector("div.s1 input"));
        search.sendKeys("Laba diena");
        search.submit();

        WebElement result = browser.findElement(By.cssSelector(".content h1"));
        result.getText();
        System.out.println(result.getText());

        String expectedText = "0 Search results";
        String actualText = result.getText();
        Assert.assertEquals(expectedText, actualText);
    }
}
