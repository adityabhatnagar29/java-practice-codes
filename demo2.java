package demo;

import java.util.Scanner;

public class demo2 {

	public static void main(String[] args) {
		int month = 12;
		System.out.println("Enter the option");
		Scanner s= new Scanner(System.in);
		month= s.nextInt();
		//String month1="";
		switch(month) {
		case 1:System.out.println("1-jan");
		break;
		case 2:System.out.println("2-feb");
		break;
		case 3:System.out.println("3-jan");
		break;
		case 4:System.out.println("4-jan");
		break;
		case 5:System.out.println("5-jan");
		break;
		case 6:System.out.println("6-jan");
		break;
		case 7:System.out.println("7-jan");
		break;
		case 8:System.out.println("8-jan");
		break;
		default:System.out.println("Invalid option");
		}
		//System.out.println(month);
	}

}
