package edu.gcccd.csis;
import java.util.Random;
public class Main {
    public static double approx(final double runs) {
        final Random random = new Random(System.currentTimeMillis());
        double inside = 0;
        double piApprox;
        for(int i = 0; i < runs; i++){
            double x = random.nextDouble();
            double y = random.nextDouble();

            if (Math.sqrt(x * x + y * y) <= 1)
                inside++;
        }
        piApprox = (4 * inside ) / runs;

        return piApprox;
    }

}
