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
    public List<Integer> postorderTraversal(TreeNode root) {
        TreeNode current=root;
        List<Integer> result=new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        
        while(current!=null || !stack.isEmpty())
        {
            if(current!=null)
            {
                stack.push(current);
                current=current.left;
            }
            else
            {
                TreeNode temp =stack.peek().right;
                if(temp==null)
                {
                    temp=stack.pop();
                    result.add(temp.val);
                    while(!stack.isEmpty() && temp==stack.peek().right)
                    {
                        temp=stack.pop();
                        result.add(temp.val);
                    }
                }
                else
                {
                    current=temp;
                }
            }
        }
        return result;
    }
}