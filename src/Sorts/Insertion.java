package Sorts;

/**
 * es wird nicht nach dem kleinsten Element gesucht, sondern 
 * der Algorithmus geht nach und nach die Elemente des Arrays 
 * durch und fuegt diese im linken, sortierten Teil des Arrays
 *	an passender Stelle ein 
 * @author Robin
 *
 */
public class Insertion {
	public static void main(String args[]){
		int[] a = {4,7,1,6,2,55,7,1,9};
		print(a);
		a = insertionsort(a);
	}
	
	private static void print(int[] a){
		for(int i=0; i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}

	private static int[] insertionsort(int[] a) {
		int m,j;
		for(int i=1; i<a.length;i++){
			j=i;
			m=a[i];
			while(j>0 && a[j-1]>m){
				a[j]=a[j-1];
				j--;
			}
			a[j]=m;
			print(a);
		}
		return a;
	}
}
