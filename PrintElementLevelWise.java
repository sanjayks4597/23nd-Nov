package tree;

class LinkedList3{
	int key;
	LinkedList3 left,right;
	public LinkedList3(int val) {
		key=val;
		left=right=null;
		
	}
}
public class PrintElementLevelWise {
	
//	static int count=0;
	public static void main(String[] args) {
		
		LinkedList3 root=new LinkedList3(1);
		root.left=new LinkedList3(2);
		root.right=new LinkedList3(3);
		root.left.left=new LinkedList3(4);
		root.left.right=new LinkedList3(5);
		root.right.left=new LinkedList3(6);
		root.right.right=new LinkedList3(7);
//		int currentLevel=0;
		int h=HeightOfTree(root);
		levelWiseElementI(root);
//		levelWiseElementR(root,h);
	}
	
	private static void levelWiseElementR(LinkedList3 root,int h) {

		if(root==null)
		{
			return;
		}
		while(h>0)
		{
			System.out.print(root.key+" ");
			levelWiseElementR(root.left, h-1);
			levelWiseElementR(root.right, h-1);
			
		}
		
	
}

	public static int HeightOfTree(LinkedList3 root)
	{
		if(root==null)
		{
			return 0;
		}

		return Math.max(HeightOfTree(root.left),HeightOfTree(root.right))+1;
	}
	public static void printKthElement(LinkedList3 root, int k)
	{
		if(root==null)
		{
			return;
		}
		if(k==0)
		{
			System.out.print(root.key+" ");
		}
		printKthElement(root.left, k-1);
		printKthElement(root.right, k-1);
	}

	private static void levelWiseElementI(LinkedList3 root) {
		
		int h=HeightOfTree(root);
		for(int i=0;i<h;i++)
		{
			printKthElement(root, i);
		}
		
		
	}


}
