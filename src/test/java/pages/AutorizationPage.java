package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.devtools.v118.database.model.Error;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;
import static java.lang.Error.*;

public class AutorizationPage {
    private final SelenideElement loginField = $(By.xpath("//input[@id='Username']"));
    private final SelenideElement password = $(By.xpath("//input[@id='Password']"));
    private final SelenideElement loginIn = $(By.xpath("//button[@id='loginBtn']"));
    private final SelenideElement polzun = $(By.xpath("//span[@class='slider round']"));

    private final SelenideElement Errorsh = $(By.xpath("//span[@data-valmsg-for='Password']"));
    public AutorizationPage inputLogin() {
        loginField.setValue("vitaerota@mail.ru");
        return this;
    }

    public AutorizationPage inputPassword() {
        password.sendKeys("8919561zaQ");
        return this;
    }
    public AutorizationPage clickLoginIn() {
        loginIn.click();
        return this;
    }
    public AutorizationPage cheking() {
        polzun.shouldBe(visible);
        return this;
    }
    public AutorizationPage inputPasswordNegative() {
        password.sendKeys("8919561zaq");
        return this;
    }
    public void checkErrorMessageVisible() {
        Errorsh.shouldBe(visible);


    }


    }



