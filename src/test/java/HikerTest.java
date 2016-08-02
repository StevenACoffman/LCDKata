import org.junit.*;
import static org.junit.Assert.*;

public class HikerTest {

    @Test
    public void life_the_universe_and_everything() {
        int expected = 42;
        int actual = Hiker.answer();
        assertEquals(expected, actual);
    }
    
    @Test
    public void returnsInputNumberAsArrayOfStringsWhenGiven1() {
        int input = 1;
        String[] expected = {"..|","..|","..|"};
        String[] result = Hiker.convert(input);
        assertArrayEquals("1 should work", expected, result);
    }

    @Test
    public void returnsInputNumberAsArrayOfStringWhenGiven7() {
        int input = 7;
        String[] expected =  {"._.","..|","..|"};
        String[] result = Hiker.convert(input);
        assertArrayEquals("7 should work", expected,result);  
    }

    @Test
    public void returnsInputNumberAsArrayOfStringWhenGiven9() {
        int input = 9;
        String[] expected =  {"._.","|_|","..|"};
        String[] result = Hiker.convert(input);
        assertArrayEquals("7 should work", expected,result);  
    }

    @Test
    public void worksWithMultipleDigits() {
        int[] input = {1, 1};
        String[] expected = {"..| ..|","..| ..|","..| ..|"};
        String[] result = Hiker.convert(input);
        assertArrayEquals("11 should also work", expected, result);
    }
}
