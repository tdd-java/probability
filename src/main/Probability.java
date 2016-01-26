public class Probability {

    private double valueAsFraction;

    public Probability(double probability) {
        this.valueAsFraction = probability;
    }


    public double notHappeningEvent() {
        return (1 - this.valueAsFraction);
    }
}
