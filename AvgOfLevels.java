package tree;

import java.util.ArrayList;
import java.util.List;


public class AvgOfLevels {
	static List<Double> l1=new ArrayList<Double>();
	static double sum=0;
	static double count=0;
	public static void main(String[] args) {
		DoublelyLinkedList root=new DoublelyLinkedList(1);
		root.left=new DoublelyLinkedList(2);
		root.right=new DoublelyLinkedList(3);
		root.right.left=new DoublelyLinkedList(7);
		root.left.left=new DoublelyLinkedList(4);
		root.left.right=new DoublelyLinkedList(5);
		root.left.right.left=new DoublelyLinkedList(6);
		
		int h=HeightOfTree(root);
		System.out.println(h);
		for(int i=0;i<h;i++)
		{
			printavgOfKthLevel(root,i);
			double avg=sum/count;
			l1.add(avg);
			sum=0;
			count=0;
			
		}
		System.out.println(l1);

	}

	private static void printavgOfKthLevel(DoublelyLinkedList root, int k) {
		if(root==null)return;
		if(k==0)
		{
			sum+=root.key;
			count++;
		}
		 printavgOfKthLevel(root.left, k-1);
		 printavgOfKthLevel(root.right, k-1);
		
	}

	private static int HeightOfTree(DoublelyLinkedList root) {
		if(root==null)return 0;
		
		return Math.max(HeightOfTree(root.left), HeightOfTree(root.right))+1;
	}

}
