public class Probability {

    private double probability;

    public Probability(double probability) {
        this.probability = probability;
    }


    public Probability and(Probability other) {
        return new Probability(this.probability * other.probability);
    }

    public Probability or(Probability other) {
        double probabilityValue = this.probability + other.probability - this.probability * other.probability;
        return new Probability(probabilityValue);
    }

    public Probability notHappeningEvent() {
        return new Probability(1 - this.probability);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Probability that = (Probability) o;

        if (Double.compare(that.probability, probability) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(probability);
        return (int) (temp ^ (temp >>> 32));
    }

    @Override
    public String toString() {
        return "Probability{" +
                "probability=" + probability +
                '}';
    }
}
