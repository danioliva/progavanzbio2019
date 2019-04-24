import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void shouldFactorialOfZeroReturnOne(){
        int expectedResult=1;

        Factorial factorial=new Factorial();

        int obtainedResult=factorial.compute(0);

        assertEquals(expectedResult, obtainedResult);
    }

    @Test
    public void shouldFactorialOfOneReturnOne(){
        int expectedResult=1;

        Factorial factorial=new Factorial();

        int obtainedResult=factorial.compute(1);

        assertEquals(expectedResult, obtainedResult);
    }

}