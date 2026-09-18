
import static org.junit.jupiter.api.Assertions.*;
        import org.junit.jupiter.api.Test;

public class LoginTest {
    @Test
    public void testUserNameCorrect() {
        Login l = new Login();
        assertTrue(l.checkUserName("kyl_1"));
    }
    @Test
    public void testUserNameIncorrect() {
        Login l = new Login();
        assertFalse(l.checkUserName("kyle!!!!!!!"));
    }
    @Test
    public void testPasswordComplexityCorrect() {
        Login l = new Login();
        assertTrue(l.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
    @Test
    public void testPasswordComplexityIncorrect() {
                Login l = new Login();
        assertFalse(l.checkPasswordComplexity("password"));
    }
    @Test
    public void testCellPhoneNumberCorrect() {
        Login l = new Login();
        assertTrue(l.checkCellPhoneNumber("+27838888888"));
    }
    @Test
    public void testCellPhoneNumberIncorrect() {
        Login l = new Login();
        assertFalse(l.checkCellPhoneNumber("08966553"));
    }
}