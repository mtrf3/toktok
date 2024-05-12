package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEMaskSPtr extends AbstractList<NLEMask> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEMaskSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEMaskSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEMaskSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEMaskSPtr_doSize(this.LJLIL, this);
    }

    public VecNLEMaskSPtr() {
        this(NLEEditorJniJNI.new_VecNLEMaskSPtr__SWIG_0());
    }

    public VecNLEMaskSPtr(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEMask nLEMask = (NLEMask) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEMaskSPtr_doAdd__SWIG_0(this.LJLIL, this, NLEMask.LIZ(nLEMask), nLEMask);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEMaskSPtr_doGet = NLEEditorJniJNI.VecNLEMaskSPtr_doGet(this.LJLIL, this, i);
        if (VecNLEMaskSPtr_doGet == 0) {
            return null;
        }
        return new NLEMask(VecNLEMaskSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEMaskSPtr_doRemove = NLEEditorJniJNI.VecNLEMaskSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLEMaskSPtr_doRemove == 0) {
            return null;
        }
        return new NLEMask(VecNLEMaskSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEMask nLEMask = (NLEMask) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEMaskSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLEMask.LIZ(nLEMask), nLEMask);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEMaskSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEMask nLEMask = (NLEMask) obj;
        long VecNLEMaskSPtr_doSet = NLEEditorJniJNI.VecNLEMaskSPtr_doSet(this.LJLIL, this, i, NLEMask.LIZ(nLEMask), nLEMask);
        if (VecNLEMaskSPtr_doSet == 0) {
            return null;
        }
        return new NLEMask(VecNLEMaskSPtr_doSet);
    }
}
