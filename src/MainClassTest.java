import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
@Test

  public void testGetClassString()
  {
     String testString = this.getClassString();

      if (testString.contains("Hello")) {
         System.out.println("Sucsess! Value 'Hello' is in: " + "'"+ testString + "'");
      } else if (testString.contains("hello")) {
         System.out.println("Sucsess! Value 'hello' is in: " +"'" + testString+"'");
      } else {
          Assert.fail("line is not the desired value: 'Hello' or 'hello'");
      }
  }
}
