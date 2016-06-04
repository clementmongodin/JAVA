import edu.princeton.cs.introcs.StdDraw;

public class Case {
	private double i;
	private double j;
	public int couleur;
	private double taille;
	public int appartenance;
	
	public Case(double i, double j, int couleur, double taille){
		this.i = i;
		this.j = j;
		this.couleur = couleur;
		this.taille = taille;
	}
	public void afficher(){
		switch(couleur){
		case 0 : StdDraw.setPenColor(StdDraw.RED); break;
		case 1 : StdDraw.setPenColor(StdDraw.BLUE); break ;
		case 2 : StdDraw.setPenColor(StdDraw.YELLOW); break ;
		case 3 : StdDraw.setPenColor(StdDraw.GREEN); break ;
		case 4 : StdDraw.setPenColor(StdDraw.ORANGE); break ;
		case 5 : StdDraw.setPenColor(102, 0, 102); break ;
		}
		StdDraw.filledSquare(i, j, taille);
	}
}

	