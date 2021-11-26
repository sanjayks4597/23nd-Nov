package tree;
import java.util.*;
public class PrintLevelWiseElementUsingQueue {

	public static void main(String[] args) {
		
		DoublelyLinkedList root=new DoublelyLinkedList(1);
		root.left=new DoublelyLinkedList(2);
		root.right=new DoublelyLinkedList(3);
		root.left.left=new DoublelyLinkedList(4);
		root.left.right=new DoublelyLinkedList(5);
		root.left.right.left=new DoublelyLinkedList(6);

		printEverylevel(root);
	}

	private static void printEverylevel(DoublelyLinkedList root) {
		
		Queue<DoublelyLinkedList> q=new LinkedList<DoublelyLinkedList>();
		q.add(root);
		while(q.isEmpty()==false)
		{
			if(root==null)return;
			DoublelyLinkedList curr=q.poll();
			System.out.print(curr.key+" ");
			
			if(curr.left!=null)
			{
				q.add(curr.left);
			}
			if(curr.right!=null)
			{
				q.add(curr.right);
			}
		}
		
	}

}
