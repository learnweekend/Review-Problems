/*
 problem : Check if a given tree is BST or not
 */
 public class CheckBST {
   public static void main(String[] args) {
     Node root = new Node(20);
     root.left = new Node(10);
     root.right = new Node(6);
     root.right.left = new Node(22);
     root.right.right = new Node(30);
     root.left.left = new Node(5);
     root.left.right = new Node(15);
     System.out.println(checkBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE));
   }

   private static boolean checkBST(Node node, int low, int max){
    if(node == null) return true;
    if(node.data > low && node.data < max){
      return true;
    }
    return checkBST(node.left, low, node.data) && checkBST(node.right, node.data, max);
   }

   private static class Node {
     private int data;
     private Node left;
     private Node right;
     private Node(int value){
       this.data = value;
     }
   }
 }
