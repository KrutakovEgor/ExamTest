import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.MainPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
public class TestAuExam {

    @BeforeEach
    void setUp() {
        open("https://xn--80afcdbalict6afooklqi5o.xn--p1ai/");
    }



        @Test
        @DisplayName("Открытие главной страницы и формы авторизации")
    void testOpenMainPage() {

            open("https://xn--80afcdbalict6afooklqi5o.xn--p1ai/");

            new MainPage()
                    .checkVisibleButtonLogin();




        }

}
