package Codes;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class MainDrive {

	public static void main(String[] args) {

		String numStr = "2020";

		System.out.println(Integer.parseInt(numStr) + 1);

//		기본형 변수처럼 사용해보자. 

		Integer num1 = 20;
		Integer num2 = 50;

		System.out.println(num1.toString() + num2);

//		참조형 변수로써의 활용 -> ArrayList에 목록 관리.

		List<Integer> selectedDayOfWeeks = new ArrayList<>();

		selectedDayOfWeeks.add(Calendar.MONDAY);
		selectedDayOfWeeks.add(Calendar.WEDNESDAY);
		selectedDayOfWeeks.add(Calendar.FRIDAY);

	}

}
