package com.co.territorium.stepsdefinitions;

import com.co.territorium.models.Credentials;
import com.co.territorium.questions.CompareResult;
import com.co.territorium.tasks.Home;
import com.co.territorium.tasks.Login;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

public class TerritoriumStepDefinitions {

    @Managed
    WebDriver chrome;

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Daniel");
        OnStage.theActorInTheSpotlight().can(BrowseTheWeb.with(chrome));
    }

    @Given("^The student is on the page territorium$")
    public void theStudentIsOnThePageTerritorium() {
        OnStage.theActorInTheSpotlight().wasAbleTo(Open.url("https://sena.territorio.la/index.php?login=true"));
    }

    @When("^The student enter his credential$")
    public void theStudentEnterHisCredential(List<Credentials> credentialsList) {
        Credentials credentials;
        credentials = credentialsList.get(0);
        OnStage.theActorInTheSpotlight().attemptsTo(Login.enterCrendentials(credentials));
    }

    @Then("^The student can to see his lessons$")
    public void theStudentCanToSeeHisLessons() {
        OnStage.theActorInTheSpotlight().attemptsTo(Home.seeLesons());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(CompareResult.compare()
                , Matchers.equalTo("Cursos")));
    }

}
