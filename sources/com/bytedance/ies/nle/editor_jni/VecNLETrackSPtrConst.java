package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLETrackSPtrConst extends AbstractList<NLETrack> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLETrackSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLETrackSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETrackSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLETrackSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLETrackSPtrConst() {
        long new_VecNLETrackSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLETrackSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLETrackSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLETrack nLETrack = (NLETrack) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLETrack.LJI(nLETrack), nLETrack);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLETrackSPtrConst_doGet = NLEEditorJniJNI.VecNLETrackSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLETrackSPtrConst_doGet == 0) {
            return null;
        }
        return new NLETrack(VecNLETrackSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLETrackSPtrConst_doRemove = NLEEditorJniJNI.VecNLETrackSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLETrackSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLETrack(VecNLETrackSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLETrack nLETrack = (NLETrack) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLETrack.LJI(nLETrack), nLETrack);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLETrack nLETrack = (NLETrack) obj;
        long VecNLETrackSPtrConst_doSet = NLEEditorJniJNI.VecNLETrackSPtrConst_doSet(this.LJLIL, this, i, NLETrack.LJI(nLETrack), nLETrack);
        if (VecNLETrackSPtrConst_doSet == 0) {
            return null;
        }
        return new NLETrack(VecNLETrackSPtrConst_doSet);
    }
}
