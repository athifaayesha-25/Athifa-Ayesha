import java.time.LocalDate;

public class LeapYear12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date1=LocalDate.of(2017, 1, 13);
		System.out.println(date1.isLeapYear());
		LocalDate date2=LocalDate.of(2016, 9, 23);
		System.out.println(date2.isLeapYear());
	}

}