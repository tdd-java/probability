public class Probability {

    private double valueAsFraction;

    public Probability(double probability) {
        this.valueAsFraction = probability;
    }


    public Probability notHappeningEvent() {
        return new Probability(1 - this.valueAsFraction);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Probability)) return false;

        Probability that = (Probability) o;

        if (Double.compare(that.valueAsFraction, valueAsFraction) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(valueAsFraction);
        return (int) (temp ^ (temp >>> 32));
    }

    public Probability mutuallyInclusiveProbability(Probability other) {
        return new Probability(this.valueAsFraction * other.valueAsFraction);
    }

}
