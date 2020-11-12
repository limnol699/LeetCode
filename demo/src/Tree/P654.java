package Tree;

public class P654 {
    public static void main(String[] args) {

    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return Construct(nums, 0 , nums.length);
    }
    public TreeNode Construct(int[] nums, int l, int r){
        if(l == r)
            return null;
        int max_i = getMax(nums, l, r);
        TreeNode root = new TreeNode(nums[max_i]);
        root.left = Construct(nums, l, max_i);
        root.right = Construct(nums, max_i + 1, r);
        return root;
    }
    public int getMax(int[] nums, int l, int r){
        int max_i = l;
        for(int i = l; i < r; i++){
            if(nums[i] > nums[max_i])
                max_i = i;
        }
        return max_i;
    }
}
