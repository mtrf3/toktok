package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEStdFeatureList extends AbstractList<Feature> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdFeatureList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEStdFeatureList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEStdFeatureList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEStdFeatureList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdFeatureList_isEmpty(this.swigCPtr, this);
    }

    public EEStdFeatureList() {
        this(EffectCreatorJniJNI.new_EEStdFeatureList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdFeatureList(Iterable<Feature> iterable) {
        this();
        Iterator<Feature> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(Feature feature) {
        EffectCreatorJniJNI.EEStdFeatureList_doAdd__SWIG_0(this.swigCPtr, this, Feature.getCPtr(feature), feature);
    }

    private Feature doGet(int i) {
        long EEStdFeatureList_doGet = EffectCreatorJniJNI.EEStdFeatureList_doGet(this.swigCPtr, this, i);
        if (EEStdFeatureList_doGet == 0) {
            return null;
        }
        return new Feature(EEStdFeatureList_doGet, true);
    }

    private Feature doRemove(int i) {
        long EEStdFeatureList_doRemove = EffectCreatorJniJNI.EEStdFeatureList_doRemove(this.swigCPtr, this, i);
        if (EEStdFeatureList_doRemove == 0) {
            return null;
        }
        return new Feature(EEStdFeatureList_doRemove, true);
    }

    public static long getCPtr(EEStdFeatureList eEStdFeatureList) {
        if (eEStdFeatureList == null) {
            return 0L;
        }
        return eEStdFeatureList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Feature feature) {
        ((AbstractList) this).modCount++;
        doAdd(feature);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Feature get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public Feature remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEStdFeatureList_reserve(this.swigCPtr, this, j);
    }

    public EEStdFeatureList(Feature[] featureArr) {
        this();
        reserve(featureArr.length);
        for (Feature feature : featureArr) {
            add(feature);
        }
    }

    public EEStdFeatureList(EEStdFeatureList eEStdFeatureList) {
        this(EffectCreatorJniJNI.new_EEStdFeatureList__SWIG_1(getCPtr(eEStdFeatureList), eEStdFeatureList), true);
    }

    public EEStdFeatureList(int i, Feature feature) {
        this(EffectCreatorJniJNI.new_EEStdFeatureList__SWIG_2(i, Feature.getCPtr(feature), feature), true);
    }

    private void doAdd(int i, Feature feature) {
        EffectCreatorJniJNI.EEStdFeatureList_doAdd__SWIG_1(this.swigCPtr, this, i, Feature.getCPtr(feature), feature);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEStdFeatureList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private Feature doSet(int i, Feature feature) {
        long EEStdFeatureList_doSet = EffectCreatorJniJNI.EEStdFeatureList_doSet(this.swigCPtr, this, i, Feature.getCPtr(feature), feature);
        if (EEStdFeatureList_doSet == 0) {
            return null;
        }
        return new Feature(EEStdFeatureList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Feature feature) {
        ((AbstractList) this).modCount++;
        doAdd(i, feature);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEStdFeatureList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public Feature set(int i, Feature feature) {
        return doSet(i, feature);
    }
}
