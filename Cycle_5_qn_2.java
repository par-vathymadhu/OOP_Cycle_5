/**Write a Java program that displays the number of characters, lines and words in a text file.**/

import java.io.*;

public class Cycle_5_qn_2 
{
    public static void main(String args[])
    {
        try
        {
            FileReader f1=new FileReader("/Deskstop/Java/Cycle 5/textfile.txt");
            BufferedReader b=new BufferedReader(f1);
            int l=0,w=0,c=0;
            String s=b.readLine();
            while(s!=null)
            {
                l++;
                String[] word=s.split(" ");
                w=w+word.length;
                for(String i:word)
                {
                    c=c+i.length();
                }
                s=b.readLine();
            }
            System.out.println("No. of characters: "+c);
            System.out.println("No. of lines: "+l);
            System.out.println("No. of words: "+w);
        }
        catch(Exception e)
        {
            System.out.println("Exception occured");
        }
    }
}

/*

Output

Number of characters :51
Number of lines:3
Number of words :10
*/