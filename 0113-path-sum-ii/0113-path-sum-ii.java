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
    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        solve(root, targetSum, new ArrayList<>());
        return ans;
    }

    void solve(TreeNode root, int sum, List<Integer> list) {
        if (root == null) return;

        list.add(root.val);

        if (root.left == null && root.right == null && sum == root.val)
            ans.add(new ArrayList<>(list));

        solve(root.left, sum - root.val, list);
        solve(root.right, sum - root.val, list);

        list.remove(list.size() - 1);
    }
}