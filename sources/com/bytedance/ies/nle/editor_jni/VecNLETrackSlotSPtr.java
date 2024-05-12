package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLETrackSlotSPtr extends AbstractList<NLETrackSlot> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLETrackSlotSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLETrackSlotSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETrackSlotSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLETrackSlotSPtr_doSize(this.LJLIL, this);
    }

    public VecNLETrackSlotSPtr() {
        this(NLEEditorJniJNI.new_VecNLETrackSlotSPtr__SWIG_0());
    }

    public VecNLETrackSlotSPtr(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    public final void LIZJ(NLETrackSlot nLETrackSlot) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackSlotSPtr_doAdd__SWIG_0(this.LJLIL, this, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot);
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: LJFF, reason: merged with bridge method [inline-methods] */
    public final NLETrackSlot get(int i) {
        long VecNLETrackSlotSPtr_doGet = NLEEditorJniJNI.VecNLETrackSlotSPtr_doGet(this.LJLIL, this, i);
        if (VecNLETrackSlotSPtr_doGet == 0) {
            return null;
        }
        return new NLETrackSlot(VecNLETrackSlotSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LIZJ((NLETrackSlot) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLETrackSlotSPtr_doRemove = NLEEditorJniJNI.VecNLETrackSlotSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLETrackSlotSPtr_doRemove == 0) {
            return null;
        }
        return new NLETrackSlot(VecNLETrackSlotSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackSlotSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackSlotSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLETrackSlot nLETrackSlot = (NLETrackSlot) obj;
        long VecNLETrackSlotSPtr_doSet = NLEEditorJniJNI.VecNLETrackSlotSPtr_doSet(this.LJLIL, this, i, NLETrackSlot.LIZJ(nLETrackSlot), nLETrackSlot);
        if (VecNLETrackSlotSPtr_doSet == 0) {
            return null;
        }
        return new NLETrackSlot(VecNLETrackSlotSPtr_doSet);
    }
}
