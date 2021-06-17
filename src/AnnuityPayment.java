public class AnnuityPayment {
    public int calculate(int loanAmount, int loanTermsYears, double interestRateAsAPercentage) {
        double annuityPayment = (loanAmount + (loanAmount * interestRateAsAPercentage / 100)) / (loanTermsYears * 12);
        return (int) annuityPayment;
    }
}
