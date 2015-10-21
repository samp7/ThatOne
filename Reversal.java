import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Reversal {

    public static void main(String[] args) throws FileNotFoundException {
    	
        ArrayList<String> revFile = new ArrayList<String>();
        ArrayList<String> finalString = new ArrayList<String>();
        String linetemp = "";
        
        Scanner file_name = new Scanner(System.in);
        String filename = file_name.next();
        
        System.out.println(filename);
        Scanner input = new Scanner(new File(filename));
        
        while (input.hasNextLine()){
        	revFile.add(input.nextLine()); 
        }
            
        for(int i = revFile.size()-1; i >=0; i--){
        	String wordtemp[]=revFile.get(i).split(" ");
        	linetemp = "";
        	for(int j = wordtemp.length-1; j >=0; j--){
        		System.out.print(wordtemp[j] + " ");
        		linetemp += wordtemp[j] + " ";
        	}
        	System.out.println(" ");
        	
        	//System.out.println(linetemp);
        	finalString.add(linetemp);
        	
        	
        	wordtemp=null;
        }
            
            
        //System.out.println(revFile);
        //System.out.println(finalString);
           
        //return "0";
        //filename.close();
        input.close();

	}
}