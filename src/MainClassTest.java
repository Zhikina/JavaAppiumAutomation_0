import org.junit.Test;

public class MainClassTest extends MainClass
{
  @Test

  public void testGetLocalNumber()
  {

    int number = this.getLocalNumber();
    if(number == 14) {
      System.out.println("Sucsess! Function returned value " + number);
    }else {
      System.out.println("Error! Value: "+ number);
    }


  }
}
