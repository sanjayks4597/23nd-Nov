package tree;

import java.util.ArrayList;
import java.util.List;

public class SimilarLeaf {
	static List<Integer> list1=new ArrayList<Integer>();
	static List<Integer> list2=new ArrayList<Integer>();
	public static void main(String[] args) {
		
		DoublelyLinkedList root1=new DoublelyLinkedList(1);
		root1.left=new DoublelyLinkedList(2);
		root1.right=new DoublelyLinkedList(3);
		root1.left.left=new DoublelyLinkedList(4);
		root1.left.right=new DoublelyLinkedList(5);
		root1.left.right.left=new DoublelyLinkedList(6);
		
		DoublelyLinkedList root2=new DoublelyLinkedList(1);
		root2.left=new DoublelyLinkedList(2);
		root2.right=new DoublelyLinkedList(3);
		root2.left.left=new DoublelyLinkedList(4);
		root2.left.right=new DoublelyLinkedList(5);
		root2.left.right.left=new DoublelyLinkedList(6);
		
//		int h1=HeightOfTree(root1);
//		int h2=HeightOfTree(root2);
		
//		System.out.println(h1);
//		System.out.println(h2);
		
		getLeaf(root1);
		getLeaf1(root2);

		System.out.println(list1);
		System.out.println(list2);
		
		if(list1.equals(list2))
		{
			System.out.println(true);
		}
		else
			System.out.println(false);
	}

	private static void getLeaf(DoublelyLinkedList root1) {
		
		if(root1==null)return;
		if(root1.left==null && root1.right==null)
		{
			list1.add(root1.key);
		}
		getLeaf(root1.left);
		getLeaf(root1.right);
		
	}
	
	private static void getLeaf1(DoublelyLinkedList root2) {
		
		if(root2==null)return;
		if(root2.left==null && root2.right==null)
		{
			list2.add(root2.key);
		}
		getLeaf1(root2.left);
		getLeaf1(root2.right);
	}

	private static int HeightOfTree(DoublelyLinkedList root) {
		
		if(root==null)return 0;
		
		return Math.max(HeightOfTree(root.left), HeightOfTree(root.right))+1;
	}

}
