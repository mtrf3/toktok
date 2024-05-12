package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLESegmentSPtrConst extends AbstractList<NLESegment> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLESegmentSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLESegmentSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLESegmentSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLESegmentSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLESegmentSPtrConst() {
        long new_VecNLESegmentSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLESegmentSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLESegmentSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLESegment nLESegment = (NLESegment) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLESegmentSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLESegment.LIZ(nLESegment), nLESegment);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLESegmentSPtrConst_doGet = NLEEditorJniJNI.VecNLESegmentSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLESegmentSPtrConst_doGet == 0) {
            return null;
        }
        return new NLESegment(VecNLESegmentSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLESegmentSPtrConst_doRemove = NLEEditorJniJNI.VecNLESegmentSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLESegmentSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLESegment(VecNLESegmentSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLESegment nLESegment = (NLESegment) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLESegmentSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLESegment.LIZ(nLESegment), nLESegment);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLESegmentSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLESegment nLESegment = (NLESegment) obj;
        long VecNLESegmentSPtrConst_doSet = NLEEditorJniJNI.VecNLESegmentSPtrConst_doSet(this.LJLIL, this, i, NLESegment.LIZ(nLESegment), nLESegment);
        if (VecNLESegmentSPtrConst_doSet == 0) {
            return null;
        }
        return new NLESegment(VecNLESegmentSPtrConst_doSet);
    }
}
