package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEMaskSPtrConst extends AbstractList<NLEMask> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEMaskSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEMaskSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEMaskSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEMaskSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLEMaskSPtrConst() {
        long new_VecNLEMaskSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLEMaskSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEMaskSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEMask nLEMask = (NLEMask) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEMaskSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLEMask.LIZ(nLEMask), nLEMask);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEMaskSPtrConst_doGet = NLEEditorJniJNI.VecNLEMaskSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLEMaskSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEMask(VecNLEMaskSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEMaskSPtrConst_doRemove = NLEEditorJniJNI.VecNLEMaskSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLEMaskSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEMask(VecNLEMaskSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEMask nLEMask = (NLEMask) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEMaskSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLEMask.LIZ(nLEMask), nLEMask);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEMaskSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEMask nLEMask = (NLEMask) obj;
        long VecNLEMaskSPtrConst_doSet = NLEEditorJniJNI.VecNLEMaskSPtrConst_doSet(this.LJLIL, this, i, NLEMask.LIZ(nLEMask), nLEMask);
        if (VecNLEMaskSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEMask(VecNLEMaskSPtrConst_doSet);
    }
}
