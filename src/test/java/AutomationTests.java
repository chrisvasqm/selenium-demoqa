import org.example.models.Student;
import org.example.pageObjects.StudentRegistrationForm;
import org.example.pageObjects.StudentRegistrationModal;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static com.google.common.truth.Truth.assertThat;
import static org.junit.Assert.assertTrue;

public class AutomationTests {
    private final WebDriver driver = new ChromeDriver();

    @Test
    public void studentRegistrationForm_NewStudent_IsSaved() {
        var form = new StudentRegistrationForm(driver);
        form.visit();

        var student = new Student(
                "Chris",
                "Perez",
                "c.perez@gmail.com",
                "Male",
                "1111111111"
        );
        form.fill(student);
        form.submit();

        var modal = new StudentRegistrationModal(driver);
        assertTrue(modal.isSaved());
    }

    @AfterMethod
    public void tearDown() throws InterruptedException {
        driver.quit();
    }
}
