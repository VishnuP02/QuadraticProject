package quadratic;

/**
 * Driver class for testing the Quadratic class functionality.
 */
public class Driver {

    public static void main(String[] args) {
        // Test case 1: Example with real roots
        Quadratic quad1 = new Quadratic(1, -3, 2);
        testQuadratic(quad1);

        // Test case 2: Example with negative discriminant
        Quadratic quad2 = new Quadratic(1, 2, 5);
        testQuadratic(quad2);

        // Test case 3: Example with zero discriminant
        Quadratic quad3 = new Quadratic(1, 2, 1);
        testQuadratic(quad3);

        // Test case 4: Large coefficients
        Quadratic quad4 = new Quadratic(1_000_000, -1_000_000, 1);
        testQuadratic(quad4);

        // Test case 5: Small coefficients
        Quadratic quad5 = new Quadratic(1e-6, -1e-6, 1e-12);
        testQuadratic(quad5);

        // Test case 6: Zero coefficients
        Quadratic quad6 = new Quadratic(1, 0, 0);
        testQuadratic(quad6);
    }

    /**
     * Tests the functionality of the Quadratic class for a specific instance.
     * @param quad The Quadratic object to test.
     */
    private static void testQuadratic(Quadratic quad) {
        System.out.println("Equation: " + quad);
        System.out.println("Discriminant: " + quad.computeDiscriminant());
        System.out.println("Has Real Roots: " + quad.hasRealRoots());
        double[] roots = quad.findRealRoots();
        if (roots != null) {
            System.out.println("Roots: [" + roots[0] + ", " + roots[1] + "]");
        } else {
            System.out.println("Roots: None");
        }
        System.out.println();
    }
}