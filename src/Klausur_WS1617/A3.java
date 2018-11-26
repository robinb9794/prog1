package Klausur_WS1617;

public class A3{
	private static int convert_rec(String a){
		return convert_rec(a, 0, 0, 0);
	}

	private static int convert_rec(String a, int i, int j, int val){
		if(i<a.length()){
			j = Character.getNumericValue(a.charAt(a.length()-i-1));
			return convert_rec(a, i+1, j, val |= (j<<i));
		}
		return val;
	} 
	
	private static int convert_iter(String a){
		int val = 0;
		int j;
		for(int i=0; i<a.length(); i++){
			j = Character.getNumericValue(a.charAt(a.length()-i-1));
			val |= (j<<i);
		}
		return val;
	}

	public static void main(String args[]){
		String a = "1101";
		int i = convert_iter(a);
		System.out.println(i);
		i = convert_rec(a);
		System.out.println(i);
	}
}

class WrongString extends Exception{
	public WrongString(){
		super("Falsche Eingabe des Strings.");
	}
}
