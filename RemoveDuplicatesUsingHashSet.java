import java.util.HashSet;
public class RemoveDuplicatesUsingHashSet
{
public static void main(String[] args)
{
int arr[]={1,2,2,3,3};
HashSet<Integer> set=new HashSet<>();
for(int i=0;i<arr.length;i++)
{
set.add(arr[i]);
}
for(int x:set)
{
System.out.print(x+" ");
}
}
}
