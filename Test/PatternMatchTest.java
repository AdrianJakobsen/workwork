import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternMatchTest {

    public PatternMatch matcher;

    @Before
    public void setup() {
        matcher = new PatternMatch();
    }

    @Test
    public void patternMatch_checkForFirstIndexOfPatternInExpresion_3() {
        int returnedAnswear = matcher.patternMatch("hello world", "lo");
        assertEquals(3, returnedAnswear);
    }

    @Test
    public void patternMatch_checkForLongerPatternThanExpression_Negative1() {
        int returnedAnswear = matcher.patternMatch("hello", "hello World");
        assertEquals(-1, returnedAnswear);
    }

    @Test
    public void patternMatch_checkForAnPatternWhoDoesNotExistInExpression_negative1(){
        int returnedAnswear = matcher.patternMatch("hello", "abc");
        assertEquals(-1, returnedAnswear);
    }

    @Test
    public void patternMatch_checkForCaseSensetivePattern_3(){
        int returnedAnswear = matcher.patternMatch("heLLO WOrld", "lo");
        assertEquals(3, returnedAnswear);
    }

    @Test
    public void patternMatch_checkForEmptyStringPattern_Negative1(){
        int returnedAnswear = matcher.patternMatch("hello java", "");
        assertEquals(-1, returnedAnswear);
    }
    @Test
    public void test1(){
        String a = "This is a short summary of information about the famous tower in france. By the way, France is written with a capital F. Oh, how the french will rage about that one. Not so much about the lower case f in french though. They are a strange people. French - hah! Ok ok, so, about the eiffel tower. It is made of iron and some shit, and was originally painted red by the chinese communist party to celebrate the month of March. As you know, NASA found water on Mars, which is my the tower is currently painter by a slim coat of rain. LOLERSKATES. Did you honestly believe that last dribble? You must be retarded!! Ayyy lmao";
        long startTime = System.nanoTime();
        int result = matcher.patternMatch(a, "eiffel");
        long endtime = System.nanoTime();
        double resultTime = (double) ((endtime-startTime)/Math.pow(10,9));

        System.out.println(resultTime+" seconds");
        assertEquals(281, result);
    }

    @Test
    public void patternMatch_checkStringWithOnlyNumbers_7(){
        int returnedAnswear = matcher.patternMatch("123456789", "8");
        assertEquals(7, returnedAnswear);
    }
}