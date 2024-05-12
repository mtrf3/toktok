package com.livecore.base.tinyjson;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class TreeNode<T> {
    public final List<TreeNode<T>> children;
    public T data;
    public final TreeNode<T> parent;

    public final List<TreeNode<T>> getChildren() {
        return this.children;
    }

    public final T getData() {
        return this.data;
    }

    public final TreeNode<T> getParent() {
        return this.parent;
    }

    public final void setData(T t) {
        o.LJIIIZ(t, "<set-?>");
        this.data = t;
    }

    public TreeNode(T data, TreeNode<T> treeNode, List<TreeNode<T>> children) {
        o.LJIIIZ(data, "data");
        o.LJIIIZ(children, "children");
        this.data = data;
        this.parent = treeNode;
        this.children = children;
    }

    public /* synthetic */ TreeNode(Object obj, TreeNode treeNode, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, treeNode, (i & 4) != 0 ? new ArrayList() : list);
    }
}
