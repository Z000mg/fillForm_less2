import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import javax.swing.*;

import java.io.File;

import static com.codeborne.selenide.Selenide.*;

public class FillFormLesson2 {


    public static String
            first_name = "Alexander",
            last_name = "Ivanov",
            email = "exmpl@ya.ru",
            number = "9031234567",
            adress = "Lenina str.",
            subj = "WTF";
    File file = new File("src/test/resources/1.jpg");

    @BeforeAll
    static void setup(){
        Configuration.startMaximized = true;
    }

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
        $(".react-datepicker__day--007").click();
        $("#subjectsInput").click();
        $("#subjectsInput").val(subj);
        $x("//*[@for='hobbies-checkbox-1']").click();
        $x("//*[@for='hobbies-checkbox-3']").click();
        $("#uploadPicture").uploadFile(file);
        $("#currentAddress").val(adress);
        $("#stateCity-wrapper").click();

        $x("//*[@for='hobbies-checkbox-3']").click();

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