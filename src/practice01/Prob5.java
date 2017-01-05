package practice01;

public class Prob5 {

	public static void main(String[] args) {
		for(int i=0;i<=100;i++){
			int num= i % 10;
			if(num==3 || num==6 || num==9){
				int num2=i / 10;
				if(num2==3 || num2==6 || num2==9 ){
					System.out.println(i+" 짝짝 ");
				}
				System.out.println(i+" 짝 ");
			}
		}
	}

}
