/*Write a Java program that reads a file and displays the file on the screen, with a line number
before each line by handling all file related exceptions. */

import java.io.*;

class Cycle_5_qn_1
{
    public static void main(String args[])
    {
        try
        {
            FileReader f1= new FileReader("/Desktop/Java/Cycle 5/textfile.txt");
            BufferedReader b1= new BufferedReader(f1);
            int j=1;
            String s=b1.readLine();
            while(s!=null)
            {
                System.out.println(j+".");
                System.out.print(s);
                s=b1.readLine();
                System.out.println();
                j++;
            }
        }
            catch(Exception e)
            {}
    }
}

/**
Output

1. Hi all,
2. Welcome to the world of programming
3. let us start.

 */