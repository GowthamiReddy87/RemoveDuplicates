public class RemoveDuplicatesFromUnSortedArray
{
public static void main(String[] args)
{

int arr[] = {3, 1, 2, 3, 1, 4};

        for (int i = 0; i < arr.length; i++) {
            boolean duplicate = false;

            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
