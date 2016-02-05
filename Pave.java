import java.util.Scanner;

public class pave {
	public static void main(String ... args) {
		/* Un pave a une hauteur, une largeur, une longueur et un volume */
		Scanner scan = new Scanner(System.in);
			System.out.println("entrer la hauteur");
				double a = scan.nextDouble(); /*a = 15.0; //hauteur*/
			System.out.println ("entrer la largeur");
				double b = scan.nextDouble(); /*b = 5.0; //longeur*/
			System.out.println ("entrer la longueur");
				double c = scan.nextDouble(); /*c = 10.0; //largeur*/
			double d = a * b * c;
		System.out.println("le volume est :" + d);
	}
}
