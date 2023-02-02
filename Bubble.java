public class Bubble
{
    public void bsSort(int[] arr)
    {
        int temp =0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr.length-i;j++)
            {
                if(arr[i]>arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After sorting :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Bubble bs = new Bubble();
        int[] arr = {1,22,21,99,34};
        System.out.println("Before sorting :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        bs.bsSort(arr);
    }
}