/**Write a java program that writes your name and address into a file with help of file writer
class and read the contents from file and display in the console using appropriate reader
class.**/

import java.io.*;
import java.util.*;

class Cycle_5_qn_3
{
    public static void main(String args[])
    {
        try
        {
            FileWriter fw=new FileWriter("/Deskstop/Java/Cycle 5/textfile.txt");
            FileReader fr=new FileReader("/Deskstop/Java/Cycle 5/textfile.txt");      
            fw.write("Name:Parvathy Madhu\n");
            fw.write("Address:Kalady\n");
            fw.close();
            int i;
            while((i=fr.read())!=-1)
            {
                System.out.print((char)i); 
            }
            fr.close();
        }
        catch(Exception e)
        {
            System.out.println("Exception occured");
        }
    }
}

