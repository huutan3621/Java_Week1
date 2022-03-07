package PrintCalendar.java;

import java.util.*;

public class PrintCalendar {
	
	public static void main(String[] args) {
		 
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Nhap vao mot nam (Enter a year): ");
	      int year = sc.nextInt();
	 
	      Calendar cal = new GregorianCalendar();
	 
	      int dayStart;
	      int numOfDays;
	      for (int i=0; i<12; i++){
	        cal.set(year, i, 1);
	        dayStart = cal.get(Calendar.DAY_OF_WEEK);
	        numOfDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
	        System.out.print(cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US));
	        System.out.println( " " + year);
	        printMonth(numOfDays,dayStart);
	        System.out.println();
	      }
	   }
	 
	   private static void printMonth(int numberOfDays, int startDay) {
	 
	      int iWeekdays = 0;
	      System.out.println("Su  Mo  Tu  We  Th  Fr  Sa");
	 
	      for (int day = 1; day < startDay; day++) {
	         System.out.print("    ");
	         iWeekdays++;
	      }
	 
	      for (int day = 1; day <= numberOfDays; day++) {
	         System.out.printf("%1$2d", day);
	         iWeekdays++;
	         if (iWeekdays == 7) {
	            iWeekdays = 0;
	            System.out.println();
	         } else { 
	            System.out.print("  ");
	         }
	      }
	      System.out.println();
	   }

}
