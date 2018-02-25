import java.util.*;

public class Main {
	public static void main(String[] args) {
		String JUDUL = "KALKULATOR CLI";
		System.out.println(Color.CYAN+makeLines('-', JUDUL.length())+Color.RESET);
		System.out.println(JUDUL);
		System.out.println(Color.CYAN+makeLines('-', JUDUL.length())+Color.RESET);
		
		if(args.length > 0){
			String operator = args[0];
			
			Kalkulator kalkulator = Kalkulator.getInstance().setOperator(operator);
			if(kalkulator.getOperator().equals("+")) {
				double nilai1 = Double.parseDouble(args[1]);
				double nilai2 = Double.parseDouble(args[2]);
				kalkulator.Jumlah(nilai1, nilai2);
			}
			else if(kalkulator.getOperator().equals("x")) {
				double nilai1 = Double.parseDouble(args[1]);
				double nilai2 = Double.parseDouble(args[2]);
				kalkulator.Kali(nilai1, nilai2);
			}
			else if(kalkulator.getOperator().equals("-")) {
				double nilai1 = Double.parseDouble(args[1]);
				double nilai2 = Double.parseDouble(args[2]);
				kalkulator.Kurangi(nilai1, nilai2);
			}
			else if(kalkulator.getOperator().equals(":")) {
				double nilai1 = Double.parseDouble(args[1]);
				double nilai2 = Double.parseDouble(args[2]);
				kalkulator.Bagi(nilai1, nilai2);
			}
			else {
				Notify.printError("penggunaan : kalkulator [operator] nilai1 nilai2\nOperator :\n   +\t : penjumlahan\n   x\t : perkalian\n   -\t : pengurangan\n   :\t : pembagian\n");
			}
		} else {
			Notify.printError("penggunaan : kalkulator [operator] nilai1 nilai2\nOperator :\n   +\t : penjumlahan\n   x\t : perkalian\n   -\t : pengurangan\n   :\t : pembagian\n");
		}
	}
	
	public static String makeLines(char chars, int count) {
		String line = "";
		for (int i = 0; i <= count; i++) {
			line += chars;
		}
		return line;
	}
}
