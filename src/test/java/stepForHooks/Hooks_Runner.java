package stepForHooks;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\patel\\eclipse-workspace\\Cucumber_Hooks\\src\\test\\resources\\HooksDemo\\HooksDemo.feature",
glue= {"stepForHooks"})

public class Hooks_Runner {

}
