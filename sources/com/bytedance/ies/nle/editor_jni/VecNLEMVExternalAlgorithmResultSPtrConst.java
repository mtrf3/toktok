package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEMVExternalAlgorithmResultSPtrConst extends AbstractList<NLEMVExternalAlgorithmResult> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEMVExternalAlgorithmResultSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLEMVExternalAlgorithmResultSPtrConst() {
        long new_VecNLEMVExternalAlgorithmResultSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLEMVExternalAlgorithmResultSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEMVExternalAlgorithmResultSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult = (NLEMVExternalAlgorithmResult) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLEMVExternalAlgorithmResult.LIZ(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEMVExternalAlgorithmResultSPtrConst_doGet = NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLEMVExternalAlgorithmResultSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEMVExternalAlgorithmResult(VecNLEMVExternalAlgorithmResultSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEMVExternalAlgorithmResultSPtrConst_doRemove = NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLEMVExternalAlgorithmResultSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEMVExternalAlgorithmResult(VecNLEMVExternalAlgorithmResultSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult = (NLEMVExternalAlgorithmResult) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLEMVExternalAlgorithmResult.LIZ(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult = (NLEMVExternalAlgorithmResult) obj;
        long VecNLEMVExternalAlgorithmResultSPtrConst_doSet = NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtrConst_doSet(this.LJLIL, this, i, NLEMVExternalAlgorithmResult.LIZ(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
        if (VecNLEMVExternalAlgorithmResultSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEMVExternalAlgorithmResult(VecNLEMVExternalAlgorithmResultSPtrConst_doSet);
    }
}
