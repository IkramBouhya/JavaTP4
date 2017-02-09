package S3;

public class Ex44 {
	
    public static int nombre1, nombre2;

	public int lancerde(int total){
    	
    	  int cpt = 0;
          int totaltemp = 0;
          
          //Exception
          if (total<2 || total>12){
              IllegalArgumentException e = new IllegalArgumentException("Nombre doit etre compris entre 2 et 12");
              throw e;
      }
          
          // Lancé de dé
          while (totaltemp != total){
              nombre1 = (int)(Math.random()*6+1);
              nombre2 = (int)(Math.random()*6+1);
              
              totaltemp = nombre1+nombre2;
              cpt+=1;
          }
          return (cpt);
    }
    
	
	public int getDe1(){
		return nombre1;
	}
	
	
	public int getDe2(){
		return nombre2;
	}
    
    public static void main(String[] args) {
		//int nombre =lancerde(2);
		//System.out.println("Il faut "+nombre+" tours pour avoir 2");
	}
    
    
}