package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEStdEventCommandList extends AbstractList<EventCommand> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdEventCommandList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEStdEventCommandList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEStdEventCommandList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEStdEventCommandList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdEventCommandList_isEmpty(this.swigCPtr, this);
    }

    public EEStdEventCommandList() {
        this(EffectCreatorJniJNI.new_EEStdEventCommandList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdEventCommandList(Iterable<EventCommand> iterable) {
        this();
        Iterator<EventCommand> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(EventCommand eventCommand) {
        EffectCreatorJniJNI.EEStdEventCommandList_doAdd__SWIG_0(this.swigCPtr, this, EventCommand.getCPtr(eventCommand), eventCommand);
    }

    private EventCommand doGet(int i) {
        long EEStdEventCommandList_doGet = EffectCreatorJniJNI.EEStdEventCommandList_doGet(this.swigCPtr, this, i);
        if (EEStdEventCommandList_doGet == 0) {
            return null;
        }
        return new EventCommand(EEStdEventCommandList_doGet, true);
    }

    private EventCommand doRemove(int i) {
        long EEStdEventCommandList_doRemove = EffectCreatorJniJNI.EEStdEventCommandList_doRemove(this.swigCPtr, this, i);
        if (EEStdEventCommandList_doRemove == 0) {
            return null;
        }
        return new EventCommand(EEStdEventCommandList_doRemove, true);
    }

    public static long getCPtr(EEStdEventCommandList eEStdEventCommandList) {
        if (eEStdEventCommandList == null) {
            return 0L;
        }
        return eEStdEventCommandList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(EventCommand eventCommand) {
        ((AbstractList) this).modCount++;
        doAdd(eventCommand);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public EventCommand get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public EventCommand remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEStdEventCommandList_reserve(this.swigCPtr, this, j);
    }

    public EEStdEventCommandList(EventCommand[] eventCommandArr) {
        this();
        reserve(eventCommandArr.length);
        for (EventCommand eventCommand : eventCommandArr) {
            add(eventCommand);
        }
    }

    public EEStdEventCommandList(EEStdEventCommandList eEStdEventCommandList) {
        this(EffectCreatorJniJNI.new_EEStdEventCommandList__SWIG_1(getCPtr(eEStdEventCommandList), eEStdEventCommandList), true);
    }

    public EEStdEventCommandList(int i, EventCommand eventCommand) {
        this(EffectCreatorJniJNI.new_EEStdEventCommandList__SWIG_2(i, EventCommand.getCPtr(eventCommand), eventCommand), true);
    }

    private void doAdd(int i, EventCommand eventCommand) {
        EffectCreatorJniJNI.EEStdEventCommandList_doAdd__SWIG_1(this.swigCPtr, this, i, EventCommand.getCPtr(eventCommand), eventCommand);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEStdEventCommandList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private EventCommand doSet(int i, EventCommand eventCommand) {
        long EEStdEventCommandList_doSet = EffectCreatorJniJNI.EEStdEventCommandList_doSet(this.swigCPtr, this, i, EventCommand.getCPtr(eventCommand), eventCommand);
        if (EEStdEventCommandList_doSet == 0) {
            return null;
        }
        return new EventCommand(EEStdEventCommandList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, EventCommand eventCommand) {
        ((AbstractList) this).modCount++;
        doAdd(i, eventCommand);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEStdEventCommandList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public EventCommand set(int i, EventCommand eventCommand) {
        return doSet(i, eventCommand);
    }
}
