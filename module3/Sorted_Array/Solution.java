import java.util.*;
public class Solution
{
    public static void main(String[] args) 
    {
        int m, n, k, i = 0, flag = 0;
        Scanner s = new Scanner(System.in);
        
        m = s.nextInt();
        
        n = s.nextInt();
        k = m;
        int a[] = new int[m];
        int b[] = new int[n];
        int c[] = new int[m+n];
        
        for(i = 0; i < m; i++)
        {
            a[i] = s.nextInt();
			
        }
        
        for(i = 0; i < n; i++)
        {
            b[i] = s.nextInt();
			
        }
        for(i = 0; i < m; i++)
        {
            c[i] = a[i];
        }
        for(i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(b[i] != a[j])
                {
                    flag = 1;
                }
                else
                {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
            {
                c[k] = b[i];
                k++;
            }
        }
        
        for(i = 0; i < k - 1; i++)
        {
			Arrays.sort(c);
            System.out.print(c[i]+",");
        }
        System.out.print(c[k-1]);
        System.out.println("");
        int p = 0;
        for(i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
            {
                if(b[i] == a[j])
                {
                    flag = 1;
                    break;
                }
                else
                {
                    flag = 0;
                }
            }
         
        }
  }
}
	
