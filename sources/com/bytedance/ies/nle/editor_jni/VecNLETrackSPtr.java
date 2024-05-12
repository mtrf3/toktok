package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLETrackSPtr extends AbstractList<NLETrack> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLETrackSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLETrackSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETrackSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLETrackSPtr_doSize(this.LJLIL, this);
    }

    public VecNLETrackSPtr() {
        this(NLEEditorJniJNI.new_VecNLETrackSPtr__SWIG_0());
    }

    public VecNLETrackSPtr(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final NLETrack get(int i) {
        long VecNLETrackSPtr_doGet = NLEEditorJniJNI.VecNLETrackSPtr_doGet(this.LJLIL, this, i);
        if (VecNLETrackSPtr_doGet == 0) {
            return null;
        }
        return new NLETrack(VecNLETrackSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLETrack nLETrack = (NLETrack) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackSPtr_doAdd__SWIG_0(this.LJLIL, this, NLETrack.LJI(nLETrack), nLETrack);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLETrackSPtr_doRemove = NLEEditorJniJNI.VecNLETrackSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLETrackSPtr_doRemove == 0) {
            return null;
        }
        return new NLETrack(VecNLETrackSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLETrack nLETrack = (NLETrack) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLETrack.LJI(nLETrack), nLETrack);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLETrack nLETrack = (NLETrack) obj;
        long VecNLETrackSPtr_doSet = NLEEditorJniJNI.VecNLETrackSPtr_doSet(this.LJLIL, this, i, NLETrack.LJI(nLETrack), nLETrack);
        if (VecNLETrackSPtr_doSet == 0) {
            return null;
        }
        return new NLETrack(VecNLETrackSPtr_doSet);
    }
}
