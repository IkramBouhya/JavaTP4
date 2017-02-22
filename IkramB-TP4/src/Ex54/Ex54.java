package Ex54;

import java.util.Scanner;

public class Ex54 {
	
	
	public static void generer(){
		BlackjackHand h1 = new BlackjackHand();
		Deck d1 = new Deck();
		Card c;
		d1.shuffle();
		
		int num = (int)(Math.random()*6+2);
		
		for(int i=0;i<num ;i++){
		
			c=d1.dealCard(); /** Récupérer les cartes du deck **/
			h1.addCard(c);   /** Ajouter la carte au hand du joueur **/

			System.out.println(h1.getCard(i));
			
						
			
		}
			
		System.out.println(h1.getBlackjackValue());
		
	}
	
	public static void main(String[] args) {
			
		char c ='y';
		
		while(c=='y'){
			generer();
			System.out.println("Voulez-vous continuer ?");
			System.out.println("Tappez y pour continuer ou n pour sortir");
			c=TextIO.getChar();
		}
		
	}

}
