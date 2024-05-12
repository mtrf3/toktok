package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEStdEventCommandUnitList extends AbstractList<EventCommandUnit> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdEventCommandUnitList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEStdEventCommandUnitList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEStdEventCommandUnitList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEStdEventCommandUnitList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdEventCommandUnitList_isEmpty(this.swigCPtr, this);
    }

    public EEStdEventCommandUnitList() {
        this(EffectCreatorJniJNI.new_EEStdEventCommandUnitList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdEventCommandUnitList(Iterable<EventCommandUnit> iterable) {
        this();
        Iterator<EventCommandUnit> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(EventCommandUnit eventCommandUnit) {
        EffectCreatorJniJNI.EEStdEventCommandUnitList_doAdd__SWIG_0(this.swigCPtr, this, EventCommandUnit.getCPtr(eventCommandUnit), eventCommandUnit);
    }

    private EventCommandUnit doGet(int i) {
        long EEStdEventCommandUnitList_doGet = EffectCreatorJniJNI.EEStdEventCommandUnitList_doGet(this.swigCPtr, this, i);
        if (EEStdEventCommandUnitList_doGet == 0) {
            return null;
        }
        return new EventCommandUnit(EEStdEventCommandUnitList_doGet, true);
    }

    private EventCommandUnit doRemove(int i) {
        long EEStdEventCommandUnitList_doRemove = EffectCreatorJniJNI.EEStdEventCommandUnitList_doRemove(this.swigCPtr, this, i);
        if (EEStdEventCommandUnitList_doRemove == 0) {
            return null;
        }
        return new EventCommandUnit(EEStdEventCommandUnitList_doRemove, true);
    }

    public static long getCPtr(EEStdEventCommandUnitList eEStdEventCommandUnitList) {
        if (eEStdEventCommandUnitList == null) {
            return 0L;
        }
        return eEStdEventCommandUnitList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(EventCommandUnit eventCommandUnit) {
        ((AbstractList) this).modCount++;
        doAdd(eventCommandUnit);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public EventCommandUnit get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public EventCommandUnit remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEStdEventCommandUnitList_reserve(this.swigCPtr, this, j);
    }

    public EEStdEventCommandUnitList(EventCommandUnit[] eventCommandUnitArr) {
        this();
        reserve(eventCommandUnitArr.length);
        for (EventCommandUnit eventCommandUnit : eventCommandUnitArr) {
            add(eventCommandUnit);
        }
    }

    public EEStdEventCommandUnitList(EEStdEventCommandUnitList eEStdEventCommandUnitList) {
        this(EffectCreatorJniJNI.new_EEStdEventCommandUnitList__SWIG_1(getCPtr(eEStdEventCommandUnitList), eEStdEventCommandUnitList), true);
    }

    public EEStdEventCommandUnitList(int i, EventCommandUnit eventCommandUnit) {
        this(EffectCreatorJniJNI.new_EEStdEventCommandUnitList__SWIG_2(i, EventCommandUnit.getCPtr(eventCommandUnit), eventCommandUnit), true);
    }

    private void doAdd(int i, EventCommandUnit eventCommandUnit) {
        EffectCreatorJniJNI.EEStdEventCommandUnitList_doAdd__SWIG_1(this.swigCPtr, this, i, EventCommandUnit.getCPtr(eventCommandUnit), eventCommandUnit);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEStdEventCommandUnitList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private EventCommandUnit doSet(int i, EventCommandUnit eventCommandUnit) {
        long EEStdEventCommandUnitList_doSet = EffectCreatorJniJNI.EEStdEventCommandUnitList_doSet(this.swigCPtr, this, i, EventCommandUnit.getCPtr(eventCommandUnit), eventCommandUnit);
        if (EEStdEventCommandUnitList_doSet == 0) {
            return null;
        }
        return new EventCommandUnit(EEStdEventCommandUnitList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, EventCommandUnit eventCommandUnit) {
        ((AbstractList) this).modCount++;
        doAdd(i, eventCommandUnit);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEStdEventCommandUnitList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public EventCommandUnit set(int i, EventCommandUnit eventCommandUnit) {
        return doSet(i, eventCommandUnit);
    }
}
