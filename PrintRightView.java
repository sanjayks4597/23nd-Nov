package tree;

public class PrintRightView {
	static int levelSofar=0;
	public static void main(String[] args) {
		DoublelyLinkedList root=new DoublelyLinkedList(1);
		root.left=new DoublelyLinkedList(2);
		root.right=new DoublelyLinkedList(3);
		root.left.left=new DoublelyLinkedList(4);
		root.left.right=new DoublelyLinkedList(5);
		root.left.right.left=new DoublelyLinkedList(6);
		
		int currentLevel=0;
		printRight(root,currentLevel);

	}

	private static void printRight(DoublelyLinkedList root, int currentLevel) {
		
		if(root==null)return;
		
		if(currentLevel>=levelSofar)
		{
			System.out.println(root.key);
			levelSofar++;
		}
		printRight(root.right, currentLevel+1);
		printRight(root.left, currentLevel+1);
		
	}

}
