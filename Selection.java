class Sort
{
  public static void SelectionSort(int arr[])
  {
    int n=arr.length;
    for(int i=0;i<n-1;i++)
    {
     int min_idx=i;
       for(int j=i+1;j<n;j++)
       {
         if(arr[j]<arr[min_idx])
         { 
           min_idx=j;
         }
       }
     int temp=arr[min_idx];
     arr[min_idx]=arr[i];
     arr[i]=temp;
    }
  }
  public static void main(String[]args)
  { 
    int arr[]={45,33,23,21,67};
    System.out.println("Unsorted Array");
    for(int i=0;i<arr.length;i++)
    {
     System.out.println(arr[i]+" ");
    }
    System.out.println();
    SelectionSort(arr);
    System.out.println("Sorted array");
    for(int i=0;i<arr.length;i++)
    {
    System.out.println(arr[i]+" ");
    }
  }
}
