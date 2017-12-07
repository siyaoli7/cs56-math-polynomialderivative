import java.util.Scanner;

/** <p>PolynomialDerivative calculate the derivative of input polynomial</p>

    <p>PolynomialDerivative allows users input data from console or command line</p>

    <p>PolynomialDerivative inherits from Polynomial class.</p>`

    @author Siyao Li
    @version UCSB, CS56, F17
*/

public class PolynomialDerivative extends Polynomial{
    /**
       Main for reading polynomial from cmd line or console
       The derivative of the input polynomial will be printed.
     */
    public static void main(String args [] ){
	if(args.length == 0){
	    //no input is sent through cmd line
	    System.out.print("Which polynomial you want to calculate the derivative of: ");
	    Scanner scan = new Scanner(System.in);
	    String input = scan.nextLine();
	    PolynomialDerivative p = new PolynomialDerivative(input);
	    System.out.println(p.derivative());
	}else{
	    String input = "";
	    for(String i : args){
		input+=i+" ";
	    }
	    input = input.substring(0,input.length()-1);
	    PolynomialDerivative p = new PolynomialDerivative(input);
	    System.out.println(p.derivative());
	}
    }
    /**
       Constructor takes an int array and create a polynomial
    */
    public PolynomialDerivative(int [] coeffsHighToLow){
	super(coeffsHighToLow);
    }
    
    /**
       Constructor takes a string and create a polynomial
    */

    public PolynomialDerivative(String s){
	super(s);
    }

    /**
       Default Constructor creates a polynomial with 0    
     */
    public PolynomialDerivative(){
	super();
    }
    
    /** return a new Polynomial which is the derivative of its original value.

	@return derivative of this Polynomial

    */

    public PolynomialDerivative derivative () {
	if(this.size()==1) return new PolynomialDerivative(new int[]{0});
	else{
	    int [] newArr = new int[this.size()-1];
	    for(int i = 1;i<this.size();i++){
		newArr[i-1]=this.get(i)*i;
	    }
	    PolynomialDerivative newP = new PolynomialDerivative (Polynomial.highToLow(newArr));
	    return newP;
	}	
    }
}
