/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 * DFS遍历
 */
public class Solution {
   
    public List<String> binaryTreePaths(TreeNode root) {
        if(root == null){
            return Collections.emptyList();
        }
        List<String> res = new ArrayList<>();
        Deque<TreeNode> st = new ArrayDeque();
        Deque<TreeNode> path = new ArrayDeque();
        TreeNode t;
        st.addFirst(root);
        while(!st.isEmpty()){
            t=st.removeFirst();
            if(t!=path.peekLast()){
                path.addLast(t);
                st.addFirst(t);
            }
            else{
                path.removeLast();
                continue;
            }
            if(t.right==null&&t.left==null){
                Iterator<TreeNode> it = path.iterator();
                StringBuilder sb = new StringBuilder();
                sb.append(Integer.toString(it.next().val));
                while(it.hasNext()){
                    sb.append("->");
                    sb.append(Integer.toString(it.next().val));
                }
                res.add(sb.toString());
            }
            if(t.right!=null){
                st.addFirst(t.right);
            }
            if(t.left!=null){
                st.addFirst(t.left);
            }
        }
        return res;
    }
}
