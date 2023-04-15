/**
 * 
 */
package vibhav.bank.test;

import java.io.IOException;

import java.util.Arrays;
import java.util.Scanner;


/**
 * @author Vibhav
 *
 */
public class HelloWorld {

	/**
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] bankingMenu = {"1. Open Bank Account","2. Close Bank Account","3. Deposit Money","4. Withdraw money","5. Check Balance","6. Bank executive portal(4 digit Employee code is mandatory)"};
		System.out.println("Welcome to \"State Bank of Noida\"\nChoose from the options below:");

		for (String menu : bankingMenu) {
			System.out.println(menu);
		}

		try{
			System.out.println();
		int option1= getInput();
		System.out.println("You selected :" + bankingMenu[option1-1]);		
		}
		catch(IOException e) {
			System.out.println(Arrays.toString(e.getStackTrace()));
		}
		
		
	}
	
	public static int getInput() throws IOException {		 
			/*
			 * Enter data using BufferReader 
			 * // BufferedReader reader = // new BufferedReader(new
			 * InputStreamReader(System.in));
			 */      
		Scanner s = new Scanner(System.in);

		return s.nextInt();
	}
	
	
}
