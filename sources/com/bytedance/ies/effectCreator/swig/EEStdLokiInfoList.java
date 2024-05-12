package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEStdLokiInfoList extends AbstractList<LokiInfo> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdLokiInfoList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEStdLokiInfoList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEStdLokiInfoList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEStdLokiInfoList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdLokiInfoList_isEmpty(this.swigCPtr, this);
    }

    public EEStdLokiInfoList() {
        this(EffectCreatorJniJNI.new_EEStdLokiInfoList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdLokiInfoList(Iterable<LokiInfo> iterable) {
        this();
        Iterator<LokiInfo> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(LokiInfo lokiInfo) {
        EffectCreatorJniJNI.EEStdLokiInfoList_doAdd__SWIG_0(this.swigCPtr, this, LokiInfo.getCPtr(lokiInfo), lokiInfo);
    }

    private LokiInfo doGet(int i) {
        return new LokiInfo(EffectCreatorJniJNI.EEStdLokiInfoList_doGet(this.swigCPtr, this, i), true);
    }

    private LokiInfo doRemove(int i) {
        return new LokiInfo(EffectCreatorJniJNI.EEStdLokiInfoList_doRemove(this.swigCPtr, this, i), true);
    }

    public static long getCPtr(EEStdLokiInfoList eEStdLokiInfoList) {
        if (eEStdLokiInfoList == null) {
            return 0L;
        }
        return eEStdLokiInfoList.swigCPtr;
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
        EffectCreatorJniJNI.EEStdLokiInfoList_reserve(this.swigCPtr, this, j);
    }

    public EEStdLokiInfoList(LokiInfo[] lokiInfoArr) {
        this();
        reserve(lokiInfoArr.length);
        for (LokiInfo lokiInfo : lokiInfoArr) {
            add(lokiInfo);
        }
    }

    public EEStdLokiInfoList(EEStdLokiInfoList eEStdLokiInfoList) {
        this(EffectCreatorJniJNI.new_EEStdLokiInfoList__SWIG_1(getCPtr(eEStdLokiInfoList), eEStdLokiInfoList), true);
    }

    public EEStdLokiInfoList(int i, LokiInfo lokiInfo) {
        this(EffectCreatorJniJNI.new_EEStdLokiInfoList__SWIG_2(i, LokiInfo.getCPtr(lokiInfo), lokiInfo), true);
    }

    private void doAdd(int i, LokiInfo lokiInfo) {
        EffectCreatorJniJNI.EEStdLokiInfoList_doAdd__SWIG_1(this.swigCPtr, this, i, LokiInfo.getCPtr(lokiInfo), lokiInfo);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEStdLokiInfoList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private LokiInfo doSet(int i, LokiInfo lokiInfo) {
        return new LokiInfo(EffectCreatorJniJNI.EEStdLokiInfoList_doSet(this.swigCPtr, this, i, LokiInfo.getCPtr(lokiInfo), lokiInfo), true);
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

    public EEStdLokiInfoList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public LokiInfo set(int i, LokiInfo lokiInfo) {
        return doSet(i, lokiInfo);
    }
}
