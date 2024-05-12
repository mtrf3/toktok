package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEEventSequenceList extends AbstractList<EventSequence> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEEventSequenceList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEEventSequenceList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEEventSequenceList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEEventSequenceList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEEventSequenceList_isEmpty(this.swigCPtr, this);
    }

    public EEEventSequenceList() {
        this(EffectCreatorJniJNI.new_EEEventSequenceList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEEventSequenceList(Iterable<EventSequence> iterable) {
        this();
        Iterator<EventSequence> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(EventSequence eventSequence) {
        EffectCreatorJniJNI.EEEventSequenceList_doAdd__SWIG_0(this.swigCPtr, this, EventSequence.getCPtr(eventSequence), eventSequence);
    }

    private EventSequence doGet(int i) {
        long EEEventSequenceList_doGet = EffectCreatorJniJNI.EEEventSequenceList_doGet(this.swigCPtr, this, i);
        if (EEEventSequenceList_doGet == 0) {
            return null;
        }
        return new EventSequence(EEEventSequenceList_doGet, true);
    }

    private EventSequence doRemove(int i) {
        long EEEventSequenceList_doRemove = EffectCreatorJniJNI.EEEventSequenceList_doRemove(this.swigCPtr, this, i);
        if (EEEventSequenceList_doRemove == 0) {
            return null;
        }
        return new EventSequence(EEEventSequenceList_doRemove, true);
    }

    public static long getCPtr(EEEventSequenceList eEEventSequenceList) {
        if (eEEventSequenceList == null) {
            return 0L;
        }
        return eEEventSequenceList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(EventSequence eventSequence) {
        ((AbstractList) this).modCount++;
        doAdd(eventSequence);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public EventSequence get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public EventSequence remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEEventSequenceList_reserve(this.swigCPtr, this, j);
    }

    public EEEventSequenceList(EventSequence[] eventSequenceArr) {
        this();
        reserve(eventSequenceArr.length);
        for (EventSequence eventSequence : eventSequenceArr) {
            add(eventSequence);
        }
    }

    public EEEventSequenceList(EEEventSequenceList eEEventSequenceList) {
        this(EffectCreatorJniJNI.new_EEEventSequenceList__SWIG_1(getCPtr(eEEventSequenceList), eEEventSequenceList), true);
    }

    public EEEventSequenceList(int i, EventSequence eventSequence) {
        this(EffectCreatorJniJNI.new_EEEventSequenceList__SWIG_2(i, EventSequence.getCPtr(eventSequence), eventSequence), true);
    }

    private void doAdd(int i, EventSequence eventSequence) {
        EffectCreatorJniJNI.EEEventSequenceList_doAdd__SWIG_1(this.swigCPtr, this, i, EventSequence.getCPtr(eventSequence), eventSequence);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEEventSequenceList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private EventSequence doSet(int i, EventSequence eventSequence) {
        long EEEventSequenceList_doSet = EffectCreatorJniJNI.EEEventSequenceList_doSet(this.swigCPtr, this, i, EventSequence.getCPtr(eventSequence), eventSequence);
        if (EEEventSequenceList_doSet == 0) {
            return null;
        }
        return new EventSequence(EEEventSequenceList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, EventSequence eventSequence) {
        ((AbstractList) this).modCount++;
        doAdd(i, eventSequence);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEEventSequenceList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public EventSequence set(int i, EventSequence eventSequence) {
        return doSet(i, eventSequence);
    }
}
