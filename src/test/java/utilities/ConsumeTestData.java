package utilities;

import java.nio.charset.Charset;
import java.util.Locale;
import java.util.Random;

import com.github.javafaker.Faker;

public class ConsumeTestData {
	//just edit for push request thats it for github

	public static void main(String[] args) {
        //just edit for github push request
		// create object for the faker class
		Faker fakeobj2=new Faker();
		GenerateFakeTestData gfd=new GenerateFakeTestData();
		
		String firstName=fakeobj2.address().firstName();
		 gfd.setFirstname(firstName);
		//System.out.println("firstname is "+gfd.getFirstname()); or also we can print name using getmethod
	    System.out.println("firstname is "+firstName);
	    
	    String lastName=fakeobj2.address().lastName();
		System.out.println("lastName is "+lastName);
	    gfd.setLastname(lastName);
	    
	    String email=fakeobj2.internet().emailAddress();
		System.out.println("email  is "+email);
	    gfd.setLastname(email);
	    
	    
	    String company=fakeobj2.company().name();
		System.out.println("company  is "+company);
	    gfd.setLastname(company);
	    
	    String password=gfd.getAlphaNumericString(8);
		System.out.println("password  is "+password);
	    gfd.setLastname(password);
	    
	    
	 // Create an object of Faker class with default locale i.e india
	 		Faker faker = new Faker(new Locale("en-IND"));
	 		// To generate valid random first name
	 		System.out.println("First name is: "+faker.name().firstName());
	 		// To generate valid random last name
	 		System.out.println("Last name is: "+faker.name().lastName());
	 		// To generate valid random city name
	 		System.out.println("City name is: "+faker.address().cityName());
	 		// To generate valid random state name
	 		System.out.println("State name is: "+faker.address().state());
	 		// To generate valid random country name
	 		System.out.println("Country name is: "+faker.address().country());
	 		// To generate valid random cell number
	 		System.out.println("Cell number is: "+faker.phoneNumber().cellPhone());
	 		// To generate valid random animal name
	 		System.out.println("Animal name is: "+faker.animal().name());
				
	}

}
