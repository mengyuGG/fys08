import org.junit.Assert;
import org.junit.Test;

public class LinearEquationSolver {
    public static double solve(double a, double b) {
        if (a == 0) {
            if (b == 0) {
                throw new IllegalArgumentException("方程无解");
            }
            return -b / a;
        }
        return -b / a;
    }

    @Test
    public void testSolve() {
        double a = 2;
        double b = 5;
        double expected = -b / a;
        double actual = solve(a, b);
        System.out.println("预期结果: " + expected);
        System.out.println("实际结果: " + actual);
        Assert.assertEquals(expected, actual, 0.0001);



        
    }
}
