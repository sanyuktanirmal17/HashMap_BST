package BinarySearchTree;

/**********************************************************************
 * Purpose : Implementation of Hash Map
 * 
 * @author Sanyukta Nirmal
 * @Version 1.0
 * @since 15-06-2021
 *
 ************************************************************************/

public class NodeOfTree {
	NodeOfTree left;
	NodeOfTree right;
	int data;

	public NodeOfTree getLeft() {
		return left;
	}

	public void setLeft(NodeOfTree left) {
		this.left = left;
	}

	public NodeOfTree getRight() {
		return right;
	}

	public void setRight(NodeOfTree right) {
		this.right = right;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public NodeOfTree(int data) {
		left = null;
		right = null;
	}

}
