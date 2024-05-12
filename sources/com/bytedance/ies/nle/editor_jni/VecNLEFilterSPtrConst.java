package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEFilterSPtrConst extends AbstractList<NLEFilter> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEFilterSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEFilterSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEFilterSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEFilterSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLEFilterSPtrConst() {
        long new_VecNLEFilterSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLEFilterSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEFilterSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEFilter nLEFilter = (NLEFilter) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEFilterSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLEFilter.LIZ(nLEFilter), nLEFilter);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEFilterSPtrConst_doGet = NLEEditorJniJNI.VecNLEFilterSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLEFilterSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEFilter(VecNLEFilterSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEFilterSPtrConst_doRemove = NLEEditorJniJNI.VecNLEFilterSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLEFilterSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEFilter(VecNLEFilterSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEFilter nLEFilter = (NLEFilter) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEFilterSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLEFilter.LIZ(nLEFilter), nLEFilter);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEFilterSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEFilter nLEFilter = (NLEFilter) obj;
        long VecNLEFilterSPtrConst_doSet = NLEEditorJniJNI.VecNLEFilterSPtrConst_doSet(this.LJLIL, this, i, NLEFilter.LIZ(nLEFilter), nLEFilter);
        if (VecNLEFilterSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEFilter(VecNLEFilterSPtrConst_doSet);
    }
}
