package com.bytedance.ies.actionai.jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes17.dex */
public class ActionNodeList extends AbstractList<ActionExecutionNode> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionNodeList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return ActionAIJniJNI.ActionNodeList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return ActionAIJniJNI.ActionNodeList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ActionAIJniJNI.ActionNodeList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return ActionAIJniJNI.ActionNodeList_isEmpty(this.swigCPtr, this);
    }

    public ActionNodeList() {
        this(ActionAIJniJNI.new_ActionNodeList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public ActionNodeList(Iterable<ActionExecutionNode> iterable) {
        this();
        Iterator<ActionExecutionNode> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(ActionExecutionNode actionExecutionNode) {
        ActionAIJniJNI.ActionNodeList_doAdd__SWIG_0(this.swigCPtr, this, ActionExecutionNode.getCPtr(actionExecutionNode), actionExecutionNode);
    }

    private ActionExecutionNode doGet(int i) {
        long ActionNodeList_doGet = ActionAIJniJNI.ActionNodeList_doGet(this.swigCPtr, this, i);
        if (ActionNodeList_doGet == 0) {
            return null;
        }
        return new ActionExecutionNode(ActionNodeList_doGet, true);
    }

    private ActionExecutionNode doRemove(int i) {
        long ActionNodeList_doRemove = ActionAIJniJNI.ActionNodeList_doRemove(this.swigCPtr, this, i);
        if (ActionNodeList_doRemove == 0) {
            return null;
        }
        return new ActionExecutionNode(ActionNodeList_doRemove, true);
    }

    public static long getCPtr(ActionNodeList actionNodeList) {
        if (actionNodeList == null) {
            return 0L;
        }
        return actionNodeList.swigCPtr;
    }

    public static long swigRelease(ActionNodeList actionNodeList) {
        if (actionNodeList != null) {
            if (actionNodeList.swigCMemOwn) {
                long j = actionNodeList.swigCPtr;
                actionNodeList.swigCMemOwn = false;
                actionNodeList.delete();
                return j;
            }
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(ActionExecutionNode actionExecutionNode) {
        ((AbstractList) this).modCount++;
        doAdd(actionExecutionNode);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public ActionExecutionNode get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ActionExecutionNode remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        ActionAIJniJNI.ActionNodeList_reserve(this.swigCPtr, this, j);
    }

    public ActionNodeList(ActionExecutionNode[] actionExecutionNodeArr) {
        this();
        reserve(actionExecutionNodeArr.length);
        for (ActionExecutionNode actionExecutionNode : actionExecutionNodeArr) {
            add(actionExecutionNode);
        }
    }

    public ActionNodeList(ActionNodeList actionNodeList) {
        this(ActionAIJniJNI.new_ActionNodeList__SWIG_1(getCPtr(actionNodeList), actionNodeList), true);
    }

    public ActionNodeList(int i, ActionExecutionNode actionExecutionNode) {
        this(ActionAIJniJNI.new_ActionNodeList__SWIG_2(i, ActionExecutionNode.getCPtr(actionExecutionNode), actionExecutionNode), true);
    }

    private void doAdd(int i, ActionExecutionNode actionExecutionNode) {
        ActionAIJniJNI.ActionNodeList_doAdd__SWIG_1(this.swigCPtr, this, i, ActionExecutionNode.getCPtr(actionExecutionNode), actionExecutionNode);
    }

    private void doRemoveRange(int i, int i2) {
        ActionAIJniJNI.ActionNodeList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private ActionExecutionNode doSet(int i, ActionExecutionNode actionExecutionNode) {
        long ActionNodeList_doSet = ActionAIJniJNI.ActionNodeList_doSet(this.swigCPtr, this, i, ActionExecutionNode.getCPtr(actionExecutionNode), actionExecutionNode);
        if (ActionNodeList_doSet == 0) {
            return null;
        }
        return new ActionExecutionNode(ActionNodeList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, ActionExecutionNode actionExecutionNode) {
        ((AbstractList) this).modCount++;
        doAdd(i, actionExecutionNode);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public ActionNodeList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public ActionExecutionNode set(int i, ActionExecutionNode actionExecutionNode) {
        return doSet(i, actionExecutionNode);
    }
}
