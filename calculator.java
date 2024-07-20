import java.util.*;
class calculator
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter The Marks of Five Subjects:");
		int mark1 = input.nextInt();
		int mark2 = input.nextInt();
		int mark3 = input.nextInt();
		int mark4 = input.nextInt();
		int mark5 = input.nextInt();
		int total = mark1 + mark2 + mark3 + mark4 + mark5;
		float per = total/5;
		System.out.println("Total :"+total);
		System.out.println("Percentage :"+per);	
		if(per>=90)
			System.out.println("Grade A");
		else if(per>=80)
			System.out.println("Grade B");
		else if(per>=70)
			System.out.println("Grade C");
		else if(per>=60)
			System.out.println("Grade D");
		else if(per>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
}