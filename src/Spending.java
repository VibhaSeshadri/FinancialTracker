import java.util.ArrayList;
import java.util.Scanner;

public class Spending {
	public String myCategory;
	public int myCost;
	public String myDate;
	public String terminate;
	public ArrayList<Spending> spendingList;
	
	public Spending(){
		terminate = "add";
		spendingList = new ArrayList<Spending>();
	}
	
	public Spending(String category, int cost, String date){
		myCategory=category;
		myCost=cost;
		myDate = date;
	}
	public void setCost(int cost){
		myCost=cost;
	}
	public void setCategory(String category){
		myCategory=category;
	}
	
	public void setDate(String date){
		myDate= date;
	}
	
	public void addToList(){
		Scanner inputCost = new Scanner(System.in);
		while(terminate.equalsIgnoreCase("add")){
			System.out.println("What did you buy?");
			myCategory=inputCost.nextLine();
			System.out.println("How much did it cost? Omit the dollar sign($)");
			myCost=Integer.parseInt(inputCost.nextLine());
			System.out.println("When did you buy it?");
			myDate=inputCost.nextLine();
			System.out.println("Have more to do? Type\"add\". If you are done type \"quit\".");
			terminate=inputCost.nextLine();
			spendingList.add(new Spending(myCategory,myCost,myDate));
		}
		if(inputCost!=null){
			inputCost.close();
		}
	}
	
	public ArrayList<Spending> displaySpending(){
		System.out.println("hello");
		return spendingList;
	}
	
	public String toString(){
		String str = "Category: " + myCategory + " Cost: $" + myCost + " Date Bought: " + myDate;
		return str;
	}
}
