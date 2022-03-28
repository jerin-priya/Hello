
package file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;


public class FileDemo {
    public static void main(String[] args) {
        File dir = new File("C:/Users/user/Desktop/Student");
        dir.mkdir();
        String path= dir.getAbsolutePath();
        System.out.println(path);
        
        File file1 = new File (path+ "/Result.txt");
         File file2 = new File (path+"/OthersActivities.txt");
         
         try{
             file1.createNewFile();
             file2.createNewFile();
             System.out.println("Files are created");
         }catch(Exception e){
             System.out.println(e);
         }
         
         String id,name;
         try{
            Formatter formatter = new Formatter("C:/Users/User/Desktop/Student/Result.txt");
            
            Scanner input = new Scanner(System.in);
             System.out.println("How many students : ");
             int num=input.nextInt();
             
            for(int i=0;i<num;i++){
                System.out.println("Enter students id and name : ");
             id=input.next();
             name=input.next();
             formatter.format("%s %s\r\n",id,name);
            }
            
            /*formatter.format("%s %s\r\n","101","Anika");
       
            formatter.format("%s %s\r\n","102","Samira");*/
            
            formatter.close();
                }catch(FileNotFoundException e){
                    System.out.println(e);
                }
         
       /* String dirlocation=dir.getAbsolutePath();
        System.out.println(dirlocation); //location print korbe
        System.out.println(dir.getName()); //file er nam print korbe
        if(dir.delete()){
            System.out.println(dir.getName()+" file has been deleted"); //file ta delete kore dibe
        }*/
       ////
    }
}




