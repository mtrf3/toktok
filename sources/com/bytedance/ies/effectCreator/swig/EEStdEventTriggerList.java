package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEStdEventTriggerList extends AbstractList<EventTrigger> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdEventTriggerList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEStdEventTriggerList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEStdEventTriggerList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEStdEventTriggerList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdEventTriggerList_isEmpty(this.swigCPtr, this);
    }

    public EEStdEventTriggerList() {
        this(EffectCreatorJniJNI.new_EEStdEventTriggerList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdEventTriggerList(Iterable<EventTrigger> iterable) {
        this();
        Iterator<EventTrigger> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(EventTrigger eventTrigger) {
        EffectCreatorJniJNI.EEStdEventTriggerList_doAdd__SWIG_0(this.swigCPtr, this, EventTrigger.getCPtr(eventTrigger), eventTrigger);
    }

    private EventTrigger doGet(int i) {
        long EEStdEventTriggerList_doGet = EffectCreatorJniJNI.EEStdEventTriggerList_doGet(this.swigCPtr, this, i);
        if (EEStdEventTriggerList_doGet == 0) {
            return null;
        }
        return new EventTrigger(EEStdEventTriggerList_doGet, true);
    }

    private EventTrigger doRemove(int i) {
        long EEStdEventTriggerList_doRemove = EffectCreatorJniJNI.EEStdEventTriggerList_doRemove(this.swigCPtr, this, i);
        if (EEStdEventTriggerList_doRemove == 0) {
            return null;
        }
        return new EventTrigger(EEStdEventTriggerList_doRemove, true);
    }

    public static long getCPtr(EEStdEventTriggerList eEStdEventTriggerList) {
        if (eEStdEventTriggerList == null) {
            return 0L;
        }
        return eEStdEventTriggerList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(EventTrigger eventTrigger) {
        ((AbstractList) this).modCount++;
        doAdd(eventTrigger);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public EventTrigger get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public EventTrigger remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEStdEventTriggerList_reserve(this.swigCPtr, this, j);
    }

    public EEStdEventTriggerList(EventTrigger[] eventTriggerArr) {
        this();
        reserve(eventTriggerArr.length);
        for (EventTrigger eventTrigger : eventTriggerArr) {
            add(eventTrigger);
        }
    }

    public EEStdEventTriggerList(EEStdEventTriggerList eEStdEventTriggerList) {
        this(EffectCreatorJniJNI.new_EEStdEventTriggerList__SWIG_1(getCPtr(eEStdEventTriggerList), eEStdEventTriggerList), true);
    }

    public EEStdEventTriggerList(int i, EventTrigger eventTrigger) {
        this(EffectCreatorJniJNI.new_EEStdEventTriggerList__SWIG_2(i, EventTrigger.getCPtr(eventTrigger), eventTrigger), true);
    }

    private void doAdd(int i, EventTrigger eventTrigger) {
        EffectCreatorJniJNI.EEStdEventTriggerList_doAdd__SWIG_1(this.swigCPtr, this, i, EventTrigger.getCPtr(eventTrigger), eventTrigger);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEStdEventTriggerList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private EventTrigger doSet(int i, EventTrigger eventTrigger) {
        long EEStdEventTriggerList_doSet = EffectCreatorJniJNI.EEStdEventTriggerList_doSet(this.swigCPtr, this, i, EventTrigger.getCPtr(eventTrigger), eventTrigger);
        if (EEStdEventTriggerList_doSet == 0) {
            return null;
        }
        return new EventTrigger(EEStdEventTriggerList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, EventTrigger eventTrigger) {
        ((AbstractList) this).modCount++;
        doAdd(i, eventTrigger);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEStdEventTriggerList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public EventTrigger set(int i, EventTrigger eventTrigger) {
        return doSet(i, eventTrigger);
    }
}
