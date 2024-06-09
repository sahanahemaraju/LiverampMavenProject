package com.training.test;

import com.training.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.LinkedList;

public class OpportunityTest1 extends BaseTest{

    @Test
    public  void clickOnOpportunityDropDown() throws InterruptedException {

    login();
     Thread.sleep(10000);

        WebElement oppLinkElement = driver.findElement(By.xpath("//span[text()='Opportunities']"));
        waitForVisibility(oppLinkElement,driver,10,"opp link element 2");
        moveAndClickAction(oppLinkElement,"oppLinkElement");

    }
    @Test
    public void createOpportunity() throws InterruptedException {
        //Testcase number-2,TC_Opty_ProductACV_Update_Condition7_LR
        clickOnOpportunityDropDown();

        WebElement newBtn = driver.findElement(By.xpath("//div[text()='New']"));
        click(newBtn,"'New' button");

        WebElement standardOpp = driver.findElement(By.xpath("(//span[@class='slds-radio--faux'])[1]"));
    click(standardOpp ," Standard opportunity radioButton");


        WebElement nextBtn = driver.findElement(By.xpath("(//span[@class=' label bBody'])[4]"));
       waitForVisibility(nextBtn,driver,5,"Next button");
        click(nextBtn,"Next button");
        Thread.sleep(10000);

        WebElement accountNameTb = driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[1]"));
        waitForVisibility(accountNameTb,driver,5,"Account name text box");
        click(accountNameTb,"Account name textbox");

        WebElement ramAccount = driver.findElement(By.xpath("//span[@title='Test _Ram_Account for Automation_00']"));
        waitForVisibility(ramAccount,driver,10,"Ram account");
        click(ramAccount,"Ram accont");

        WebElement closeDateTb = driver.findElement(By.xpath("//div/input[@name='CloseDate']"));
        waitForVisibility(closeDateTb,driver,3,"close date text box");
        enterText(closeDateTb,"4/24/2024","close date text box");

        WebElement oppNameTb = driver.findElement(By.xpath("//div/input[ @name='Name']"));
        waitForVisibility(oppNameTb,driver,5,"Opportunity name text box");
        enterText(oppNameTb,"Testing_Opportunity_001","Opportunity name text box");

        Thread.sleep(3000);
        WebElement stageDropDown = driver.findElement(By.xpath("//div[@class='slds-form-element__control']//button[@aria-label='Stage' or @id='combobox-button-704']"));
        waitForVisibility(stageDropDown,driver,10,"stage drop down");
        click(stageDropDown,"Stage textbox");

        WebElement introductionStage = driver.findElement(By.xpath("//span[text()='Introduction']"));
        waitUntilElementToBeClickable(By.xpath("//span[text()='Introduction']"),10,"Introduction stage");
        click(introductionStage,"Introduction stage");

//        WebElement introductionStage = driver.findElement(By.xpath("(//span[text()='Introduction'])[2]"));
//        waitUntilElementToBeClickable(By.xpath("(//span[text()='Introduction'])[2]"),10,"Introduction stage");
//        click(introductionStage,"Introduction stage");

//        JavascriptExecutor js=(JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click();", introductionStage);



//        Select select=new Select(stageDropDown);
//        select.selectByIndex(2);
//         stageDropDown.click();
//
//       Thread.sleep(2000);
//        scrollDownByJavascript(5,1000);
//
//        JavascriptExecutor js=(JavascriptExecutor)driver;
//        for (int i = 0; i < 5; i++) {
//            js.executeScript("window.scrollBy(0,1000)");
//            Thread.sleep(3000);
//        }




//        WebElement typeOfBuisiness = driver.findElement(By.xpath("(//button[contains(@id ,'combobox-button')])[1] "));
//        waitForVisibility(typeOfBuisiness,driver,5,"Type of Buisiness");
//
//        Thread.sleep(3000);
//        scrollThePageDownToElement(driver,typeOfBuisiness);
//    waitUntilElementToBeClickable(By.xpath("(//button[contains(@id ,'combobox-button')])[1] "),3,"type of buisiness text box");
//        click(typeOfBuisiness,"Type of buisiness");

//    selectElementByIndex(typeOfBuisiness,2,"Type of buisiness");
//
//        WebElement forecastCategory = driver.findElement(By.xpath("//div/button[@id='combobox-button-725']"));
//    waitForVisibility(forecastCategory,driver,5,"Forecast Category text box");
//    enterText(forecastCategory,"Pipeline","Forecst category text box");

//        WebElement saveButton = driver.findElement(By.xpath("//button[text()='Save']"));
//        waitForVisibility(saveButton,driver,5,"Save button");
//        click(saveButton,"Save button");
//
//
//    Thread.sleep(3000);
//
//        for (int i = 0; i < 5; i++) {
//            js.executeScript("window.scrollBy(0,1000)");
//            Thread.sleep(3000);
//
//        }


    }
    @Test
    public void Opty_ProductACV_Update_Condition8_LR() throws InterruptedException {
        clickOnOpportunityDropDown();

        WebElement newBtn = driver.findElement(By.xpath("//div[text()='New']"));
        click(newBtn,"'New' button");

        WebElement standardOpp = driver.findElement(By.xpath("(//span[@class='slds-radio--faux'])[1]"));
        click(standardOpp ," Standard opportunity radioButton");

        WebElement nextBtn = driver.findElement(By.xpath("(//span[@class=' label bBody'])[4]"));
        click(nextBtn,"Next button");
        Thread.sleep(10000);

        WebElement accountNameTb = driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[1]"));
        waitForVisibility(accountNameTb,driver,3,"Account name text box");
        enterText(accountNameTb, "Tekarch","Account name text box");

        WebElement closeDateTb = driver.findElement(By.xpath("//div/input[@name='CloseDate']"));
        waitForVisibility(closeDateTb,driver,3,"close date text box");
        enterText(closeDateTb,"4/24/2024","close date text box");

        WebElement oppNameTb = driver.findElement(By.xpath("//div/input[ @name='Name']"));
        waitForVisibility(oppNameTb,driver,5,"Opportunity name text box");
        enterText(oppNameTb,"Testing_Opportunity_001","Opportunity name text box");

        WebElement stageDropDown = driver.findElement(By.xpath("//div[@class='slds-form-element__control']//button[@aria-label='Stage' or @id='combobox-button-704']"));
        waitForVisibility(stageDropDown,driver,10,"stage drop down");
        click(stageDropDown,"Stage textbox");

        Thread.sleep(3000);

        JavascriptExecutor js=(JavascriptExecutor) driver;
        for (int i = 0; i < 5; i++) {
            js.executeScript("window.scrollBy(0,1000)");
            Thread.sleep(3000);

        }



    }
    @Test
   public void opp_TC_9() throws InterruptedException {
        login();

        Thread.sleep(3000);
        WebElement accountLinkElement = driver.findElement(By.xpath("//span[text()='Accounts']"));
        waitForVisibility(accountLinkElement,driver,10," account link element ");
        moveAndClickAction(accountLinkElement,"mouse over account");

        Thread.sleep(5000);
        WebElement existingAccount = driver.findElement(By.xpath("//a[@title='Test _Ram_Account for Automation_00']"));
        waitForVisibility(existingAccount,driver,30,"Existing account name");
        click(existingAccount,"Existing account name");

        Thread.sleep(3000);
        WebElement changeOwnerBtn = driver.findElement(By.xpath("//button[@title='Change Owner']"));
        waitForVisibility(changeOwnerBtn,driver,30,"Change owner button");
        click(changeOwnerBtn,"Change owner button");

        WebElement searchUserTextbox = driver.findElement(By.xpath("//input[@title='Search Users']"));
        waitForVisibility(searchUserTextbox,driver,10,"Search User TB");
        click(searchUserTextbox,"Search text box");

        WebElement ChristopherAlbers= driver.findElement(By.xpath("//div[@title='Christopher Albers']"));
        waitForVisibility(ChristopherAlbers,driver,10,"Ram Bulusu option");
        click(ChristopherAlbers,"Ram Bulusu option");

        WebElement button = driver.findElement(By.xpath("//button[text()='Change Owner']"));
        waitForVisibility(button,driver,10,"Change Owner btn");
        click(button,"Change owner button");
        Thread.sleep(10000);

        WebElement oppLinkElement = driver.findElement(By.xpath("//span[text()='Opportunities']"));
        waitUntilElementToBeClickable(By.xpath("//span[text()='Opportunities']"),20,"Opportunity link");
        moveAndClickAction(oppLinkElement,"oppLinkElement");

        WebElement existingOppor = driver.findElement(By.xpath("//a[@title='Testing_opportunity_003']"));
        waitForVisibility(existingOppor,driver,10,"Existing opportunity");
        click(existingOppor,"Existing opportunity");
        Thread.sleep(3000);

     JavascriptExecutor js=(JavascriptExecutor)driver;
        for (int i = 0; i < 3; i++) {
            js.executeScript("window.scrollBy(0,500)") ;
            Thread.sleep(3000);
        }
        System.out.println("The webpage is scroll down");



        WebElement oppTeamTab = driver.findElement(By.xpath("//span[@title='Opportunity Team']"));
        waitForVisibility(oppTeamTab,driver,10,"Opportunity team tab");
        click(oppTeamTab,"Opportunity Team Tab");

    }
    @Test
    public void TC_Opty_QualifiedFlag_Checked_TC1_LR() throws InterruptedException {
        login();

        clickOnOpportunityDropDown();

        WebElement newBtn = driver.findElement(By.xpath("//div[text()='New']"));
        click(newBtn,"'New' button");

        WebElement standardOpp = driver.findElement(By.xpath("(//span[@class='slds-radio--faux'])[1]"));
        click(standardOpp ," Standard opportunity radioButton");


        WebElement nextBtn = driver.findElement(By.xpath("(//span[@class=' label bBody'])[4]"));
        waitForVisibility(nextBtn,driver,5,"Next button");
        click(nextBtn,"Next button");
        Thread.sleep(10000);

        WebElement accountNameTb = driver.findElement(By.xpath("(//input[@class='slds-combobox__input slds-input'])[1]"));
        waitForVisibility(accountNameTb,driver,5,"Account name text box");
        enterText(accountNameTb, "Test _Ram_Account for Automation_00","Account name text box");

        WebElement closeDateTb = driver.findElement(By.xpath("//div/input[@name='CloseDate']"));
        waitForVisibility(closeDateTb,driver,3,"close date text box");
        enterText(closeDateTb,"4/24/2024","close date text box");

        WebElement oppNameTb = driver.findElement(By.xpath("//div/input[ @name='Name']"));
        waitForVisibility(oppNameTb,driver,5,"Opportunity name text box");
        enterText(oppNameTb,"Testing_Opportunity_001","Opportunity name text box");

        Thread.sleep(3000);
        WebElement stageDropDown = driver.findElement(By.xpath("//div[@class='slds-form-element__control']//button[@aria-label='Stage' or @id='combobox-button-704']"));
        waitForVisibility(stageDropDown,driver,10,"stage drop down");
        click(stageDropDown,"Stage textbox");

        WebElement introductionStage = driver.findElement(By.xpath("//button[@type='button' and @aria-label='Stage' and @data-value='Introduction']"));
        waitUntilElementToBeClickable(By.xpath("\"//button[@type='button' and @aria-label='Stage' and @data-value='Introduction']\""),10,"Introduction stage");
        click(introductionStage,"Introduction stage");


    }
    @Test
    public void TC_StandardOpportunity_CustomCloning_LR() throws InterruptedException {

        clickOnOpportunityDropDown();

        WebElement existingStandardOpp = driver.findElement(By.xpath("//a[@title='Testing_opportunity_003']"));
        waitForVisibility(existingStandardOpp, driver, 10, "Existing standard opportunity");
        click(existingStandardOpp, "Existing standard opportunity");
        Thread.sleep(3000);

        WebElement cloneElement = driver.findElement(By.xpath("//button[@name='Opportunity.Clone_with_Related_New']"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        cloneElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@name='Opportunity.Clone_with_Related_New']")));
        cloneElement.click();
        cloneElement = driver.findElement(By.xpath("//button[@name='Opportunity.Clone_with_Related_New']"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", cloneElement);
        System.out.println("clone element is clicked");

        Thread.sleep(3000);
//        WebElement checkBoxOfOppProduct = driver.findElement(By.xpath("//span[@part='indicator']"));
//        waitForVisibility(checkBoxOfOppProduct,driver,10,"Check box of opportunity product");
//        checkBoxOfOppProduct= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@part='indicator']")));
//        checkBoxOfOppProduct.click();
//        checkBoxOfOppProduct = driver.findElement(By.xpath("//span[@part='indicator']"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkBoxOfOppProduct);

        WebElement checkBox = driver.findElement(By.xpath("//span[@class='slds-checkbox_faux']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(checkBox).click().perform();
        System.out.println("check box is selected");

        //        WebElement nextBtn = driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand' and text()='Next'])[1]"));
        //        waitForVisibility(nextBtn,driver,10,"Next button");
        //        click(nextBtn,"Next button");

//        WebElement nextBtn = driver.findElement(By.xpath("(//button[@class='slds-button slds-button_brand'])[6]"));
//         actions = new Actions(driver);
//        actions.moveToElement(nextBtn).click().perform();
//        System.out.println("Next Btn is clicked");


        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='slds-button slds-button_brand']")));
        element.click();
    }

}
