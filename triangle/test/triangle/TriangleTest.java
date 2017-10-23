package triangle;

import org.junit.Test;
import static org.junit.Assert.*;

import static triangle.Triangle.Type;
import static triangle.Triangle.Type.*;

/**
 * Test class for the Triangle implementation.
 */
public class TriangleTest {


    @Test //Jucong test for INVALID
    public void test_invalid() {
      Triangle t = new Triangle();
      Type actual = Triangle.classify(-1,2,3);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }


    @Test //Karen test invalid first if condition
    public void testInvalid() {
      Type actual = Triangle.classify(0, 0, 0);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //karen test invalid first if condition
    public void testInvalid2() {
      Type actual = Triangle.classify(1, 0, 0);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test//karen test invalid first if condition
    public void testInvalid3() {
      Type actual = Triangle.classify(1, 1, 0);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //karen test for ISOSCELES
    public void test4() {
      Type actual = Triangle.classify(3, 3, 4);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test //karen test for scalene
    public void test5() {
      Type actual = Triangle.classify(3, 4, 3);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test //karen test for isoceles
    public void test6() {
      Type actual = Triangle.classify(4, 3, 3);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test //karen test for ivalid
    public void test7() {
      Type actual = Triangle.classify(3, 1, 6);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //karen test for invalid
    public void test8() {
      Type actual = Triangle.classify(3, 6, 1);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //karen test invalid
    public void test9() {
      Type actual = Triangle.classify(6, 1, 3);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //karen test scalene
    public void testScalene() {
      Type actual = Triangle.classify(3, 5, 6);
      Type expected = SCALENE;
      assertEquals(actual, expected);
    }

    @Test //karen test scalene
    public void testScalene2() {
      Type actual = Triangle.classify(3, 6, 5);
      Type expected = SCALENE;
      assertEquals(actual, expected);
    }

    @Test //karen test scalene
    public void testScalene3() {
      Type actual = Triangle.classify(6, 3, 5);
      Type expected = SCALENE;
      assertEquals(actual, expected);
    }

    @Test //karen test isoceles
    public void testIsosceles() {
      Type actual = Triangle.classify(3, 3, 5);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test //karen test isoceles
    public void testIsosceles2() {
      Type actual = Triangle.classify(3, 3, 10);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //karen test isoceles
    public void testIsosceles3() {
      Type actual = Triangle.classify(3, 1, 3);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test //karen test isoceles
    public void testIsosceles4() {
      Type actual = Triangle.classify(3, 7, 3);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //karen test isoceles
    public void testIsosceles5() {
      Type actual = Triangle.classify(7, 3, 3);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //karen test isoceles
    public void testIsosceles6() {
      Type actual = Triangle.classify(1, 3, 3);
      Type expected = ISOSCELES;
      assertEquals(actual, expected);
    }

    @Test //Karen test for default constructor
    public void testDefaultConstructor() {
      Triangle t = new Triangle();
    }

    @Test //Jucong test for INVALID not 0/-1 number
    public void test_invalid_2() {
      Type actual = Triangle.classify(1,2,4);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for INVALID
    public void test_invalid_3() {
      Type actual = Triangle.classify(2,-1,3);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    @Test  //Jucong test for INVALID
    public void test_invalid_4() {
      Type actual = Triangle.classify(2,3,-1);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for INVALID not 0/-1 number
    public void test_invalid_5() {
      Type actual = Triangle.classify(1,5,4);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for INVALID not 0/-1 number
    public void test_invalid_6() {
      Type actual = Triangle.classify(5,1,4);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for INVALID not 0/-1 number
    public void test_invalid_7() {
      Type actual = Triangle.classify(2,100,2);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for INVALID not 0/-1 number
    public void test_invalid_8() {
      Type actual = Triangle.classify(100,2,2);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for EQUILATERAL
    public void test_equilateral() {
      Type actual = Triangle.classify(1,1,1);
      Type expected = EQUILATERAL;
      assertEquals(actual,expected);
    }

    @Test //Jucong test for SCALENE
    public void test_scalene() {
      Type actual = Triangle.classify(2,3,4);
      Type expected = SCALENE;
      assertEquals(actual,expected);
    }

    @Test // Jucong test for ISOSCELES
    public void test_isosceles_1() {
      Type actual = Triangle.classify(1,2,2);
      Type expected = ISOSCELES;
      assertEquals(actual,expected);
    }

    @Test // Jucong test for ISOSCELES
    public void test_isosceles_2() {
      Type actual = Triangle.classify(2,1,2);
      Type expected = ISOSCELES;
      assertEquals(actual,expected);
    }

    @Test // Jucong test for ISOSCELES
    public void test_isosceles_3() {
      Type actual = Triangle.classify(2,2,1);
      Type expected = ISOSCELES;
      assertEquals(actual,expected);
    }

    @Test // Jucong test for ISOSCELES
    public void test_isosceles_4() {
      Type actual = Triangle.classify(2,2,100);
      Type expected = INVALID;
      assertEquals(actual,expected);
    }

    //TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM
    //statement coverage
    @Test
    //first if invalid
    public void test_first_if1 () {
        Type actual = Triangle.classify(0, 0, 0);
        Type expected = INVALID;
        assertEquals(actual, expected);
    }
    //scalene
    @Test
    public void test_first_scalene () {
        Type actual = Triangle.classify(9, 13, 14);
        Type expected = SCALENE;
        assertEquals(actual, expected);
    }
    //equilateral
    @Test
    public void test_equilateral_tim () {
        Type actual = Triangle.classify(10, 10, 10);
        Type expected = EQUILATERAL;
        assertEquals(actual, expected);
    }

    //isosceles
    @Test
    public void test_first_isos () {
        Type actual = Triangle.classify(5, 5, 4);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }
    //isosceles
    @Test
    public void test_sec_isos () {
        Type actual = Triangle.classify(5, 4, 5);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }
    //isosceles
    @Test
    public void test_third_isos () {
        Type actual = Triangle.classify(4, 5, 5);
        Type expected = ISOSCELES;
        assertEquals(actual, expected);
    }

    //constructor
    @Test
    public void test_constructor() {
      Triangle t = new Triangle();
    }

    //line coverage
    //for line 20
    @Test
    public void test_first_if2 () {
      Type actual = Triangle.classify(1, 0, 1);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }
    //invalid
    @Test
    public void test_first_if3 () {
      Type actual = Triangle.classify(1, 1, 0);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test
    public void test_first_if4 () {
      Type actual = Triangle.classify(0, 1, 1);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    //trian = 0
    @Test
    public void test_invalidtrian_zero1() {
      Type actual = Triangle.classify(2, 10, 13);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }
    //trian = 0
    @Test
    public void test_invalidtrian_zero2 () {
      Type actual = Triangle.classify(2, 15, 13);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }
    //trian = 0
    @Test
    public void test_invalidtrian_zero3 () {
      Type actual = Triangle.classify(30, 15, 13);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test
    public void test_invalidtrian_one () {
      Type actual = Triangle.classify(2, 2, 100);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }
    //trian = 2
    @Test
    public void test_invalidtrian_two () {
      Type actual = Triangle.classify(30, 70, 30);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    //trian = 3
    @Test
    public void test_invalidtrian_three () {
      Type actual = Triangle.classify(200, 50, 50);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }
    //TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM TIM

    //Caitlyn's mutant killing process
    @Test //killed
    public void mutation66() {
      Type actual = Triangle.classify(1, 2, 3);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //killed
    public void mutation16() {
      Type actual = Triangle.classify(3, 3, -1);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //killed
    public void mutation9() {
      Type actual = Triangle.classify(3, -1, 3);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //unkillable
    public void mutation11() {
      Type actual = Triangle.classify(1,-1,1);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //killed
    public void mutation4() {
      Type actual = Triangle.classify(-1, 3, 3);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //killed
    public void mutation59() {
      Type actual = Triangle.classify(3, 3, -1);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //killed
    public void mutation105() {
      Type actual = Triangle.classify(40, 40, 120);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //killed
    public void mutation109() {
      Type actual = Triangle.classify(1, 1, 2);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //unkillable
    public void mutation101() {
      Type actual = Triangle.classify(2,2,4);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //a==b==a+b>c unkillable
    public void mutation111() {
      Type actual = Triangle.classify(1,1, 1);
      Type expected = EQUILATERAL;
      assertEquals(actual, expected);
    }


    @Test //killed
    public void mutation126() {
      Type actual = Triangle.classify(4,2, 2);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test // b==c, a+c=2, >b unkillable
    public void mutation128() {
      Type actual = Triangle.classify(1,2, 1);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }

    @Test //killed
    public void mutation143() {
      Type actual = Triangle.classify(4,4, 4);
      Type expected = EQUILATERAL;
      assertEquals(actual, expected);
    }

    @Test //unkillable
    public void mutation136() {
      Type actual = Triangle.classify(4,4, 4);
      Type expected = EQUILATERAL;
      assertEquals(actual, expected);
    }

    @Test //unkillable
    public void mutation145() {
      Type actual = Triangle.classify(4,1,2);
      Type expected = INVALID;
      assertEquals(actual, expected);
    }



  //End of Caitlyn's mutant killing process





}