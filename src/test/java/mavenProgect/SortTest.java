package mavenProgect;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {
	
	@Test
	public void test_SelectSort()
	{
		boolean i;
		int[] str = {5,4,3,2,1};
		int[] right = {1,2,3,4,5};
		Sort s = new Sort();
		s.SelectSort(str,5);
		if(Arrays.equals(str, right))
		{
			i=true;
			System.out.println(str);
		}
		else
		{
			i=false;
		}
		Assert.assertTrue(i);
	}
	
	@Test
	public void test_removeDuplicates()
	{
		boolean i;
		int[] str = {1,1,2,2,3,4,4,5};
		int[] right = {1,2,3,4,5};
		Sort s = new Sort();
		int[] str1 = s.removeDuplicates(str, 8);
		if(Arrays.equals(str1, right))
		{
			i=true;
			System.out.println(str1);
		}
		else
		{
			i=false;
		}
		Assert.assertTrue(i);
	}

}

