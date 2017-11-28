/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementing.arrays;
import java.io.BufferedWriter;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author abiiaka
 */

public class ImplementingArrays {
    private static int[] RanArray;
    private static int[] CountArray;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // variables
        int num1 = output("Enter a number: ");
        int num2 = output("Enter number to start from: ");
        int num3 = output("Enter number to end to: ");
        
        File file1 = new File("numbers.txt"); 
        BufferedWriter output=null;
        try{
            
        output = new BufferedWriter(new FileWriter(file1));
        output.write("Start\n");
        //generating random array
        Random rand = new Random();
        RanArray = new int[1000];
        CountArray = new int[100];
        for(int i = 0; i < 1000; i++){
            RanArray[i] = rand.nextInt(100);
            CountArray[RanArray[i]]++;
        }
        
        //outputing array onto window
        for(int i = 0; i < 1000; i+=5){
        //    System.out.println(RanArray[i]+","+RanArray[i+1]+","+RanArray[i+2]
        //        +","+RanArray[i+3]+","+RanArray[i+4]);
        
        //outputting array into file
            output.write(RanArray[i]+","+RanArray[i+1]+","+RanArray[i+2]
                +","+RanArray[i+3]+","+RanArray[i+4]+"\n\r");
        }
        
         System.out.println("Number" + "\t" + "Times Repeated");
        for(int i = 0; i < 100; i++){
            
            System.out.println(i + "\t" + CountArray[i]);
        }
        }
        catch(IOException e){
            e.printStackTrace();
            }
        
        if(output != null){
            output.close();
        }
       System.out.println(num1+" - "+CountArray[num1]);
       
       for(int i = num2; i <= num3; i++){
          System.out.println(i+ " - "+CountArray[i]); 
       }
      
    }
    public static int output(String prompt) {
			return new Integer(JOptionPane.showInputDialog(prompt));
		}
}
