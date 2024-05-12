package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLENoiseReductionSPtrConst extends AbstractList<NLENoiseReduction> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLENoiseReductionSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLENoiseReductionSPtrConst() {
        long new_VecNLENoiseReductionSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLENoiseReductionSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLENoiseReductionSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLENoiseReduction nLENoiseReduction = (NLENoiseReduction) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLENoiseReduction.LIZ(nLENoiseReduction), nLENoiseReduction);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLENoiseReductionSPtrConst_doGet = NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLENoiseReductionSPtrConst_doGet == 0) {
            return null;
        }
        return new NLENoiseReduction(VecNLENoiseReductionSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLENoiseReductionSPtrConst_doRemove = NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLENoiseReductionSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLENoiseReduction(VecNLENoiseReductionSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLENoiseReduction nLENoiseReduction = (NLENoiseReduction) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLENoiseReduction.LIZ(nLENoiseReduction), nLENoiseReduction);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLENoiseReduction nLENoiseReduction = (NLENoiseReduction) obj;
        long VecNLENoiseReductionSPtrConst_doSet = NLEEditorJniJNI.VecNLENoiseReductionSPtrConst_doSet(this.LJLIL, this, i, NLENoiseReduction.LIZ(nLENoiseReduction), nLENoiseReduction);
        if (VecNLENoiseReductionSPtrConst_doSet == 0) {
            return null;
        }
        return new NLENoiseReduction(VecNLENoiseReductionSPtrConst_doSet);
    }
}
