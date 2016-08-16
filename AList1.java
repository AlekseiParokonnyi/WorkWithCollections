package NewList;

public class AList1 implements EList
{
	int[] ar = new int[10];
	int top = 0;
	
	@Override
	public void init(int[] ini)
	{
		if(ini == null)
		{
			ini = new int[0];
		}
		
		for(int i = 0; i < ini.length; i++)
		{
			ar[i] = ini[i];
		}
		top = ini.length;
	}
	
	@Override
	public int size()
	{
		return top;		
	}
	
	@Override
	public void clear()
	{
		top = 0;
	}
	
	@Override
	public int[] toArray()
	{
		int[] tmp = new int[top];
			
		for(int i = 0; i < top; i++)
		{
			tmp[i] = ar[i];
		}
		
		return tmp;
	}
	
	@Override
	public void addStart(int val)
	{
		if(top < ar.length - 1)
		{
			top++;
			
			for(int i = top - 1; i > 0; i--)
			{
				ar[i] = ar[i-1];
			}
			
			ar[0] = val;
		}
		else
		{
			int[] temp = new int[top * 13 / 10];
			
			top++;

			temp[0] = val;
			
			for(int i = 1; i < top; i++)
			{
				temp[i] = ar[i-1];
			}
			
			ar = temp;
		}
	}
	
	@Override
	public void addEnd(int val)
	{	
		if(top < ar.length - 1)
		{
			ar[top++] = val;
		}
		else
		{
			int[] temp = new int[top * 13 / 10];
			
			for(int i = 1; i < top; i++)
			{
				temp[i] = ar[i-1];
			}
			
			temp[top++] = val;
			
			ar = temp;
		}
	}
	
	@Override
	public void addPos(int pos, int val)
	{
		if(pos < 0 || pos > top)
		{
			throw new IllegalArgumentException();
		}
		
		if(top < ar.length - 1)
		{
			top++;
			
			for(int i = top - 1; i >= 0; i--)
			{
				if(i < pos)
				{
					ar[i] = ar[i];
				}
				else if(i == pos)
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
			int[] temp = new int[top * 13 / 10];
			
			top++;
		
			for(int i = 0; i < top; i++)
			{
				if(i < pos)
				{
					temp[i] = ar[i];
				}
				else if(i == pos)
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
		if(top == 0)
		{
			return;
		}
		
		for(int i = 1; i < top; i++)
		{
			ar[i-1] = ar[i];
		}
		
		top--;
	}
	
	public void delEnd()
	{
		if(top == 0)
		{
			return;
		}
		
		top--;
	}
	
	@Override
	public void delPos(int pos)
	{
		if(top == 0)
		{
			return;
		}
		
		if(pos < 0 || pos > top)
		{
			throw new IllegalArgumentException();
		}
		
		top--;
		
		for(int i = 0; i < top; i++)
		{
			if(i < pos)
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
		if(top == 0)
		{
			throw new IllegalArgumentException();
		}
		
		int min = ar[0];
		
		for(int i = 1; i < top; i++)
		{
			if(min > ar[i])
			{
				min = ar[i];
			}
		}
		
		return min;
	}
	
	@Override
	public int max()
	{
		if(top == 0)
		{
			throw new IllegalArgumentException();
		}
		
		int max = ar[0];
		
		for(int i = 1; i < top; i++)
		{
			if(max < ar[i])
			{
				max = ar[i];	
			}
		}
		
		return max;
	}
	
	@Override
	public int minInd()
	{
		if(top == 0)
		{
			throw new IllegalArgumentException();
		}
		
		int minInd = 0;
		
		for(int i = 1; i < top; i++)
		{
			if(ar[minInd] > ar[i])
			{
				minInd = i;
			}
		}
		
		return minInd;
	}
	
	@Override
	public int maxInd()
	{
		if(top == 0)
		{
			throw new IllegalArgumentException();
		}
		
		int maxInd = 0;
		
		for(int i = 1; i < top; i++)
		{
			if(ar[maxInd] < ar[i])
			{
				maxInd = i;
		
			}
		}
		
		return maxInd;
	}
	
	@Override
	public void set(int pos, int val)
	{
		if(pos < 0 || pos > top)
		{
			throw new IllegalArgumentException();
		}
		
		if(top == 0)
		{
			top++;
		}
		
		ar[pos] = val;
	}
	
	@Override
	public int get(int pos)
	{
		if(top == 0 || pos < 0 || pos > top)
		{
			throw new IllegalArgumentException();
		}
		
		return ar[pos];
	}
	
	@Override
	public void reverse()
	{
		if(top == 0)
		{
			return;
		}
		
		for(int i = 0; i < (top / 2); i++)
		{
			int temp = ar[top-1-i];
			ar[top-1-i] = ar[i];
			ar[i] = temp;
		}
	}
	
	@Override
	public void halfReverse()
	{
		if(top == 0)
		{
			return;
		}
		
		int ind = ((top % 2) > 0) ? 1 : 0;
		
		for(int i = 0; i < (top / 2); i++)
		{
			int temp = ar[i];
			ar[i] = ar[top/2 + ind + i];
			ar[top/2 + ind + i] = temp;
		}
	}
	
	@Override
	public void bubbleSort()
	{
		if(top == 0)
		{
			return;
		}

		for(int i = top - 1; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
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
