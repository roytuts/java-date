package com.roytuts.java.future.or.past.date;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FuturePastDateApp {

	private static final String DATE_FORMAT = "yyyy-MM-dd";

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String date = "2015-02-25"; // date from which a next or past date will be calculated
		String futureDate = addDaysToDate(date, "280"); // get date after adding 280 days to the above date
		System.out.println("Future Date : " + futureDate + "(" + DATE_FORMAT + ")");
		String pastDate = subtractDaysFromDate(date, "30"); // get past date after subtracting 30 days from the above
															// date
		System.out.println("Past Date : " + pastDate + "(" + DATE_FORMAT + ")");
	}

	/**
	 *
	 * @param date
	 * @param days
	 * @return string
	 */
	private static String addDaysToDate(String date, String days) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat(DATE_FORMAT);

		try {
			Date myDate = df.parse(date.trim());
			c.setTime(myDate);
			c.add(Calendar.DATE, Integer.parseInt(days));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String toDate = df.format(c.getTime());

		return toDate;
	}

	/**
	 *
	 * @param date
	 * @param days
	 * @return string
	 */
	private static String subtractDaysFromDate(String date, String days) {
		Calendar c = Calendar.getInstance();
		DateFormat df = new SimpleDateFormat(DATE_FORMAT);

		try {
			Date myDate = df.parse(date.trim());
			c.setTime(myDate);
			c.add(Calendar.DATE, (Integer.parseInt(days) * -1));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		String toDate = df.format(c.getTime());

		return toDate;
	}

}
