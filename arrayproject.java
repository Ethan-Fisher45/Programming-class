public class arrayproject {
    public static void main(String[] args)
    {
        int[] count =new int[200];
        int total =0;
        for(int i=0; i<100; i++)
        {
           count[i]=i+1;
        
        }
        for(int i=0; i<count.length; i++)
        {
           System.out.print(count[i]);
           total+=count[i];
           if(count[i]%2==1) System.out.println(" odd");
           else System.out.println(" even"); 
        
        }
        System.out.print("the total is "+ total);
     
    }
    
}
