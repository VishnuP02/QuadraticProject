package quadratic;

/**
 * Represents a quadratic equation of the form ax^2 + bx + c = 0.
 */
public class Quadratic {
    private double a, b, c;

    /**
     * Default constructor initializes coefficients to 0.
     */
    public Quadratic() {
        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    /**
     * Parameterized constructor initializes coefficients to given values.
     * @param a Coefficient of x^2.
     * @param b Coefficient of x.
     * @param c Constant term.
     */
    public Quadratic(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    // Getters and Setters
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    /**
     * Computes the discriminant of the quadratic equation.
     * @return The value of the discriminant (b^2 - 4ac).
     */
    public double computeDiscriminant() {
        return b * b - 4 * a * c;
    }

    /**
     * Checks if the quadratic equation has real roots.
     * @return True if real roots exist, false otherwise.
     */
    public boolean hasRealRoots() {
        return computeDiscriminant() >= 0;
    }

    /**
     * Finds the real roots of the quadratic equation, if they exist.
     * @return An array containing the roots, or null if no real roots exist.
     */
    public double[] findRealRoots() {
        if (!hasRealRoots()) {
            return null; // No real roots
        }
        double discriminant = computeDiscriminant();
        double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
        double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        return new double[]{root1, root2};
    }

    /**
     * Computes the derivative of the quadratic equation at a specific value of x.
     * @param x The value of x.
     * @return The value of the derivative (2ax + b) at x.
     */
    public double calculateDerivative(double x) {
        return 2 * a * x + b;
    }

    @Override
    public String toString() {
        return a + "x^2 + " + b + "x + " + c;
    }
}