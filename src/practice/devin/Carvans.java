
public class Carvans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myArray[]= {8, 3, 6};
		int maxSpeed=myArray[0];
		int countMax=1;
		for(int i=1;i<myArray.length;i++) {
			if(myArray[i]<=maxSpeed) {
				countMax=countMax+1;
				maxSpeed=myArray[i];
			}
		}
		
		System.out.println(countMax);
	}

}
