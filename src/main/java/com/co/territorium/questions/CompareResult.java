package com.co.territorium.questions;

import com.co.territorium.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class CompareResult implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return Text.of(HomePage.TXT_LESSONS).viewedBy(actor).asString();
    }

    public static CompareResult compare(){
        return new CompareResult();
    }
}
