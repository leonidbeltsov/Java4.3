public class Main {
    public static void main(String[] args) {
        AnnuityPayment service = new AnnuityPayment();
        double annuityPayment1 = service.calculate(1_000_000, 1, 9.99);
        System.out.println(annuityPayment1);
        double annuityPayment2 = service.calculate(1_000_000, 2, 9.99);
        System.out.println(annuityPayment2);
        double annuityPayment3 = service.calculate(1_000_000, 3, 9.99);
        System.out.println(annuityPayment3);
        //annuity payment
        //differentiated payment
        //loan terms - срок кредитования
        //interest rate - процентная ставка
        //int loanAmount = 1_000_000;
        //int loanTermsYears = 1;
        //double interestRateAsAPercentage = 9.99;

    }
}
