package specs.example;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import com.example.Greeter;

/* Run this class as a JUnit test. */

@RunWith(ConcordionRunner.class)
public class HelloWorldFixture {
    
    public String greetingFor(String firstName) {
        return new Greeter().greetingFor(firstName);
    }
}
