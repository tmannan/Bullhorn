import static org.junit.Assert.*;

import org.junit.Test;

import customTools.DbUser;
import model.Bhuser;

public class Bhusertest {

	@Test
	public void test() {
		assertTrue(1 == 1);
	}
	@Test
	public void getUserTest() {
		Bhuser testUser = DbUser.getUserByEmail("user2@domain.com");
		assertTrue(testUser.getBhuserid() == 2);
	}

}
