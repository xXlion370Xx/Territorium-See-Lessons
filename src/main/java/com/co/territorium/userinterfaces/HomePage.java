package com.co.territorium.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class HomePage {

    public static final Target BTN_PROFILE = Target.the("Button profile").locatedBy("//i[@class='iconMenuLateral fa fa-user']");
    public static final Target BTN_LESSONS = Target.the("Lessons profile").locatedBy("//ul[@id='contenidoDashboard']/li[6]");
    public static final Target TXT_LESSONS = Target.the("Text lessons").locatedBy("//*[text()='Cursos']");
}
