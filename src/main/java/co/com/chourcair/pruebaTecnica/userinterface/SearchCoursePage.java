package co.com.chourcair.pruebaTecnica.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class SearchCoursePage extends PageObject {
    public static final Target SELECT_CC = Target.the("Select university")
            .located(By.xpath("//div[@class='card-header']//strong[contains(text(), 'Cursos y ')]"));
    public static final Target INPUT_COURSE = Target.the("Search the course")
            .located(By.id("coursesearchbox"));
    public static final Target BUTTON_GO = Target.the("Click to search the course")
            .located(By.xpath("//button[@class='btn btn-secondary']"));
    public static final Target SELECT_COURSE = Target.the("Gives a click to search the course")
            .located(By.xpath("//a[contains(@href, 'https://operacion.choucairtesting.com/academy/course/view.php?id=480')]"));
    public static final Target NAME_COURSE = Target.the("Extract the name of the course")
            .located(By.tagName("h1"));
}
