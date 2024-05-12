package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEFloatList extends AbstractList<Float> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEFloatList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEFloatList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEFloatList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEFloatList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEFloatList_isEmpty(this.swigCPtr, this);
    }

    public EEFloatList() {
        this(EffectCreatorJniJNI.new_EEFloatList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEFloatList(Iterable<Float> iterable) {
        this();
        Iterator<Float> it = iterable.iterator();
        while (it.hasNext()) {
            add(Float.valueOf(it.next().floatValue()));
        }
    }

    private void doAdd(float f) {
        EffectCreatorJniJNI.EEFloatList_doAdd__SWIG_0(this.swigCPtr, this, f);
    }

    private float doGet(int i) {
        return EffectCreatorJniJNI.EEFloatList_doGet(this.swigCPtr, this, i);
    }

    private float doRemove(int i) {
        return EffectCreatorJniJNI.EEFloatList_doRemove(this.swigCPtr, this, i);
    }

    public static long getCPtr(EEFloatList eEFloatList) {
        if (eEFloatList == null) {
            return 0L;
        }
        return eEFloatList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Float f) {
        ((AbstractList) this).modCount++;
        doAdd(f.floatValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Float get(int i) {
        return Float.valueOf(doGet(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public Float remove(int i) {
        ((AbstractList) this).modCount++;
        return Float.valueOf(doRemove(i));
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEFloatList_reserve(this.swigCPtr, this, j);
    }

    public EEFloatList(float[] fArr) {
        this();
        reserve(fArr.length);
        for (float f : fArr) {
            add(Float.valueOf(f));
        }
    }

    public EEFloatList(EEFloatList eEFloatList) {
        this(EffectCreatorJniJNI.new_EEFloatList__SWIG_1(getCPtr(eEFloatList), eEFloatList), true);
    }

    public EEFloatList(int i, float f) {
        this(EffectCreatorJniJNI.new_EEFloatList__SWIG_2(i, f), true);
    }

    private void doAdd(int i, float f) {
        EffectCreatorJniJNI.EEFloatList_doAdd__SWIG_1(this.swigCPtr, this, i, f);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEFloatList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private float doSet(int i, float f) {
        return EffectCreatorJniJNI.EEFloatList_doSet(this.swigCPtr, this, i, f);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Float f) {
        ((AbstractList) this).modCount++;
        doAdd(i, f.floatValue());
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public Float set(int i, Float f) {
        return Float.valueOf(doSet(i, f.floatValue()));
    }

    public EEFloatList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
