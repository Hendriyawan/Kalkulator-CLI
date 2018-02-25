public class Notify
{
	public static void printSucess(String message){
		System.out.println(Color.GREEN+"[+] "+Color.RESET+"Hasil : "+message);
	}
	
	public static void printError(String message){
		System.out.println(Color.RED+"[-] "+Color.RESET+message);
	}
}
