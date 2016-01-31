import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;

public class ProbabilityTest {

    @Test
    public void probabilityForNotGettingEvent(){
        Probability probabilityOfEventHappening = new Probability(0.6);
        Probability probabilityOfEventNotHappening = new Probability(0.4);
        assertEquals(probabilityOfEventNotHappening, probabilityOfEventHappening.not());
    }

    @Test
    public void probabilityForAnd(){
        Probability probabilityForEventOne = new Probability(0.6);
        Probability probabilityForEventTwo = new Probability(0.3);
        Probability expectedProbability = new Probability(0.18);
        assertEquals(expectedProbability, probabilityForEventOne.and(probabilityForEventTwo));
    }

    @Test
    public void probabilityForMutuallyExclusiveEvents(){
        Probability probabilityForEventOne = new Probability(0.6);
        Probability probabilityForEventTwo = new Probability(0.3);
        Probability expectedProbability = new Probability(0.72);
        assertEquals(expectedProbability, probabilityForEventOne.or(probabilityForEventTwo));
    }

}
