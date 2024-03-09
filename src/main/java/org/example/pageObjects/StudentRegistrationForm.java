package org.example.pageObjects;

import org.example.models.Student;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentRegistrationForm extends PageObject {
    @FindBy(id = "firstName")
    private WebElement inputFirstName;

    @FindBy(id = "lastName")
    private WebElement inputLastName;

    @FindBy(id = "userEmail")
    private WebElement inputEmail;

    @FindBy(xpath = "//label[text()='Male']")
    private WebElement checkboxMale;

    @FindBy(id = "userNumber")
    private WebElement inputPhone;

    @FindBy(id = "submit")
    private WebElement buttonSubmit;

    public StudentRegistrationForm(WebDriver driver) {
        super(driver);
    }

    public void visit() {
        driver.get("https://demoqa.com/automation-practice-form");
    }

    public void fill(Student student) {
        inputFirstName.sendKeys(student.firstName());
        inputLastName.sendKeys(student.lastName());
        inputEmail.sendKeys(student.email());
        checkboxMale.click();
        inputPhone.sendKeys(student.phone());
    }

    public void submit() {
        buttonSubmit.click();
    }
}
