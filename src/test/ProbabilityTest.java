import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class ProbabilityTest {

    private Probability probabilityOne;
    @Test
    public void shouldReturnProbabilityNotGettingEvent(){
        probabilityOne = new Probability(1.0);
        assertEquals(1.6, probabilityOne.notHappeningEvent(), 0.1);
    }
}
