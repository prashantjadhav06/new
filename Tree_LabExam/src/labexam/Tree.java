package labexam;

import java.util.Stack;

public class Tree {
	public Node root;

	static class Node {

		int data;
		Node left, right;

		public Node(int data) {

			this.data = data;
			left = null;
			right = null;
		}
	}

	public void reverse() {
		if (root == null) {
			return;
		}

		Stack<Node> t = new Stack<Node>();

		Node temp = root;

		while (temp != null || t.size() > 0) // traversing the tree
		{
			while (temp != null) {

				t.push(temp);

				temp = temp.left;
			}

			temp = t.pop();

			System.out.print(temp.data + " ");

			temp = temp.right;
		}
	}
}
