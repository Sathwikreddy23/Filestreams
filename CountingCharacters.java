package Streams;

import java.util.Scanner;
import java.util.HashMap;

public class CountingCharacters 
{
	public CountingCharacters(String a)
	{
		HashMap<Character,Integer> map = new HashMap<>();
		
		a = a.replaceAll(" ","");
		
		for(char ch: a.toCharArray())
		{
			map.put(ch,map.getOrDefault(ch,0)+1);
		}
		
		for(char ch : map.keySet())
		{
			System.out.println(ch+"->"+map.get(ch));
		}
		
		
		
	}

}
