package Run;



@CucumberOptions(
        features = "src/test/resources/firstTest.feature",
        glue = {"StepDefinitions"}
)

public class Run extends AbstractTestNGCucumberTests {
}
