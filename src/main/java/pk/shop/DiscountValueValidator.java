package pk.shop;

public class DiscountValueValidator {

    public static void validatePercentageDiscountValue(double value) {
        if(value < 0 || value >= 1) {
            throw new RuntimeException();
        }
    }
}
