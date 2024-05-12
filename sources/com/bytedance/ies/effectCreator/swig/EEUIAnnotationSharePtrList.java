package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEUIAnnotationSharePtrList extends AbstractList<UIAnnotationTransform2DData> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEUIAnnotationSharePtrList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEUIAnnotationSharePtrList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEUIAnnotationSharePtrList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEUIAnnotationSharePtrList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEUIAnnotationSharePtrList_isEmpty(this.swigCPtr, this);
    }

    public EEUIAnnotationSharePtrList() {
        this(EffectCreatorJniJNI.new_EEUIAnnotationSharePtrList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEUIAnnotationSharePtrList(Iterable<UIAnnotationTransform2DData> iterable) {
        this();
        Iterator<UIAnnotationTransform2DData> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        EffectCreatorJniJNI.EEUIAnnotationSharePtrList_doAdd__SWIG_0(this.swigCPtr, this, UIAnnotationTransform2DData.getCPtr(uIAnnotationTransform2DData), uIAnnotationTransform2DData);
    }

    private UIAnnotationTransform2DData doGet(int i) {
        long EEUIAnnotationSharePtrList_doGet = EffectCreatorJniJNI.EEUIAnnotationSharePtrList_doGet(this.swigCPtr, this, i);
        if (EEUIAnnotationSharePtrList_doGet == 0) {
            return null;
        }
        return new UIAnnotationTransform2DData(EEUIAnnotationSharePtrList_doGet, true);
    }

    private UIAnnotationTransform2DData doRemove(int i) {
        long EEUIAnnotationSharePtrList_doRemove = EffectCreatorJniJNI.EEUIAnnotationSharePtrList_doRemove(this.swigCPtr, this, i);
        if (EEUIAnnotationSharePtrList_doRemove == 0) {
            return null;
        }
        return new UIAnnotationTransform2DData(EEUIAnnotationSharePtrList_doRemove, true);
    }

    public static long getCPtr(EEUIAnnotationSharePtrList eEUIAnnotationSharePtrList) {
        if (eEUIAnnotationSharePtrList == null) {
            return 0L;
        }
        return eEUIAnnotationSharePtrList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        ((AbstractList) this).modCount++;
        doAdd(uIAnnotationTransform2DData);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationTransform2DData get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationTransform2DData remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEUIAnnotationSharePtrList_reserve(this.swigCPtr, this, j);
    }

    public EEUIAnnotationSharePtrList(UIAnnotationTransform2DData[] uIAnnotationTransform2DDataArr) {
        this();
        reserve(uIAnnotationTransform2DDataArr.length);
        for (UIAnnotationTransform2DData uIAnnotationTransform2DData : uIAnnotationTransform2DDataArr) {
            add(uIAnnotationTransform2DData);
        }
    }

    public EEUIAnnotationSharePtrList(EEUIAnnotationSharePtrList eEUIAnnotationSharePtrList) {
        this(EffectCreatorJniJNI.new_EEUIAnnotationSharePtrList__SWIG_1(getCPtr(eEUIAnnotationSharePtrList), eEUIAnnotationSharePtrList), true);
    }

    public EEUIAnnotationSharePtrList(int i, UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        this(EffectCreatorJniJNI.new_EEUIAnnotationSharePtrList__SWIG_2(i, UIAnnotationTransform2DData.getCPtr(uIAnnotationTransform2DData), uIAnnotationTransform2DData), true);
    }

    private void doAdd(int i, UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        EffectCreatorJniJNI.EEUIAnnotationSharePtrList_doAdd__SWIG_1(this.swigCPtr, this, i, UIAnnotationTransform2DData.getCPtr(uIAnnotationTransform2DData), uIAnnotationTransform2DData);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEUIAnnotationSharePtrList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private UIAnnotationTransform2DData doSet(int i, UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        long EEUIAnnotationSharePtrList_doSet = EffectCreatorJniJNI.EEUIAnnotationSharePtrList_doSet(this.swigCPtr, this, i, UIAnnotationTransform2DData.getCPtr(uIAnnotationTransform2DData), uIAnnotationTransform2DData);
        if (EEUIAnnotationSharePtrList_doSet == 0) {
            return null;
        }
        return new UIAnnotationTransform2DData(EEUIAnnotationSharePtrList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        ((AbstractList) this).modCount++;
        doAdd(i, uIAnnotationTransform2DData);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEUIAnnotationSharePtrList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public UIAnnotationTransform2DData set(int i, UIAnnotationTransform2DData uIAnnotationTransform2DData) {
        return doSet(i, uIAnnotationTransform2DData);
    }
}
