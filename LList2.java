package NewList;

public class LList2 implements EList
{
	class Node
	{
		int val;
		Node next = null;
		Node prev = null;
		public Node(int val)
		{
			this.val = val;
		}
	}
	
	Node root = null;
	Node top = null;
	int leng = 0;
	
	@Override
	public void init(int[] ini)
	{
		if(ini == null)
		{
			ini = new int[0];
		}
		
		for(int i = ini.length - 1; i >= 0; i--)
		{
			addStart(ini[i]);
		}
	}

	@Override
	public int size()
	{
		return leng;
	}

	@Override
	public void clear()
	{
		root = null;
		top = null;
		leng = 0;
	}

	@Override
	public int[] toArray()
	{
		int[] ret = new int[leng];
		Node p = root;
		
		for(int i = 0; i < ret.length; i++)
		{
			ret[i] = p.val;
			p = p.next;
		}
		
		return ret;
	}

	@Override
	public void addStart(int val)
	{
		Node tmp = new Node(val);
		
		if(root == null)
		{
			root = tmp;
			top = tmp;
		}
		else
		{
			tmp.next = root;
			root = tmp;
			tmp.next.prev = tmp;
		}
		
		leng++;
	}

	@Override
	public void addEnd(int val)
	{
		if(root == null)
		{
			addStart(val);
			return;
		}
		
		Node tmp = new Node(val);
		
		tmp.prev = top;
		top.next = tmp;
		top = tmp;
		
		leng++;
	}

	@Override
	public void addPos(int pos, int val)
	{
		if(pos < 0 || pos > leng)
			throw new IllegalArgumentException();
		
		if(pos == 0)
		{
			addStart(val);
			return;
		}
		
		Node tmp = new Node(val);
		Node p = null;
		
		if(pos < leng / 2)
		{
			p = root;
			int count = 0;
			while(count != pos - 1)
			{
				p = p.next;
				count++;
			}
		}
		else
		{
			p = top;
			int count = leng - 1;
			while(count != pos - 1)
			{
				p = p.prev;
				count--;
			}	
		}
		
		tmp.next = p.next;
		p.next = tmp;
		tmp.prev = p;
		p.next.prev = tmp;
		
		leng++;
	}

	@Override
	public void delStart()
	{
		if(root != null)
		{
			root = root.next;			
			leng--;
		}	
	}

	@Override
	public void delEnd()
	{
		if(root != null)
		{
			if(leng == 1)
			{
				delStart();
				return;
			}
			
			top.prev.next = null;
			leng--;			
		}
	}

	@Override
	public void delPos(int pos)
	{
		if(pos < 0 || pos > leng)
			throw new IllegalArgumentException();
		
		if(pos == 0)
		{
			delStart();	
			return;
		}
		else if(pos == leng - 1)
		{
			delEnd();
			return;
		}
		else
		{
			Node p = null;
			
			if(pos < leng / 2)
			{
				p = root;
				int count = 0;
				while(count != pos - 1)
				{
					p = p.next;
					count++;
				}
			}
			else
			{
				p = top;
				int count = leng - 1;
				while(count != pos - 1)
				{
					p = p.prev;
					count--;
				}	
			}
			
			p.next = p.next.next;
			p.next.prev = p;
		}
		
		leng--;
	}

	@Override
	public int min()
	{
		if(root == null)
		{
			throw new IllegalArgumentException();
		}
		
		int min = root.val;
		Node p = root.next;
		while(p != null)
		{
			if(min > p.val)
			{
				min = p.val;
			}
			
			p = p.next;
		}
		
		return min;
	}

	@Override
	public int max()
	{
		if(root == null)
		{
			throw new IllegalArgumentException();
		}
		
		int max = root.val;
		Node p = root.next;
		while(p != null)
		{
			if(max < p.val)
			{
				max = p.val;
			}
			
			p = p.next;
		}
		
		return max;
	}

	@Override
	public int minInd()
	{
		if(root == null)
		{
			throw new IllegalArgumentException();
		}
		
		int min = root.val;
		int minInd = 0;
		if(root.next != null)
		{
			int count = 0;
			Node p = root.next;
			while(p != null)
			{
				if(min > p.val)
				{
					minInd = count + 1;
					min = p.val;
				}
				p = p.next;
				count++;
			}
		}
		
		return minInd;
	}

	@Override
	public int maxInd()
	{
		if(root == null)
		{
			throw new IllegalArgumentException();
		}
		
		int max = root.val;
		int maxInd = 0;
		if(root.next != null)
		{
			int count = 0;
			Node p = root.next;
			while(p != null)
			{
				if(max < p.val)
				{
					maxInd = count + 1;
					max = p.val;
				}
				p = p.next;
				count++;
			}
		}
		
		return maxInd;
	}

	@Override
	public void set(int pos, int val)
	{
		if(pos < 0 || pos > leng)
		{
			throw new IllegalArgumentException();
		}
		
		if(root == null)
		{
			addStart(val);
		}
		else
		{	
			if(pos < leng / 2)
			{
				Node p = root;
				int count = 0;
				while(count != pos)
				{
					p = p.next;
					count++;
				}
				
				p.val = val;
			}
			else
			{
				Node p = top;
				int count = leng - 1;
				while(count != pos)
				{
					p = p.prev;
					count--;
				}
				
				p.val = val;
			}
		}
	}

	@Override
	public int get(int pos)
	{
		if(pos < 0 || pos >= leng)
		{
			throw new IllegalArgumentException();
		}
		
		Node p = null;
		if(pos < leng / 2)
		{
			p = root;
			int count = 0;
			while(count != pos)
			{
				p = p.next;
				count++;
			}
		}
		else
		{
			p = top;
			int count = leng - 1;
			while(count != pos)
			{
				p = p.prev;
				count--;
			}
		}
		
		return p.val;
	}

	@Override
	public void reverse()
	{
		if(root == null || root.next == null)
		{
			return;
		}
		
		int i = 0;
		while(i < leng / 2)
		{
			int tmp = get(leng - 1 - i);
			set(leng - 1 - i, get(i));
			set(i, tmp);
			i++;
		}		
	}

	@Override
	public void halfReverse()
	{
		if(root == null || root.next == null)
		{
			return;
		}
		
		int ind = 0;
		if(size() % 2 != 0)
		{
			ind++;
		}
		
		int i = 0;
		while(i < leng / 2)
		{
			int tmp = get(leng / 2 + ind + i);
			set(leng / 2 + ind + i, get(i));
			set(i, tmp);
			i++;
		}		
	}

	@Override
	public void bubbleSort()
	{
		if(root == null || root.next == null)
		{
			return;
		}
		
		for(int i = leng - 1; i > 0; i--)
		{
			for(int j = 0; j < i; j++)
			{
				if(get(j) > get(j + 1))
				{
					int tmp = get(j);
					set(j, get(j + 1));
					set(j + 1, tmp);
				}
			}
		}		
	}
	
}
