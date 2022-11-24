class binarySearchv1
{
    int binarySearch(int arr[], int k)
    {
        int length = arr.length;
        int high = length;
        int low = 0;
        while(low<=high)
        {
            int mid= (low+high)/2;

            if (k==arr[mid])
            {
                return mid;
            }
            else if (k>arr[mid])
            {
                low=mid+1;
            }
            else if (k<arr[mid])
            {
                high=mid-1;
            }

        }
        return -1;
    }

    public static void main(String args[])
    {
        int arr[] = {2,4,6,8,10,12,14,16,18,20};
        //int k = 8;
        binarySearchv1 ob = new binarySearchv1();
        System.out.println(arr.length);
        int result=ob.binarySearch(arr,-8);
        if (result==-1)
            System.out.println("Not present in array");
        else
            System.out.println(result);
    }
}

