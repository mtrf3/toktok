package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEStdEventActionList extends AbstractList<EventAction> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdEventActionList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEStdEventActionList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEStdEventActionList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEStdEventActionList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdEventActionList_isEmpty(this.swigCPtr, this);
    }

    public EEStdEventActionList() {
        this(EffectCreatorJniJNI.new_EEStdEventActionList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdEventActionList(Iterable<EventAction> iterable) {
        this();
        Iterator<EventAction> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(EventAction eventAction) {
        EffectCreatorJniJNI.EEStdEventActionList_doAdd__SWIG_0(this.swigCPtr, this, EventAction.getCPtr(eventAction), eventAction);
    }

    private EventAction doGet(int i) {
        long EEStdEventActionList_doGet = EffectCreatorJniJNI.EEStdEventActionList_doGet(this.swigCPtr, this, i);
        if (EEStdEventActionList_doGet == 0) {
            return null;
        }
        return new EventAction(EEStdEventActionList_doGet, true);
    }

    private EventAction doRemove(int i) {
        long EEStdEventActionList_doRemove = EffectCreatorJniJNI.EEStdEventActionList_doRemove(this.swigCPtr, this, i);
        if (EEStdEventActionList_doRemove == 0) {
            return null;
        }
        return new EventAction(EEStdEventActionList_doRemove, true);
    }

    public static long getCPtr(EEStdEventActionList eEStdEventActionList) {
        if (eEStdEventActionList == null) {
            return 0L;
        }
        return eEStdEventActionList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(EventAction eventAction) {
        ((AbstractList) this).modCount++;
        doAdd(eventAction);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public EventAction get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public EventAction remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEStdEventActionList_reserve(this.swigCPtr, this, j);
    }

    public EEStdEventActionList(EventAction[] eventActionArr) {
        this();
        reserve(eventActionArr.length);
        for (EventAction eventAction : eventActionArr) {
            add(eventAction);
        }
    }

    public EEStdEventActionList(EEStdEventActionList eEStdEventActionList) {
        this(EffectCreatorJniJNI.new_EEStdEventActionList__SWIG_1(getCPtr(eEStdEventActionList), eEStdEventActionList), true);
    }

    public EEStdEventActionList(int i, EventAction eventAction) {
        this(EffectCreatorJniJNI.new_EEStdEventActionList__SWIG_2(i, EventAction.getCPtr(eventAction), eventAction), true);
    }

    private void doAdd(int i, EventAction eventAction) {
        EffectCreatorJniJNI.EEStdEventActionList_doAdd__SWIG_1(this.swigCPtr, this, i, EventAction.getCPtr(eventAction), eventAction);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEStdEventActionList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private EventAction doSet(int i, EventAction eventAction) {
        long EEStdEventActionList_doSet = EffectCreatorJniJNI.EEStdEventActionList_doSet(this.swigCPtr, this, i, EventAction.getCPtr(eventAction), eventAction);
        if (EEStdEventActionList_doSet == 0) {
            return null;
        }
        return new EventAction(EEStdEventActionList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, EventAction eventAction) {
        ((AbstractList) this).modCount++;
        doAdd(i, eventAction);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEStdEventActionList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public EventAction set(int i, EventAction eventAction) {
        return doSet(i, eventAction);
    }
}
