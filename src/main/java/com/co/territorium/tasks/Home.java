package com.co.territorium.tasks;


import com.co.territorium.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.DoubleClick;

public class Home implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(DoubleClick.on(HomePage.BTN_PROFILE));
        actor.attemptsTo(Click.on(HomePage.BTN_LESSONS));
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static Home seeLesons(){
        return Tasks.instrumented(Home.class);
    }
}
