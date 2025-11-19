package lllll;
import java.util.Scanner;
public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);





		System.out.print("please enter the current amount due:");
		int NewAmount = input.nextInt();

		ChangeInConsumption(NewAmount);

		input.close();}
	public static void ChangeInConsumption(int NewAmount) {

		Scanner input = new Scanner(System.in);
		double change;
		System.out.print("Please enter your amount due one month ago:");
		int LastAmount = input.nextInt();
		//Last Amount > New Amount:
		//- The change in consumption = (Last Amount - New Amount) / Last Amount
		//- It’s a decreasing change
		if(LastAmount > NewAmount)
		{change =(double) (LastAmount - NewAmount) / LastAmount;
		System.out.println("It’s a decreasing change");
		}


		//New Amount > Last Amount:
		//		- The change in consumption = (New Amount - Last Amount) / Last Amount
		//		- It’s an increasing change
		else if(LastAmount < NewAmount)
		{change =(double) (NewAmount - LastAmount) / LastAmount;
		System.out.println("It’s an increasing change");
		}


		//New Amount = Last Amount:
		//- The change in consumption = 0
		//	- There is no change in the consumption
		else
		{change = 0;
		System.out.println("There is no change in the consumption");
		}	
		System.out.printf("the change in consumption is %.2f%%", change*100);
	}

}
