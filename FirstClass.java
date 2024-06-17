public class FirstClass {
    public static void main(String[] args) {
        int num =124,rem,rev=0,temp=num;

        for(;num>0;num/=10)
        {
            rem=num%10;
            rev=rev*10+rem;
        }
        if(temp==rev)
        {
            System.out.println("Palindrome");

        }
        else
            System.out.println(" Not Palindrome");
    }
}
