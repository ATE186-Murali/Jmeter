package Jmeter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class abc {
	
	public static String value=a();
	
	
	public static String a()
	{
		return "a";
	}
	
	public static void main(String[] args) throws ParseException {
		 String _24HourTime = "22:15";
         SimpleDateFormat _24HourSDF = new SimpleDateFormat("HH:mm");
         SimpleDateFormat _12HourSDF = new SimpleDateFormat("hh:mm");
         Date _24HourDt = _24HourSDF.parse(_24HourTime);
         System.out.println(_12HourSDF.format(_24HourDt));
	}

}
