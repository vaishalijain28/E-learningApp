package Enhance;

public class Test {
	public int TestId;
	public String username;
	public String password;

	public void setTestId(int TestId) {
		this.TestId = TestId;
	}

	public int getTestId() {
		return TestId;
	}

	public void setusername(String username) {
		this.username = username;
	}

	public String getusername() {
		return username;
	}

	public void setpassword(String password) {
		this.password = password;
	}

	public String getpassword() {
		return password;
	}

	public void display() {
		System.out.println("Test Id:" + TestId);
		System.out.println("Username:" + username);
		System.out.println("Password:" + password);

	}

	public static void main(String args[]) {

	}
}