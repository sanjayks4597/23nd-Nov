package tree;

public class PathSum {

	public static void main(String[] args) {
		DoublelyLinkedList root=new DoublelyLinkedList(1);
		root.left=new DoublelyLinkedList(2);
		root.right=new DoublelyLinkedList(3);
		root.left.left=new DoublelyLinkedList(4);
		root.right.right=new DoublelyLinkedList(5);
		root.left.right=new DoublelyLinkedList(6);
		
		boolean flag=pathSumCheck(root,9);
		System.out.println(flag);

	}

	private static boolean pathSumCheck(DoublelyLinkedList root, int i) {
		
		if(root==null)
		{
			return false;
		}
		if(root.left==null && root.right==null && i-root.key==0)
		{
			return true;
		}
		return pathSumCheck(root.left, i-root.key) || pathSumCheck(root.right, i-root.key);
	}

}
