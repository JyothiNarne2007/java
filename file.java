import java.io.*;
class NoFreeSpaceException extends RuntimeException
{
	public String getMessage()
	{
		return "check sze of file";
	}
}
class concat
{
	public static void main(String args []) throws IOException
	{
		File f =new File("desktop\\20.jpeg");
		File f1 =new File("desktop\\red.txt");
	    long desktopspace= f.getTotalSpace();
		long fiftyspace = (desktopspace*50)/100;
		long freespace = f.getFreeSpace();
		System.out.println(f.length());
		System.out.println(f1.length());
		if(freespace >= fiftyspace)
		{
			if(f1.length() < 13000 )
			{
				System.out.println("file accepted");
			}
			else{
				System.out.println("file not accepted");
			}
			
		}
		else
		{
			throw new NoFreeSpaceException();
		}
	}
}
