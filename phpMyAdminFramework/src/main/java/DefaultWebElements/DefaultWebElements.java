package DefaultWebElements;
import Tools.WebDriver;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DefaultWebElements {
    private WebElement logo;
    private List<WebElement> naviPanelLinks;
    private WebElement resent;
    private WebElement favorites;
    private List<WebElement> databases;
    private WebElement arrow;
    private WebElement server;
    private WebElement aNewerVersion;
    private ArrayList<WebElement> menuBar = new ArrayList<WebElement>();
    private WebElement[] menuBarItems = new WebElement[12];

    public DefaultWebElements(){
        initDefaultWebElements();
    }

    private void initDefaultWebElements(){
        logo = WebDriver.driver.findElement(By.cssSelector("#pmalogo > a"));
        naviPanelLinks = WebDriver.driver.findElements(By.cssSelector("#navipanellinks"));
        resent = WebDriver.driver.findElement(By.cssSelector("#pma_navigation_tree > div.pma_quick_warp > div:nth-child(1) > span"));
        favorites = WebDriver.driver.findElement(By.cssSelector("#pma_navigation_tree > div.pma_quick_warp > div:nth-child(2) > span"));
        databases = WebDriver.driver.findElements(By.cssSelector("#pma_navigation_tree_content > ul"));
        menuBarItems[0] = WebDriver.driver.findElement(By.cssSelector("#topmenu > li:nth-child(1)"));
        menuBarItems[1] = WebDriver.driver.findElement(By.cssSelector("#topmenu > li:nth-child(2)"));
        menuBarItems[2] = WebDriver.driver.findElement(By.cssSelector("#topmenu > li:nth-child(3)"));
        menuBarItems[3] = WebDriver.driver.findElement(By.cssSelector("#topmenu > li:nth-child(4)"));
        menuBarItems[4] = WebDriver.driver.findElement(By.cssSelector("#topmenu > li:nth-child(5)"));
        menuBarItems[5] = WebDriver.driver.findElement(By.cssSelector("#topmenu > li:nth-child(6)"));
        menuBarItems[6] = WebDriver.driver.findElement(By.cssSelector("#topmenu > li:nth-child(7)"));
        menuBarItems[7] = WebDriver.driver.findElement(By.cssSelector("#topmenu > li:nth-child(8)"));
        menuBarItems[8] = WebDriver.driver.findElement(By.cssSelector("#topmenu > li:nth-child(9)"));
        menuBarItems[9] = WebDriver.driver.findElement(By.cssSelector("#topmenu > li:nth-child(10)"));
        menuBarItems[10] = WebDriver.driver.findElement(By.cssSelector("#topmenu > li:nth-child(11)"));
        menuBarItems[11] = WebDriver.driver.findElement(By.cssSelector("#topmenu > li:nth-child(12)"));
        arrow = WebDriver.driver.findElement(By.cssSelector("#pma_navigation_collapser"));
        server = WebDriver.driver.findElement(By.cssSelector("#serverinfo > a"));
        aNewerVersion = WebDriver.driver.findElement(By.cssSelector("#newer_version_notice"));
        for (WebElement el : menuBarItems) {
            menuBar.add(el);
        }
    }

    @Step("Clicking to arrow...")
    public void clickArrow(){
        getArrow().click();
    }

    @Step("Getting an arrow...")
    public WebElement getArrow() {
        return arrow;
    }

    public void setArrow(WebElement arrow) {
        this.arrow = arrow;
    }

    @Step("Getting a server...")
    public WebElement getServer() {
        return server;
    }

    public void setServer(WebElement server) {
        this.server = server;
    }

    @Step("Clicking server...")
    public void clickServer(){
        getServer().click();
    }

    @Step("Getting a newer version...")
    public WebElement getaNewerVersion() {
        return aNewerVersion;
    }

    public void setaNewerVersion(WebElement aNewerVersion) {
        this.aNewerVersion = aNewerVersion;
    }

    @Step("Clicking newer server...")
    public void clickNewerVersion(){
        getaNewerVersion().click();
    }

    @Step("Getting menu bar...")
    public ArrayList<WebElement> getMenuBarr() {
        return menuBar;
    }

    @Step("Getting menu bar element...")
    public WebElement getMenuElement(int num) {
        return menuBar.get(num);
    }

    @Step("Getting the text of needed menu bar element...")
    public String getElementText(int num){
        return getMenuElement(num).getText();
    }

    @Step("Getting logo...")
    public WebElement getLogo() {
        return logo;
    }

    @Step("Clicking logo...")
    public void clickLogo(){
        getLogo().click();
    }

    @Step("Getting the navigation panel links...")
    public List<WebElement> getNaviPanelLinks() {
        return naviPanelLinks;
    }

    @Step("Getting the resent...")
    public WebElement getResent() {
        return resent;
    }

    @Step("Clicking resent...")
    public void clickResent(){
        getResent().click();
    }

    @Step("Getting favorites...")
    public WebElement getFavorites() {
        return favorites;
    }

    @Step("Clicking favorites...")
    public void clickFavorites(){
        getFavorites().click();
    }

    @Step("Getting databases...")
    public List<WebElement> getDatabases() {
        return databases;
    }

    public void setLogo(WebElement logo) {
        this.logo = logo;
    }

    public void setNaviPanelLinks(List<WebElement> naviPanelLinks) {
        this.naviPanelLinks = naviPanelLinks;
    }

    public void setResent(WebElement resent) {
        this.resent = resent;
    }

    public void setFavorites(WebElement favorites) {
        this.favorites = favorites;
    }

    public void setDatabases(List<WebElement> databases) {
        this.databases = databases;
    }

    public void setMenuBar(ArrayList<WebElement> menuBar) {
        this.menuBar = menuBar;
    }

    public void setMenuBarItems(WebElement[] menuBarItems) {
        this.menuBarItems = menuBarItems;
    }
}
