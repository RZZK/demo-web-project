import org.junit.*;

public class TestWebController {
	private WebController wc = new WebController();
	
	@Test
	public void getUserTest(){
		wc.addUser("Test");
		User  u = wc.getUser("Test");
		assertEquals("Test",u.getId());
		wc.removeUser("Test");
	}
}