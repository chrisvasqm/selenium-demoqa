package org.example.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentRegistrationModal extends PageObject {

    @FindBy(xpath = "//div[text()='Thanks for submitting the form']")
    private WebElement headerStudentSaved;

    public StudentRegistrationModal(WebDriver driver) {
        super(driver);
    }

    public boolean isSaved() {
        return headerStudentSaved.isDisplayed();
    }
}
