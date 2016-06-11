import java.util.ArrayList;
import java.util.Scanner;

public class Main extends Spending {

	public static void main(String[] args) {
		/*String firstName="";
		String lastName="";
		Scanner name = new Scanner(System.in);
		System.out.println("What is your First name?");
		firstName=name.nextLine();
		System.out.println("What is your Last name?");
		lastName=name.nextLine();
		User one = new User(firstName,lastName);
		one.setBudget();
		System.out.println(one.displayBudget());*/
		
		/*moving on to amount*/
		String choice="";
		Amount two = new Amount();
		Spending three = new Spending();
		two.inputAmount();
		choice=two.question();
		while(choice.equalsIgnoreCase("yes")){
			two.changes();
			choice=two.question();
		}
		while(choice.equalsIgnoreCase("no")){
			three.addToList();
			System.out.println(three.displaySpending());
			choice=two.question();
			if(choice.equalsIgnoreCase("yes")){
				two.changes();
				choice="no";
			}
		}




		
		
		
		
	}

}
