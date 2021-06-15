package BinarySearchTree;

/***************************************************************************
 * Purpose : Implementation of Hash Map
 * 
 * @author Sanyukta Nirmal
 * @Version 1.0
 * @since 15-06-2021
 *
 ************************************************************************/

public class BinaryTree {

	int size;
	NodeOfTree root;

	/*
	 * Default constructor root of the tree is null.
	 */
	public BinaryTree() {
		root = null;
		size = 0;

	}

	/**
	 * node object of NodeOfTree
	 */
	public void insert(int data) {
		NodeOfTree node = new NodeOfTree(data);
		if (root == null) {
			root = node;
			size++;
		} else {
			NodeOfTree main = root;
			NodeOfTree temp = root;
			/**
			 *
			 * Tree traversing inside elemnts
			 */
			while (temp != null) {
				main = temp;
				if (data < temp.getData()) {
					temp = temp.getLeft();
				} else {
					temp = temp.getRight();
					System.out.println("" + data);
				}
			}
			if (data < main.getData()) {
				main.setLeft(node);
				size++;
			} else {
				main.setRight(node);

				size++;
			}
		}
	}

	/**
		 * data taken for search method 
		 * @param data
		 */
		public void Search(int data, root, node) {
			int temp;
		if ( temp< root.data) {
            search(root.left, data, root);
        }
        else {
            search(root.right, data, root);
      }
    }

	/**
	 * size of the tree
	 */
	public int size() {
		System.out.println("size of array:");
		return size;
	}

}
