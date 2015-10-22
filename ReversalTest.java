import static org.junit.Assert.*;
import java.io.*;
import org.junit.*;
import java.io.File;
import java.util.Scanner;

public class ReversalTest {
	
	private final String EOL = System.getProperty("line.separator");
	
	@Test
	public void test01() throws IOException{
		File input = File.createTempFile("joke", ".txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(input));
		bw.write("Knock Knock" + EOL + 
				"Who is there?" + EOL + 
				"Doctor" + EOL + 
				"Doctor who?" + EOL + 
				"(Buh-Dum tss)" + EOL);
		bw.close();
		
		File output = File.createTempFile("output", ".txt");
		Reversal.reverseFile(input, output);
		
		String expected = "tss) (Buh-Dum " + EOL +
						  "who? Doctor " + EOL +
						  "Doctor " + EOL +
						  "there? is Who " + EOL +
						  "Knock Knock " + EOL;
		
		Scanner fileScanner = new Scanner(output);
		String actual = new String();
		while (fileScanner.hasNextLine()){
        	actual += fileScanner.nextLine() + EOL; 
        }
		fileScanner.close();	
		assertEquals("Didn't work.", expected, actual);
	}
	
	@Test
	public void Test02(){
		new Reversal();
	}
}
