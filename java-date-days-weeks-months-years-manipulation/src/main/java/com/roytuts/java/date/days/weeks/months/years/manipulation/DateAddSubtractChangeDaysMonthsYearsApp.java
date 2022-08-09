package com.roytuts.java.date.days.weeks.months.years.manipulation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateAddSubtractChangeDaysMonthsYearsApp {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();

		System.out.println("Date: " + localDate);

		localDate = localDate.plusDays(5);
		System.out.println("Date: " + localDate);

		localDate = localDate.plusWeeks(3);
		System.out.println("Date: " + localDate);

		localDate = localDate.plusMonths(2);
		System.out.println("Date: " + localDate);

		localDate = localDate.plusYears(1);
		System.out.println("Date: " + localDate);

		localDate = localDate.minusYears(1);
		System.out.println("Date: " + localDate);

		localDate = localDate.minusMonths(2);
		System.out.println("Date: " + localDate);

		localDate = localDate.minusWeeks(3);
		System.out.println("Date: " + localDate);

		localDate = localDate.minusDays(5);
		System.out.println("Date: " + localDate);

		localDate = localDate.withDayOfMonth(10);
		System.out.println("Date: " + localDate);

		localDate = localDate.withDayOfYear(10);
		System.out.println("Date: " + localDate);

		localDate = localDate.withMonth(9);
		System.out.println("Date: " + localDate);

		localDate = localDate.withYear(2025);
		System.out.println("Current Date: " + localDate);

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		LocalDate anotherDate = LocalDate.parse("2020-12-23", dtf);

		System.out.println("Another date: " + anotherDate);

		System.out.println("Difference in days: " + ChronoUnit.DAYS.between(localDate, anotherDate));
		System.out.println("Difference in weeks: " + ChronoUnit.WEEKS.between(localDate, anotherDate));
		System.out.println("Difference in months: " + ChronoUnit.MONTHS.between(localDate, anotherDate));
		System.out.println("Difference in years: " + ChronoUnit.YEARS.between(localDate, anotherDate));
	}

}
