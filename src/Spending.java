import java.util.ArrayList;
import java.util.Scanner;

public class Spending {
	public String myCategory;
	public int myRecentCost;
	public int myTotalCost;
	public String myDate;
	public String terminate;
	public ArrayList<Spending> spendingList;
	public Scanner sc = new Scanner(System.in);
	
	public Spending(){
		terminate = "add";
		spendingList = new ArrayList<Spending>();
	}
	
	public Spending(String category, int cost, String date){
		myCategory=category;
		myRecentCost=cost;
		myDate = date;
	}
	public void setRecentCost(int cost){
		myRecentCost=cost;
	}
	public void setTotalCost(int cost){
		myTotalCost+=cost;
	}
	public int getRecentCost(){
		return myRecentCost;
	}
	public int getTotalCost(){
		return myTotalCost;
	}
	public void setCategory(String category){
		myCategory=category;
	}
	
	public void setDate(String date){
		myDate= date;
	}
	
	public void addToList(){
		terminate="add";
		while(terminate.equalsIgnoreCase("add")){
			System.out.println("What did you buy?");
			myCategory=sc.nextLine();
			System.out.println("How much did it cost? Omit the dollar sign($)");
			myRecentCost=Integer.parseInt(sc.nextLine());
			myTotalCost+=myRecentCost;
			System.out.println("When did you buy it?");
			myDate=sc.nextLine();
			System.out.println("Have more to do? Type\"add\". If you are done type \"quit\".");
			terminate=sc.nextLine();
			spendingList.add(new Spending(myCategory,myRecentCost,myDate));
		}
	}
	
	public ArrayList<Spending> displaySpending(){
		return spendingList;
	}
	
	public String toString(){
		String str = "Category: " + myCategory + " Cost: $" + myRecentCost + " Date Bought: " + myDate;
		return str;
	}
}
