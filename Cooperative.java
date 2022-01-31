	public class Cooperative{
			public static void main(String [] args){
				int [][] tabProduct = new int[7][4];
				int i, j;
				int sommeOeuf;
				int somSemProduct;
				int totalProduction;

				for(i = 0;i < 7; i++){
					System.out.print("Donner le nombre d oeuf fourni dans la premiere semaine du producteur numero "+i+" : ");
					tabProduct[i][0] = Lire.i();

					System.out.println(" ");
					
					System.out.print("Donner le nombre d oeuf fourni dans la deuxieme semaine du producteur numero "+i+" : ");
					tabProduct[i][1] = Lire.i();
					
					System.out.println(" ");
					
					System.out.print("Donner le nombre d oeuf fourni dans la troiseme semaine du producteur numero "+i+" : ");
					tabProduct[i][2] = Lire.i();
					
					System.out.println(" ");


					System.out.print("Donner le nombre d oeuf fourni dans la quatrieme semaine du producteur numero "+i+" : ");
					tabProduct[i][3] = Lire.i();
					
					System.out.println(" ");
					}

					
				System.out.println(" ");
			
				System.out.print("Donner l'indice du producteur choisi : ");
				 i = Lire.i();

				sommeOeuf = somme(i, tabProduct);
				System.out.println("La somme total d'oeuf du producteur numero "+i+" est de "+sommeOeuf);
				
				System.out.println(" ");

				System.out.print("Donner l'indice de la semaine choisi : ");
				 j = Lire.i();

				somSemProduct = sommeProduct(j, tabProduct);
				System.out.println("La somme total d'oeuf de tout les producteurs durant la semaine numero "+j+" est de "+somSemProduct);
				
				System.out.println(" ");

				totalProduction = totalProd(j, tabProduct);
				System.out.println("La somme total d'oeuf recueilli par la cooperative pendant quatre semaines est de "+totalProduction);
				
				System.out.println(" ");

				System.out.println("Fin du programme");
			}

				public static int somme (int x, int tab[][]){
					int i;
					int j;
					int s;
					
					i = x;
					s = 0;
					for(j = 0; j < 4; j++){
							s = s + tab[i][j];							
						}
						return s;
					}
							
					public static int sommeProduct (int y, int t[][]){
						int i;
						int j;
						int som;
					
						j = y;
						som = 0;
						for(i = 0; i < 7; i++){
							som = som + t[i][j];							
						}
						return som;
					}
						public static int totalProd (int a, int tb[][]){
							int i;
							int j;
							int sm;
					
							j = a;
							sm = 0;
							for(i = 0; i < 7; i++){
								for(j = 0; j < 4; j++){
								sm = sm + tb[i][j];
								}							
							}
							return sm;
						}

				}