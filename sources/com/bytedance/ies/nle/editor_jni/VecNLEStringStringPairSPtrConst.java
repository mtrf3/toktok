package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEStringStringPairSPtrConst extends AbstractList<NLEStringStringPair> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEStringStringPairSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLEStringStringPairSPtrConst() {
        long new_VecNLEStringStringPairSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLEStringStringPairSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEStringStringPairSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEStringStringPair nLEStringStringPair = (NLEStringStringPair) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLEStringStringPair.LIZ(nLEStringStringPair), nLEStringStringPair);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEStringStringPairSPtrConst_doGet = NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLEStringStringPairSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEStringStringPair(VecNLEStringStringPairSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEStringStringPairSPtrConst_doRemove = NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLEStringStringPairSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEStringStringPair(VecNLEStringStringPairSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEStringStringPair nLEStringStringPair = (NLEStringStringPair) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLEStringStringPair.LIZ(nLEStringStringPair), nLEStringStringPair);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEStringStringPair nLEStringStringPair = (NLEStringStringPair) obj;
        long VecNLEStringStringPairSPtrConst_doSet = NLEEditorJniJNI.VecNLEStringStringPairSPtrConst_doSet(this.LJLIL, this, i, NLEStringStringPair.LIZ(nLEStringStringPair), nLEStringStringPair);
        if (VecNLEStringStringPairSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEStringStringPair(VecNLEStringStringPairSPtrConst_doSet);
    }
}
