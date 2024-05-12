package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEStdStringList extends AbstractList<String> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdStringList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEStdStringList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEStdStringList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEStdStringList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdStringList_isEmpty(this.swigCPtr, this);
    }

    public EEStdStringList() {
        this(EffectCreatorJniJNI.new_EEStdStringList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdStringList(Iterable<String> iterable) {
        this();
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(String str) {
        EffectCreatorJniJNI.EEStdStringList_doAdd__SWIG_0(this.swigCPtr, this, str);
    }

    private String doGet(int i) {
        return EffectCreatorJniJNI.EEStdStringList_doGet(this.swigCPtr, this, i);
    }

    private String doRemove(int i) {
        return EffectCreatorJniJNI.EEStdStringList_doRemove(this.swigCPtr, this, i);
    }

    public static long getCPtr(EEStdStringList eEStdStringList) {
        if (eEStdStringList == null) {
            return 0L;
        }
        return eEStdStringList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(String str) {
        ((AbstractList) this).modCount++;
        doAdd(str);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public String remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEStdStringList_reserve(this.swigCPtr, this, j);
    }

    public EEStdStringList(String[] strArr) {
        this();
        reserve(strArr.length);
        for (String str : strArr) {
            add(str);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return doGet(i);
    }

    public EEStdStringList(EEStdStringList eEStdStringList) {
        this(EffectCreatorJniJNI.new_EEStdStringList__SWIG_1(getCPtr(eEStdStringList), eEStdStringList), true);
    }

    public EEStdStringList(int i, String str) {
        this(EffectCreatorJniJNI.new_EEStdStringList__SWIG_2(i, str), true);
    }

    private void doAdd(int i, String str) {
        EffectCreatorJniJNI.EEStdStringList_doAdd__SWIG_1(this.swigCPtr, this, i, str);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEStdStringList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private String doSet(int i, String str) {
        return EffectCreatorJniJNI.EEStdStringList_doSet(this.swigCPtr, this, i, str);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, String str) {
        ((AbstractList) this).modCount++;
        doAdd(i, str);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEStdStringList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public String set(int i, String str) {
        return doSet(i, str);
    }
}
