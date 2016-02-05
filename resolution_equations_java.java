import java.util.Scanner;

public class equa {
	public static void main(String ... args) {
		Scanner scan = new Scanner(System.in);
			System.out.println("entrer a");
				double a = scan.nextDouble();
			System.out.println("entrer b");
				double b = scan.nextDouble();
			System.out.println("entrer c");
				double c = scan.nextDouble();
			double det=(b*b)-(4*a*c);
			if(det>0){
				double x1=(-b-Math.sqrt(det))/(2*a);
				double x2=(-b+Math.sqrt(det))/(2*a);
				System.out.println("Les 2 solutions réelles sont:"); 
				System.out.println("x1=" +x1); 
				System.out.println("x2=" +x2); 
			} 
			if(det==0){
				 double x1=-b/(2*a); 
				System.out.println("la solution double est:" +x1); 
			}
			if(det<0){
				double re=-b/(2*a);
				double im=Math.sqrt(-det)/(2*a);
				System.out.println("les 2 solutions complexes sont:"); 
				System.out.println("x1=" +re+"+"+im+"i"); 
				System.out.println("x2=" +re+"+"+im+"i"); 
			}  
	}
}