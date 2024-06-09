package com.training.test;

import com.training.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AccountsTest extends BaseTest {

    @Test
    public void clickOnAccount() throws InterruptedException {
        login();

        Thread.sleep(10000);

        WebElement accountLinkElement = driver.findElement(By.xpath("//span[text()='Accounts']"));
        waitForVisibility(accountLinkElement,driver,10," account link element ");
        moveAndClickAction(accountLinkElement,"mouse over account");

    }
    @Test
    public void account_D_M_NotAutopopulate_Opty_LR() throws InterruptedException {
        clickOnAccount();
        WebElement newBtn = driver.findElement(By.linkText("New"));
        waitForVisibility(newBtn,driver,10,"'New' button");
        click(newBtn,"New button");

        WebElement stdRadioBtn = driver.findElement(By.xpath("(//span[@class='slds-radio--faux'])[1]"));
    waitForVisibility(stdRadioBtn,driver,10,"Standard radio button");
    click(stdRadioBtn,"Standard radio button");

   // WebElement nextButton = driver.findElement(By.xpath("(//button/span[@class=' label bBody'])[1]"));
  WebElement nextButton=  driver.findElement(By.xpath("//button[@class='slds-button slds-button_neutral slds-button slds-button_brand uiButton']"));
        waitForVisibility(nextButton,driver,20,"Next buttton");
        click(nextButton,"Next button");


        WebElement accountNameTextBox = driver.findElement(By.xpath("//input[@class='slds-input' and @name='Name' ]"));
        waitForVisibility(accountNameTextBox,driver,10,"Account name text box");
        enterText(accountNameTextBox,"Sahana KH","Account name text box");

        WebElement websiteTextbox = driver.findElement(By.xpath("//input[@name='Website']"));
        waitForVisibility(websiteTextbox,driver,10,"Website text box");
        enterText(websiteTextbox,"https://www.liveramp.com","Website textbox");

       WebElement shippingAddress = driver.findElement(By.xpath("//input[@name='country']"));
       waitForVisibility(shippingAddress,driver,10,"Shipping address");
       click(shippingAddress,"Shipping address");
//        Thread.sleep(10000);
//        WebElement shippingCountryDropDown = driver.findElement(By.xpath("//input[@name='//input']"));
//        waitForVisibility(shippingCountryDropDown,driver,10,"Shipping country drop down");
//        click(shippingCountryDropDown,"Shipping country drop down");

        WebElement shippingStreet = driver.findElement(By.xpath("(//input[@class='slds-input'])[4]"));
        waitForVisibility(shippingStreet,driver,10,"Shipping street text box");
        enterText(shippingStreet,"Mysore","Shipping street");

        scrollDownByJavascript(3,1000);

        WebElement proceedBtn = driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']"));
        waitForVisibility(proceedBtn,driver,10,"Proceed button");
        click(proceedBtn,"Proceed button");

        switchToAlert();
        scrollThePageDownByAmount(driver);

        WebElement verticalTextbox = driver.findElement(By.xpath("//button[@id='combobox-button-2439']"));
        waitForVisibility(verticalTextbox,driver,10,"Vertical text box");
        enterText(verticalTextbox,"Agency","Vertical text box");

        WebElement saveBtn = driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']"));
        waitForVisibility(saveBtn,driver,10,"Save button");
        click(saveBtn,"Save Button");


    }
}
