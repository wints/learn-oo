import java.util.Scanner;

public class PhraseRepeaterDriver {
  public static void main( String[] args ) {
    Scanner keyboard = new Scanner(System.in);

    System.out.print("Enter a message: ");
    String msg = keyboard.nextLine();
    System.out.print("Number of times: ");
    int n = keyboard.nextInt();

    PhraseRepeater pr = new PhraseRepeater();
    pr.setValues(msg, n); // does not compile - incompatible types error
    System.out.println( pr.getRepeatedPhrase() );
  }
}
