package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEStdElementItemSharePtrList extends AbstractList<EventItem> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdElementItemSharePtrList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEStdElementItemSharePtrList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEStdElementItemSharePtrList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEStdElementItemSharePtrList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdElementItemSharePtrList_isEmpty(this.swigCPtr, this);
    }

    public EEStdElementItemSharePtrList() {
        this(EffectCreatorJniJNI.new_EEStdElementItemSharePtrList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdElementItemSharePtrList(Iterable<EventItem> iterable) {
        this();
        Iterator<EventItem> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(EventItem eventItem) {
        EffectCreatorJniJNI.EEStdElementItemSharePtrList_doAdd__SWIG_0(this.swigCPtr, this, EventItem.getCPtr(eventItem), eventItem);
    }

    private EventItem doGet(int i) {
        long EEStdElementItemSharePtrList_doGet = EffectCreatorJniJNI.EEStdElementItemSharePtrList_doGet(this.swigCPtr, this, i);
        if (EEStdElementItemSharePtrList_doGet == 0) {
            return null;
        }
        return new EventItem(EEStdElementItemSharePtrList_doGet, true);
    }

    private EventItem doRemove(int i) {
        long EEStdElementItemSharePtrList_doRemove = EffectCreatorJniJNI.EEStdElementItemSharePtrList_doRemove(this.swigCPtr, this, i);
        if (EEStdElementItemSharePtrList_doRemove == 0) {
            return null;
        }
        return new EventItem(EEStdElementItemSharePtrList_doRemove, true);
    }

    public static long getCPtr(EEStdElementItemSharePtrList eEStdElementItemSharePtrList) {
        if (eEStdElementItemSharePtrList == null) {
            return 0L;
        }
        return eEStdElementItemSharePtrList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(EventItem eventItem) {
        ((AbstractList) this).modCount++;
        doAdd(eventItem);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public EventItem get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public EventItem remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEStdElementItemSharePtrList_reserve(this.swigCPtr, this, j);
    }

    public EEStdElementItemSharePtrList(EventItem[] eventItemArr) {
        this();
        reserve(eventItemArr.length);
        for (EventItem eventItem : eventItemArr) {
            add(eventItem);
        }
    }

    public EEStdElementItemSharePtrList(EEStdElementItemSharePtrList eEStdElementItemSharePtrList) {
        this(EffectCreatorJniJNI.new_EEStdElementItemSharePtrList__SWIG_1(getCPtr(eEStdElementItemSharePtrList), eEStdElementItemSharePtrList), true);
    }

    public EEStdElementItemSharePtrList(int i, EventItem eventItem) {
        this(EffectCreatorJniJNI.new_EEStdElementItemSharePtrList__SWIG_2(i, EventItem.getCPtr(eventItem), eventItem), true);
    }

    private void doAdd(int i, EventItem eventItem) {
        EffectCreatorJniJNI.EEStdElementItemSharePtrList_doAdd__SWIG_1(this.swigCPtr, this, i, EventItem.getCPtr(eventItem), eventItem);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEStdElementItemSharePtrList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private EventItem doSet(int i, EventItem eventItem) {
        long EEStdElementItemSharePtrList_doSet = EffectCreatorJniJNI.EEStdElementItemSharePtrList_doSet(this.swigCPtr, this, i, EventItem.getCPtr(eventItem), eventItem);
        if (EEStdElementItemSharePtrList_doSet == 0) {
            return null;
        }
        return new EventItem(EEStdElementItemSharePtrList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, EventItem eventItem) {
        ((AbstractList) this).modCount++;
        doAdd(i, eventItem);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEStdElementItemSharePtrList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public EventItem set(int i, EventItem eventItem) {
        return doSet(i, eventItem);
    }
}
