package drugDrop;

import static com.codeborne.selenide.Selenide.*;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;


public class DrugDropTest {

    @Test
    void comparePlansOpens() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        $("#column-a").shouldHave(text("a"));
        $("#column-b").shouldHave(text("b"));
        $("#column-a").dragAndDropTo("#column-b");
        $("#column-a").shouldHave(text("b"));
        $("#column-b").shouldHave(text("a"));


    }
}
