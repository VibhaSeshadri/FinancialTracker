import java.util.ArrayList;
import java.util.Scanner;


public class User {
	public String myFirstName;
	public String myLastName;
	public String myCategory;//category of spending they will budget in
	public int myBudget;//their budget for that category
	public ArrayList<User>myBGoals;//arraylist that will hold their budgets for all categories
	public String terminate;
	
	public User(String firstName, String lastName){
		myFirstName=firstName;
		myLastName=lastName;
		myBGoals=new ArrayList<User>();
		terminate="add";

	}
	
	public User(String category, int budget){
		myCategory=category;
		myBudget=budget;

	}
	public void setName(String firstName, String lastName){
		firstName=myFirstName;
		lastName=myLastName;
	}
	/*setBudget() allows the user to create goals as to how much they want to budget for*/
	public void setBudget(){
		/*String category;
		int budget;*/
		Scanner inputBudget = new Scanner(System.in);
		while(terminate.equalsIgnoreCase("add")){
			System.out.println("Which Category would you like to Budget for?");
			myCategory=inputBudget.nextLine();
			System.out.println("How much will you allocate for this cateogry?");
			myBudget=Integer.parseInt(inputBudget.nextLine());
			System.out.println("Have more to do? Type\"add\". If you are done type \"quit\".");
			//System.out.println("hello");
			terminate=inputBudget.nextLine();
			myBGoals.add(new User(myCategory,myBudget));
		}
		if(inputBudget!=null){
			inputBudget.close();
		}
	}
	
	public ArrayList<User> displayBudget(){
		return myBGoals;
	}
	
	public String toString(){
		String str = "Category: " + myCategory + " Budget: $" + myBudget;
		return str;
	}
}
