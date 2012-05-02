import java.util.*;
import java.io.*;


public class MusicCopy
{
	public static void main (String[] argc)
	{  
		if(argc.length == 2)
		{
			Settings.sourceOfFile = argc[0];
			Settings.destinationFile = argc[1];
		}
		else
		{
			System.exit(0);
		}
		
		Thread m_thread = new MainProgramThread();
		m_thread.start();
	}
}


class MainProgramThread extends Thread
{
	public void run()
	{
		System.out.println("I am in a new thread you dumb prick");
		RemoteAPI remApi = new RemoteAPI();
		int count = remApi.filesCount(Settings.sourceOfFile,".mp3");
		remApi.getFileAPI().SendFile();
		
		System.out.println("Number of files in folder is = "+ count);
		
	}
}