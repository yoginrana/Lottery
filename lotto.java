import java.util.Scanner; 
import java.util.ArrayList; 
import java.util.List; 
import java.util.Arrays;  
public class lotto 
 { 
   public static void main(String args[]) 
    { 
       Integer[] numarray = new Integer[7];
       Integer[] randarray = new Integer[7]; 
       List<Integer> list1 = new ArrayList<Integer>(); 
       List<Integer> list2 = new ArrayList<Integer>(); 
       int userin = 0;   
       int same = 0; 
      
       System.out.println("Enter your numbers betweeen 1 and 49"); 
       Scanner input = new Scanner(System.in); 
       for(int i=0; i<7; i++) 
       { 
           userin = input.nextInt(); 
           randarray[i] = (int)Math.ceil(Math.random()*49);
           for (int x=0; x<i; x++){ 
               if (userin == numarray[x] ){ 
                 userin = 999999; 
                 } 
               if (randarray[i] == randarray[x]){ 
                 randarray[i] = (int)Math.ceil(Math.random()*49); 
                 x = 0; 
                 } 
            } 
            if (userin>49||userin<0){ 
               System.out.println("The number in position " + (i+1) + " is not valid please re-enter"); 
                i = i-1; 
             }else{ 
               numarray[i] = userin;
           } 
        }  
       list1 = Arrays.asList(randarray); 
       list2 = Arrays.asList(numarray); 
       System.out.println("The winning lotto numbers are " + list1); 
       for (Object o : list1) {   
           if (list2.contains(o)) { 
              same = same + 1; 
           }  
         }       
       switch (same){       
           case 3:                                      
           System.out.println("You won £10"); 
           break; 
            case 4:                                      
            System.out.println("You won £100"); 
            break; 
            case 6: 
            System.out.println("You won £1,000,000");     
            break; 
            case 7: 
            System.out.println("You won £1,000,000");   
         } 
        if (same == 5 && numarray[6] == randarray[6]){  
            System.out.println("You won £100,000"); 
        }else if(same == 5){ 
           System.out.println("Yous won £10,000"); 
        }else if(same < 3){ 
             System.out.println("You won £0!"); 
       }      
     }  
 } 
