import java.util.Scanner;
public class Amount extends Spending {
	public int total;
	
	public Amount(){
		total=0;
	}
	
	public void inputAmount(){
		Scanner totalSavings = new Scanner(System.in);
		System.out.println("How much money do you have?");
		total = totalSavings.nextInt();
		System.out.println("You have entered you have $" + total + ".");
		if(totalSavings!=null){
			totalSavings.close();
		}
	}
	
	public void addAmount(){
		Scanner newAddition = new Scanner(System.in);
		System.out.println("How much money do you want to add?");
		int add = newAddition.nextInt();
		total+=add;
		System.out.println("Your new total balance is: $" + total);
		if(newAddition!=null){
			newAddition.close();
		}
	}
	
	public void manualSubtract(){
		Scanner mWithdrawal = new Scanner(System.in);
		System.out.println("How much do you want to withdraw?");
		int mSubtract = mWithdrawal.nextInt();
		total-=mSubtract;
		System.out.println("Your new total balance is: $" + total);
		if(mWithdrawal!=null){
			mWithdrawal.close();
		}
	}
	
	public int aSubtract(){
		total-=this.getCost();
		return total;
	}
	
	
}
