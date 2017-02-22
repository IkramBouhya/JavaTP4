package Ex77;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.io.*;

public class Read {
	
	private static ArrayList<String> removeDuplicates(ArrayList<String> l){
		
		for (int i = 1; i < l.size(); i++) {
            String a1 = l.get(i);
            String a2 = l.get(i-1);
            if (a1.equals(a2)) {
                l.remove(a1);
            }
        }
		return l;
	}
	
	private static ArrayList<String> sortList(ArrayList<String> l2){
		
		l2=removeDuplicates(l2);
		String temp2;
		
		 for(int i=0;i<l2.size();i++){

		        for(int j=i+1;j<l2.size();j++){

		     if(l2.get(j).compareTo(l2.get(i))<0){

		            temp2=l2.get(i);
		            l2.set(i, l2.get(j));
		            l2.set(j,temp2);   

		     }
		        }
		    }
	
	return l2;
		
	}
	
	
	public static void main(String[] args) throws FileNotFoundException {
		
		File temp = new File("C:/Users/admin/workspace/IkramBouhya-T4/src/doc.txt");
		Scanner file = new Scanner(temp);
		ArrayList<String> list = new ArrayList<String>();
		HashSet<String> unique = new HashSet<>(list);
		
		while(file.hasNext()){
			
			String s = file.nextLine().trim();
			
			String [] tab = s.split("\\s");
			
			
			for(int i=0;i<tab.length;i++){
				if(tab[i]!=null)
					tab[i]=tab[i].toLowerCase();
				System.out.println(tab[i]);
				list.add(tab[i]);
			}

			
		}
		
				System.out.println("List : "+list);
				System.out.println("List without diplucates : "+removeDuplicates(list));
				System.out.println("Sorted List without duplicates : "+sortList(list));



	}

}
