package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEStringFloatPairSPtrConst extends AbstractList<NLEStringFloatPair> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEStringFloatPairSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLEStringFloatPairSPtrConst() {
        long new_VecNLEStringFloatPairSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLEStringFloatPairSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEStringFloatPairSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEStringFloatPair nLEStringFloatPair = (NLEStringFloatPair) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLEStringFloatPair.LIZ(nLEStringFloatPair), nLEStringFloatPair);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEStringFloatPairSPtrConst_doGet = NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLEStringFloatPairSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEStringFloatPair(VecNLEStringFloatPairSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEStringFloatPairSPtrConst_doRemove = NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLEStringFloatPairSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEStringFloatPair(VecNLEStringFloatPairSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEStringFloatPair nLEStringFloatPair = (NLEStringFloatPair) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLEStringFloatPair.LIZ(nLEStringFloatPair), nLEStringFloatPair);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEStringFloatPair nLEStringFloatPair = (NLEStringFloatPair) obj;
        long VecNLEStringFloatPairSPtrConst_doSet = NLEEditorJniJNI.VecNLEStringFloatPairSPtrConst_doSet(this.LJLIL, this, i, NLEStringFloatPair.LIZ(nLEStringFloatPair), nLEStringFloatPair);
        if (VecNLEStringFloatPairSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEStringFloatPair(VecNLEStringFloatPairSPtrConst_doSet);
    }
}
