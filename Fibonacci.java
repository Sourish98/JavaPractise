class Fibonacci {
    public static void main (String args[])
    {
        int i =1,num1=2,num2=1;
        for(i = 0;i<=6;i++)
        {
            
            System.out.print(num1+" ");
           int num3=num1+num2;    
            num1=num2;
            num2=num3;

                
        }
    }
}