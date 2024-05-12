package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEStdLokiInfoPtrList extends AbstractList<LokiInfo> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdLokiInfoPtrList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEStdLokiInfoPtrList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEStdLokiInfoPtrList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEStdLokiInfoPtrList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdLokiInfoPtrList_isEmpty(this.swigCPtr, this);
    }

    public EEStdLokiInfoPtrList() {
        this(EffectCreatorJniJNI.new_EEStdLokiInfoPtrList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdLokiInfoPtrList(Iterable<LokiInfo> iterable) {
        this();
        Iterator<LokiInfo> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(LokiInfo lokiInfo) {
        EffectCreatorJniJNI.EEStdLokiInfoPtrList_doAdd__SWIG_0(this.swigCPtr, this, LokiInfo.getCPtr(lokiInfo), lokiInfo);
    }

    private LokiInfo doGet(int i) {
        long EEStdLokiInfoPtrList_doGet = EffectCreatorJniJNI.EEStdLokiInfoPtrList_doGet(this.swigCPtr, this, i);
        if (EEStdLokiInfoPtrList_doGet == 0) {
            return null;
        }
        return new LokiInfo(EEStdLokiInfoPtrList_doGet, true);
    }

    private LokiInfo doRemove(int i) {
        long EEStdLokiInfoPtrList_doRemove = EffectCreatorJniJNI.EEStdLokiInfoPtrList_doRemove(this.swigCPtr, this, i);
        if (EEStdLokiInfoPtrList_doRemove == 0) {
            return null;
        }
        return new LokiInfo(EEStdLokiInfoPtrList_doRemove, true);
    }

    public static long getCPtr(EEStdLokiInfoPtrList eEStdLokiInfoPtrList) {
        if (eEStdLokiInfoPtrList == null) {
            return 0L;
        }
        return eEStdLokiInfoPtrList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(LokiInfo lokiInfo) {
        ((AbstractList) this).modCount++;
        doAdd(lokiInfo);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public LokiInfo get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public LokiInfo remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEStdLokiInfoPtrList_reserve(this.swigCPtr, this, j);
    }

    public EEStdLokiInfoPtrList(LokiInfo[] lokiInfoArr) {
        this();
        reserve(lokiInfoArr.length);
        for (LokiInfo lokiInfo : lokiInfoArr) {
            add(lokiInfo);
        }
    }

    public EEStdLokiInfoPtrList(EEStdLokiInfoPtrList eEStdLokiInfoPtrList) {
        this(EffectCreatorJniJNI.new_EEStdLokiInfoPtrList__SWIG_1(getCPtr(eEStdLokiInfoPtrList), eEStdLokiInfoPtrList), true);
    }

    public EEStdLokiInfoPtrList(int i, LokiInfo lokiInfo) {
        this(EffectCreatorJniJNI.new_EEStdLokiInfoPtrList__SWIG_2(i, LokiInfo.getCPtr(lokiInfo), lokiInfo), true);
    }

    private void doAdd(int i, LokiInfo lokiInfo) {
        EffectCreatorJniJNI.EEStdLokiInfoPtrList_doAdd__SWIG_1(this.swigCPtr, this, i, LokiInfo.getCPtr(lokiInfo), lokiInfo);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEStdLokiInfoPtrList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private LokiInfo doSet(int i, LokiInfo lokiInfo) {
        long EEStdLokiInfoPtrList_doSet = EffectCreatorJniJNI.EEStdLokiInfoPtrList_doSet(this.swigCPtr, this, i, LokiInfo.getCPtr(lokiInfo), lokiInfo);
        if (EEStdLokiInfoPtrList_doSet == 0) {
            return null;
        }
        return new LokiInfo(EEStdLokiInfoPtrList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, LokiInfo lokiInfo) {
        ((AbstractList) this).modCount++;
        doAdd(i, lokiInfo);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEStdLokiInfoPtrList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public LokiInfo set(int i, LokiInfo lokiInfo) {
        return doSet(i, lokiInfo);
    }
}
