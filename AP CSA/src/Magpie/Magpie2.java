package Magpie;

import java.util.Date;

public class Magpie2
{
	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */
	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		String response = "";
		Date date = new Date();
		if (statement.indexOf("no") >= 0)
		{
			response = "Why so negative?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0
				|| statement.indexOf("brother") >= 0)
		{
			response = "Tell me more about your family.";
		}
		else if (statement.indexOf("last night") >=0)
		{
			response = "My mother and I talked last night.";
		}
		else if (statement.indexOf("yes") >= 0)
		{
			response = "I said no!";
		}
		else if (statement.indexOf("weather") >= 0)
		{
			response = "The weather is nice.";
		}
		else if (statement.indexOf("your bro") >= 0)
		{
			response = "Do you know my brother?";
		}
		else if (statement.indexOf("cat") >=0 || statement.indexOf("dog") >= 0)
		{
			response = "Tell me more about your pets.";
		}
		else if (statement.indexOf("Mr. Finkelstein") >= 0)
		{
			response = "He sounds like a good teacher";
		}
		else if (statement.indexOf("date") >= 0 || statement.indexOf("time") >= 0)
		{
			response = date.toString();
		}
		else if (statement.indexOf("Valentine's Day?") >= 0)
		{
			response = "February 14th";
		}
		else if (statement.indexOf("AP CSA room number") >= 0)
		{
			response = "F101";
		}
		else if ((statement.trim()).length() == 0)
		{
			response = "Say something, please.";
		}
		else
		{
			response = getRandomResponse();
		}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 5;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Meep.";
		}
		else if (whichResponse == 5)
		{
			response = "wot";
		}
		
		return response;
	}
}