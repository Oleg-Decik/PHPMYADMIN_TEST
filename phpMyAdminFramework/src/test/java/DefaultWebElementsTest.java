import DefaultWebElements.DefaultWebElements;
import org.testng.annotations.*;
import Tools.WebDriver;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class DefaultWebElementsTest {
    @BeforeClass
    protected void setUpWebDriver() {
        WebDriver driver = new WebDriver();
    }
    @AfterClass(alwaysRun = true)
    protected void closeWebDriver() {
        WebDriver.driver.quit();
    }

    @Test
    public void isMenuBarHaveAllElements(){
        assertEquals( new DefaultWebElements().getMenuBarr().size(), 12, "No right digits of length" );
    }
    @Test
    public void isFirstElementIsRight(){
        String expected = "Databases";
        assertEquals(new DefaultWebElements().getElementText(0).trim(), expected);
    }

    @Test
    public void clickArrowTest() throws InterruptedException {
        DefaultWebElements defaultWebElements = new DefaultWebElements();
        WebDriver.driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        defaultWebElements.clickArrow();
        assertEquals(defaultWebElements.getArrow().getAttribute("style"), "left: 3px;");
    }
}
