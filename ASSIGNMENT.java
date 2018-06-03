import java.util.*;
class capital
{
        public static void main(String[] args)
        {
                int i;
                Scanner scan=new Scanner(System.in);
                System.out.println("Enter input string");
                String s=scan.nextLine();
                String[] s1=s.split(" ");
                for(String s2 : s1)
                {
                        char[] ch=s2.toCharArray();
                        for(i=0;i<ch.length;i++)
                        {
                                if(i%2==0)
                                        System.out.println(Character.toUpperCase(ch[i]));
                                else
                                        System.out.println(ch[i]);

                        }
                        System.out.println(" ");
                }
      }
}
