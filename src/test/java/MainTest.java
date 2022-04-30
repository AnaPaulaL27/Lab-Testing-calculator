import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MainTest {
//creating a local variable:
    //objecting testing, could write :private Main undertesting;
    private Main main;

    @BeforeEach
    //before each sets up test for each one of the public void... tests below on the @ test
    // testing each individually

    public void setup(){
        //for every method with test annotation do this first:

        main= new Main();

    }

    @Test
    //Assertions
   public void shouldSayHi(){
        //create assertions to say what you are expecting
        // assertThat()("actual").isEqualTo("expected"); // if passes you get green tick, if not red - failed

        assertThat(main.sayHi()).isEqualTo("Hi.");
        //it passed to make it fail alter what is said in green "Hi" to something else e.g. "Hi."

    }
}
