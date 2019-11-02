package mavenProgect;
import org.apache.commons.lang3.ArrayUtils;

public class Sort {

	public static void main(String[] args) {
		System.out.println("this is sort!");

	}
	
	public  void SelectSort(int a[],int len)    //对数组进行选择排序
	{
		int begin = 0;
	    int end = len - 1;
	    int max = 0;
	    int min = 0;
	    while(begin < end)
	    {
	        max = begin;min = begin;
	        for(int i = begin;i <= end;i++)
	        {
	            if(a[i]>=a[max])
	            {
	                max = i;
	            }
	            if(a[i]>a[min])
	            {
	                min = i;
	            }
	        }
	        if(max == begin && min == end)
	        {
	            ArrayUtils.swap(a,max,end);
	            continue;
	        }
	 
	        if(max == begin)
	        {
	        	ArrayUtils.swap(a,max,end);
	        	ArrayUtils.swap(a,min,begin);
	            continue;
	        }
	 
	        if(min == end)
	        {
	        	ArrayUtils.swap(a,min,begin);
	        	ArrayUtils.swap(a,max,end);
	            continue;
	        }
	        ArrayUtils.swap(a,min,begin);
        	ArrayUtils.swap(a,max,end);
	        begin++;
	        end--;
	    } 
	}
	
	public int[] removeDuplicates(int a[],int len)   //删除数组中的重复元素
	{
		int b[] = {};
		if(ArrayUtils.isEmpty(a))
		{
			return b;
		}
		for(int i=len-1;i>=0;i--)
		{
			if(ArrayUtils.lastIndexOf(a, a[i], i-1)!=-1)
			{
				a = ArrayUtils.remove(a,i);
			}
			if(i==0)	break;
		}
		b=a;
		return b;
	}

}