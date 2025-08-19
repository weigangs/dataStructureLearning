package com.weigangs.dsa.tree;

public interface TreeNode <E> {

    E getElement();

    TreeNode<E> [] getChildes();

    void accept(TreeVisitor<E> visitor);
}
