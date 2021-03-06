package steps;

import pages.PersonsPage;
import ru.yandex.qatools.allure.annotations.Step;

import java.util.HashMap;

import static org.junit.Assert.assertTrue;

public class PersonsPageSteps{

    /*@Step("заголовок второй страницы калькулятора равен {0}")
    public void checkPageTitle(String expectedTitle){
        String actualTitle = new PersonsPage(driver).title.getText();
        assertTrue(String.format("Заголовок равен [%s]. Ожидалось - [%s]",
                actualTitle, expectedTitle), actualTitle.contains(expectedTitle));
    }*/

    @Step("Поле {0} заполняется значением {1}")
    public void stepFillField(String field, String value){
        new PersonsPage().fillField(field,value);
    }

    @Step("Заполняются поля")
    public void stepWhenFillingFields(HashMap<String ,String> fields){
        fields.forEach(this::stepFillField);
    }

    @Step("Нажатие кнопки продолжить")
    public void clickingCntBtn(){
        new PersonsPage().cntButton.click();
    }
    @Step("Проверка ошибки")
    public void errorValidation() {
        new PersonsPage().checkFieldErrorMessage();
    }
}
