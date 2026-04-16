import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class PaymentServiceTest {
    PaymentService service = new PaymentService();

    @Test
    void testSuccessfulPayment() {
        assertTrue(service.validatePayment(100.0, "1234567812345678"));
    }

    @Test
    void testInvalidAmount() {
        assertFalse(service.validatePayment(-10.0, "1234567812345678"));
    }

    @Test
    void testInvalidCardFormat() {
        assertFalse(service.validatePayment(50.0, "1234"));
    }
}
