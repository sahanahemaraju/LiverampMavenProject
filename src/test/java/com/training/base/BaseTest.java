package com.training.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;
import org.apache.commons.io.input.TaggedReader;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.swing.*;
import java.time.Duration;
import java.util.List;
import java.util.Set;


public class BaseTest {
  public  WebDriver driver;
   public WebDriverWait wait;
   
   public  void setUpBeforeMethod(){
       openBrowser("chrome");
       
   }
    
    public void openBrowser(String browser){
        if (browser.equalsIgnoreCase("chrome")){
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
            
        }
        System.out.println(browser +" is opened");

    }
    public void login(){
        openBrowser("chrome");
        enterUrl("https://liveramp--uat1.sandbox.my.salesforce.com/");
        maximizeBrowser();
        implicitlyWait(driver,5);
        WebElement unTb = driver.findElement(By.id("username"));
        enterText(unTb,"amla@liveramp.com.uat1" ,"unTextbox");
        WebElement pwTb = driver.findElement(By.id("password"));
        enterText(pwTb,"Testing@1234" ,"pwTextbox");
        WebElement loginBtn = driver.findElement(By.id("Login"));
        click(loginBtn,"login button");
    }
    public  void maximizeBrowser(){
        driver.manage().window().maximize();

    }
    public void loginVerification(){
        String exptUrl = "https://liveramp--uat1.sandbox.lightning.force.com/lightning/page/home";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(exptUrl,actualUrl);


    }
    public void enterUrl(String url){
        driver.get(url);
        System.out.println(url + " is entered");
    }
    public  void getPageTitle(){
        String title = driver.getTitle();
        System.out.println("the title of the page is :"+title);
    }
    public void refreshPage(){
        driver.navigate().refresh();
    }
    public void enterText(WebElement givenWebElement, String data, String elementName){
        if(givenWebElement.isDisplayed()) {
            clearElement(givenWebElement, elementName);
            givenWebElement.sendKeys(data);
            System.out.println("Data is entered in the " + elementName);
        } else{
            System.out.println(elementName + "is not found");

        }
    }

    private static void clearElement(WebElement givenWebElement, String elementName) {
        if (givenWebElement.isDisplayed()) {
            givenWebElement.clear();
            System.out.println(elementName + " is cleared");
        } else {
            System.out.println(elementName + " is not displayed");
        }
    }

    public void click(WebElement element,String objectName){
        if (element.isEnabled() || element.isDisplayed()) {
            element.click();
            System.out.println(objectName + " is clicked");
        }else{
            System.out.println(objectName + " is not found");
        }

    }
    public void scrollDownByJavascript(int n,int length) throws InterruptedException {
       JavascriptExecutor js=(JavascriptExecutor) driver;
        for (int i = 0; i < n; i++) {
            js.executeScript("window.scrollBy(0,length)");
            Thread.sleep(3000);

        }
    }
    public void scrollThePageDownByAmount(WebDriver driver) throws InterruptedException {
        Actions actions=new Actions(driver);
        for (int i = 0; i < 3 ; i++) {
            actions.scrollByAmount(0, 100).build().perform();
            Thread.sleep(1000);
        }

    }
    public void scrollThePageDownToElement(WebDriver driver,WebElement element) throws InterruptedException {
        Actions actions=new Actions(driver);
        for (int i = 0; i < 3 ; i++) {
            waitForVisibility(element,driver,5,"object name");
            actions.scrollToElement(element).build().perform();
            Thread.sleep(1000);
        }

    }
    public String getText(WebElement element,String objectName){
        String text = element.getText();
        System.out.println(text +"text is extracted from "+objectName);

        return text;
    }


    public void moveToElement(WebElement givenElement ,String objectName){
       Actions action=new Actions(driver);
       action.moveToElement(givenElement).build().perform();
       System.out.println("cursor move to webElement "+objectName);
    }
    public void moveAndClickAction(WebElement element,String objectName){
       Actions actions=new Actions(driver);
       actions.moveToElement(element).click().build().perform();
       System.out.println("perform click action on WebElement :"+objectName);
    }


    public void switchToWindow(String parentWindow){

        Set<String> whs = driver.getWindowHandles();
        whs.remove(parentWindow);
        for (String wh:whs){
           driver.switchTo().window(wh);
        }
        System.out.println("Switch to new window");
    }
    public void switchToAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public  WebElement selectFromListUsingText(List<WebElement> list,String text){
       WebElement element=null;
       for(WebElement ele:list){
           if(ele.getText().equalsIgnoreCase(text)){
               System.out.println("selected"+ele.getText());
               element=ele;
               break;
           }
       }
        return element;
    }
    public void selectElementByIndex(WebElement element,int index,String objectName){

       Select select=new Select(element);
       select.selectByIndex(index);
        System.out.println(objectName+" is selected by index");

    }

    public void implicitlyWait(WebDriver driver,int time){
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
       
    }
    public void waitForVisibility(WebElement element,WebDriver driver,int time,String objectName) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(time));
        wait.until(ExpectedConditions.visibilityOf(element));
        System.out.println(objectName+" is waiting for visibility of explicit wait");
    }
    public void waitForVisibility(WebElement element,WebDriver driver ,int time,int pollingTime,String objectName){
        FluentWait<WebDriver> wait=new FluentWait<>(driver);
        wait.withTimeout(Duration.ofSeconds(time)).pollingEvery(Duration.ofSeconds(pollingTime))
                .ignoring(ElementNotInteractableException.class);
        System.out.println(objectName +" is waiting for visibility of fluent wait");
    }
    public void waitUntilPresenceOfElementLocatedBy(By locator,int time,String objectName){
        System.out.println("Waiting for ana webElement "+objectName + " for its visibility");
        wait=new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(locator));
    }
    public void  waitUntilElementToBeClickable(By locator,int time,String objectName){
        System.out.println("Waiting for an webElement"+ objectName+ " to be clickable");
        wait=new WebDriverWait(driver,Duration.ofSeconds(time));
        wait.until(ExpectedConditions.elementToBeClickable(locator));
   }
   public void waitForAlertPresent(int time){
       wait=new WebDriverWait(driver,Duration.ofSeconds(time));
       wait.until(ExpectedConditions.alertIsPresent());
   }

    public void waitUntilPageLoads() {
        System.out.println("waiting page loads until 30 sec maximum");
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
    }
        public  void closeBrowser(){
        driver.close();
        System.out.println("Browser is closed");
    }
    
}
