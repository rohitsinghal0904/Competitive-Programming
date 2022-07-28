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
    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode current=root;
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> result= new ArrayList<>();
        
        while(current!=null || !stack.isEmpty())
        {
            if(current!=null)
            {
                stack.push(current);
                current=current.left;
            }
            else
            {
                current=stack.pop();
                result.add(current.val);
                current=current.right;
            }
        }
        return result;
    }
}