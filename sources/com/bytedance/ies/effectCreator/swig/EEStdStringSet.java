package com.bytedance.ies.effectcreator.swig;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.NoSuchElementException;

/* loaded from: classes34.dex */
public class EEStdStringSet extends AbstractSet<String> {
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
                    EffectCreatorJniJNI.delete_EEStdStringSet_Iterator(j);
                }
                this.swigCPtr = 0L;
            }
        }

        public String derefUnchecked() {
            return EffectCreatorJniJNI.EEStdStringSet_Iterator_derefUnchecked(this.swigCPtr, this);
        }

        public void incrementUnchecked() {
            EffectCreatorJniJNI.EEStdStringSet_Iterator_incrementUnchecked(this.swigCPtr, this);
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
            return EffectCreatorJniJNI.EEStdStringSet_Iterator_isNot(this.swigCPtr, this, getCPtr(iterator), iterator);
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
                EffectCreatorJniJNI.delete_EEStdStringSet(j);
            }
            this.swigCPtr = 0L;
        }
    }

    private int sizeImpl() {
        return EffectCreatorJniJNI.EEStdStringSet_sizeImpl(this.swigCPtr, this);
    }

    public Iterator begin() {
        return new Iterator(EffectCreatorJniJNI.EEStdStringSet_begin(this.swigCPtr, this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        EffectCreatorJniJNI.EEStdStringSet_clear(this.swigCPtr, this);
    }

    public Iterator end() {
        return new Iterator(EffectCreatorJniJNI.EEStdStringSet_end(this.swigCPtr, this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return EffectCreatorJniJNI.EEStdStringSet_isEmpty(this.swigCPtr, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.Iterator<java.lang.String>, com.bytedance.ies.effectcreator.swig.EEStdStringSet$1] */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public java.util.Iterator<String> iterator() {
        ?? r0 = new java.util.Iterator<String>() { // from class: com.bytedance.ies.effectcreator.swig.EEStdStringSet.1
            public Iterator curr;
            public Iterator end;

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.curr.isNot(this.end);
            }

            public java.util.Iterator<String> init() {
                this.curr = EEStdStringSet.this.begin();
                this.end = EEStdStringSet.this.end();
                return this;
            }

            @Override // java.util.Iterator
            public String next() {
                if (hasNext()) {
                    String derefUnchecked = this.curr.derefUnchecked();
                    this.curr.incrementUnchecked();
                    return derefUnchecked;
                }
                throw new NoSuchElementException();
            }
        };
        r0.init();
        return r0;
    }

    public EEStdStringSet() {
        this(EffectCreatorJniJNI.new_EEStdStringSet__SWIG_0(), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return sizeImpl();
    }

    public void finalize() {
        delete();
    }

    public EEStdStringSet(EEStdStringSet eEStdStringSet) {
        this(EffectCreatorJniJNI.new_EEStdStringSet__SWIG_1(getCPtr(eEStdStringSet), eEStdStringSet), true);
    }

    private boolean containsImpl(String str) {
        return EffectCreatorJniJNI.EEStdStringSet_containsImpl(this.swigCPtr, this, str);
    }

    public static long getCPtr(EEStdStringSet eEStdStringSet) {
        if (eEStdStringSet == null) {
            return 0L;
        }
        return eEStdStringSet.swigCPtr;
    }

    private boolean hasNextImpl(Iterator iterator) {
        return EffectCreatorJniJNI.EEStdStringSet_hasNextImpl(this.swigCPtr, this, Iterator.getCPtr(iterator), iterator);
    }

    private boolean removeImpl(String str) {
        return EffectCreatorJniJNI.EEStdStringSet_removeImpl(this.swigCPtr, this, str);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends String> collection) {
        java.util.Iterator<? extends String> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= add(it.next());
        }
        return z;
    }

    public boolean addImpl(String str) {
        return EffectCreatorJniJNI.EEStdStringSet_addImpl(this.swigCPtr, this, str);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (!(obj instanceof String)) {
            return false;
        }
        return containsImpl((String) obj);
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
        if (!(obj instanceof String)) {
            return false;
        }
        return removeImpl((String) obj);
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

    public EEStdStringSet(Collection<? extends String> collection) {
        this();
        addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(String str) {
        return addImpl(str);
    }

    public EEStdStringSet(long j, boolean z) {
        this.swigCMemOwn = z;
        this.swigCPtr = j;
    }
}
