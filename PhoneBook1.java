import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneBook1
{
	public static Map<String, String> getPhoneNumber(Map<String, String> m, String[] names)
	{
		Map<String, String> m1=new LinkedHashMap<String, String>();
		String name="";
		String num="";
		Iterator<Map.Entry<String, String>> itr=m.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, String> entry=itr.next();
			for(int i=0;i<names.length;i++)
			{
				if(names[i].equals(entry.getKey()))
				{
					name=entry.getKey();
					num=entry.getValue();
				}
				m1.put(name, num);
			}
			
		}
		return m1;
	}
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number of entries..");
		int n=s.nextInt();
		String name;
		String num;
		String pattern="^[0-9]{10}+$";
		
		Map<String, String> map=new LinkedHashMap<String, String>();
		System.out.println("Enter "+n+" name and number..");
		for(int i=0;i<n;i++)
		{
			name=s.next();
			num=s.next();
			if(!num.matches(pattern))
			{
				System.out.println("Invalid mobile no. enter 10 digits");
				num=s.next();
			}
			map.put(name, num);
		}
		System.out.println(map);
		System.out.println("Enter number of entries for finding numbers..");
		int m=s.nextInt();
		String[] names=new String[m];
		System.out.println("Enter the names to find numbers..");
		for(int i=0;i<m;i++)
		{
			names[i]=s.next();
		}
		Map<String, String> map2=getPhoneNumber(map,names);
		System.out.println(map2);
		Iterator<Map.Entry<String, String>> itr=map2.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, String> entry=itr.next();
			for(int i=0;i<names.length;i++)
			{
				if(names[i].equals(entry.getKey()))
				{
					System.out.println("Number for "+entry.getKey()+" is "+entry.getValue());
				}
				else
				{
					System.out.println("Number for "+names[i]+" is not existing");
					break;
				}
			}
		}
	}
}

		