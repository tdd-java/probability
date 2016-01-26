import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class ProbabilityTest {

    @Test
    public void shouldReturnProbabilityofNotGettingEvent(){
        Probability probability = new Probability(0.6);
        assertEquals(1.6, probability.notHappeningEvent(),0.1);
    }
}
