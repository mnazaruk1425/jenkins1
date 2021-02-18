import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimpleTest {
    @Test
    void successTest(){
        assertEquals(true,true);

       assertTrue(true);
    }
    @Test
    void negativeTest(){
        assertEquals(true,false);

    }@Test

   void successWithHamcrestTest(){

        assertThat(true, is (true));
    }

    @Test

    void negativeWithHamcrestTest(){
        step("Assert that true is false",() ->

      assertThat(true,is(false)));

    }

}
