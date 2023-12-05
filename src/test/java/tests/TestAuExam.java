package tests;

import org.junit.jupiter.api.*;
import pages.AutorizationPage;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestAuExam extends BaseTests{


    //@Test
     //@DisplayName("Переход с главной страницы в авторизацию")
    //void testOpenMainPage() {
      //   new MainPage()
    //.clickLogin();
    //}


        @Test
        @DisplayName("Ввод валидного логина и пароля")
         void test() {
            new AutorizationPage()
                    .inputPassword()
                    .inputLogin()
                    .clickLoginIn()
                    .cheking();
        }
         @Test
         @DisplayName("Ввод невалидного пароля, валидного логина")
         void testNegative() {
            new AutorizationPage()
                    .inputPasswordNegative()
                    .inputLogin()
                    .clickLoginIn()
                    .checkErrorMessageVisible();
             }
         }







            

























