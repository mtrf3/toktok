package com.bytedance.ies.actionai.jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes17.dex */
public class ActionParamDescList extends AbstractList<ActionParamDescription> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_ActionParamDescList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return ActionAIJniJNI.ActionParamDescList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return ActionAIJniJNI.ActionParamDescList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ActionAIJniJNI.ActionParamDescList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return ActionAIJniJNI.ActionParamDescList_isEmpty(this.swigCPtr, this);
    }

    public ActionParamDescList() {
        this(ActionAIJniJNI.new_ActionParamDescList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public ActionParamDescList(Iterable<ActionParamDescription> iterable) {
        this();
        Iterator<ActionParamDescription> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(ActionParamDescription actionParamDescription) {
        ActionAIJniJNI.ActionParamDescList_doAdd__SWIG_0(this.swigCPtr, this, ActionParamDescription.getCPtr(actionParamDescription), actionParamDescription);
    }

    private ActionParamDescription doGet(int i) {
        long ActionParamDescList_doGet = ActionAIJniJNI.ActionParamDescList_doGet(this.swigCPtr, this, i);
        if (ActionParamDescList_doGet == 0) {
            return null;
        }
        return new ActionParamDescription(ActionParamDescList_doGet, true);
    }

    private ActionParamDescription doRemove(int i) {
        long ActionParamDescList_doRemove = ActionAIJniJNI.ActionParamDescList_doRemove(this.swigCPtr, this, i);
        if (ActionParamDescList_doRemove == 0) {
            return null;
        }
        return new ActionParamDescription(ActionParamDescList_doRemove, true);
    }

    public static long getCPtr(ActionParamDescList actionParamDescList) {
        if (actionParamDescList == null) {
            return 0L;
        }
        return actionParamDescList.swigCPtr;
    }

    public static long swigRelease(ActionParamDescList actionParamDescList) {
        if (actionParamDescList != null) {
            if (actionParamDescList.swigCMemOwn) {
                long j = actionParamDescList.swigCPtr;
                actionParamDescList.swigCMemOwn = false;
                actionParamDescList.delete();
                return j;
            }
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(ActionParamDescription actionParamDescription) {
        ((AbstractList) this).modCount++;
        doAdd(actionParamDescription);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public ActionParamDescription get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ActionParamDescription remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        ActionAIJniJNI.ActionParamDescList_reserve(this.swigCPtr, this, j);
    }

    public ActionParamDescList(ActionParamDescription[] actionParamDescriptionArr) {
        this();
        reserve(actionParamDescriptionArr.length);
        for (ActionParamDescription actionParamDescription : actionParamDescriptionArr) {
            add(actionParamDescription);
        }
    }

    public ActionParamDescList(ActionParamDescList actionParamDescList) {
        this(ActionAIJniJNI.new_ActionParamDescList__SWIG_1(getCPtr(actionParamDescList), actionParamDescList), true);
    }

    public ActionParamDescList(int i, ActionParamDescription actionParamDescription) {
        this(ActionAIJniJNI.new_ActionParamDescList__SWIG_2(i, ActionParamDescription.getCPtr(actionParamDescription), actionParamDescription), true);
    }

    private void doAdd(int i, ActionParamDescription actionParamDescription) {
        ActionAIJniJNI.ActionParamDescList_doAdd__SWIG_1(this.swigCPtr, this, i, ActionParamDescription.getCPtr(actionParamDescription), actionParamDescription);
    }

    private void doRemoveRange(int i, int i2) {
        ActionAIJniJNI.ActionParamDescList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private ActionParamDescription doSet(int i, ActionParamDescription actionParamDescription) {
        long ActionParamDescList_doSet = ActionAIJniJNI.ActionParamDescList_doSet(this.swigCPtr, this, i, ActionParamDescription.getCPtr(actionParamDescription), actionParamDescription);
        if (ActionParamDescList_doSet == 0) {
            return null;
        }
        return new ActionParamDescription(ActionParamDescList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, ActionParamDescription actionParamDescription) {
        ((AbstractList) this).modCount++;
        doAdd(i, actionParamDescription);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public ActionParamDescList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public ActionParamDescription set(int i, ActionParamDescription actionParamDescription) {
        return doSet(i, actionParamDescription);
    }
}
