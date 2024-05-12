package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.NoSuchElementException;

/* loaded from: classes34.dex */
public class EEStdElementSet extends AbstractSet<Element> {
    public transient boolean swigCMemOwn;
    public transient long swigCPtr;

    /* loaded from: classes34.dex */
    public static class Iterator {
        public transient boolean swigCMemOwn;
        public transient long swigCPtr;

        public synchronized void delete() {
            long j = this.swigCPtr;
            if (j != 0) {
                if (this.swigCMemOwn) {
                    this.swigCMemOwn = false;
                    EffectCreatorJniJNI.delete_EEStdElementSet_Iterator(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public Element derefUnchecked() {
            long EEStdElementSet_Iterator_derefUnchecked = EffectCreatorJniJNI.EEStdElementSet_Iterator_derefUnchecked(this.swigCPtr, this);
            if (EEStdElementSet_Iterator_derefUnchecked == 0) {
                return null;
            }
            return new Element(EEStdElementSet_Iterator_derefUnchecked, true);
        }

        public void incrementUnchecked() {
            EffectCreatorJniJNI.EEStdElementSet_Iterator_incrementUnchecked(this.swigCPtr, this);
        }

        public void finalize() {
            delete();
        }

        public static long getCPtr(Iterator iterator) {
            if (iterator == null) {
                return 0L;
            }
            return iterator.swigCPtr;
        }

        public boolean isNot(Iterator iterator) {
            return EffectCreatorJniJNI.EEStdElementSet_Iterator_isNot(this.swigCPtr, this, getCPtr(iterator), iterator);
        }

        public Iterator(long j, boolean z) {
            this.swigCMemOwn = z;
            this.swigCPtr = j;
        }
    }

    public synchronized void delete() {
        long j = this.swigCPtr;
        if (j != 0) {
            if (this.swigCMemOwn) {
                this.swigCMemOwn = false;
                EffectCreatorJniJNI.delete_EEStdElementSet(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int sizeImpl() {
        return EffectCreatorJniJNI.EEStdElementSet_sizeImpl(this.swigCPtr, this);
    }

    public Iterator begin() {
        return new Iterator(EffectCreatorJniJNI.EEStdElementSet_begin(this.swigCPtr, this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        EffectCreatorJniJNI.EEStdElementSet_clear(this.swigCPtr, this);
    }

    public Iterator end() {
        return new Iterator(EffectCreatorJniJNI.EEStdElementSet_end(this.swigCPtr, this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdElementSet_isEmpty(this.swigCPtr, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.bytedance.ies.effectcreator.swig.EEStdElementSet$1, java.util.Iterator<com.bytedance.ies.effectcreator.swig.Element>] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<Element> iterator() {
        ?? r0 = new java.util.Iterator<Element>() { // from class: com.bytedance.ies.effectcreator.swig.EEStdElementSet.1
            public Iterator curr;
            public Iterator end;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.curr.isNot(this.end);
            }

            public java.util.Iterator<Element> init() {
                this.curr = EEStdElementSet.this.begin();
                this.end = EEStdElementSet.this.end();
                return this;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // java.util.Iterator
            public Element next() {
                if (hasNext()) {
                    Element derefUnchecked = this.curr.derefUnchecked();
                    this.curr.incrementUnchecked();
                    return derefUnchecked;
                }
                throw new NoSuchElementException();
            }
        };
        r0.init();
        return r0;
    }

    public EEStdElementSet() {
        this(EffectCreatorJniJNI.new_EEStdElementSet__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return sizeImpl();
    }

    public void finalize() {
        delete();
    }

    public EEStdElementSet(EEStdElementSet eEStdElementSet) {
        this(EffectCreatorJniJNI.new_EEStdElementSet__SWIG_1(getCPtr(eEStdElementSet), eEStdElementSet), true);
    }

    private boolean containsImpl(Element element) {
        return EffectCreatorJniJNI.EEStdElementSet_containsImpl(this.swigCPtr, this, Element.getCPtr(element), element);
    }

    public static long getCPtr(EEStdElementSet eEStdElementSet) {
        if (eEStdElementSet == null) {
            return 0L;
        }
        return eEStdElementSet.swigCPtr;
    }

    private boolean hasNextImpl(Iterator iterator) {
        return EffectCreatorJniJNI.EEStdElementSet_hasNextImpl(this.swigCPtr, this, Iterator.getCPtr(iterator), iterator);
    }

    private boolean removeImpl(Element element) {
        return EffectCreatorJniJNI.EEStdElementSet_removeImpl(this.swigCPtr, this, Element.getCPtr(element), element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends Element> collection) {
        java.util.Iterator<? extends Element> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public boolean addImpl(Element element) {
        return EffectCreatorJniJNI.EEStdElementSet_addImpl(this.swigCPtr, this, Element.getCPtr(element), element);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof Element)) {
            return false;
        }
        return containsImpl((Element) obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        if (!(obj instanceof Element)) {
            return false;
        }
        return removeImpl((Element) obj);
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return z;
    }

    public EEStdElementSet(Collection<? extends Element> collection) {
        this();
        addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Element element) {
        return addImpl(element);
    }

    public EEStdElementSet(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
