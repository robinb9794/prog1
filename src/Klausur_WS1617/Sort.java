package Klausur_WS1617;

public class Sort{
	static void sort(int[] field){
		for(int i1=0; i1<field.length; i1++){
			int min = i1;
			for(int i2=i1+1; i2<field.length; i2++){
				if(field[i2]  <  field[min])
					min = i2;
			}
			swap(field, min, i1);
			for(int i : field)
				System.out.print(i + "\t");
			System.out.println();
		}
	}
		
	static void swap(int[] field, int iPos1, int iPos2){
		int tmp = field[iPos1];
		field[iPos1] = field[iPos2];
		field[iPos2] = tmp;
	}

	public static void main(String args[]){
		int[] a = {-2, 5, -6, 12, -17, 0};
		sort(a);
	}
}

/*

-17	5	-6	12	-2	0
-17	-6	5	12	-2	0
-17	-6	-2	12	5	0
-17	-6	-2	0	5	12
-17	-6	-2	0	5	12

*/
