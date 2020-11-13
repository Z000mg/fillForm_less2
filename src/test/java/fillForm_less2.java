import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.closeWindow;
import static com.codeborne.selenide.Selenide.open;

public class fillForm_less2 {

    @Test
    void lesson2Form() {
        open ("https://demoqa.com/automation-practice-form");

        open ("https://demoqa.com/automation-practice-form");
        closeWindow();
    }

}



// найти Student Registration Form
// заполнить first name
// заполнить last name
// заполнить email
// выбрать gender
// ввести номер (10 цифр)
// выбрать дату
// написать что-то в subjects
// выбрать хобби
// выбрать и загрузить картинку
// заполнить адрес
// выбрать хобби
// выбрать штат
// выбрать город
// нажать сабмит
// проверить что выдано