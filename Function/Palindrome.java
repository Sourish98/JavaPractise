package Function;

public class Palindrome {
    
    public static int palinCheck(int num2)
    {
        int rem,add=0;
        while(num2>0)
        {
            rem=num2%10;
            add=(add*10)+rem;
            num2=num2/10;
        }
        return add;
    }

public static void main(String[] args) {
    int num1=491,temp=num1;
    
    int call=palinCheck(num1);
    if(temp==call)
    {
        System.out.println("It is a palindrome");
    }
    else 
    {
        System.out.println("It is  not ");
    }

}

}
