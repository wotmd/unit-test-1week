import org.junit.Test;
import static org.junit.Assert.*;

public class UpperCaseCounterTest {
    private UpperCaseCounter upperCaseCounter = new UpperCaseCounter();
    @Test
    public void 널체크() {
        String str = null;
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);
    }
    @Test
    public void 빈문자열체크(){
        String str = "";
        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);
        assertTrue(result == 0);
    }
    @Test
    public void 대문자인경우(){
        String str = "ABC";

        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);

        System.out.println("result : " + result);
        assertTrue(result == 3);
        assertFalse(result == 2);
    }
    @Test
    public void 대문자아닌경우체크(){
        String str = "ABCdefGHI";

        int result = upperCaseCounter.getNumberOfUpperCaseCharactersInString(str);

        System.out.println("result : " + result);
        assertTrue(result == 6);
        assertFalse(result == 9);
    }
}