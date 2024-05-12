package com.bytedance.ies.actionai.jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes17.dex */
public class StringList extends AbstractList<String> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                ActionAIJniJNI.delete_StringList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return ActionAIJniJNI.StringList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return ActionAIJniJNI.StringList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        ActionAIJniJNI.StringList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return ActionAIJniJNI.StringList_isEmpty(this.swigCPtr, this);
    }

    public StringList() {
        this(ActionAIJniJNI.new_StringList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public StringList(Iterable<String> iterable) {
        this();
        Iterator<String> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(String str) {
        ActionAIJniJNI.StringList_doAdd__SWIG_0(this.swigCPtr, this, str);
    }

    private String doGet(int i) {
        return ActionAIJniJNI.StringList_doGet(this.swigCPtr, this, i);
    }

    private String doRemove(int i) {
        return ActionAIJniJNI.StringList_doRemove(this.swigCPtr, this, i);
    }

    public static long getCPtr(StringList stringList) {
        if (stringList == null) {
            return 0L;
        }
        return stringList.swigCPtr;
    }

    public static long swigRelease(StringList stringList) {
        if (stringList != null) {
            if (stringList.swigCMemOwn) {
                long j = stringList.swigCPtr;
                stringList.swigCMemOwn = false;
                stringList.delete();
                return j;
            }
            throw new RuntimeException("Cannot release ownership as memory is not owned");
        }
        return 0L;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(String str) {
        ((AbstractList) this).modCount++;
        doAdd(str);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public String remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        ActionAIJniJNI.StringList_reserve(this.swigCPtr, this, j);
    }

    public StringList(String[] strArr) {
        this();
        reserve(strArr.length);
        for (String str : strArr) {
            add(str);
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        return doGet(i);
    }

    public StringList(StringList stringList) {
        this(ActionAIJniJNI.new_StringList__SWIG_1(getCPtr(stringList), stringList), true);
    }

    public StringList(int i, String str) {
        this(ActionAIJniJNI.new_StringList__SWIG_2(i, str), true);
    }

    private void doAdd(int i, String str) {
        ActionAIJniJNI.StringList_doAdd__SWIG_1(this.swigCPtr, this, i, str);
    }

    private void doRemoveRange(int i, int i2) {
        ActionAIJniJNI.StringList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private String doSet(int i, String str) {
        return ActionAIJniJNI.StringList_doSet(this.swigCPtr, this, i, str);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, String str) {
        ((AbstractList) this).modCount++;
        doAdd(i, str);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public StringList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public String set(int i, String str) {
        return doSet(i, str);
    }
}
