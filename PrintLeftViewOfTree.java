package tree;

public class PrintLeftViewOfTree {
	static int levelSoFar=0;
	public static void main(String[] args) {
		
		DoublelyLinkedList root=new DoublelyLinkedList(1);
		root.left=new DoublelyLinkedList(2);
		root.right=new DoublelyLinkedList(3);
		root.left.left=new DoublelyLinkedList(4);
		root.left.right=new DoublelyLinkedList(5);
		root.left.right.left=new DoublelyLinkedList(6);
		
		int currentLevel=0;
		printLeftView(root,currentLevel);

	}

	private static void printLeftView(DoublelyLinkedList root, int currentLevel) {
		
		if(root==null)return;
		
		if(currentLevel>=levelSoFar)
		{
			System.out.println(root.key);
			levelSoFar++;
		}
		printLeftView(root.left, currentLevel+1);
		printLeftView(root.right, currentLevel+1);
		
	}
	
	

}
