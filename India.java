import java.util.Scanner;

class India
{
   public static void main(String ar[])
    {
      Scanner sc = new Scanner(System.in);
      int i,n,j,t;
      
      System.out.println("ENTER SIZE OF ARRAY");
      n = sc.nextInt();
      int a[] = new int[n];

      System.out.println("ENTER ELEMENTS");
      for(i=0;i<n;i++){
         a[i] = sc.nextInt();
      }

      System.out.print("BEFORE SORTING ARRAY : ");
      for(i=0;i<n;i++){
         System.out.print(a[i]+"  ");
      }

      for(i=0;i<n-1;i++){
         for(j=0;j<n-i-1;j++){
            if(a[j]>a[j+1]){
                t = a[j];
               a[j] = a[j+1];
               a[j+1] = t;
            }
         }
      }
      System.out.print("AFTER SORTING ARRAY : ");
      for(i=0;i<n;i++){
         System.out.print(a[i]+"  ");
      }
      sc.close();

    }
}

