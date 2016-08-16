package NewList;

public class AList0 implements EList
{
	private int[] ar = {};
	
	@Override
	public void init(int[] ini)
	{
		if(ini == null)
		{
			ini = new int[0];
		}
		
		this.ar = new int[ini.length];
		
		for(int i = 0; i < ini.length; i++)
		{
			ar[i] = ini[i];
		}
	}
	
	@Override
	public int size()
	{
		return ar.length;		
	}
	
	@Override
	public void clear()
	{
		ar = new int[0];
	}
	
	@Override
	public int[] toArray()
	{
		int[] temp = new int[ar.length];
			
		for(int i = 0; i < ar.length; i++)
		{
			temp[i] = ar[i];
		}
		
		return ar;
	}
	
	@Override
	public void addStart(int val)
	{
		int[] temp = new int[ar.length + 1];

		temp[0] = val;
		
		for(int i = 1; i < temp.length; i++)
		{
			temp[i] = ar[i-1];
		}

		ar = temp;
	}
	
	@Override
	public void addEnd(int val)
	{
		int[] temp = new int[ar.length + 1];
	
		temp[ar.length] = val;
		
		for(int i = 0; i < temp.length - 1; i++)
		{
			temp[i] = ar[i];
		}
			
		ar = temp;
	}
	
	@Override
	public void addPos(int pos, int val)
	{
		if(pos < 0 || pos > ar.length)
		{
			throw new IllegalArgumentException();
		}
		
		int[] temp = new int[ar.length + 1];

		for(int i = 0; i < temp.length; i++)
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
	
	@Override
	public void delStart()
	{
		if(ar.length == 0)
		{
			return;
		}
		
		int[] temp = new int[ar.length-1];
		
		for(int i = 1; i < ar.length; i++)
		{
			temp[i-1] = ar[i];
		}
		
		ar = temp;
	}
	
	@Override
	public void delEnd()
	{
		if(ar.length == 0)
		{
			return;
		}
		
		int[] temp = new int[ar.length-1];
		
		for(int i = 0; i < temp.length; i++)
		{
			temp[i] = ar[i];
		}
		
		ar = temp;
	}
	
	@Override
	public void delPos(int pos)
	{
		if(ar.length == 0)
		{
			return;
		}
		
		if(pos < 0 || pos > ar.length)
		{
			throw new IllegalArgumentException();
		}
		
		int[] temp = new int[ar.length-1];
		
		for(int i = 0; i < temp.length; i++)
		{
			if(i < pos)
			{
				temp[i] = ar[i];
			}
			else
			{
				temp[i] = ar[i+1];
			}
		}
		
		ar = temp;
	}
	
	@Override
	public int min()
	{
		if(ar.length == 0)
		{
			throw new IllegalArgumentException();
		}
		
		int min = ar[0];
		
		for(int i = 1; i < ar.length; i++)
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
		if(ar.length == 0)
		{
			throw new IllegalArgumentException();
		}
		
		int max = ar[0];
		
		for(int i = 1; i < ar.length; i++)
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
		if(ar.length == 0)
		{
			throw new IllegalArgumentException();
		}
		
		int minInd = 0;
		
		for(int i = 1; i < ar.length; i++)
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
		if(ar.length == 0)
		{
			throw new IllegalArgumentException();
		}
		
		int maxInd = 0;
		
		for(int i = 1; i < ar.length; i++)
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
		if(pos < 0 || pos > ar.length)
		{
			throw new IllegalArgumentException();
		}
		
		if(ar.length == 0)
		{
			int[] temp = new int[1];
			ar = temp;
		}
		
		ar[pos] = val;
	}
	
	@Override
	public int get(int pos)
	{
		if(ar.length == 0 || pos < 0 || pos > ar.length)
		{
			throw new IllegalArgumentException();
		}
		
		return ar[pos];
	}
	
	@Override
	public void reverse()
	{
		if(ar.length == 0)
		{
			return;
		}
		
		for(int i = 0; i < (ar.length / 2); i++)
		{
			int temp = ar[ar.length-1-i];
			ar[ar.length-1-i] = ar[i];
			ar[i] = temp;
		}
	}
	
	@Override
	public void halfReverse()
	{
		if(ar.length == 0)
		{
			return;
		}
		
		int ind = ((ar.length % 2) > 0) ? 1 : 0;
		
		for(int i = 0; i < (ar.length / 2); i++)
		{
			int temp = ar[i];
			ar[i] = ar[ar.length/2 + ind + i];
			ar[ar.length/2 + ind + i] = temp;
		}
	}
	
	@Override
	public void bubbleSort()
	{
		if(ar.length == 0)
		{
			return;
		}

		for(int i = ar.length - 1; i > 0; i--)
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
