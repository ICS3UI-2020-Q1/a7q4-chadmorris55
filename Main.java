/**
 *
 * @author 
 */
public class Main {


  public static int lastDigit(int number){
    int last = number % 10;
    return last;
  }
  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // TODO code application logic here
    //calls method
    int numberTwo = lastDigit(35767);
    //prints out what was returned
    System.out.println(numberTwo);
  }
}
