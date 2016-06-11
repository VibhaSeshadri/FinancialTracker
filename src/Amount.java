import java.util.Scanner;
public class Amount extends Spending {
	public int total;
	
	public Amount(){
		total=0;
	}
	
	public void inputAmount(){
		System.out.println("How much money do you have?");
		total =Integer.parseInt(sc.nextLine());
		System.out.println("You have entered you have $" + total + ".");
	}
	
	public String question(){
		String choice = "";
		System.out.println("Do you want to add/subtract money from what you currently have? "
				+ "You don't need to subtract money from your total savings when you shop, " 
				+ "because we will do that for you.");
		choice=sc.nextLine();
		return choice;
	}
	
	public void changes(){
		String option="";
		System.out.println("Do you want to add or subtract money?");
		option = sc.nextLine();
		if(option.equalsIgnoreCase("add")){
			this.addAmount();
		}
		else{
			this.manualSubtract();
		}
	}
	public void addAmount(){
		System.out.println("How much money do you want to add?");
		int add = Integer.parseInt(sc.nextLine());
		total+=add;
		System.out.println("Your new total balance is: $" + total);
	}
	
	public void manualSubtract(){
		System.out.println("How much do you want to withdraw?");
		int mSubtract = Integer.parseInt(sc.nextLine());
		total-=mSubtract;
		System.out.println("Your new total balance is: $" + total);
	}
	
	public int aSubtract(){
		total-=this.getTotalCost();
		return total;
	}
	
	
}
