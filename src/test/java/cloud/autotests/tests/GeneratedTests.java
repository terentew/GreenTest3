package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Simple test for GreenAtom website")
    @DisplayName("GreenAtom main webpage search test")
    void generatedTest() {
        step("Open https://greenatom.ru/", () -> {
            open("https://greenatom.ru/");
            step("// todo: selenium action: find element and fill");
            $("[class=\"search small-search-width\"]").setValue("цифровая арктика").pressEnter();
        });

        step("Check", () -> {
            step("// todo: check results");
            $("[class=\"p-search-ga\"]").shouldHave(text("Росатомфлот"));
        });
    }

    @Test
    @Description("Header test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://greenatom.ru/'", () ->
                open("https://greenatom.ru/"));

        step("Page title should have text 'Гринатом'", () -> {
            String expectedTitle = "Гринатом";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Console test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://greenatom.ru/'", () ->
                open("https://greenatom.ru/"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}