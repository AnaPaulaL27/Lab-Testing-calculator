import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTest {
    //when writing test class for another class, it can see every class in main folder, so no need to import it
    private Calculator calc;


    //the 'setup' method will run before every test in this file
    //can be used as a reset. make sure previous tests not corrupted subsequent
    @BeforeEach
    public void setup(){
        // setup is called then should add is called, setup is called then subtract is called... resetting canvas
        calc = new Calculator();
    }

    @Test
    //testing add
    public void shouldAdd(){
        //making an assertion on the add method, that when we add the values of a and b we expect the result 28
        assertThat(calc.add(8, 20)).isEqualTo(28);
    }

    @Test
    public void shouldSubtract() {
        assertThat(calc.subtract(10, 4)).isEqualTo(6);

    }

    @Test
    public void shouldMultiply() {

        assertThat(calc.multiply(3, 9)).isEqualTo(27);
        assertThat(calc.multiply(10, 10)).isGreaterThan(50);
        assertThat(calc.multiply(5, 5)).isEqualTo(25);


    }

    @Test
    public void shouldDivide() {
        assertThat(calc.divide(10, 5)).isEqualTo(2);
    }

}
