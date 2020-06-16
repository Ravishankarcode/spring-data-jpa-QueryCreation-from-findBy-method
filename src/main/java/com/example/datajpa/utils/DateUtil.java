package com.example.datajpa.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @author Ravishankar.kumar
 *
 */
public class DateUtil {
	/**
	 * Method for convert String to Date Format.
	 * @param stringDate
	 * @return
	 */
	public static Date convertStringToDate(String stringDate) {

		DateFormat df = new SimpleDateFormat("yyyy-MM-dd"); 
		Date startDate = null;

		try {
		    startDate = df.parse(stringDate);

		} catch (ParseException e) {
		    e.printStackTrace();
		}
		return startDate;
		
	}

}
