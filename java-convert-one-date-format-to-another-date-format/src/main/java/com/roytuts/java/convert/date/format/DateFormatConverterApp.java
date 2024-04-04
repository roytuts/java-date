package com.roytuts.java.convert.date.format;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateFormatConverterApp {

	public static void main(String[] args) throws ParseException {
		System.out.println(convertDateFormat("20220601", "yyyyMMdd", "dd/MM/yyyy"));
		System.out.println(convertDateFormat("20220601123456", "yyyyMMddHHmmss", "dd/MM/yyyy HH:mm:ss"));
		System.out.println(convertDateFormat("20220601123456", "yyyyMMddhhmmss", "dd/MM/yyyy HH:mm:ss"));
		System.out.println(convertDateFormat("20220601123456", "yyyyMMddHHmmss", "dd/MM/yyyy hh:mm:ss"));
		System.out.println(convertDateFormat("20220601123456", "yyyyMMddhhmmss", "dd/MM/yyyy hh:mm:ss"));
		System.out.println(convertDate8Format("20220601", "yyyyMMdd", "dd/MM/yyyy"));
		System.out.println(convertDateTime8Format("20220601123456", "yyyyMMddHHmmss", "dd/MM/yyyy HH:mm:ss"));
		System.out.println(convertDateTime8Format("20220601123456", "yyyyMMddHHmmss", "dd/MM/yyyy hh:mm:ss"));
		System.out.println(convertDateFormat("04-04-2024", "dd-MM-yyyy", "dd/MM/yyyy"));
		System.out.println(convertDate8Format("04-04-2024", "dd-MM-yyyy", "dd/MM/yyyy"));

		// error as input format needs HH instead of hh
		System.out.println(convertDateTime8Format("20220601113456", "yyyyMMddhhmmss", "dd/MM/yyyy hh:mm:ss"));
	}

	public static String convertDateFormat(String inputDate, String inputFormat, String outputFormat)
			throws ParseException {
		DateFormat inputDf = new SimpleDateFormat(inputFormat);
		DateFormat outputDf = new SimpleDateFormat(outputFormat);

		Date tempDate = inputDf.parse(inputDate);

		String dtStr = outputDf.format(tempDate);

		return dtStr;
	}

	public static String convertDate8Format(String inputDate, String inputFormat, String outputFormat)
			throws ParseException {
		DateTimeFormatter inputDf = DateTimeFormatter.ofPattern(inputFormat);
		DateTimeFormatter outputDf = DateTimeFormatter.ofPattern(outputFormat);

		LocalDate tempDate = LocalDate.parse(inputDate, inputDf);

		String dtStr = tempDate.format(outputDf);

		return dtStr;
	}

	public static String convertDateTime8Format(String inputDateTime, String inputFormat, String outputFormat)
			throws ParseException {
		DateTimeFormatter inputDf = DateTimeFormatter.ofPattern(inputFormat);
		DateTimeFormatter outputDf = DateTimeFormatter.ofPattern(outputFormat);

		LocalDateTime tempDateTime = LocalDateTime.parse(inputDateTime, inputDf);

		String dtStr = outputDf.format(tempDateTime);

		return dtStr;
	}

}
