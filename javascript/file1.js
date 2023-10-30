class TreeNode {
    constructor(val) {
        this.val = val;
        this.left = this.right = null;
    }
}

function reverseTree(root) {
    if (root === null) {
        return null;
    }

    let temp = root.left;
    root.left = root.right;
    root.right = temp;

    reverseTree(root.left);
    reverseTree(root.right);

    return root;
}

// Helper function to print the tree (in-order traversal)
function printTree(root) {
    if (root !== null) {
        printTree(root.left);
        console.log(root.val);
        printTree(root.right);
    }
}
let root = new TreeNode(1);
root.left = new TreeNode(2);
root.right = new TreeNode(3);
root.left.left = new TreeNode(4);
root.left.right = new TreeNode(5);

console.log("Original tree:");
printTree(root);

root = reverseTree(root);

console.log("\nReversed tree:");
printTree(root);
