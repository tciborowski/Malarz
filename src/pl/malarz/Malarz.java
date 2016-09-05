package pl.malarz;

import java.util.Scanner;

public class Malarz {
	
	static String sideSquare;
	static Scanner scaner = new Scanner(System.in);
	static char s = '#'; // sign
	static char c = '@'; //circle

	public static void main(String[] args) {
		
		while(true) {
			System.out.println("bok kwadratu: ");
			sideSquare = scaner.nextLine();
			drawOdd(Integer.parseInt(sideSquare));
			
			if(!sideSquare.equals("end")) {
			
				
				
			}else {
				break;
			}	
		}		
	}
	
	static void drawOdd(int a){
		int middle = (a/2)+1;
		int x=0, y=0;
		for(int i=1; i<=a; i++) {
		//i = wiersze
		//j = kolumny
			
			//dotyczy pierwszej i ostatniej lini
			if(i==1 || i==a){
				for(int j=1; j<=a; j++){
					System.out.print(s);
					if(j==a){
						System.out.println("");
					}
				}
			//dotyczy drugiej i przedostatniej linii
			} else if(i == 2 || i == (a-1)){
				for (int j = 1; j <= a; j++) {
					if (j==1) System.out.print(s);
					else if (j==a) System.out.println(s + " " + x + " " + y);
					else if (j==middle) { 
						System.out.print(c);//ryduje ko³o
						//narysowal w 'x' i 'y'
						x = i; 
						y = middle; 
					} 
					else System.out.print(" ");
				}
			//dotyczy srodkowej lini
			} else if (i == middle) {
				for (int j = 1; j <= a; j++) {
					if (j==1) System.out.print(s);//pierwszy
					else if (j==a) System.out.println(s);//ostatni
					else if (j==2 || j == a-1) System.out.print(c);//drugi i przedostatni
					else System.out.print(" ");
				}

			//pozostale linie (wiersze)
			} else {
				if (i<middle && i>2) { //czyli kazda kolejna linia powyzej 2 ale mniejsza niz srodek
					for (int j = 1; j <= a; j++) {
						if (j==1) System.out.print(s); //pierwszy
						else if (j==2) System.out.print("^"); //drugi
						else if (j==(a-1)) System.out.print("^"); //przedostatni
						if (j==a) System.out.println(s + " " + x + " " + y); //ostatni
						else { //w pozostalych przypadkach
							if (j==(x+1)) {
								System.out.print(c);
								//x = i;
								//y = j;
							} else {
								System.out.print("^");
							}
						}
					}
				}
				
				
			}
			
			
			
			
			
			
	/*		
			switch(i){
			case 1:
				for(int j=1; j<=a; j++){
					System.out.print("*");
					if(j==a){
						System.out.println("");
					}
				}
				break;
			case 2:
				int middle = (a/2)+1;
				for(int j=1; j<=a; j++){
					if(j==1 || j==middle) System.out.print("*"); 
					else if(j==a) System.out.println("*");
					else System.out.print(" ");
				}
			}
			*/
		}
	}

}
