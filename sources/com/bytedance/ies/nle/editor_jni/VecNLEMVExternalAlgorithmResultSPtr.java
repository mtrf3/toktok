package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEMVExternalAlgorithmResultSPtr extends AbstractList<NLEMVExternalAlgorithmResult> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEMVExternalAlgorithmResultSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_doSize(this.LJLIL, this);
    }

    public VecNLEMVExternalAlgorithmResultSPtr() {
        long new_VecNLEMVExternalAlgorithmResultSPtr__SWIG_0 = NLEEditorJniJNI.new_VecNLEMVExternalAlgorithmResultSPtr__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEMVExternalAlgorithmResultSPtr__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult = (NLEMVExternalAlgorithmResult) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_doAdd__SWIG_0(this.LJLIL, this, NLEMVExternalAlgorithmResult.LIZ(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEMVExternalAlgorithmResultSPtr_doGet = NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_doGet(this.LJLIL, this, i);
        if (VecNLEMVExternalAlgorithmResultSPtr_doGet == 0) {
            return null;
        }
        return new NLEMVExternalAlgorithmResult(VecNLEMVExternalAlgorithmResultSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEMVExternalAlgorithmResultSPtr_doRemove = NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLEMVExternalAlgorithmResultSPtr_doRemove == 0) {
            return null;
        }
        return new NLEMVExternalAlgorithmResult(VecNLEMVExternalAlgorithmResultSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult = (NLEMVExternalAlgorithmResult) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLEMVExternalAlgorithmResult.LIZ(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult = (NLEMVExternalAlgorithmResult) obj;
        long VecNLEMVExternalAlgorithmResultSPtr_doSet = NLEEditorJniJNI.VecNLEMVExternalAlgorithmResultSPtr_doSet(this.LJLIL, this, i, NLEMVExternalAlgorithmResult.LIZ(nLEMVExternalAlgorithmResult), nLEMVExternalAlgorithmResult);
        if (VecNLEMVExternalAlgorithmResultSPtr_doSet == 0) {
            return null;
        }
        return new NLEMVExternalAlgorithmResult(VecNLEMVExternalAlgorithmResultSPtr_doSet);
    }
}
