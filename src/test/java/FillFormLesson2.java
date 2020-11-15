import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

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
        $("#firstName").val(first_name);
        $("#lastName").val(last_name);
        $("#userEmail").val(email);
        $x("//*[@for='gender-radio-1']").click();
        $("#userNumber").val(number);
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionByValue("6");
        $(".react-datepicker__year-select").selectOptionByValue("1973");
        $(".react-datepicker__day--003").click();

        $(By.id("dateOfBirthInput")).click();

        $(By.className("react-datepicker__day")).click();
        //$(By.cssSelector("react-datepicker__day")).click();


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