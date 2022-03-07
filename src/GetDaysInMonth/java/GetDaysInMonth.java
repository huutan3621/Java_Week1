package GetDaysInMonth.java;

import java.util.Scanner;

public class GetDaysInMonth {
	public static void main(String[] args) {
	
		Scanner scn = new Scanner(System.in);
		
		int numDaysOfMonth = 0;
		String MonthName = "Unknown";
		
		System.out.print("Nhap nam (Input the year): ");  
		int year = scn.nextInt();
		System.out.println("Nhap thang (Input the month): ");
		int month = scn.nextInt();
		
		//switch month day number of days in month cases from the input
		switch (month) {
		case 1:
			MonthName = "Thang Mot (January)";
			numDaysOfMonth = 31;
			break;
		case 2:
			MonthName = "Thang Hai (February)";
			if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
				numDaysOfMonth = 29;
				System.out.println("Nam nay la nam nhuan (This year is a leap year).");
			} else {
				numDaysOfMonth = 28;
			}
			break;
		case 3:
			MonthName = "Thang Ba (March)";
			numDaysOfMonth = 31;
			break;
		case 4:
			MonthName = "Thang Tu (April)";
			numDaysOfMonth = 30;
			break;
		case 5:
			MonthName = "Thang 5 (May)";
			numDaysOfMonth = 31;
			break;
		case 6:
			MonthName = "Thang 6 (June)";
			numDaysOfMonth = 30;
			break;
		case 7:
			MonthName = "Thang Bay (July)";
			numDaysOfMonth = 31;
			break;
		case 8:
			MonthName = "Thang 8 (August)";
			numDaysOfMonth = 31;
			break;
		case 9:
			MonthName = "Thang Chin (September)";
			numDaysOfMonth = 30;
			break;
		case 10:
			MonthName = "Thang Muoi (October)";
			numDaysOfMonth = 31;
			break;
		case 11:
			MonthName = "Thang Muoi Mot (November)";
			numDaysOfMonth = 30;
			break;
		case 12:
			MonthName = "Thang Muoi Hai (December)";
			numDaysOfMonth = 31;
			break;		
		}
		System.out.println("So ngay trong thang (The number of days in month) "+MonthName+" va nam (and year) "+year+ " la (is): "+numDaysOfMonth);
	}
}
