package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEStdElementIdList extends AbstractList<ElementId> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdElementIdList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEStdElementIdList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEStdElementIdList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEStdElementIdList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdElementIdList_isEmpty(this.swigCPtr, this);
    }

    public EEStdElementIdList() {
        this(EffectCreatorJniJNI.new_EEStdElementIdList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdElementIdList(Iterable<ElementId> iterable) {
        this();
        Iterator<ElementId> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(ElementId elementId) {
        EffectCreatorJniJNI.EEStdElementIdList_doAdd__SWIG_0(this.swigCPtr, this, ElementId.getCPtr(elementId), elementId);
    }

    private ElementId doGet(int i) {
        return new ElementId(EffectCreatorJniJNI.EEStdElementIdList_doGet(this.swigCPtr, this, i), true);
    }

    private ElementId doRemove(int i) {
        return new ElementId(EffectCreatorJniJNI.EEStdElementIdList_doRemove(this.swigCPtr, this, i), true);
    }

    public static long getCPtr(EEStdElementIdList eEStdElementIdList) {
        if (eEStdElementIdList == null) {
            return 0L;
        }
        return eEStdElementIdList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(ElementId elementId) {
        ((AbstractList) this).modCount++;
        doAdd(elementId);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public ElementId get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public ElementId remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEStdElementIdList_reserve(this.swigCPtr, this, j);
    }

    public EEStdElementIdList(ElementId[] elementIdArr) {
        this();
        reserve(elementIdArr.length);
        for (ElementId elementId : elementIdArr) {
            add(elementId);
        }
    }

    public EEStdElementIdList(EEStdElementIdList eEStdElementIdList) {
        this(EffectCreatorJniJNI.new_EEStdElementIdList__SWIG_1(getCPtr(eEStdElementIdList), eEStdElementIdList), true);
    }

    public EEStdElementIdList(int i, ElementId elementId) {
        this(EffectCreatorJniJNI.new_EEStdElementIdList__SWIG_2(i, ElementId.getCPtr(elementId), elementId), true);
    }

    private void doAdd(int i, ElementId elementId) {
        EffectCreatorJniJNI.EEStdElementIdList_doAdd__SWIG_1(this.swigCPtr, this, i, ElementId.getCPtr(elementId), elementId);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEStdElementIdList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private ElementId doSet(int i, ElementId elementId) {
        return new ElementId(EffectCreatorJniJNI.EEStdElementIdList_doSet(this.swigCPtr, this, i, ElementId.getCPtr(elementId), elementId), true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, ElementId elementId) {
        ((AbstractList) this).modCount++;
        doAdd(i, elementId);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEStdElementIdList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public ElementId set(int i, ElementId elementId) {
        return doSet(i, elementId);
    }
}
