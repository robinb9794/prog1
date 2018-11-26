package Klausur_WS1617;

public class A2{
	public static void print(int[][] a){
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length;j++){
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("-------------------------------\n\n");
	}

	public static SubArrInfo[] getSubInfos(int[][] a){
		SubArrInfo[] info = new SubArrInfo[a.length];
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		int sum = 0;
		float avg = 0;

		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				if(a[i][j] < min)
					min = a[i][j];
				if(a[i][j] > max)
					max = a[i][j];
				sum = sum + a[i][j];
			}
			avg = sum/a[i].length;
			info[i] = new SubArrInfo(i, min, max, sum, avg);

			min = Integer.MAX_VALUE;
			max = Integer.MIN_VALUE;
			sum = 0;
			avg = 0;
		}
		return info;
	}

	public static void main(String[] args){
		int[][] a = new int[3][7];
		for(int i=0; i<a.length;i++){
			for(int j=0; j<a[i].length;j++){
				a[i][j] = (int)(Math.random()*20+5);
			}
		}			
		print(a);
		SubArrInfo[] info = getSubInfos(a);
		for(SubArrInfo x : info)
			x.getInfo();
	}	
}

class SubArrInfo{
	public int m_iRow;
	public int m_iMin;
	public int m_iMax;
	public int m_iSum;
	public float m_fAvg;
	
	public SubArrInfo(int row, int min, int max, int sum, float avg){
		m_iRow = row;
		m_iMin = min;
		m_iMax = max;
		m_iSum = sum;
		m_fAvg = avg;
	} 

	public void getInfo(){
		System.out.println("Zeile: " + m_iRow);
		System.out.println("Minimum: " + m_iMin);
		System.out.println("Maximum: " + m_iMax);
		System.out.println("Summe: " + m_iSum);
		System.out.println("Durchschnitt: " + m_fAvg);
	}
}
