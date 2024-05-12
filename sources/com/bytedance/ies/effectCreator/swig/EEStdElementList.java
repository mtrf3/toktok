package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes34.dex */
public class EEStdElementList extends AbstractList<Element> implements RandomAccess {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdElementList(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int doSize() {
        return EffectCreatorJniJNI.EEStdElementList_doSize(this.swigCPtr, this);
    }

    public long capacity() {
        return EffectCreatorJniJNI.EEStdElementList_capacity(this.swigCPtr, this);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        EffectCreatorJniJNI.EEStdElementList_clear(this.swigCPtr, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdElementList_isEmpty(this.swigCPtr, this);
    }

    public EEStdElementList() {
        this(EffectCreatorJniJNI.new_EEStdElementList__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return doSize();
    }

    public void finalize() {
        delete();
    }

    public EEStdElementList(Iterable<Element> iterable) {
        this();
        Iterator<Element> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next());
        }
    }

    private void doAdd(Element element) {
        EffectCreatorJniJNI.EEStdElementList_doAdd__SWIG_0(this.swigCPtr, this, Element.getCPtr(element), element);
    }

    private Element doGet(int i) {
        long EEStdElementList_doGet = EffectCreatorJniJNI.EEStdElementList_doGet(this.swigCPtr, this, i);
        if (EEStdElementList_doGet == 0) {
            return null;
        }
        return new Element(EEStdElementList_doGet, true);
    }

    private Element doRemove(int i) {
        long EEStdElementList_doRemove = EffectCreatorJniJNI.EEStdElementList_doRemove(this.swigCPtr, this, i);
        if (EEStdElementList_doRemove == 0) {
            return null;
        }
        return new Element(EEStdElementList_doRemove, true);
    }

    public static long getCPtr(EEStdElementList eEStdElementList) {
        if (eEStdElementList == null) {
            return 0L;
        }
        return eEStdElementList.swigCPtr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Element element) {
        ((AbstractList) this).modCount++;
        doAdd(element);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public Element get(int i) {
        return doGet(i);
    }

    @Override // java.util.AbstractList, java.util.List
    public Element remove(int i) {
        ((AbstractList) this).modCount++;
        return doRemove(i);
    }

    public void reserve(long j) {
        EffectCreatorJniJNI.EEStdElementList_reserve(this.swigCPtr, this, j);
    }

    public EEStdElementList(Element[] elementArr) {
        this();
        reserve(elementArr.length);
        for (Element element : elementArr) {
            add(element);
        }
    }

    public EEStdElementList(EEStdElementList eEStdElementList) {
        this(EffectCreatorJniJNI.new_EEStdElementList__SWIG_1(getCPtr(eEStdElementList), eEStdElementList), true);
    }

    public EEStdElementList(int i, Element element) {
        this(EffectCreatorJniJNI.new_EEStdElementList__SWIG_2(i, Element.getCPtr(element), element), true);
    }

    private void doAdd(int i, Element element) {
        EffectCreatorJniJNI.EEStdElementList_doAdd__SWIG_1(this.swigCPtr, this, i, Element.getCPtr(element), element);
    }

    private void doRemoveRange(int i, int i2) {
        EffectCreatorJniJNI.EEStdElementList_doRemoveRange(this.swigCPtr, this, i, i2);
    }

    private Element doSet(int i, Element element) {
        long EEStdElementList_doSet = EffectCreatorJniJNI.EEStdElementList_doSet(this.swigCPtr, this, i, Element.getCPtr(element), element);
        if (EEStdElementList_doSet == 0) {
            return null;
        }
        return new Element(EEStdElementList_doSet, true);
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Element element) {
        ((AbstractList) this).modCount++;
        doAdd(i, element);
    }

    @Override // java.util.AbstractList
    public void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        doRemoveRange(i, i2);
    }

    public EEStdElementList(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public Element set(int i, Element element) {
        return doSet(i, element);
    }
}
