package utilities;

import java.nio.charset.Charset;
import java.util.Random;

import com.github.javafaker.Faker;

public class GenerateFakeTestData {
	private String email;
	private String firstname;
	private String lastname;
	private String password;
	private String companyName;
	
	Faker fakeobj=new Faker(); 
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	 public static String getAlphaNumericString(int n) {
			// length is bounded by 256 Character
			byte[] array = new byte[256];
			new Random().nextBytes(array);

			String randomString = new String(array, Charset.forName("UTF-8"));

			// Create a StringBuffer to store the result
			StringBuffer r = new StringBuffer();

			// Append first 20 alphanumeric characters
			// from the generated random String into the result
			for (int k = 0; k < randomString.length(); k++) {

				char ch = randomString.charAt(k);

				if (((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9')) && (n > 0)) {

					r.append(ch);
					n--;
				}
			}

			// return the resultant string
			return r.toString();
		}

	
	
	

}
