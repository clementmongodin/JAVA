import edu.princeton.cs.introcs.StdDraw;
import java.awt.Font;
import java.util.Scanner;

public class Main {
	public static void main (String[] args){
		seljoueurs();
	}
	public static int taille=1;
	public static int s1=0;
	public static int s2=0;
	public static int f=0;
	public static int jeu=0;
	
	public static void seljoueurs(){
		StdDraw.picture(0.635, 0.55, "src/resources/java6.jpg");
		StdDraw.setPenColor(3, 34, 76);
		StdDraw.setFont(new Font("Stencil", Font.BOLD, 40));
		StdDraw.rectangle(0.5, 0.61, 0.25, 0.07);
		StdDraw.text(0.5,0.60, "2 joueurs");
		StdDraw.rectangle(0.5, 0.41, 0.35, 0.07);
		StdDraw.text(0.5,0.40, "1 joueur VS IA");
		StdDraw.text(0.5,0.9, "Jeu des 6 couleurs");
		StdDraw.setFont(new Font("Arial", Font.PLAIN, 30));
		StdDraw.text(0.5,0.75, "Nombre de joueurs ?");
		while(true){
			if (StdDraw.mousePressed()){
			//double x = StdDraw.mouseX();
			int x = (int) Math.floor(StdDraw.mouseX()*1000);
			int y = (int) Math.floor(StdDraw.mouseY()*1000);
			if (x>=250 & x<=750 & y>=540 & y<=680 ){
				jeu=1;
			}
			else if (x>=150 & x<=850 & y>=340 & y<=480 ){
				jeu=2;
			}
			else seljoueurs();
			selgrille();
			}
		}
	}
		
	
	
	public static void selgrille(){
		StdDraw.clear();
		StdDraw.picture(0.635, 0.55, "src/resources/java6.jpg");
		StdDraw.setPenColor(3, 34, 76);
		StdDraw.setFont(new Font("Stencil", Font.BOLD, 40));
		StdDraw.square(0.35, 0.5, 0.14);
		StdDraw.text(0.35,0.5, "9*9");
		StdDraw.square(0.65, 0.5, 0.14);
		StdDraw.text(0.65,0.5, "13*13");
		StdDraw.square(0.65, 0.2, 0.14);
		StdDraw.text(0.65,0.2, "17*17");
		StdDraw.square(0.35, 0.2, 0.14);
		StdDraw.text(0.35,0.2, "15*15");
		StdDraw.text(0.5,0.9, "Jeu des 6 couleurs");
		StdDraw.setFont(new Font("Arial", Font.PLAIN, 30));
		StdDraw.text(0.5,0.75, "Taille de la grille de jeu ?");
		while(true){
			if (StdDraw.mousePressed()){
			int x = (int) Math.floor(StdDraw.mouseX()*1000);
			int y = (int) Math.floor(StdDraw.mouseY()*1000);
			if (x>=210 & x<=490 & y>=360 & y<=640 ){
				taille = 9;
			}
			else if (x>=510 & x<=790 & y>=360 & y<=640 ){
				taille = 13;
			}
			else if (x>=510 & x<=790 & y>=60 & y<=340 ){
				taille = 17;
			}
			else if (x>=210 & x<=490 & y>=60 & y<=340 ){
				taille = 15;
			}
			else selgrille();
			if (jeu==1){
				jeu();
			}
			else {
				jeu1();
			}
			}
		}
	}
	public static void jeu(){
		Grille g1 = new Grille(taille,taille);
		StdDraw.clear();
		g1.afficher();
		int a=0;
		int b=6;
		int c=6;
		g1.grille[0][taille-1].appartenance = 1;
		g1.grille[taille-1][0].appartenance = 2;
		while(true){
			//joueur 1
			while (a==0){
			if (StdDraw.mousePressed() || f==0){
				int x = (int) Math.floor(StdDraw.mouseX());
				int y = (int) Math.floor(StdDraw.mouseY());
				if (g1.grille[x][y].couleur == b) break;	
				if (g1.grille[x][y].couleur == c) break;
				b=g1.grille[x][y].couleur;
				for (int z=0; z<taille*taille; z++){
					int k=0;
				for (int i=0; i<=taille-1; i++){
					for (int j=0; j<=taille-1; j++){
										if (g1.grille[i][j].appartenance == 1){
											g1.grille[i][j].couleur = g1.grille[x][y].couleur;
											if (i-1>=0){
												if (g1.grille[i-1][j].couleur == g1.grille[x][y].couleur){
											g1.grille[i-1][j].appartenance = 1;
												}
											}
											if (i+1<=taille-1){
												if (g1.grille[i+1][j].couleur == g1.grille[x][y].couleur){
											g1.grille[i+1][j].appartenance = 1;
												}
											}
											if (j-1>=0){
												if (g1.grille[i][j-1].couleur == g1.grille[x][y].couleur){
											g1.grille[i][j-1].appartenance = 1;
												}
											}
											if (j+1<=taille-1){
												if (g1.grille[i][j+1].couleur == g1.grille[x][y].couleur){
											g1.grille[i][j+1].appartenance = 1;
												}
											}
										}
							if(g1.grille[i][j].appartenance == 1){
								k++;
							}
					}
				}
				s1=k;
				
				}
				a=1;
				g1.afficher();
				
			}
			}
			
			//joueur 2
			while (a==1){
			if (StdDraw.mousePressed() || f==0){
				//a=1;
				int x = (int) Math.floor(StdDraw.mouseX());
				int y = (int) Math.floor(StdDraw.mouseY());
				if (g1.grille[x][y].couleur == b) break;
				if (g1.grille[x][y].couleur == c) break;
				c=g1.grille[x][y].couleur;
				for (int z=0; z<taille*taille; z++){
					int k=0;
				for (int i=0; i<=taille-1; i++){
					for (int j=0; j<=taille-1; j++){
										if (g1.grille[i][j].appartenance == 2){
											g1.grille[i][j].couleur = g1.grille[x][y].couleur;
											s2++;
										if (i-1>=0){
										if (g1.grille[i-1][j].couleur == g1.grille[x][y].couleur){
											g1.grille[i-1][j].appartenance = 2;
											s2++;
										}
										}
										if (i+1<=taille-1){
										if (g1.grille[i+1][j].couleur == g1.grille[x][y].couleur){
											g1.grille[i+1][j].appartenance = 2;
											s2++;
										}
										}
										if (j-1>=0){
										if (g1.grille[i][j-1].couleur == g1.grille[x][y].couleur){
											g1.grille[i][j-1].appartenance = 2;
											s2++;
										}
										}
										if (j+1<=taille-1){
										if (g1.grille[i][j+1].couleur == g1.grille[x][y].couleur){
											g1.grille[i][j+1].appartenance = 2;
											s2++;
										}
										}
										}
									if(g1.grille[i][j].appartenance == 2){
										k++;
									}
					}
					
				}
				s2=k;
				}
				a=0;
				g1.afficher();
				f=1;
			}
			}		
		if (s1>(taille*taille)/2){
		score();
		}
		if (s2>(taille*taille)/2){
		score();
		}
	}
}
	
