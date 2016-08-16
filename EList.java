package NewList;

public interface EList
{
	 void init(int[] ini);
	 int size();
	 void clear();
	 int[] toArray();
	
	 void addStart(int val);
	 void addEnd(int val);
	 void addPos(int pos, int val);
	 void delStart();
	 void delEnd();
	 void delPos(int pos);

	 int min();
	 int max();
	 int minInd();	
	 int maxInd();
	
	 void set(int pos, int val);
	 int get(int pos);	
	 void reverse();
	 void halfReverse();
	 void bubbleSort();
}
