package com.training.test;

import com.training.base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class LeadTest extends BaseTest {

    @Test
    public void clickOnLeadTab() throws InterruptedException {
        login();
        Thread.sleep(10000);

        WebElement leadLinkElement = driver.findElement(By.xpath("//span[text()='Leads']"));
        waitForVisibility(leadLinkElement, driver, 10, "opp link element 2");
        moveAndClickAction(leadLinkElement, "mouse over account");


    }

    @Test
    public void convertLeadToOpportunity() throws InterruptedException {
        clickOnLeadTab();
        Thread.sleep(5000);

        WebElement leadName = driver.findElement(By.xpath("//a[@title='Siri M']"));
        waitForVisibility(leadName, driver, 5, "Lead name");
        click(leadName, "Lead name");

        Thread.sleep(5000);
        scrollThePageDownByAmount(driver);
        WebElement reportingMatchedAccount = driver.findElement(By.xpath("//button[@title='Edit Reporting Matched Account']"));
        waitForVisibility(reportingMatchedAccount,driver,5,"Reporting matched account");
        click(reportingMatchedAccount,"Reporting matched account");
        selectElementByIndex(reportingMatchedAccount,3,"Reporting matched Account");

    }
}