	public static void jeu1(){
		Grille g1 = new Grille(taille,taille);
		StdDraw.clear();
		g1.afficher();
		int a=0;
		int b=6;
		int c=6;
		g1.grille[0][taille-1].appartenance = 1;
		g1.grille[taille-1][0].appartenance = 2;
		while(true){
			//joueur 1
			while (a==0){
			if (StdDraw.mousePressed() || f==0){
				int x = (int) Math.floor(StdDraw.mouseX());
				int y = (int) Math.floor(StdDraw.mouseY());
				if (g1.grille[x][y].couleur == b) break;	
				if (g1.grille[x][y].couleur == c) break;
				b=g1.grille[x][y].couleur;
				for (int z=0; z<taille*taille; z++){
					int k=0;
				for (int i=0; i<=taille-1; i++){
					for (int j=0; j<=taille-1; j++){
										if (g1.grille[i][j].appartenance == 1){
											g1.grille[i][j].couleur = g1.grille[x][y].couleur;
											if (i-1>=0){
												if (g1.grille[i-1][j].couleur == g1.grille[x][y].couleur){
											g1.grille[i-1][j].appartenance = 1;
												}
											}
											if (i+1<=taille-1){
												if (g1.grille[i+1][j].couleur == g1.grille[x][y].couleur){
											g1.grille[i+1][j].appartenance = 1;
												}
											}
											if (j-1>=0){
												if (g1.grille[i][j-1].couleur == g1.grille[x][y].couleur){
											g1.grille[i][j-1].appartenance = 1;
												}
											}
											if (j+1<=taille-1){
												if (g1.grille[i][j+1].couleur == g1.grille[x][y].couleur){
											g1.grille[i][j+1].appartenance = 1;
												}
											}
										}
							if(g1.grille[i][j].appartenance == 1){
								k++;
							}
					}
				}
				s1=k;
				
				}
				a=1;
				g1.afficher();
				
			}
			}
			
			//joueur 2
			while (a==1){
				int t=g1.grille[taille-1][0].couleur;
				if (f!= 0){t =(int) (Math.random()*6);}
				if (t == b) break;
				if (t == c) break;
				c=t;
				for (int z=0; z<taille*taille; z++){
					int k=0;
				for (int i=0; i<=taille-1; i++){
					for (int j=0; j<=taille-1; j++){
										if (g1.grille[i][j].appartenance == 2){
											g1.grille[i][j].couleur = t;
											s2++;
										if (i-1>=0){
										if (g1.grille[i-1][j].couleur == t){
											g1.grille[i-1][j].appartenance = 2;
											s2++;
										}
										}
										if (i+1<=taille-1){
										if (g1.grille[i+1][j].couleur == t){
											g1.grille[i+1][j].appartenance = 2;
											s2++;
										}
										}
										if (j-1>=0){
										if (g1.grille[i][j-1].couleur == t){
											g1.grille[i][j-1].appartenance = 2;
											s2++;
										}
										}
										if (j+1<=taille-1){
										if (g1.grille[i][j+1].couleur == t){
											g1.grille[i][j+1].appartenance = 2;
											s2++;
										}
										}
										}
									if(g1.grille[i][j].appartenance == 2){
										k++;
									}
					}
					
				}
				s2=k;
				}
				a=0;
				g1.afficher();
				f=1;
			}		
		if (s1>(taille*taille)/2){
		score();
		}
		if (s2>(taille*taille)/2){
		score();
		}
	}
}
	public static void score(){
		StdDraw.setScale(0,1);
		StdDraw.clear();
		StdDraw.picture(0.635, 0.55, "src/resources/java6.jpg");
		StdDraw.setPenColor(3, 34, 76);
		StdDraw.setFont(new Font("Stencil", Font.BOLD, 40));
		if (s1>s2){
		StdDraw.text(0.5,0.6, "Joueur 1 a gagné !");
		StdDraw.text(0.5,0.4, "Score : " + s1 +"-" +s2 );
		}
		if (s1<s2){
			StdDraw.text(0.5,0.6, "Joueur 2 a gagné !");
			StdDraw.text(0.5,0.4, "Score : " + s2 +"-" +s1 );
			}
	}
}