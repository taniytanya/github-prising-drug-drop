package github;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class PrisingTest {
    @BeforeAll
    static void configure() {
        Configuration.baseUrl = "https://github.com";
    }

    @Test
    void PageComparePlansOpens() {
        open("/");
        $(byText("Pricing")).hover();
        $(byText("Compare plans")).click();
        $(".application-main").shouldHave(text("Choose the plan that’s right for you."));
    }
}
