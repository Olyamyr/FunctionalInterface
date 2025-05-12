package Function;

import java.util.Objects;

public class Coin {
    private final double weight;
    private final int yearOfIssue;
    private final double diameter;
    private final String metalName;
    private final int nominal;

    public Coin(double weight, int yearOfIssue, double diameter, String metalName, int nominal) {
        this.weight = weight;
        this.yearOfIssue = yearOfIssue;
        this.diameter = diameter;
        this.metalName = metalName;
        this.nominal = nominal;
    }

    public double getWeight() { return weight; }
    public int getYearOfIssue() { return yearOfIssue; }
    public double getDiameter() { return diameter; }
    public String getMetalName() { return metalName; }
    public int getNominal() { return nominal; }
}