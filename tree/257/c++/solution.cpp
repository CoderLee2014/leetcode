/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode(int x) : val(x), left(NULL), right(NULL) {}
 * };
 */
class Solution {
public:
    vector<string> binaryTreePaths(TreeNode* root) {
        vector<string> res;
        vector<int> path;
        solve(res, root, path);
        return res;
    }
    
    void solve(vector<string>&res, TreeNode* root, vector<int> path){
        if(!root)
            return;
        path.push_back(root->val);
        if(!root->left && !root->right){
            string s = "";
            for(int i=0; i< path.size()-1;i++){
                s += to_string(path[i]) + "->";
            }
            s += to_string(path[path.size()-1]);
            res.push_back(s);
        }
        solve(res,root->left,path);
        solve(res,root->right,path);
    }
};
