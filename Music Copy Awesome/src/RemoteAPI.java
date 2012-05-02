import java.util.*;
import java.io.*;
import java.io.File;


public class RemoteAPI
{
	private FileTransfer m_fileTransfer = null;
	//Properties
	public FileTransfer getFileAPI()
	{
		if(m_fileTransfer == null)
		{
			m_fileTransfer = new FileTransfer();
		}
		return m_fileTransfer;
	}
	//Properties End
	
	public int filesCount(String folderPath,String extension)
	{
		int ret = 0;
		File folder = new File(folderPath);
		if(folder.exists())
		{
			File[] files = folder.listFiles();
			for (int i =0; i< files.length; i++)
			{
				if(files[i].getName().endsWith(".mp3") || files[i].getName().endsWith(".MP3"))
				{
					ret ++;
				}
			}
			return ret;
		}
		return ret;
	}

}


class FileTransfer
{
	void SendFile()
	{
		
	}
	
	void RevcFile()
	{
		
	}
}

class BackGroundAsyncFileSend extends Thread 
{
	public void run()
	{
		
	}
}