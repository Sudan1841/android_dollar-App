import java.util.*;
public class Dollars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dollarsAmount;
		int haundarth;
		int fifty;
		int twenty;
		int ten;
		int five;
		int dollars;
		//@@@@@@@@@@@@@@@@@@@@
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Dollars Amount ");
		dollarsAmount = input.nextInt();
		dollars = dollarsAmount;
		
		
		haundarth = dollarsAmount/100;
		dollars = dollars%100;
		
		fifty = dollars/50;
		dollars = dollars%50;
		
		twenty = dollars/20;
		dollars = dollars%20;
		
		ten = dollars/10;
		dollars = dollars%10;
		
		five = dollars/5;
		dollars = dollars%5;
		
		
		
		
		
		
		System.out.println(" Dollars Amount : $ "+dollarsAmount + 
				"\n Handuarts: $"+haundarth+
				"\n fifty : $"+fifty+
				"\n twenty :$ "+twenty+"n\ten :$"+ten+ 
				" \n Five :$ "+five+"\ndollars :$ "+dollars);
		

	}

}
