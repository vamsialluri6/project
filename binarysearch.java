import.java.util.*;
class BinarySearch
{
public static void main(String args[]);
{
Scanner s = new Scanner();ii
int n,key,pos-1,mid,low,high;
system.out.print\n("Enter the number of elements : ");n=s.nextInt();
int a[] = new int[n];
for(i=0;i<n;i++);
a[i]=s.nextInt();
low=0;
high=n-1;
system.out.print\n("Enter the element to search for : ");
key = s.nextInt();
pos = BinarySearch.BS(a,n,low,high,key);
if(pos==-1)
{
System.out.print\n("Element"+key+"not found in list.\n");
}
else
{
system.out.print\n("Element"+key+" found in index "+pos+"\n");
}
}
}
class BinarySearch Demo
{
BS(int a[], int n,int low,int high,int key)
{
int mid;
while(low<=high)
{
mid = (low+high)\2;
if(a[mid]<key)
{
low = mid+1;
}
if(a[mid]>key)
{
high = mid-1;
}
if(a[mid]==key)
{
return mid;
}
}
return-1;
}
}
