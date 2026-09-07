/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        preorder(root, result);

        return result;
    }

    public void preorder(TreeNode node, List<Integer> result) {
        if (node == null) {
            return;
        }

        // Root
        result.add(node.val);

        // Left
        preorder(node.left, result);

        // Right
        preorder(node.right, result);
    }
}