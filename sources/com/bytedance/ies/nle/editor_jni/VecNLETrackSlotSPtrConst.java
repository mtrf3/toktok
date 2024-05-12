package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLETrackSlotSPtrConst extends AbstractList<NLETrackSlot> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLETrackSlotSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLETrackSlotSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETrackSlotSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLETrackSlotSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLETrackSlotSPtrConst() {
        long new_VecNLETrackSlotSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLETrackSlotSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLETrackSlotSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackSlotSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLETrackSlotSPtrConst_doGet = NLEEditorJniJNI.VecNLETrackSlotSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLETrackSlotSPtrConst_doGet == 0) {
            return null;
        }
        return new NLETrackSlot(VecNLETrackSlotSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLETrackSlotSPtrConst_doRemove = NLEEditorJniJNI.VecNLETrackSlotSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLETrackSlotSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLETrackSlot(VecNLETrackSlotSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackSlotSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackSlotSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
        long VecNLETrackSlotSPtrConst_doSet = NLEEditorJniJNI.VecNLETrackSlotSPtrConst_doSet(this.LJLIL, this, i, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot);
        if (VecNLETrackSlotSPtrConst_doSet == 0) {
            return null;
        }
        return new NLETrackSlot(VecNLETrackSlotSPtrConst_doSet);
    }
}
