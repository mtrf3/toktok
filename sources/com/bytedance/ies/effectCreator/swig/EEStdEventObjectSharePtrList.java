package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEStdEventObjectSharePtrList extends AbstractList<EventObject> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdEventObjectSharePtrList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEStdEventObjectSharePtrList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEStdEventObjectSharePtrList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEStdEventObjectSharePtrList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdEventObjectSharePtrList_isEmpty(this.swigCPtr, this);
    }

    public EEStdEventObjectSharePtrList() {
        this(EffectCreatorJniJNI.new_EEStdEventObjectSharePtrList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdEventObjectSharePtrList(Iterable<EventObject> iterable) {
        this();
        Iterator<EventObject> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(EventObject eventObject) {
        EffectCreatorJniJNI.EEStdEventObjectSharePtrList_doAdd__SWIG_0(this.swigCPtr, this, EventObject.getCPtr(eventObject), eventObject);
    }

    private EventObject doGet(int i) {
        long EEStdEventObjectSharePtrList_doGet = EffectCreatorJniJNI.EEStdEventObjectSharePtrList_doGet(this.swigCPtr, this, i);
        if (EEStdEventObjectSharePtrList_doGet == 0) {
            return null;
        }
        return new EventObject(EEStdEventObjectSharePtrList_doGet, true);
    }

    private EventObject doRemove(int i) {
        long EEStdEventObjectSharePtrList_doRemove = EffectCreatorJniJNI.EEStdEventObjectSharePtrList_doRemove(this.swigCPtr, this, i);
        if (EEStdEventObjectSharePtrList_doRemove == 0) {
            return null;
        }
        return new EventObject(EEStdEventObjectSharePtrList_doRemove, true);
    }

    public static long getCPtr(EEStdEventObjectSharePtrList eEStdEventObjectSharePtrList) {
        if (eEStdEventObjectSharePtrList == null) {
            return 0L;
        }
        return eEStdEventObjectSharePtrList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(EventObject eventObject) {
        ((AbstractList) this).modCount++;
        doAdd(eventObject);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public EventObject get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public EventObject remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEStdEventObjectSharePtrList_reserve(this.swigCPtr, this, j);
    }

    public EEStdEventObjectSharePtrList(EventObject[] eventObjectArr) {
        this();
        reserve(eventObjectArr.length);
        for (EventObject eventObject : eventObjectArr) {
            add(eventObject);
        }
    }

    public EEStdEventObjectSharePtrList(EEStdEventObjectSharePtrList eEStdEventObjectSharePtrList) {
        this(EffectCreatorJniJNI.new_EEStdEventObjectSharePtrList__SWIG_1(getCPtr(eEStdEventObjectSharePtrList), eEStdEventObjectSharePtrList), true);
    }

    public EEStdEventObjectSharePtrList(int i, EventObject eventObject) {
        this(EffectCreatorJniJNI.new_EEStdEventObjectSharePtrList__SWIG_2(i, EventObject.getCPtr(eventObject), eventObject), true);
    }

    private void doAdd(int i, EventObject eventObject) {
        EffectCreatorJniJNI.EEStdEventObjectSharePtrList_doAdd__SWIG_1(this.swigCPtr, this, i, EventObject.getCPtr(eventObject), eventObject);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEStdEventObjectSharePtrList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private EventObject doSet(int i, EventObject eventObject) {
        long EEStdEventObjectSharePtrList_doSet = EffectCreatorJniJNI.EEStdEventObjectSharePtrList_doSet(this.swigCPtr, this, i, EventObject.getCPtr(eventObject), eventObject);
        if (EEStdEventObjectSharePtrList_doSet == 0) {
            return null;
        }
        return new EventObject(EEStdEventObjectSharePtrList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, EventObject eventObject) {
        ((AbstractList) this).modCount++;
        doAdd(i, eventObject);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEStdEventObjectSharePtrList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public EventObject set(int i, EventObject eventObject) {
        return doSet(i, eventObject);
    }
}
