package NewList;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AList1Test
{
	//EList lst = new AList0();
	//EList lst = new AList1();
	//EList lst = new AList2();
	//EList lst = new LList1();
	EList lst = new LList2();
	
	@Before
	public void setUp()
	{
		lst.clear();
	}
	
	//===========================================================
	//Initialize
	//===========================================================

	@Test
	public void test_InitializeNull()
	{
		int[] ini = null;
		lst.init(ini);
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void test_Initialize0Length()
	{
		int[] ini = {};
		lst.init(ini);
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}

	@Test
	public void test_InitializeOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		int[] exp = {10};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void test_InitializeTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		int[] exp = {10, 20};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void test_InitializeEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		int[] exp = {1, 12, -24, 0, 0, 109};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	@Test
	public void test_InitializeOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		int[] exp = {1, 12, -24, 0, 0, 109, 14};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	//===========================================================
	//Size
	//===========================================================
	
	@Test
	public void test_Size0Length()
	{
		int[] ini = {};
		lst.init(ini);
		assertEquals(0, lst.size());	
	}

	@Test
	public void test_SizeOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		assertEquals(1, lst.size());
	}
	
	@Test
	public void test_SizeTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		assertEquals(2, lst.size());
	}
	
	@Test
	public void test_SizeEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		assertEquals(6, lst.size());
	}
	
	@Test
	public void test_SizeOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		assertEquals(7, lst.size());
	}
	
	//===========================================================
	//Clear
	//===========================================================
	
	@Test
	public void test_Clear0Length()
	{
		int[] ini = {};
		lst.init(ini);
		lst.clear();
		assertEquals(0, lst.size());
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}

	@Test
	public void test_ClearOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		lst.clear();
		assertEquals(0, lst.size());
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	@Test
	public void test_ClearTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		lst.clear();
		assertEquals(0, lst.size());
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	@Test
	public void test_ClearEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		lst.clear();
		assertEquals(0, lst.size());
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void test_ClearOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.clear();
		assertEquals(0, lst.size());
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	//===========================================================
	//toArray
	//===========================================================

	@Test
	public void test_toArray0Length()
	{
		int[] ini = {};
		lst.init(ini);
		int[] exp = {};
		assertArrayEquals(exp, lst.toArray());
	}

	@Test
	public void test_toArrayOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		int[] exp = {10}; 
		assertArrayEquals(exp, lst.toArray());		
	}
	
	@Test
	public void test_toArrayTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		int[] exp= {10, 20};
		assertArrayEquals(exp, lst.toArray());	
	}
	
	@Test
	public void test_toArrayEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		int[] exp = {1, 12, -24, 0, 0, 109};
		assertArrayEquals(exp, lst.toArray());
	}
	
	@Test
	public void test_toArrayOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		int[] exp = {1, 12, -24, 0, 0, 109, 14};
		assertArrayEquals(exp, lst.toArray());
	}
	
	//===========================================================
	//addStart
	//===========================================================
	
	@Test
	public void test_addStart0Length()
	{
		int[] ini = {};
		lst.init(ini);
		lst.addStart(45);
		assertEquals(1, lst.size());
		int[] exp = {45};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}

	@Test
	public void test_addStartOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		lst.addStart(45);
		assertEquals(2, lst.size());
		int[] exp = {45, 10};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void test_addStartTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		lst.addStart(45);
		assertEquals(3, lst.size());
		int[] exp = {45, 10, 20};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void test_addStartEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		lst.addStart(45);
		assertEquals(7, lst.size());
		int[] exp = {45, 1, 12, -24, 0, 0, 109};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	@Test
	public void test_addStartOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.addStart(45);
		assertEquals(8, lst.size());
		int[] exp = {45, 1, 12, -24, 0, 0, 109, 14};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	//===========================================================
	//addEnd
	//===========================================================
	
	@Test
	public void test_addEnd0Length()
	{
		int[] ini = {};
		lst.init(ini);
		lst.addEnd(45);
		assertEquals(1, lst.size());
		int[] exp = {45};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}

	@Test
	public void test_addEndOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		lst.addEnd(45);
		assertEquals(2, lst.size());
		int[] exp = {10, 45};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);			
	}
	
	@Test
	public void test_addEndTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		lst.addEnd(45);
		assertEquals(3, lst.size());
		int[] exp = {10, 20, 45};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void test_addEndEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		lst.addEnd(45);
		assertEquals(7, lst.size());
		int[] exp = {1, 12, -24, 0, 0, 109, 45};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void test_addEndOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.addEnd(45);
		assertEquals(8, lst.size());
		int[] exp = {1, 12, -24, 0, 0, 109, 14, 45};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	//===========================================================
	//addPos
	//===========================================================
	
	@Test
	public void test_addPos0Length()
	{
		int[] ini = {};
		lst.init(ini);
		lst.addPos(0, 45);
		assertEquals(1, lst.size());
		int[] exp = {45};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}

	@Test
	public void test_addPosOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		lst.addPos(0, 45);
		assertEquals(2, lst.size());
		int[] exp = {45, 10};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void test_addPosTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		lst.addPos(2, 45);
		assertEquals(3, lst.size());
		int[] exp = {10, 20, 45};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void test_addPosEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		lst.addPos(4, 45);
		assertEquals(7, lst.size());
		int[] exp = {1, 12, -24, 0, 45, 0, 109};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void test_addPosOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.addPos(5, 45);
		assertEquals(8, lst.size());
		int[] exp = {1, 12, -24, 0, 0, 45, 109, 14};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_addPosIlligalInsertPos()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.addPos(10, 45);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_addPosZeroInsertPos()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.addPos(-1, 45);	
	}
	
	//===========================================================
	//delStart
	//===========================================================
	
	@Test
	public void test_delStart0Length()
	{
		int[] ini = {};
		lst.init(ini);
		lst.delStart();
		assertEquals(0, lst.size());
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);			
	}

	@Test
	public void test_delStartOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		lst.delStart();
		assertEquals(0, lst.size());
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);				
	}
	
	@Test
	public void test_delStartTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		lst.delStart();
		assertEquals(1, lst.size());
		int[] exp = {20};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);			
	}
	
	@Test
	public void test_delStartEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		lst.delStart();
		assertEquals(5, lst.size());
		int[] exp = {12, -24, 0, 0, 109};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void test_delStartOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.delStart();
		assertEquals(6, lst.size());
		int[] exp = {12, -24, 0, 0, 109, 14};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);			
		
	}
	
	//===========================================================
	//delEnd
	//===========================================================
	
	@Test
	public void test_delEnd0Length()
	{
		int[] ini = {};
		lst.init(ini);
		lst.delEnd();
		assertEquals(0, lst.size());
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}

	@Test
	public void test_delEndOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		lst.delEnd();
		assertEquals(0, lst.size());
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);			
	}
	
	@Test
	public void test_delEndTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		lst.delEnd();
		assertEquals(1, lst.size());
		int[] exp = {10};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void test_delEndEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		lst.delEnd();
		assertEquals(5, lst.size());
		int[] exp = {1, 12, -24, 0, 0};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void test_delEndOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.delEnd();
		assertEquals(6, lst.size());
		int[] exp = {1, 12, -24, 0, 0, 109};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}
	
	//===========================================================
	//delPos
	//===========================================================
	
	@Test
	public void test_delPos0Length()
	{
		int[] ini = {};
		lst.init(ini);
		lst.delPos(0);
		assertEquals(0, lst.size());
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}

	@Test
	public void test_delPosOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		lst.delPos(0);
		assertEquals(0, lst.size());
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);			
	}
	
	@Test
	public void test_delPosTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		lst.delPos(1);
		assertEquals(1, lst.size());
		int[] exp = {10};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);
	}
	
	@Test
	public void test_delPosEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		lst.delPos(4);
		assertEquals(5, lst.size());
		int[] exp = {1, 12, -24, 0, 109};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void test_delPosOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.delPos(5);
		assertEquals(6, lst.size());
		int[] exp = {1, 12, -24, 0, 0, 14};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_delPosIlligalInsertPos()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.delPos(10);	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_delPosNegativeInsertPos()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.delPos(-1);	
	}
	
	//===========================================================
	//min
	//===========================================================
	
	@Test (expected = IllegalArgumentException.class)
	public void test_min0Length()
	{
		lst.min();		
	}

	@Test
	public void test_minOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		assertEquals(10, lst.min());	
	}
	
	@Test
	public void test_minTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		assertEquals(10, lst.min());	
	}
	
	@Test
	public void test_minEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		assertEquals(-24, lst.min());	
	}
	
	@Test
	public void test_minOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		assertEquals(-24, lst.min());	
	}
	
	//===========================================================
	//max
	//===========================================================
	
	@Test (expected = IllegalArgumentException.class)
	public void test_max0Length()
	{
		lst.max();		
	}

	@Test
	public void test_maxOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		assertEquals(10, lst.max());	
	}
	
	@Test
	public void test_maxTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		assertEquals(20, lst.max());	
	}
	
	@Test
	public void test_maxEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		assertEquals(109, lst.max());	
	}
	
	@Test
	public void test_maxOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 109};
		lst.init(ini);
		assertEquals(109, lst.max());	
	}
	
	//===========================================================
	//minInd
	//===========================================================
	
	@Test (expected = IllegalArgumentException.class)
	public void test_minInd0Length()
	{
		lst.minInd();		
	}

	@Test
	public void test_minIndOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		assertEquals(0, lst.minInd());	
	}
	
	@Test
	public void test_minIndTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		assertEquals(0, lst.minInd());	
	}
	
	@Test
	public void test_minIndEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		assertEquals(2, lst.minInd());	
	}
	
	@Test
	public void test_minIndOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		assertEquals(2, lst.minInd());	
	}
	
	//===========================================================
	//maxInd
	//===========================================================
	
	@Test (expected = IllegalArgumentException.class)
	public void test_maxInd0Length()
	{
		lst.maxInd();		
	}

	@Test
	public void test_maxIndOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		assertEquals(0, lst.maxInd());	
	}
	
	@Test
	public void test_maxIndTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		assertEquals(1, lst.maxInd());	
	}
	
	@Test
	public void test_maxIndEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		assertEquals(5, lst.maxInd());	
	}
	
	@Test
	public void test_maxIndOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 10};
		lst.init(ini);
		assertEquals(5, lst.maxInd());	
	}
	
	//===========================================================
	//Set
	//===========================================================
	
	@Test
	public void test_Set0Length()
	{
		int[] ini = {};
		lst.init(ini);
		lst.set(0, 45);
		int[] exp = {45};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}

	@Test
	public void test_SetOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		lst.set(0, 45);
		int[] exp = {45};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void test_SetTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		lst.set(1, 45);
		int[] exp = {10, 45};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void test_SetEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		lst.set(4, 45);
		int[] exp = {1, 12, -24, 0, 45, 109};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void test_SetOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.set(5, 45);
		int[] exp = {1, 12, -24, 0, 0, 45, 14};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_SetIlligalInsertPos()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.set(10, 45);
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_SetNegativeInsertPos()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.set(-1, 45);
	}
	
	//===========================================================
	//Get
	//===========================================================
	
	@Test (expected = IllegalArgumentException.class)
	public void test_Get0Length()
	{
		int[] ini = {};
		lst.init(ini);
		assertEquals(0, lst.get(0));		
	}

	@Test
	public void test_GetOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		assertEquals(10, lst.get(0));	
	}
	
	@Test
	public void test_GetTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		assertEquals(20, lst.get(1));	
	}
	
	@Test
	public void test_GetEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		assertEquals(109, lst.get(5));	
	}
	
	@Test
	public void test_GetOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 109};
		lst.init(ini);
		assertEquals(109, lst.get(6));	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_GetIlligalPos()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 109};
		lst.init(ini);
		lst.get(11);	
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void test_GetZeroPos()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 109};
		lst.init(ini);
		lst.get(-1);
	}
	
	//===========================================================
	//Reverse
	//===========================================================
	
	@Test
	public void test_Reverse0Length()
	{
		int[] ini = {};
		lst.init(ini);
		lst.reverse();
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}

	@Test
	public void test_ReverseOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		lst.reverse();
		int[] exp = {10};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void test_ReverseTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		lst.reverse();
		int[] exp = {20, 10};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void test_ReverseEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		lst.reverse();
		int[] exp = {109, 0, 0, -24, 12, 1};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void test_ReverseOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.reverse();
		int[] exp = {14, 109, 0, 0, -24, 12, 1};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	//===========================================================
	//halfReverse
	//===========================================================
	
	@Test
	public void test_halfReverse0Length()
	{
		int[] ini = {};
		lst.init(ini);
		lst.halfReverse();
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}

	@Test
	public void test_halfReverseOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		lst.halfReverse();
		int[] exp = {10};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void test_halfReverseTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		lst.halfReverse();
		int[] exp = {20, 10};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void test_halfReverseEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		lst.halfReverse();
		int[] exp = {0, 0, 109, 1, 12, -24};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void test_halfReverseOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.halfReverse();
		int[] exp = {0, 109, 14, 0, 1, 12, -24};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	//===========================================================
	//bubbleSort
	//===========================================================
	
	@Test
	public void test_bubbleSort0Length()
	{
		int[] ini = {};
		lst.init(ini);
		lst.bubbleSort();
		int[] exp = {};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}

	@Test
	public void test_bubbleSortOneLength()
	{
		int[] ini = {10};
		lst.init(ini);
		lst.bubbleSort();
		int[] exp = {10};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);			
	}
	
	@Test
	public void test_bubbleSortTwoQuantity()
	{
		int[] ini = {10, 20};
		lst.init(ini);
		lst.bubbleSort();
		int[] exp = {10, 20};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void test_bubbleSortEvenQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109};
		lst.init(ini);
		lst.bubbleSort();
		int[] exp = {-24, 0, 0, 1, 12, 109};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void test_bubbleSortOddQuantity()
	{
		int[] ini = {1, 12, -24, 0, 0, 109, 14};
		lst.init(ini);
		lst.bubbleSort();
		int[] exp = {-24, 0, 0, 1, 12, 14, 109};
		int[] act = lst.toArray();
		assertArrayEquals(exp, act);	
	}
}
