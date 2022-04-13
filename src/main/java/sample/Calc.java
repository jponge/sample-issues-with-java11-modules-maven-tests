package sample;

import java.util.logging.Logger;

public class Calc {

    private static final Logger logger = Logger.getLogger(Calc.class.getName());

    public static int add(int a, int b) {
        logger.info(String.format("%d + %d", a, b));
        return Math.addExact(a, b);
    }
}
