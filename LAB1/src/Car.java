public class Car {
    protected int maxSpeed;
    protected int cost;
    protected double consumption;
    protected String name;
    public int getSpeed()
    {
        return maxSpeed;
    }
    public double getConsumption()
    {
        return consumption;
    }
    public int getCost()
    {
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }
}
