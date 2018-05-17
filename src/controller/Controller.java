package controller;
import model.Pannel;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import timeLimit.Time;
import model.Frame;
public class Controller
{
	public void start()
	{
		{	
			int t = 1;
			do
				{
				t++;
				System.out.println(t);
				}
				while(t <= 1000);
			{
			if(t > 100)
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
	
	}
}
