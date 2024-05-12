package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEFilterSPtr extends AbstractList<NLEFilter> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEFilterSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEFilterSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEFilterSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEFilterSPtr_doSize(this.LJLIL, this);
    }

    public VecNLEFilterSPtr() {
        this(NLEEditorJniJNI.new_VecNLEFilterSPtr__SWIG_0());
    }

    public VecNLEFilterSPtr(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final NLEFilter get(int i) {
        long VecNLEFilterSPtr_doGet = NLEEditorJniJNI.VecNLEFilterSPtr_doGet(this.LJLIL, this, i);
        if (VecNLEFilterSPtr_doGet == 0) {
            return null;
        }
        return new NLEFilter(VecNLEFilterSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEFilter nLEFilter = (NLEFilter) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEFilterSPtr_doAdd__SWIG_0(this.LJLIL, this, NLEFilter.LIZ(nLEFilter), nLEFilter);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEFilterSPtr_doRemove = NLEEditorJniJNI.VecNLEFilterSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLEFilterSPtr_doRemove == 0) {
            return null;
        }
        return new NLEFilter(VecNLEFilterSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEFilter nLEFilter = (NLEFilter) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEFilterSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLEFilter.LIZ(nLEFilter), nLEFilter);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEFilterSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEFilter nLEFilter = (NLEFilter) obj;
        long VecNLEFilterSPtr_doSet = NLEEditorJniJNI.VecNLEFilterSPtr_doSet(this.LJLIL, this, i, NLEFilter.LIZ(nLEFilter), nLEFilter);
        if (VecNLEFilterSPtr_doSet == 0) {
            return null;
        }
        return new NLEFilter(VecNLEFilterSPtr_doSet);
    }
}
