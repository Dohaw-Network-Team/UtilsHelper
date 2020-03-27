package me.caleb.UtilsAPI.utils;

public class Numbers {

	public static double roundToPoint5(double x) {
		return Math.round(x * 2) / 2.0;
	}
	
	public static long secondsToTicks(double seconds) {
		return (long) (seconds*20);
	}
	
}
