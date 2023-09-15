public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        System.out.println();
        System.out.println("Сумма кредита  1 000 000 руб., срок кредита 1 год, процентная ставка 9,99%");
        System.out.println("Ежемесячный платеж " + service.calculate(12, 1000000, 9.99) + " руб.");
        System.out.println();
        System.out.println("Сумма кредита  1 000 000 руб., срок кредита 2 года, процентная ставка 9,99%");
        System.out.println("Ежемесячный платеж " + service.calculate(24, 1000000, 9.99) + " руб.");
        System.out.println();
        System.out.println("Сумма кредита  1 000 000 руб., срок кредита 3 года, процентная ставка 9,99%");
        System.out.println("Ежемесячный платеж " + service.calculate(36, 1000000, 9.99) + " руб.");

    }
}
