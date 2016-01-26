public class Probability {

    private double probability;

    public Probability(double probability) {
        this.probability = probability;
    }


    public double notHappeningEvent() {
        return (1/this.probability);
    }
}
