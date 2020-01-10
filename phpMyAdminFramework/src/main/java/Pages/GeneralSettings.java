package Pages;

import Tools.WebDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class GeneralSettings {
    private WebElement documentation;
    private WebElement coddingSystem;

    public GeneralSettings(){
        initGeneralSettings();
    }

    private void initGeneralSettings(){
        documentation = WebDriver.driver.findElement(By.cssSelector("#li_select_mysql_collation > form > label > a"));
        coddingSystem = WebDriver.driver.findElement(By.cssSelector("#select_collation_connection"));
    }

    @Step("Getting the general settings documentation")
    public WebElement getDocumentation() {
        return documentation;
    }

    public void setDocumentation(WebElement documentation) {
        this.documentation = documentation;
    }

    @Step("Clicking the general settings documentation")
    private void clickDocumentation(){
        getDocumentation().click();
    }

    @Step("Getting codding system")
    public WebElement getCoddingSystem() {
        return coddingSystem;
    }

    public void setCoddingSystem(WebElement coddingSystem) {
        this.coddingSystem = coddingSystem;
    }

    @Step("Clicking the general settings documentation")
    private void clickCoddingSystem(){
        getCoddingSystem().click();
    }
}
