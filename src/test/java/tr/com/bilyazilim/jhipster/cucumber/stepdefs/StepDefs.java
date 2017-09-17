package tr.com.bilyazilim.jhipster.cucumber.stepdefs;

import tr.com.bilyazilim.jhipster.InventoryApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = InventoryApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
