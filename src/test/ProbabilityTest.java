import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class ProbabilityTest {

    private Probability probabilityOfEventHappening;
    @Test
    public void shouldReturnProbabilityNotGettingEvent(){
        probabilityOfEventHappening = new Probability(0.6);
        Probability probabilityOfEventNotHappening = new Probability(0.4);
        assertEquals(probabilityOfEventNotHappening, probabilityOfEventHappening.notHappeningEvent());
    }



}
