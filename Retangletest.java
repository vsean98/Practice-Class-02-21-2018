package age;
import java.util.Scanner;
public class Retangletest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<3;i++) {
		
		
		
		System.out.println ("Please enter the length ");
		Scanner scanner=new Scanner(System.in);

        int anwser=scanner.nextInt();
	
        System.out.println ("Please enter the width ");
		Scanner scanner1=new Scanner(System.in);

        int anwser1=scanner1.nextInt();

	
			
			
			Retangle p1=new Retangle (anwser,anwser1);
	System.out.println(p1.getPerimeter());
	
	Retangle p2=new Retangle (anwser,anwser1);
	System.out.println(p1.getArea());
	
	}
	}

}
