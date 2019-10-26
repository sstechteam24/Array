import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class LearningArray {

	public static void main(String[] args) {
		 
		int count=1;
		Scanner kb= new Scanner(System.in);
		String [] month= {"january","Feb","march","April","May","Jume","July","August","September","October","Nov","Dec"};
		/*
		Calendar calendar = Calendar.getInstance();
		 int hours = calendar.get(Calendar.HOUR_OF_DAY);
		 int minutes = calendar.get(Calendar.MINUTE);
		 int convertHours=hours*60;
		 int startingTime=convertHours+minutes;
		 int endingTime=startingTime+EXIT_TIME;
		 
		for (int i=0;i<month.length; i++) {
			System.out.println(month[i]);
		}
		*/
		System.out.println("Priting the month");
		System.out.println("-----------------");
		int number=0;
		System.out.println("Enter number between 1-12: ");
			number=kb.nextInt();
		while(number<0||number>12) {
			count++;
			System.out.println("Wrong Entry");
			System.out.println("==========================");
			System.out.println("Enter number between 1-12: ");
			number=kb.nextInt();	
			if(count>=3){
				System.out.println("Good bye!!!!!");
				System.out.println("You excess your limit");
				System.exit(0);
			}
		}
		count=0;
		System.out.println(month[number-1]);
	}
}
