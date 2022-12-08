public class Payment {
    private String paymentMethod;
    private double payment;

    // getters and setters
    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public Payment() {
        // constructor
    }

    public void returnBalance(){
        // this method is used to check the payment and return the balance to customer if needed
    }
}
