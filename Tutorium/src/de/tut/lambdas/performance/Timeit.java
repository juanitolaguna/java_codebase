package de.tut.lambdas.performance;

/**
 * Created on 23/04/2017.
 */
public class Timeit {
    public static void code(Runnable block) {
        long start = System.nanoTime();

        try {
            block.run();
        } finally {
            long end = System.nanoTime();
            System.out.println("Time taken(s)" + (end - start)/1.0e9);
        }

    }
}
