package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLESegmentSPtr extends AbstractList<NLESegment> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLESegmentSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLESegmentSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLESegmentSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLESegmentSPtr_doSize(this.LJLIL, this);
    }

    public VecNLESegmentSPtr() {
        long new_VecNLESegmentSPtr__SWIG_0 = NLEEditorJniJNI.new_VecNLESegmentSPtr__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLESegmentSPtr__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLESegment nLESegment = (NLESegment) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLESegmentSPtr_doAdd__SWIG_0(this.LJLIL, this, NLESegment.LIZ(nLESegment), nLESegment);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLESegmentSPtr_doGet = NLEEditorJniJNI.VecNLESegmentSPtr_doGet(this.LJLIL, this, i);
        if (VecNLESegmentSPtr_doGet == 0) {
            return null;
        }
        return new NLESegment(VecNLESegmentSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLESegmentSPtr_doRemove = NLEEditorJniJNI.VecNLESegmentSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLESegmentSPtr_doRemove == 0) {
            return null;
        }
        return new NLESegment(VecNLESegmentSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLESegment nLESegment = (NLESegment) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLESegmentSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLESegment.LIZ(nLESegment), nLESegment);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLESegmentSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLESegment nLESegment = (NLESegment) obj;
        long VecNLESegmentSPtr_doSet = NLEEditorJniJNI.VecNLESegmentSPtr_doSet(this.LJLIL, this, i, NLESegment.LIZ(nLESegment), nLESegment);
        if (VecNLESegmentSPtr_doSet == 0) {
            return null;
        }
        return new NLESegment(VecNLESegmentSPtr_doSet);
    }
}
