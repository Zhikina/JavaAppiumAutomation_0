import org.junit.Test;

public class MainClassTest extends MainClass
{
  @Test

  public void testGetClassNumber()
  {

    int number = this.getClassNumber();
    if(number > 45) {
      System.out.println("Sucsess! Value " + number +" more than 45");
    }else {
      System.out.println("Error! Value: "+ number + " less than 45");
    }


  }
}
