import java.math.BigDecimal;

public class Calculator {
    public CalculationType calculationType;
    public Calculator(CalculationType calculationType){
        this.calculationType = calculationType;
    }
    public void math(BigDecimal big1,BigDecimal big2){
        switch (calculationType){
            case ADDITION :
                System.out.println(big1 + " " + big2 + " Addition result is : " + big1.add(big2));
                break;
            case SUBTRACTION :
                System.out.println(big1 + " " + big2 + " Subtraction result is : " + big1.subtract(big2));
                break;
            case MULTIPLICATION :
                System.out.println(big1 + " " + big2 + " Multiplication result is : " + big1.multiply(big2));
                break;
            case DIVISION :
                System.out.println(big1 + " " + big2 + " Division result is : " + big1.divide(big2));
                break;
            case MIN :
                System.out.println(big1 + " " + big2 + " Min result is : " + big1.min(big2));
                break;
            case MAX :
                System.out.println(big1 + " " + big2 + " Max result is : " + big1.max(big2));
                break;
            default:
                System.out.println("Invalid Operation");
        }
    }

    public CalculationType getCalculationType() {
        return calculationType;
    }

    public void setCalculationType(CalculationType calculationType) {
        this.calculationType = calculationType;
    }
}
