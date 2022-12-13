//Ethan Fisher 12/13/22
//Array Project
//For Mr. Gross Programming class
public class arrayproject {
    public static void main(String[] args)
    {

        int[] count =new int[100];//initializing the array count
        int total =0;// this is the total sum of all the numbers
        for(int i=0; i<100; i++)
        {
           count[i]=i+1;//assigning the numbers 1-100 to array
        
        }
        for(int i=0; i<count.length; i++)//count.length is the length of the array we created and will work with any length
        {
           System.out.print(count[i]);
           total+=count[i];
           if(count[i]%2==1) System.out.println(" odd");//testing for even or odd
           else System.out.println(" even"); 
        
        }
        System.out.print("the total is "+ total);//printing out the total of all the elements of the array
     
    }
    
}
