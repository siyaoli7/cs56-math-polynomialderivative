import java.util.Scanner;

/** <p>PolynomialDerivative calculate the derivative of input polynomial</p>

    <p>PolynomialDerivative allows users input data from console or command line</p>

    @author Siyao Li
    @version UCSB, CS56, F17
*/

public class PolynomialDerivative{
    /**
       Main for reading polynomial from cmd line or console
       The derivative of the input polynomial will be printed.
     */
    public static void main(String args [] ){
	if(args.length == 0){
	    //no input is sent through cmd line
	    Scanner scan = new Scanner(System.in);
	    System.out.print("Which polynomial you want to calculate the derivative of: ");
	    String input = scan.nextLine();
	    Polynomial p = new Polynomial(input);
	    System.out.println(p.derivative());
	}
    }
}
