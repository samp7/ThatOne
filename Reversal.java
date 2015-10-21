import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reversal {

    public static void main(String[] args) throws FileNotFoundException {
    	
        ArrayList<String> revFile = new ArrayList<String>();
        
        Scanner file_name = new Scanner(System.in);
        String filename = file_name.next();
        Scanner input = new Scanner(new File(filename));
        
        while (input.hasNextLine()){
        	revFile.add(input.nextLine()); 
        }
            
        for(int i = revFile.size()-1; i >=0; i--){
        	String wordtemp[]=revFile.get(i).split(" ");

        	for(int j = wordtemp.length-1; j >=0; j--){
        		if(j>0){
        			System.out.print(wordtemp[j] + " ");
        		} else {
        			System.out.print(wordtemp[j]);
        		}
        	}

        	System.out.println(" ");
        	wordtemp=null;
        }
             
        file_name.close();
        input.close();
	}
}