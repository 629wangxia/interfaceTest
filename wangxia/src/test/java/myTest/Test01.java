package myTest;
import org.testng.annotations.*;

public class Test01 {
	
	@BeforeClass
	public void setUp() {
		
	}
	
	@Test
	public void login() {
		System.out.print("helloworld!");
	}

}
