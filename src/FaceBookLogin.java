import org.testng.annotations.Test;

public class FaceBookLogin {
	
	@Test
	public void loginWithValidCredentials() {
		System.out.println("Hi, I am seccessfully Logged-in");
	}
	
	@Test
	public void loginWithInvalidCredentials() {
		System.out.println("Hi, I am not able to Log-in");
	}
	
	@Test
	public void loginWithInValidUserName() {
		System.out.println("Hi, I am not unable to Log-in");
	}

}
