package com.training.test;

import com.training.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ContactTest extends BaseTest {

    @Test
    public void clickOnContact() throws InterruptedException {
        login();

        Thread.sleep(10000);

        WebElement contactLinkElement = driver.findElement(By.xpath("//span[text()='Contacts']"));
        waitForVisibility(contactLinkElement,driver,10,"Contact link element");
        moveAndClickAction(contactLinkElement,"mouse over account");

    }
@Test
    public void createContact() throws InterruptedException {
        clickOnContact();
        Thread.sleep(3000);
        WebElement newButton = driver.findElement(By.xpath("//a/div[text()='New']"));

        waitUntilElementToBeClickable(By.xpath("//a/div[text()='New']"),10,"New button");
    click(newButton,"New Button");

    WebElement titleAnDFirstName = driver.findElement(By.xpath("(//input[contains(@id , 'input')])[2]"));
    waitForVisibility(titleAnDFirstName,driver,10,"Title and first name text box");
    enterText(titleAnDFirstName,"Sahana","title and first name text box ");

    WebElement lastName = driver.findElement(By.xpath("(//input[contains(@id , 'input')])[3]"));
    waitForVisibility(lastName,driver,10,"Last name text box");
    enterText(lastName,"KH","Last name text box ");

    WebElement email = driver.findElement(By.xpath("//input[@id='input-317' or @name='Email']"));
    waitForVisibility(email,driver,10,"email text box");
    enterText(email,"sahana@tek.com","email text box ");
        Thread.sleep(5000);
    WebElement phone= driver.findElement(By.xpath("//input[@name='Phone']"));
    waitForVisibility(phone,driver,10,"phone text box");
    enterText(phone,"9845123456","phone text box ");

    WebElement accountName = driver.findElement(By.xpath("//div/input[@class='slds-combobox__input slds-input']"));
    waitForVisibility(accountName,driver,10,"account name text box");
    enterText(accountName,"liveramp","account name text box ");

    WebElement proceedBtn = driver.findElement(By.xpath("//button[@class='slds-button slds-button_brand']"));
    waitForVisibility(proceedBtn,driver,10,"proceed button");
    click(proceedBtn,"Proceed button");

    Thread.sleep(10000);
//    WebElement salutation = driver.findElement(By.xpath("//button[@name='salutation' and @role='combobox']"));
//    waitForVisibility(salutation,driver,10,"proceed button");
//    enterText(salutation,"Mrs","Salutation text box");


    WebElement saveBtn = driver.findElement(By.xpath("(//li[@class='slds-button-group-item visible'])[3] | (//button[@class='slds-button slds-button_brand'])[1]"));
    waitForVisibility(saveBtn,driver,10,"proceed button");
    click(proceedBtn,"Proceed button");

}
}
