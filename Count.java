public class Count {
    public static void main(String[] args)
    {
        System.out.println("hello world");
        int total =0;
        for(int i=1; i<101; i++)
        {
           System.out.print(i);
           total+=i;
           if(i%2==1) System.out.println(" odd");
           else System.out.println(" even"); 
        
        }
        System.out.print("the total is "+ total);

    }
}
