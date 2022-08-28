package com.co.territorium.tasks;

import com.co.territorium.models.Credentials;
import com.co.territorium.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class Login implements Task {
    Credentials credentials;

    public Login (Credentials credentials){
        this.credentials = credentials;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byValue(credentials.getTypeDocument()).from(LoginPage.DROP_DOWN_LIST));
        actor.attemptsTo(Enter.theValue(credentials.getNumberDocument()).into(LoginPage.TXT_NUM_DOCUMENT));
        actor.attemptsTo(Enter.theValue(credentials.getPassword()).into(LoginPage.TXT_PASSWORD));
        actor.attemptsTo(Click.on(LoginPage.BTN_LOGIN));
    }

    public static Login enterCrendentials(Credentials credentials){
        return Tasks.instrumented(Login.class, credentials);
    }
}
