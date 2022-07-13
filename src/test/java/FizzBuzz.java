import java.lang.reflect.InvocationTargetException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FizzBuzz {

  private FizzBuzzChain chain;

  @BeforeEach
  protected void setup()
      throws InvocationTargetException, InstantiationException, IllegalAccessException,
          NoSuchMethodException {
    chain = new FizzBuzzChain();
  }

  @Test
  public void normal_numbers_will_be_returned_as_string() {
    Assertions.assertEquals("1", chain.process(1));
    Assertions.assertEquals("2", chain.process(2));
  }

  @Test
  public void numbers_divisible_by_three_returned_Fizz() {
    Assertions.assertEquals("Fizz", chain.process(3));
    Assertions.assertEquals("Fizz", chain.process(6));
  }

  @Test
  public void numbers_divisible_by_five_returned_Buzz() {
    Assertions.assertEquals("Buzz", chain.process(5));
    Assertions.assertEquals("Buzz", chain.process(10));
  }

  @Test
  public void numbers_divisible_by_three_and_five_returned_FizzBuzz() {
    Assertions.assertEquals("FizzBuzz", chain.process(15));
    Assertions.assertEquals("FizzBuzz", chain.process(30));
  }
}
