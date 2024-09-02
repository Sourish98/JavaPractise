package Function;

public class DectoBin {
    static int[] rem =new int [1000];
    static int i=0;

 public static int [] calculateBinary(int num)
{


    {
     int i=0;

        
            while(num>0)
            {
            
        rem[i]=num%2;
        num=num/2;
        
                i++;
            
        }
        for(int j=i-1;j>=0;j--)
        {
            System.out.print(rem[j]);
        }
        }
return rem;

    }
public static void main(String[] args) {
  int rem2[] = calculateBinary(255);
  for(int k=0;k<rem[i]-1;k++)
  {
    System.out.println(rem2[k]);
  }

}
}


    

