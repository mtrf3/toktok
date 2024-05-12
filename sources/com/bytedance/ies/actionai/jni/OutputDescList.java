package com.bytedance.ies.actionai.jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes17.dex */
public class OutputDescList extends AbstractList<OutputDescription> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_OutputDescList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return ActionAIJniJNI.OutputDescList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return ActionAIJniJNI.OutputDescList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ActionAIJniJNI.OutputDescList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return ActionAIJniJNI.OutputDescList_isEmpty(this.swigCPtr, this);
    }

    public OutputDescList() {
        this(ActionAIJniJNI.new_OutputDescList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public OutputDescList(Iterable<OutputDescription> iterable) {
        this();
        Iterator<OutputDescription> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(OutputDescription outputDescription) {
        ActionAIJniJNI.OutputDescList_doAdd__SWIG_0(this.swigCPtr, this, OutputDescription.getCPtr(outputDescription), outputDescription);
    }

    private OutputDescription doGet(int i) {
        long OutputDescList_doGet = ActionAIJniJNI.OutputDescList_doGet(this.swigCPtr, this, i);
        if (OutputDescList_doGet == 0) {
            return null;
        }
        return new OutputDescription(OutputDescList_doGet, true);
    }

    private OutputDescription doRemove(int i) {
        long OutputDescList_doRemove = ActionAIJniJNI.OutputDescList_doRemove(this.swigCPtr, this, i);
        if (OutputDescList_doRemove == 0) {
            return null;
        }
        return new OutputDescription(OutputDescList_doRemove, true);
    }

    public static long getCPtr(OutputDescList outputDescList) {
        if (outputDescList == null) {
            return 0L;
        }
        return outputDescList.swigCPtr;
    }

    public static long swigRelease(OutputDescList outputDescList) {
        if (outputDescList != null) {
            if (outputDescList.swigCMemOwn) {
                long j = outputDescList.swigCPtr;
                outputDescList.swigCMemOwn = false;
                outputDescList.delete();
                return j;
            }
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(OutputDescription outputDescription) {
        ((AbstractList) this).modCount++;
        doAdd(outputDescription);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public OutputDescription get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public OutputDescription remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        ActionAIJniJNI.OutputDescList_reserve(this.swigCPtr, this, j);
    }

    public OutputDescList(OutputDescription[] outputDescriptionArr) {
        this();
        reserve(outputDescriptionArr.length);
        for (OutputDescription outputDescription : outputDescriptionArr) {
            add(outputDescription);
        }
    }

    public OutputDescList(OutputDescList outputDescList) {
        this(ActionAIJniJNI.new_OutputDescList__SWIG_1(getCPtr(outputDescList), outputDescList), true);
    }

    public OutputDescList(int i, OutputDescription outputDescription) {
        this(ActionAIJniJNI.new_OutputDescList__SWIG_2(i, OutputDescription.getCPtr(outputDescription), outputDescription), true);
    }

    private void doAdd(int i, OutputDescription outputDescription) {
        ActionAIJniJNI.OutputDescList_doAdd__SWIG_1(this.swigCPtr, this, i, OutputDescription.getCPtr(outputDescription), outputDescription);
    }

    private void doRemoveRange(int i, int i2) {
        ActionAIJniJNI.OutputDescList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private OutputDescription doSet(int i, OutputDescription outputDescription) {
        long OutputDescList_doSet = ActionAIJniJNI.OutputDescList_doSet(this.swigCPtr, this, i, OutputDescription.getCPtr(outputDescription), outputDescription);
        if (OutputDescList_doSet == 0) {
            return null;
        }
        return new OutputDescription(OutputDescList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, OutputDescription outputDescription) {
        ((AbstractList) this).modCount++;
        doAdd(i, outputDescription);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public OutputDescList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public OutputDescription set(int i, OutputDescription outputDescription) {
        return doSet(i, outputDescription);
    }
}
