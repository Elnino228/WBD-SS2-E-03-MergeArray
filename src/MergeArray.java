public class MergeArray {
    public static void main(String[] args) {
        int[] arr1={1,2,3,4};
        int[] arr2={5,6,7,8};
        int[] arr3=new int[arr1.length+arr2.length];
        //print array 1
        System.out.println("Array 1:");
        for (int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]+"\t");
        }
        //print array 2;
        System.out.println("Array 2: ");
        for (int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]+"\t");
        }
        // merge array
        for (int i=0;i<arr1.length;i++){
            arr3[i]=arr1[i];
        }
        for (int i=arr1.length;i<arr3.length;i++){
            arr3[i]=arr2[i-arr1.length];
        }
        //print array 3
        System.out.println("Array 3: ");
        for (int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]+"\t");
        }

    }
}
