package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class VerificationPage {
    private final SelenideElement codeField = $("[data-test-in=code] input");
    private final SelenideElement verifyButton = $("[data-test-in=action-verify]");
    private final SelenideElement errorNotification = $("[data-test-in='error-notification'] .notification_content");

    public void verifyVerificationPageVisibility() {
        codeField.shouldBe(visible);
    }
    public void verifyErrorNotification(String expectedText) {
        errorNotification.shouldHave(exactText(expectedText)).shouldBe(visible);
    }
    public DashboardPade validVerify(String verificationCode) {
        verify(verificationCode);
        return  new DashboardPade();
    }
    public void verify(String verificationCode) {
        codeField.setValue(verificationCode);
        verifyButton.click();
    }
}
