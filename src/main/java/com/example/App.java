public class PaymentService {
    public boolean validatePayment(double amount, String cardNumber) {
        // Basic business logic
        if (amount <= 0) return false;
        if (cardNumber == null || cardNumber.length() != 16) return false;
        
        // Simulating a successful transaction
        return true;
    }
}
