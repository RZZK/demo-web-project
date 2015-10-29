import org.junit.Test;

import edu.csupomona.cs480.data.User;

public class userTest 
{
	private WebController webController = new WebController();
	private User u = new User();
	
	@Test
	public void testUser()
	{
		User user = new User();
		user.setId("DummyId");
		user.setMajor("DummyMajor");
		user.setName("DummyName");
		
		user = webController.getUser("DummyUser");
		assertEquals("DummyId", user.getId());
		assertEquals("DummyMajor", user.getMajor());
		assertEquals("DummyName", user.getName());
		webController.deleteUser("DummyId");
	}
}