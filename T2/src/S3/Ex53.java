package S3;

public class Ex53 {
	 	

		   public static void main(String[] args) {
		     
				 Ex44 de1 = new Ex44(); /** On crée un objet De **/

		       System.out.println("Total On Dice     Average Number of Rolls   Standard Deviation  Max number of rolls");
		       System.out.println("-------------     -----------------------   ------------------  ------------------ ");
		       
		       
		   /** On affiche toutes les possibilités des tours de 2 à 12 **/
		       
		       for ( int total=2;  total <= 12; total++ ) {
		    	   
		   /** On déclare un objet de la classe StatCalc pour appeler 
		    * les fonctions de Average, deviation, max
		    */
		    	   
		    	   StatCalc st1; 
		    	   st1=new StatCalc();
		    	   
		    	   /** On répéte l'action 10000 fois */
		    	   
		    	   for (int i = 0; i <10000 ; i++ ) {
		   
		             st1.enter(de1.lancerde(total)); // Lancer le dé
		          }
		     
		          System.out.printf("%10d%22.4f%25f%24.0f\n", total, st1.getMean(),st1.getStandardDeviation(),st1.getMax());
		            
		       }
		   } 
		   
	
			
		} 



