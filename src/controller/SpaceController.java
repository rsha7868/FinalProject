package controller;
import model.Pannel;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import timeLimit.Time;
import model.SpaceFrame;
public class SpaceController
{
	public void start()
	{
		{	
			int t = -1;
			do
				{
				t++;
				System.out.println(t);
				if(t > 0  && t < 2)
				{
					System.out.println(t + " Start of the Race");
				}
				if(t > 59 && t < 61)
				{
				System.out.println(t + " It is over");
				// When you are getting to end of the cycle.
				//Last 10 Secs left
				}
				if(t >29 && t < 31)
				{
					System.out.println(t +" Half way there");
				}
			}
				while(t < 60);
				
			}
		}
	
	}
