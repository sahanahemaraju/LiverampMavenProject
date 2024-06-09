package com.training.pages;

import com.training.base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    String un="https://liveramp--uat1.sandbox.my.salesforce.com/";
    String pw="Testing@123";

@FindBy(id="username")
    private WebElement unTb;
   @FindBy(id="password")
    private WebElement pwTb;
    @FindBy(id="Login")
    private WebElement loginBtn;

    public void setUser(String un) {
        unTb.sendKeys(un);
    }
        public void setPassword(String pw){
            pwTb.sendKeys(pw);
        }
            public void clickLoginBtn(){
                loginBtn.click();
            }
    }

