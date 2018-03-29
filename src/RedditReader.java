import java.io.*;
import java.util.Scanner;
public class RedditReader {

	File redditPosts= new File("redditPosts.txt");
	String linetoAnalyze;

	boolean detectKeyword1(String linetoAnalyze) 
	{
		String linetoAnalyzeLC = linetoAnalyze.toLowerCase();
		if (linetoAnalyzeLC.contains(keyword1)) {
			return true;

		}
		else
		{
			return false;
		}
	}

	boolean detectKeyword2and3(String linetoAnalyze)
	{ 
		String linetoAnalyzeLC = linetoAnalyze.toLowerCase();
		if (linetoAnalyzeLC.contains(keyword2) && linetoAnalyzeLC.contains(keyword3)){
			return true;
		}
		else
		{
			return false;
		}
	}


	//method to count how many times one keyword is found in the reddit post
	void getNumKeyword1(){
		int kCount1 = 0;
		try 
		{
			FileReader myFileReader = new FileReader("redditPosts.txt");
			BufferedReader myBufferedReader = new BufferedReader(myFileReader);
			String line = null;
			while((line=myBufferedReader.readLine())!= null) {
				if (detectKeyword1(line) == true) {
					kCount1++;

				}


			}
			System.out.println("The number of times " + keyword1 + " appeared is: " + kCount1);
		catch(Exception ex) {
			System.out.println("The file could not be read.");
		}
		
		
	}


	void getNumKeyword2and3() {
		int kCount2and3 = 0;
		try
		{
			FileReader myFileReader = new FileReader("redditPosts.txt");
			BufferedReader myBufferedReader = new BufferedReader(myFileReader);
			String line = null;
			while((line=myBufferedReader.readLine())!=null) {
				if (detectKeyword2and3(line) == true) {
					kCount2and3++;
				}
			}
			System.out.println("The number of times " + keyword2 + " and " + keyword3 + "appeared in the same line is: " + kCount2and3);
	catch(Exception ex) {
		System.out.println("The file could not be read.");
	}
		}
	}
}



