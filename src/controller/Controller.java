package controller;
import model.Pannel;

import java.sql.Time;

import model.Frame;
public class Controller
{
	public void start()
	{
		int clockTime = 0;
		{
			while(clockTime == 0)
			{
				clockTime++;
				if(clockTime == 60)
				{
				System.out.println("At 60");
				}
			}
		}
	}
}
