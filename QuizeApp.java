package com.nissan.App;
import java.util.Scanner;

public class QuizeApp {
	//Declare golbal Scanner object
	static Scanner scanner =new Scanner(System.in);
	public static void main(String[] args) {
		try {
		//Take Name from the User
			System.out.print("Enetr your Name: ");
			String Name=scanner.nextLine();
			String[] QuestionNumber= {"Q1","Q2","Q3","Q4","Q5"};
			String[] Question= {"What is Capital of Maharashtra ",
								"What is Capital of Kerala ",
								"What is Capital of Haryana ",
								"What is Capital of Goa ",
								"What is Capital of Andhra Pradesh "};
			String[] YourAnswer=new String[5];
			String[] CorrectAnswer={"Mumbai","Thiruvnanthpuram","Chandigarh","Panaji","Hyderabad"};
			int[] Score=new int[5];
			
			char choice='n';
			do {
				//Menu driven
				System.out.println("Enter choice\n1.Start Quize\n2.Didplay Report\n3.Exit");
				int input=scanner.nextInt();
				switch(input) {
				case 1:getSatrting(QuestionNumber, Question,YourAnswer,CorrectAnswer,Score);
					break;
				case 2:Display( Name,QuestionNumber, Question,YourAnswer,CorrectAnswer,Score);
					break;
				case 3:
					System.out.println("Thank You!!!!!!!!");
					System.exit(0);
				default:
					System.out.println("Invalid option");
				}
				System.out.println("Do you want to continue....(y/n)");
				choice=scanner.next().charAt(0);
				if(choice!='y') {
					System.out.println("Thank You !!!!!");
				}
			}while(choice=='Y' || choice=='y');
		}
		catch(Exception e) {
			System.out.println("Invalid Input!!!");	
		}
	}
	
		//taking answers from user
		public static void	getSatrting(String[] QuestionNumber,String[] Question,
			String[] YourAnswer,String[] CorrectAnswer,int[] Score ){
			
			System.out.println("Sarting Quize.....");
			for(int i=0;i<5;i++) {
				System.out.print(Question[i]  + " ");
				String answer=scanner.next();
				YourAnswer[i]=answer;
				if(answer.equalsIgnoreCase(CorrectAnswer[i])) {
					Score[i]=1;
				}
			}
			
			
		}
		
			
	
	public static void Display(String name,String[] QuestionNumber,String[] Question,String[] YourAnswer,String[] CorrectAnswer,int[] Score) {
		System.out.println("Displaying Your Quiz Report...........");
		System.out.println("----------------------------------------------------------------------------------------------------");    
		System.out.println("                                           "+ name + "                                                   ");
		System.out.println("----------------------------------------------------------------------------------------------------");    
		System.out.printf(String.format("%-9s%30s%30s%20s%10s%n","QuestionNo","Question","Your Answer","Correct Answer","Score"));
		System.out.println("----------------------------------------------------------------------------------------------------");
		int sum=0;
		for(int j=0;j<5;j++) {
			System.out.printf(String.format("%-9s%40s%20s%20s%10s%n",QuestionNumber[j],Question[j],YourAnswer[j],CorrectAnswer[j],Score[j]));
			sum+=Score[j];
		}
		System.out.println("----------------------------------------------------------------------------------------------------");
		if(sum==5)
			System.out.println("                                          Exellent...!!!!                                       ");
		else if(sum==0)
			System.out.println("                                          Try Again!                                            ");
		else
			System.out.println("                                          Good try...                                           ");
	}
	
	
}
