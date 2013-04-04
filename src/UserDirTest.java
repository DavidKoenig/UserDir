import java.io.IOException;


public class UserDirTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UserDir test = new UserDir();
		String userDirectory = System.getProperty("user.dir");
		
		try {
			test.listStatus(userDirectory);
		}
		catch ( IOException e) {
			System.out.println(e);
		}

	}

}
