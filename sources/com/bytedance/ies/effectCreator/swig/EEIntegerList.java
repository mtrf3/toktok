package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEIntegerList extends AbstractList<Integer> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEIntegerList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEIntegerList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEIntegerList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEIntegerList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEIntegerList_isEmpty(this.swigCPtr, this);
    }

    public EEIntegerList() {
        this(EffectCreatorJniJNI.new_EEIntegerList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEIntegerList(Iterable<Integer> iterable) {
        this();
        Iterator<Integer> it = iterable.iterator();
        while (it.hasNext()) {
            add(Integer.valueOf(it.next().intValue()));
        }
    }

    private void doAdd(int i) {
        EffectCreatorJniJNI.EEIntegerList_doAdd__SWIG_0(this.swigCPtr, this, i);
    }

    private int doGet(int i) {
        return EffectCreatorJniJNI.EEIntegerList_doGet(this.swigCPtr, this, i);
    }

    private int doRemove(int i) {
        return EffectCreatorJniJNI.EEIntegerList_doRemove(this.swigCPtr, this, i);
    }

    public static long getCPtr(EEIntegerList eEIntegerList) {
        if (eEIntegerList == null) {
            return 0L;
        }
        return eEIntegerList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Integer num) {
        ((AbstractList) this).modCount++;
        doAdd(num.intValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer get(int i) {
        return Integer.valueOf(doGet(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer remove(int i) {
        ((AbstractList) this).modCount++;
        return Integer.valueOf(doRemove(i));
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEIntegerList_reserve(this.swigCPtr, this, j);
    }

    public EEIntegerList(int[] iArr) {
        this();
        reserve(iArr.length);
        for (int i : iArr) {
            add(Integer.valueOf(i));
        }
    }

    public EEIntegerList(EEIntegerList eEIntegerList) {
        this(EffectCreatorJniJNI.new_EEIntegerList__SWIG_1(getCPtr(eEIntegerList), eEIntegerList), true);
    }

    public EEIntegerList(int i, int i2) {
        this(EffectCreatorJniJNI.new_EEIntegerList__SWIG_2(i, i2), true);
    }

    private void doAdd(int i, int i2) {
        EffectCreatorJniJNI.EEIntegerList_doAdd__SWIG_1(this.swigCPtr, this, i, i2);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEIntegerList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private int doSet(int i, int i2) {
        return EffectCreatorJniJNI.EEIntegerList_doSet(this.swigCPtr, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Integer num) {
        ((AbstractList) this).modCount++;
        doAdd(i, num.intValue());
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public Integer set(int i, Integer num) {
        return Integer.valueOf(doSet(i, num.intValue()));
    }

    public EEIntegerList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
