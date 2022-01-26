package ownTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date;

public class DateTest {

        // Just another change from I       
        // This is a a testing class -- modified from I
	public static void main(String[] args) throws Exception {
		DateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date = sdf.parse("02-10-2001");
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		System.out.println(calendar.get(Calendar.YEAR));
		System.out.println(calendar.get(Calendar.MONTH));
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		
		ZonedDateTime zdt = ZonedDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
//		System.out.println(zdt.get(ChronoField.YEAR));
	}
}
