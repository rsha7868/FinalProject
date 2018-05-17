package timeLimit;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time
{
	Calendar cal = Calendar.getInstance();
	SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
	public Time(int calendarField)
	{	
		int t = 1;
		do
			{
			t++;
			System.out.println(t);
			}
			while(t <= Calendar.SECOND);
		
		if(t > 10)
		{
			System.out.println("10 seconds left");
			// When you are getting to end of the cycle.
		}
		else
		{
			System.out.println("Keep going");
						
		}
	}
}
	
	