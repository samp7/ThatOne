import java.util.ArrayList;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Reversal {
	
	public static void reverseFile(File input, File output) throws FileNotFoundException {
		Scanner fileScanner = new Scanner(input);
		PrintWriter pw = new PrintWriter(output);
		ArrayList<String> revFile = new ArrayList<String>();
		
		while (fileScanner.hasNextLine()){
        	revFile.add(fileScanner.nextLine()); 
        }
            
        for(int i = revFile.size()-1; i >=0; i--){
        	String wordtemp[]=revFile.get(i).split(" ");

        	for(int j = wordtemp.length-1; j >=0; j--){
        		if(j>0){
        			System.out.print(wordtemp[j] + " ");
        			pw.print(wordtemp[j] + " ");
        		} else {
        			System.out.print(wordtemp[j]);
        			pw.print(wordtemp[j]);
        		}
        	}
        	System.out.println(" ");
        	pw.println(" ");
        	wordtemp = null;
        }

		fileScanner.close();
		pw.close();
	}
}