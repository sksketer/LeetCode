/*
101. Symmetric Tree
    Easy

    Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).

    

    Example 1:

    Input: root = [1,2,2,3,4,4,3]
    Output: true

    Example 2:

    Input: root = [1,2,2,null,3,null,3]
    Output: false

    

    Constraints:

        The number of nodes in the tree is in the range [1, 1000].
        -100 <= Node.val <= 100

*/

public class _101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        return checkSymetric(root.left, root.right);
    }
    public boolean checkSymetric(TreeNode root1, TreeNode root2) {
        if(root1 == null && root2 == null)
            return true;
        if(root1 == null || root2 == null)
            return false;
        
        return ( (root1.val == root2.val) && checkSymetric(root1.left, root2.right) && checkSymetric(root1.right, root2.left) );
            
    }    
}
