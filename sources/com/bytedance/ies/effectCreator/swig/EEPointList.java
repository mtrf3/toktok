package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEPointList extends AbstractList<EEPoint> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEPointList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEPointList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEPointList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEPointList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEPointList_isEmpty(this.swigCPtr, this);
    }

    public EEPointList() {
        this(EffectCreatorJniJNI.new_EEPointList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEPointList(Iterable<EEPoint> iterable) {
        this();
        Iterator<EEPoint> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(EEPoint eEPoint) {
        EffectCreatorJniJNI.EEPointList_doAdd__SWIG_0(this.swigCPtr, this, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    private EEPoint doGet(int i) {
        return new EEPoint(EffectCreatorJniJNI.EEPointList_doGet(this.swigCPtr, this, i), false);
    }

    private EEPoint doRemove(int i) {
        return new EEPoint(EffectCreatorJniJNI.EEPointList_doRemove(this.swigCPtr, this, i), true);
    }

    public static long getCPtr(EEPointList eEPointList) {
        if (eEPointList == null) {
            return 0L;
        }
        return eEPointList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(EEPoint eEPoint) {
        ((AbstractList) this).modCount++;
        doAdd(eEPoint);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public EEPoint get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public EEPoint remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEPointList_reserve(this.swigCPtr, this, j);
    }

    public EEPointList(EEPoint[] eEPointArr) {
        this();
        reserve(eEPointArr.length);
        for (EEPoint eEPoint : eEPointArr) {
            add(eEPoint);
        }
    }

    public EEPointList(EEPointList eEPointList) {
        this(EffectCreatorJniJNI.new_EEPointList__SWIG_1(getCPtr(eEPointList), eEPointList), true);
    }

    public EEPointList(int i, EEPoint eEPoint) {
        this(EffectCreatorJniJNI.new_EEPointList__SWIG_2(i, EEPoint.getCPtr(eEPoint), eEPoint), true);
    }

    private void doAdd(int i, EEPoint eEPoint) {
        EffectCreatorJniJNI.EEPointList_doAdd__SWIG_1(this.swigCPtr, this, i, EEPoint.getCPtr(eEPoint), eEPoint);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEPointList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private EEPoint doSet(int i, EEPoint eEPoint) {
        return new EEPoint(EffectCreatorJniJNI.EEPointList_doSet(this.swigCPtr, this, i, EEPoint.getCPtr(eEPoint), eEPoint), true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, EEPoint eEPoint) {
        ((AbstractList) this).modCount++;
        doAdd(i, eEPoint);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEPointList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public EEPoint set(int i, EEPoint eEPoint) {
        return doSet(i, eEPoint);
    }
}
