package tests;

import org.junit.jupiter.api.BeforeEach;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class BaseTests {

    @BeforeEach
    void setUp() {
        open("https://xn--80afcdbalict6afooklqi5o.xn--p1ai/identity/account/login ");
    }
}