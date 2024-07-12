
import java.util.*;
public class shorting 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int array[]= new int[n];
        int odd[]= new int[n];
        int even[]= new int[n];
        int evencount=0,oddcount=0,finalcountodd=0,finalcounteven=0;
        int d=0;
        for( int i=0; i<n;i++)
        {
                        array[i]=in.nextInt();
                    }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
            if (array[j] > array[i])
            {
             int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
            }     
            }
        }
        for (int i = 0; i < n; i++) {
                    if(array[i]%2==0)
                    {
                        even[evencount]=array[i];
                        evencount=evencount+1;
                    }
                    else
                    if(array[i]%2!=0)
                    {
                    odd[oddcount]=array[i];
                    oddcount=oddcount+1;
                    }
        }
        for (int i = 0; i < oddcount/2; i++) {
            int temp = odd[i];
            odd[i]=odd[oddcount-i-1];
            odd[oddcount-i-1]=temp;
        }   
        for (int i = 0; i <n; i++) {
                    if(i%2!=0||i==1)
                    {
                        array[i]=even[finalcounteven];
                        finalcounteven=finalcounteven+1;
                    }
                    else
                    if(i%2==0||i==0)
                    {
                    array[i]=odd[finalcountodd];
                    finalcountodd=finalcountodd+1;
                    }
        }
        for (int i = 0; i < n ; i++)
        System.out.print(array[i]);
    }
}