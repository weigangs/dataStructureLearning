package com.weigangs.dsa.tree;

public interface TreeVisitor<E> {

    void visitTree(TreeNode<E> rootNode);

}
