import java.lang.String;

class String3 {

public static void main(String[] args)
    {
        String str1 = "Welcome to Java World";
        String str2 = "Welcome";
        
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2); 
       
     
        int result = str1.compareToIgnoreCase(str2);

      
        if (result < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is less than " +
                "\"" + str2 + "\"");
        }
        else if (result == 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is equal to " +
                "\"" + str2 + "\"");
        }
        else // if (result > 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " is greater than " +
                "\"" + str2 + "\"");
        }
    }
}