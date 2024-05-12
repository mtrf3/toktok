package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEStdUIAnnotationBaseList extends AbstractList<UIAnnotationBase> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdUIAnnotationBaseList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEStdUIAnnotationBaseList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEStdUIAnnotationBaseList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEStdUIAnnotationBaseList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdUIAnnotationBaseList_isEmpty(this.swigCPtr, this);
    }

    public EEStdUIAnnotationBaseList() {
        this(EffectCreatorJniJNI.new_EEStdUIAnnotationBaseList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdUIAnnotationBaseList(Iterable<UIAnnotationBase> iterable) {
        this();
        Iterator<UIAnnotationBase> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(UIAnnotationBase uIAnnotationBase) {
        EffectCreatorJniJNI.EEStdUIAnnotationBaseList_doAdd__SWIG_0(this.swigCPtr, this, UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase);
    }

    private UIAnnotationBase doGet(int i) {
        long EEStdUIAnnotationBaseList_doGet = EffectCreatorJniJNI.EEStdUIAnnotationBaseList_doGet(this.swigCPtr, this, i);
        if (EEStdUIAnnotationBaseList_doGet == 0) {
            return null;
        }
        return new UIAnnotationBase(EEStdUIAnnotationBaseList_doGet, true);
    }

    private UIAnnotationBase doRemove(int i) {
        long EEStdUIAnnotationBaseList_doRemove = EffectCreatorJniJNI.EEStdUIAnnotationBaseList_doRemove(this.swigCPtr, this, i);
        if (EEStdUIAnnotationBaseList_doRemove == 0) {
            return null;
        }
        return new UIAnnotationBase(EEStdUIAnnotationBaseList_doRemove, true);
    }

    public static long getCPtr(EEStdUIAnnotationBaseList eEStdUIAnnotationBaseList) {
        if (eEStdUIAnnotationBaseList == null) {
            return 0L;
        }
        return eEStdUIAnnotationBaseList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(UIAnnotationBase uIAnnotationBase) {
        ((AbstractList) this).modCount++;
        doAdd(uIAnnotationBase);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationBase get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationBase remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEStdUIAnnotationBaseList_reserve(this.swigCPtr, this, j);
    }

    public EEStdUIAnnotationBaseList(UIAnnotationBase[] uIAnnotationBaseArr) {
        this();
        reserve(uIAnnotationBaseArr.length);
        for (UIAnnotationBase uIAnnotationBase : uIAnnotationBaseArr) {
            add(uIAnnotationBase);
        }
    }

    public EEStdUIAnnotationBaseList(EEStdUIAnnotationBaseList eEStdUIAnnotationBaseList) {
        this(EffectCreatorJniJNI.new_EEStdUIAnnotationBaseList__SWIG_1(getCPtr(eEStdUIAnnotationBaseList), eEStdUIAnnotationBaseList), true);
    }

    public EEStdUIAnnotationBaseList(int i, UIAnnotationBase uIAnnotationBase) {
        this(EffectCreatorJniJNI.new_EEStdUIAnnotationBaseList__SWIG_2(i, UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase), true);
    }

    private void doAdd(int i, UIAnnotationBase uIAnnotationBase) {
        EffectCreatorJniJNI.EEStdUIAnnotationBaseList_doAdd__SWIG_1(this.swigCPtr, this, i, UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEStdUIAnnotationBaseList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private UIAnnotationBase doSet(int i, UIAnnotationBase uIAnnotationBase) {
        long EEStdUIAnnotationBaseList_doSet = EffectCreatorJniJNI.EEStdUIAnnotationBaseList_doSet(this.swigCPtr, this, i, UIAnnotationBase.getCPtr(uIAnnotationBase), uIAnnotationBase);
        if (EEStdUIAnnotationBaseList_doSet == 0) {
            return null;
        }
        return new UIAnnotationBase(EEStdUIAnnotationBaseList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, UIAnnotationBase uIAnnotationBase) {
        ((AbstractList) this).modCount++;
        doAdd(i, uIAnnotationBase);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEStdUIAnnotationBaseList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationBase set(int i, UIAnnotationBase uIAnnotationBase) {
        return doSet(i, uIAnnotationBase);
    }
}
