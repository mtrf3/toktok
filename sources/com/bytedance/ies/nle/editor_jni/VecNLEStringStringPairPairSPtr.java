package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEStringStringPairPairSPtr extends AbstractList<NLEStringStringPair> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEStringStringPairPairSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEStringStringPairPairSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEStringStringPairPairSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEStringStringPairPairSPtr_doSize(this.LJLIL, this);
    }

    public VecNLEStringStringPairPairSPtr() {
        long new_VecNLEStringStringPairPairSPtr__SWIG_0 = NLEEditorJniJNI.new_VecNLEStringStringPairPairSPtr__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEStringStringPairPairSPtr__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEStringStringPair nLEStringStringPair = (NLEStringStringPair) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEStringStringPairPairSPtr_doAdd__SWIG_0(this.LJLIL, this, NLEStringStringPair.LIZ(nLEStringStringPair), nLEStringStringPair);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEStringStringPairPairSPtr_doGet = NLEEditorJniJNI.VecNLEStringStringPairPairSPtr_doGet(this.LJLIL, this, i);
        if (VecNLEStringStringPairPairSPtr_doGet == 0) {
            return null;
        }
        return new NLEStringStringPair(VecNLEStringStringPairPairSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEStringStringPairPairSPtr_doRemove = NLEEditorJniJNI.VecNLEStringStringPairPairSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLEStringStringPairPairSPtr_doRemove == 0) {
            return null;
        }
        return new NLEStringStringPair(VecNLEStringStringPairPairSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEStringStringPair nLEStringStringPair = (NLEStringStringPair) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEStringStringPairPairSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLEStringStringPair.LIZ(nLEStringStringPair), nLEStringStringPair);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEStringStringPairPairSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEStringStringPair nLEStringStringPair = (NLEStringStringPair) obj;
        long VecNLEStringStringPairPairSPtr_doSet = NLEEditorJniJNI.VecNLEStringStringPairPairSPtr_doSet(this.LJLIL, this, i, NLEStringStringPair.LIZ(nLEStringStringPair), nLEStringStringPair);
        if (VecNLEStringStringPairPairSPtr_doSet == 0) {
            return null;
        }
        return new NLEStringStringPair(VecNLEStringStringPairPairSPtr_doSet);
    }
}
