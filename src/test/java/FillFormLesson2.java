import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class FillFormLesson2 {

    public static String
            first_name = "Alexander",
            last_name = "Ivanov",
            email = "exmpl@ya.ru",
            number = "9031234567",
            adress = "Lenina str.";

    @Test
    void lesson2Form() {
        open ("https://demoqa.com/automation-practice-form");
        $("html").shouldHave(Condition.text("Student Registration Form"));
        $(By.id("firstName")).setValue(first_name);
        $(By.id("lastName")).setValue(last_name);
        $(By.id("userEmail")).setValue(email);
        $(By.id("userNumber")).setValue(number);
        $(By.id("gender-radio-1")).doubleClick();
        $(By.id("dateOfBirthInput")).click();
        $(By.className("react-datepicker__month-select")).selectOptionByValue("5");
        $(By.className("react-datepicker__year-select")).selectOptionByValue("1973");
        $(By.className("react-datepicker__day react-datepicker__day--007 react-datepicker__day--weekend")).selectOptionByValue("7");



        open ("https://demoqa.com/");
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