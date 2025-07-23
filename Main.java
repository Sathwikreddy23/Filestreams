package Streams;

import java.util.Scanner;

public class Main 
{

	public static void main(String[] args) 
	{
		
		ByteFileHandler byteHandler = new ByteFileHandler();
        byteHandler.writeAndReadByteStream();

   
        CharFileHandler charHandler = new CharFileHandler();
        charHandler.writeAndReadCharStream();
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("please enter a string");
        
        String a = sc.nextLine();
        
        CountingCharacters c = new CountingCharacters(a);
        
        
	}
}