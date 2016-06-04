<<<<<<< HEAD
import edu.princeton.cs.introcs.StdDraw;

public class Grille {
		private int nbl;
		private int nbc;
		public Case [][] grille;
		
	public Grille(int n, int p){
		nbl = n;
		nbc = p;
		grille = new Case[nbl][nbc];
		for (int i=0; i<nbl; i++){
			for (int j=0; j<nbc; j++){
				grille[i][j] = new Case(i+0.5, j+0.5, (int) (Math.random()*6), 0.48);
			}
		}
		//test couleur coins
		while (grille[0][nbc-1].couleur == grille[nbl-1][0].couleur){
			grille[0][nbc-1].couleur = (int) (Math.random()*6);
		}
	}
		public void afficher(){
			StdDraw.setXscale(0, nbl);
			StdDraw.setYscale(0, nbc);
			for (int i=0; i<nbl; i++){
				for (int j=0; j<nbc; j++){
					grille[i][j].afficher();
					
		}
}
			StdDraw.show();
}
=======
import edu.princeton.cs.introcs.StdDraw;

public class Grille {
		private int nbl;
		private int nbc;
		public Case [][] grille;
		
	public Grille(int n, int p){
		nbl = n;
		nbc = p;
		grille = new Case[nbl][nbc];
		for (int i=0; i<nbl; i++){
			for (int j=0; j<nbc; j++){
				grille[i][j] = new Case(i+0.5, j+0.5, (int) (Math.random()*6), 0.48);
			}
		}
		//test couleur coins
		while (grille[0][nbc-1].couleur == grille[nbl-1][0].couleur){
			grille[0][nbc-1].couleur = (int) (Math.random()*6);
		}
	}
		public void afficher(){
			StdDraw.setXscale(0, nbl);
			StdDraw.setYscale(0, nbc);
			for (int i=0; i<nbl; i++){
				for (int j=0; j<nbc; j++){
					grille[i][j].afficher();
					
		}
}
			StdDraw.show();
}
>>>>>>> origin/master
}