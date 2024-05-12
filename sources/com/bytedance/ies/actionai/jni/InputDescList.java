package com.bytedance.ies.actionai.jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes17.dex */
public class InputDescList extends AbstractList<InputDescription> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_InputDescList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return ActionAIJniJNI.InputDescList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return ActionAIJniJNI.InputDescList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ActionAIJniJNI.InputDescList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return ActionAIJniJNI.InputDescList_isEmpty(this.swigCPtr, this);
    }

    public InputDescList() {
        this(ActionAIJniJNI.new_InputDescList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public InputDescList(Iterable<InputDescription> iterable) {
        this();
        Iterator<InputDescription> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(InputDescription inputDescription) {
        ActionAIJniJNI.InputDescList_doAdd__SWIG_0(this.swigCPtr, this, InputDescription.getCPtr(inputDescription), inputDescription);
    }

    private InputDescription doGet(int i) {
        long InputDescList_doGet = ActionAIJniJNI.InputDescList_doGet(this.swigCPtr, this, i);
        if (InputDescList_doGet == 0) {
            return null;
        }
        return new InputDescription(InputDescList_doGet, true);
    }

    private InputDescription doRemove(int i) {
        long InputDescList_doRemove = ActionAIJniJNI.InputDescList_doRemove(this.swigCPtr, this, i);
        if (InputDescList_doRemove == 0) {
            return null;
        }
        return new InputDescription(InputDescList_doRemove, true);
    }

    public static long getCPtr(InputDescList inputDescList) {
        if (inputDescList == null) {
            return 0L;
        }
        return inputDescList.swigCPtr;
    }

    public static long swigRelease(InputDescList inputDescList) {
        if (inputDescList != null) {
            if (inputDescList.swigCMemOwn) {
                long j = inputDescList.swigCPtr;
                inputDescList.swigCMemOwn = false;
                inputDescList.delete();
                return j;
            }
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(InputDescription inputDescription) {
        ((AbstractList) this).modCount++;
        doAdd(inputDescription);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public InputDescription get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public InputDescription remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        ActionAIJniJNI.InputDescList_reserve(this.swigCPtr, this, j);
    }

    public InputDescList(InputDescription[] inputDescriptionArr) {
        this();
        reserve(inputDescriptionArr.length);
        for (InputDescription inputDescription : inputDescriptionArr) {
            add(inputDescription);
        }
    }

    public InputDescList(InputDescList inputDescList) {
        this(ActionAIJniJNI.new_InputDescList__SWIG_1(getCPtr(inputDescList), inputDescList), true);
    }

    public InputDescList(int i, InputDescription inputDescription) {
        this(ActionAIJniJNI.new_InputDescList__SWIG_2(i, InputDescription.getCPtr(inputDescription), inputDescription), true);
    }

    private void doAdd(int i, InputDescription inputDescription) {
        ActionAIJniJNI.InputDescList_doAdd__SWIG_1(this.swigCPtr, this, i, InputDescription.getCPtr(inputDescription), inputDescription);
    }

    private void doRemoveRange(int i, int i2) {
        ActionAIJniJNI.InputDescList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private InputDescription doSet(int i, InputDescription inputDescription) {
        long InputDescList_doSet = ActionAIJniJNI.InputDescList_doSet(this.swigCPtr, this, i, InputDescription.getCPtr(inputDescription), inputDescription);
        if (InputDescList_doSet == 0) {
            return null;
        }
        return new InputDescription(InputDescList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, InputDescription inputDescription) {
        ((AbstractList) this).modCount++;
        doAdd(i, inputDescription);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public InputDescList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public InputDescription set(int i, InputDescription inputDescription) {
        return doSet(i, inputDescription);
    }
}
