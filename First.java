// Assignment -2,Sollution -1
// Wap to find the duplicates present in an array 
public class First {
    public static void main(String[] args) {
        int []arr ={20,50,50,30,15,80,30};//50,30,
        int count =0;

        for (int i = 0;i<=arr.length-1;i++)
        {
            for (int j = i+1;j<arr.length;j++)
            {
                if (arr[i]==arr[j]){
                    count++;
                }

                }
                if (count==1)
                System.out.println(arr[i]);
                count =0;
            }
        }
    }

