/* Kalkulator singleton class
* 19 - february 2018
* by Hendriyawan @github.com/Hendriyawan
* blog : https://gdevnet.blogspot.com
*
* @param kalkulator Kalkulator Singleton
*/
public class Kalkulator
{
	private static Kalkulator kalkulator = new Kalkulator();
	private static String operator;
	
	public Kalkulator(){
	}
	
	public static Kalkulator getInstance(){
		if(kalkulator == null){
			kalkulator = new Kalkulator();
		}
		return kalkulator;
	}
	/*Kalkulator singleton class
	*
	* @param kalkulator Kalkulator seter
	*/
	public static Kalkulator setOperator(String inputOperator){
		operator = inputOperator;
		return kalkulator;
	}
	/*Kalkulator singleton class
	*
	* @param kalkulator Kalkulator geter
	*/
	public String getOperator(){
		return operator;
	}
	
	/* Penjumlahan
	*
	*/
	public void Jumlah(double nilai1, double nilai2){
		try {
			double hasil = nilai1 + nilai2;
			Notify.printSucess("Penjumlahan : "+String.valueOf(nilai1)+" + "+String.valueOf(nilai2));
			Notify.printSucess(Color.L_CYAN+checkAfterDecimalPoint(hasil)+Color.RESET+"\n");
		}
		catch (Exception e) {
			Notify.printError(e.toString());
		}
	}
	/* Perkalian
	*
	*/
	public void Kali(double nilai1, double nilai2){
		try {
			double hasil = nilai1 * nilai2;
			Notify.printSucess("Perkalian : "+String.valueOf(nilai1)+" x "+String.valueOf(nilai2));
			Notify.printSucess(Color.L_CYAN+checkAfterDecimalPoint(hasil)+Color.RESET+"\n");
		}
		catch (Exception e){
			Notify.printError(e.toString());
		}
	}
	/* Pengurangan
	*
	*/
	public void Kurangi(double nilai1, double nilai2){
		try {
			double hasil = nilai1 - nilai2;
			Notify.printSucess("Pengurangan : "+String.valueOf(nilai1)+" - "+String.valueOf(nilai1));
			Notify.printSucess(Color.L_CYAN+checkAfterDecimalPoint(hasil)+Color.RESET+"\n");
		}
		catch (Exception e){
			Notify.printError(e.toString());
		}
	}
	/* Pembagian
	*
	*/
	public void Bagi(double nilai1, double nilai2){
		try {
			double hasil = nilai1 / nilai2;
			Notify.printSucess("Pembagian : "+String.valueOf(nilai1)+" : "+String.valueOf(nilai2));
			Notify.printSucess(Color.L_CYAN+checkAfterDecimalPoint(hasil)+Color.RESET+"\n");
		}
		catch (Exception e){
			Notify.printError(e.toString());
		}
	}
	/* metode cek nilai setelah koma
	*
	* @param kalkulator Kalkulator checkAfterDecimalPoint
	*/
	public String checkAfterDecimalPoint(double decimal){
		String result = "";
		String[] after_point = String.valueOf(decimal).split("[:.]");
		if(after_point[after_point.length-1].equals("0")) {
			result = after_point[0];
		} else {
			result = String.valueOf(decimal).replace(".",",");
		}
		return result;
	}
}
