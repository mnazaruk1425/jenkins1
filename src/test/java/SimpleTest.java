import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {
    @Test
    void successTest(){
        assertEquals(true,true);
 //       assertTrue(true);
    }
    @Test
    void negativeTest(){
        assertEquals(true,false);

    }

}