package labexam;

import labexam.Tree.Node;

public class TreeMain {

	public static void main(String[] args) {
		Tree tree = new Tree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.reverse();
		System.out.println("HI");

	}

}
