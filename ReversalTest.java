import static org.junit.Assert.*;
import java.io.*;
import org.junit.*;

public class ReversalTest {
	
	private final String EOL = System.getProperty("line.separator");
	
	private static PrintStream console;
	private static InputStream keyboard;
	private static ByteArrayOutputStream out;
	
	@BeforeClass
	public static void beforeTestsBegin(){
		console = System.out;
		out = new ByteArrayOutputStream();
		System.setOut(new PrintStream(out));
		keyboard = System.in;
	}
	
	@AfterClass
	public static void afterTestsEnd() {
		System.setOut(console);
		System.setIn(keyboard);
	}
	
	@After
	public void afterEachTest() {
		out.reset();
	}
	private void setInput(String anInput){
		ByteArrayInputStream in = new ByteArrayInputStream(anInput.getBytes());
		System.setIn(in);
	}
	private String getOutput(){
		return out.toString();
	}
	
	
	
	@Test (expected = java.io.FileNotFoundException.class)
	public void ExceptionTest(){
		String input = "";
		setInput(input);
	}
	
	
	@Test
	public void test01(){
		String input = "test";
		setInput(input);
		
		Reversal.main(null);
		
		String expected = "Bob. am I" + EOL +
						  "you? are how Hello,";
		String actual = getOutput();
		assertEquals("incorrect result", expected, actual);
	}
	
	
	
	
	
	
	
	
	
	
	
/*	
	@Test
	public void test() {
		String openfile = "test";
		Reversal.main();
		String expected = "Bob. am I" + EOL + 
						  "you? are how Hello,";
		String actual = getOutput();
		assertEquals("This isn't right.", expected, actual);
	}
*/
	
}
