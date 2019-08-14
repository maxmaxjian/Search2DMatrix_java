import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class SolutionTest {
    private int[][] input1;
    private int input2;
    private boolean expected;
    private Solution soln = new Solution1();

    public SolutionTest(int[][] input1, int input2, boolean output) {
        this.input1 = input1;
        this.input2 = input2;
        this.expected = output;
    }

    @Parameterized.Parameters
    public static Collection parameters() {
        return Arrays.asList(new Object[][]{
                {new int[][]{
                        {1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,50}
                }, 3, true},
                {new int[][]{
                        {1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,50}
                }, 13, false},
                {new int[][]{}, 0, false}
        });
    }

    @Test
    public void testFunction() {
        assertEquals(expected, soln.searchMatrix(input1, input2));
    }
}