import java.util.Scanner;

class InputToCut {
	String StringToCut;
	int range_start, range_end;
	
	void DisplayInputRange() {
		StringBuilder part_string = new StringBuilder();
		
		for (int i = range_start; i <= range_end; i++) {
			part_string.append(StringToCut.charAt(i));
		}
		
		System.out.println(part_string);
	}
	
}

public class stringcutter {

	public static void main(String[] args) {
		
		Scanner scnr1 = new Scanner(System.in);
		Scanner scnr2 = new Scanner(System.in);
		Scanner scnr3 = new Scanner(System.in);
		
		InputToCut myInput = new InputToCut();
		
		System.out.println("Input the string you want to cut: ");
		myInput.StringToCut = scnr1.nextLine();
		
		System.out.println("Input the range starting index: ");
		myInput.range_start = scnr2.nextInt();
		
		System.out.println("Input the range ending index");
		myInput.range_end = scnr3.nextInt();
		
		scnr1.close();
		scnr2.close();
		scnr3.close();
		
		myInput.DisplayInputRange();
		
	}
}
