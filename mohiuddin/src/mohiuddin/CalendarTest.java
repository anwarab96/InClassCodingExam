package mohiuddin;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {

	public static void main(String[] args) {
	//construct d as current date
		GregorianCalendar d = new GregorianCalendar();
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);
		//set d to start date of month
		d.set(Calendar.DAY_OF_MONTH, 1);
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		//get first day week(Sunday in the U.S)
		int firstDay of week = d.getFirstDayOfWeek();
		//determind the required indentation for the first line
		int indent = 0;
		while (weekday != firstDayOfWeek){
			indent++;
			d.add(Calendar.DAY_OF_MONTH, 1);
			weeday = d.get(Calendar.DAY_OF_WEEK);
		}
		//print weekday names
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		do{
			System.out.printf("%4s", weekdayNames[weekday]);
			d.add(Calenday.Day_Of_Month, 1);
			weekday = d.get(Calendar. Day_OF_WEEK);
		}
		while
			weekday = d.get(Calendar.DAY_OF_WEEK);
			
		}
		}
	}

}
