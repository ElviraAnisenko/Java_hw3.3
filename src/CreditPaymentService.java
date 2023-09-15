public class CreditPaymentService {
    public int calculate(int creditPeriodInMonths, int amount, double interestRate) {
        double annuityRatio;
        annuityRatio = interestRate / 12 / 100;
        int payment;
        payment = (int) ((int) amount * annuityRatio * Math.pow((1 + annuityRatio), creditPeriodInMonths) / (Math.pow((1 + annuityRatio), creditPeriodInMonths) - 1));
        return payment;
    }
}

