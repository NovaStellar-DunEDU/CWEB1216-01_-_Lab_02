package personalDetail;

import java.util.Scanner;
import java.util.Arrays;

public class PersonalDetails
{
	
	public static void main(String[] args) 
	{
		String[] size = new String[3];
		Scanner myScan = new Scanner(System.in);
		User newUser = new User();
		
		for (int i = 0; i < size.length; i++) 
		{
			System.out.println(newUser.Questions()[i]);
			size[i] = myScan.nextLine();
			newUser.setDetails(size);
			System.out.println("");
			
			String[] display = newUser.DisplayInfo();
			
			if (i == 1) {
				System.out.println(display[0]);
				System.out.println("");
			}
			if (i == 2) {
				System.out.println(display[1]);
				System.out.println(display[2]);
			}
		}
					
		myScan.close();

		}
	}

class User
{
	public String[] userDetails = new String[3], promptedQuestions = new String[3], displayDetail = new String[3];
	
	public String[] setDetails(String[] userDetails)
	{
		for(int r = 0; r < userDetails.length; r++) 
		{
			this.userDetails[r] = userDetails[r];
		}
		return userDetails;
	}

	public String[] DisplayInfo() 
	{
		String[] displayDetail = new String[3];
		
			displayDetail[0] = "Name: " + userDetails[0] + ", Age: " + userDetails[1];
			
			if (userDetails[1] != null && !userDetails[1].isEmpty()) {
				int x = 65;
				int y = Integer.parseInt(userDetails[1]);
				
				int z = x - y;
				
				displayDetail[1] = "Name: " + userDetails[0] + ", Age: " + userDetails[1] + ", Hobby: " + userDetails[2];
				displayDetail[2] = userDetails[0] + " will retire in " + z + " years.";
			}
			
		return displayDetail;
	}
	
	public String[] Questions() 
	{
		promptedQuestions = new String[3];
		
		promptedQuestions[0] = ("Enter your name: ");
		promptedQuestions[1] = ("Enter your age: ");
		promptedQuestions[2] = ("Enter your hobby: ");
		
		return promptedQuestions;
	}
}