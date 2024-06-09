package com.training.test;

import com.training.base.BaseTest;
import com.training.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;




public class LoginTest extends BaseTest {
    WebDriver driver;

    LoginPage login=new LoginPage(driver);

    @Test

    public void LoginTest(){

        login();

    }
    @Test
    public void verifyLogin(){
        login();
        loginVerification();
    }




}
