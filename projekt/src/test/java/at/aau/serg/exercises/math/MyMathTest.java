//12003325 Angela Sternig

package at.aau.serg.exercises.math;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MyMathTest {
    private Fraction f;
    private MyMath mm;

    @BeforeEach
    public void setUp(){
        f = new Fraction();
        mm = new MyMath();
    }

    @Test
    public void x() {
        Double x=10d;
        Double y=5d;

        assertEquals(15d, (new MyMath().add(x,y).doubleValue()));
        assertEquals(5d, (new MyMath().sub(x,y).doubleValue()));
        assertEquals(50d,(new MyMath().mul(x,y).doubleValue()));
        assertEquals(2d,(new MyMath().div(x, y).doubleValue()));
    }

    @Test
    public void test_Numerator() {
        f = new Fraction(1,1);
        assertEquals(Integer.valueOf(1), mm.reduce(f).getNumerator());

        f = new Fraction(10,6);
        assertEquals(Integer.valueOf(5), mm.reduce(f).getNumerator());

        f = new Fraction(10,5);
        assertEquals(Integer.valueOf(2), mm.reduce(f).getNumerator());
    }

    @Test
    public void test_Denumerator(){
        f = new Fraction(1,1);
        assertEquals(Integer.valueOf(1), mm.reduce(f).getDenumerator());

        f = new Fraction(10,6);
        assertEquals(Integer.valueOf(3), mm.reduce(f).getDenumerator());

        f = new Fraction(10,5);
        assertEquals(Integer.valueOf(1), mm.reduce(f).getDenumerator());
    }

    @Test
    public void test_ADouble(){
        f = new Fraction(10,5);
        assertEquals(new Double(2), mm.toDouble(f));

        f = new Fraction(10,4);
        assertEquals(new Double(2.5d), (new MyMath()).toDouble(f));
    }
}
