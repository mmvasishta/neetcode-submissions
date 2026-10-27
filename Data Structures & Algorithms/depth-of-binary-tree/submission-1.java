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
    public int maxDepth(TreeNode root) {
        // Recurrsive
        //  if (root == null) return 0;

        // return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));

        // BFS
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null) {
            return 0;
        }

        q.add(root);
        int level = 0;

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode tree = q.poll();
                if (tree.left != null) {
                    q.add(tree.left);
                }
                if (tree.right != null) {
                    q.add(tree.right);
                }
            }

            level++;
        }

        return level;
    }
}
