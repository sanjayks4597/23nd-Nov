package tree;

public class PrintKthLevelElements {

	public static void main(String[] args) {
		DoublelyLinkedList root=new DoublelyLinkedList(1);
		root.left=new DoublelyLinkedList(2);
		root.right=new DoublelyLinkedList(3);
		root.left.left=new DoublelyLinkedList(4);
		root.left.right=new DoublelyLinkedList(5);
		root.left.right.left=new DoublelyLinkedList(6);
		
		int k=2;
		printKthLevel(root,k);

	}

	private static void printKthLevel(DoublelyLinkedList root, int k) {
		
		if(root==null)return;
		if(k==0)
		{
			System.out.print(root.key+" ");
		}
		printKthLevel(root.left, k-1);
		printKthLevel(root.right, k-1);
		
	}

}
