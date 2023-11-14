package ru.netology.page;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class DashboardPade {
    private final SelenideElement heading = $("[data-test-id=dashboard]");

    public DashboardPade() {
        heading.shouldBe(visible);
    }
}
