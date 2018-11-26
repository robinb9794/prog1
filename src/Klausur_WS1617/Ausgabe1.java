package Klausur_WS1617;

interface A{
	public int doit(int i);
}

interface B{
	public int juhu(int i);
}

class X implements A{
	int i;

	X(int i){
		this.i=i;
	}

	public int doit(int i){
		return i*this.i;
	}
}

class Y extends X implements B{
	Y(){
		super(13);
	}

	public int doit(int i){
		return i+12;
	}

	public int juhu(int i){
		return i+this.i;
	}
}

public class Ausgabe1{
	static int j = 0;

	static void test(A[] a){
		int i = 3;
		for (A x : a)
			System.out.println(++j + ": " + x.doit(i++));		
	}

	static void test(Y[] b){
		int i = 3;
		for(Y x : b){
			System.out.println(++j + ": " + x.doit(i++));
			System.out.println(++j + ": " + x.juhu(i++));
		}
	}

	public static void main(String[] args){
		X[] x = {new Y(), new X(3), new X(5), new Y()};
		Y[] y = {new Y(), new Y(), new Y()};
		test(x);
		test(y);
	}
}