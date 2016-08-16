package NewList;

public class AList2 implements EList
{
	int[] ar = new int[30];
	int start = 15;
	int end = 15;
	
	@Override
	public void init(int[] ini)
	{
		if(ini == null)
		{
			ini = new int[0];
		}
		
		start = ar.length/2 - ini.length/2;
		
		for(int i = 0; i < ini.length; i++)
		{
			ar[i+start] = ini[i];
		}
		
		end = start + ini.length;		
	}

	@Override
	public int size()
	{		
		return end - start;
	}

	@Override
	public void clear()
	{
		end = start = ar.length/2;		
	}

	@Override
	public int[] toArray()
	{
		int[] tmp = new int[size()];
		
		for (int i = 0; i < tmp.length; i++) 
		{
			tmp[i] = ar[i+start];
		}
		
		return tmp;
	}

	@Override
	public void addStart(int val)
	{
		ar[--start] = val;		
	}

	@Override
	public void addEnd(int val)
	{
		ar[end++] = val;
	}

	@Override
	public void addPos(int pos, int val)
	{
		if(pos < 0 || pos > size())
		{
			throw new IllegalArgumentException();
		}
		
		if(end < ar.length - 1)
		{
			end++;
			
			for(int i = end - 1; i >= start; i--)
			{
				if(i < (pos + start))
				{
					ar[i] = ar[i];
				}
				else if(i == (pos + start))
				{
					ar[i] = val;
				}
				else
				{
					ar[i] = ar[i-1];
				}
			}
		}
		else
		{
			int[] temp = new int[(end - start) * 13 / 10];
			
			start = temp.length/2 - (ar.length + 1) / 2;
			
			end = start + ar.length + 1;
		
			for(int i = end - 1; i >= start; i--)
			{
				if(i < (pos + start))
				{
					temp[i] = ar[i];
				}
				else if(i == (pos + start))
				{
					temp[i] = val;
				}
				else
				{
					temp[i] = ar[i-1];
				}
			}
			
			ar = temp;
		}
	}

	@Override
	public void delStart() 
	{
		if((end - start) != 0)
		{
			start++;
		}
		
	}

	@Override
	public void delEnd()
	{
		if((end - start) != 0)
		{
			end--;
		}
	}

	@Override
	public void delPos(int pos)
	{
		if(end == start)
		{
			return;
		}
		
		if(pos < 0 || (pos + start) > end)
		{
			throw new IllegalArgumentException();
		}
		
		end--;
		
		for(int i = start; i < end; i++)
		{
			if(i < (pos + start))
			{
				ar[i] = ar[i];
			}
			else
			{
				ar[i] = ar[i+1];
			}
		}
		
	}

	@Override
	public int min()
	{
		if((end - start) == 0)
		{
			throw new IllegalArgumentException();
		}
		
		int min = ar[start];
		
		for(int i = 1; i < (end - start); i++)
		{
			if(min > ar[i+start])
			{
				min = ar[i+start];
			}
		}
		
		return min;
	}

	@Override
	public int max()
	{
		if((end - start) == 0)
		{
			throw new IllegalArgumentException();
		}
		
		int max = ar[start];
		
		for(int i = 1; i < (end - start); i++)
		{
			if(max < ar[i+start])
			{
				max = ar[i+start];	
			}
		}
		
		return max;
	}

	@Override
	public int minInd()
	{
		if((end - start) == 0)
		{
			throw new IllegalArgumentException();
		}
		
		int minInd = 0;
		
		for(int i = 1; i < (end - start); i++)
		{
			if(ar[minInd+start] > ar[i+start])
			{
				minInd = i;
			}
		}
		
		return minInd;
	}

	@Override
	public int maxInd()
	{
		if((end - start) == 0)
		{
			throw new IllegalArgumentException();
		}
		
		int maxInd = 0;
		
		for(int i = 1; i < (end - start); i++)
		{
			if(ar[maxInd+start] < ar[i+start])
			{
				maxInd = i ;
		
			}
		}
		
		return maxInd;
	}

	@Override
	public void set(int pos, int val)
	{
		if(pos < 0 || (pos + start) > end)
		{
			throw new IllegalArgumentException();
		}
		
		if((end - start) == 0)
		{
			end++;
		}
		
		ar[pos+start] = val;
		
	}

	@Override
	public int get(int pos)
	{
		if((end - start) == 0 || pos < 0 || pos > (end - start))
		{
			throw new IllegalArgumentException();
		}
		
		return ar[pos+start];
	}

	@Override
	public void reverse()
	{
		if((end - start) == 0)
		{
			return;
		}
		
		for(int i = 0; i < ((end - start) / 2); i++)
		{
			int temp = ar[end-1-i];
			ar[end-1-i] = ar[i+start];
			ar[i+start] = temp;
		}
		
	}

	@Override
	public void halfReverse()
	{
		if((end - start) == 0)
		{
			return;
		}
		
		int ind = (((end - start) % 2) > 0) ? 1 : 0;
		
		for(int i = 0; i < ((end - start) / 2); i++)
		{
			int temp = ar[i+start];
			ar[i+start] = ar[(end - start)/2 + start + ind + i];
			ar[(end - start)/2 + start + ind + i] = temp;
		}
	}

	@Override
	public void bubbleSort()
	{
		if((end - start) == 0)
		{
			return;
		}

		for(int i = end - 1; i > start; i--)
		{
			for(int j = start; j < i; j++)
			{
				if(ar[j] > ar[j+1])
				{
					int temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
			}
		}
	}

}
