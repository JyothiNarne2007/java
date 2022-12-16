import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
class password_validation
{
    
    public static void main(String [] args)
    {
        Scanner sc= new Scanner(System.in);
        String password = sc.nextLine();
        String l = "^(.*[A-Z])"+".*[a-z0-9]"+"*"+".{8,}";
        Pattern checking = Pattern.compile(l);
        Matcher mat =checking.matcher(password);
          if(mat.matches())
            {
                 System.out.println("pass");
            }
        else{    
       System.out.println("fail");}*/
       
    }
   
}
