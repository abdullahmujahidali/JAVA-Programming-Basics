import java.util.Scanner; 
public class BankCharges {
	public static void main(String[] args) {
		double BanksFee = 10.00;   
		double less20	= 0.10 ;  
		double in20_39  = 0.08 ;       
		double in40_59	= 0.06 ;   
		double more60   = 0.04 ;   
		double totalFee;
		int    check;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of checks written this month:");
		check = input.nextInt();
		if ( check < 20){   //$.10 each for less than 20 checks
			totalFee = (check * less20) + BanksFee;
			System.out.println("The total fees are $ "+totalFee);
		}
		else if (check == 20 || check < 40) { //$.08 each for 20–39 checks
			totalFee = (check * in20_39) + BanksFee;
			System.out.println("The total fees are $ "+totalFee);
		}
		else if (check == 40 || check < 60) {  //$.06 each for 40–59 checks
			totalFee = (check * in40_59) + BanksFee;
			System.out.println("The total fees are $ "+totalFee);
		}
		else  {              //$.04 each for 60 or more checks
			totalFee = (check * more60) + BanksFee;
			System.out.println("The total fees are $ "+totalFee);
		}
                
}
}