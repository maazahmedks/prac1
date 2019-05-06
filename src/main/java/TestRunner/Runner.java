package TestRunner;



import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import cucumber.api.testng.TestNGCucumberRunner;
import cucumber.runtime.model.CucumberFeature;

import net.bytebuddy.implementation.bind.annotation.RuntimeType;
import org.testng.annotations.*;
//import org.junit.runner.RunWith;

//@CucumberOptions(features = "Features", glue = "StepDef.Step1", plugin = "json:target/cucumber-report.json")

//@Test

@CucumberOptions(features = "Features/MyAppFeatures.feature" ,glue = "StepDef")
public class Runner extends AbstractTestNGCucumberTests {


}
