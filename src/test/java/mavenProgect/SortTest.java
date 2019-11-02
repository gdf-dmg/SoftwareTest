package mavenProgect;

import org.junit.Assert;
import org.junit.Test;

public class SortTest {
	
	@Test
	public void test_SelectSort()
	{
		int[] str = {5,4,3,2,1};
		int[] right = {1,2,3,4,5};
		Sort s = new Sort();
		s.SelectSort(str,5);
		Assert.assertArrayEquals(str,right);
	}
	
	@Test
	public void test_removeDuplicates()
	{
		int[] str = {1,1,2,2,3,4,4,5};
		int[] right = {1,2,3,4,5};
		Sort s = new Sort();
		int[] str1 = s.removeDuplicates(str, 8);
		Assert.assertArrayEquals(str1,right);
	}

}

