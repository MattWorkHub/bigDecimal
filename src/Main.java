import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(CalculationType.ADDITION);
        BigDecimal big1 = new BigDecimal(1);
        BigDecimal big2 = new BigDecimal(2);
        calculator.math(big1,big2);



    }
}