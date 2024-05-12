package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEStringFloatPairSPtr extends AbstractList<NLEStringFloatPair> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEStringFloatPairSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEStringFloatPairSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEStringFloatPairSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEStringFloatPairSPtr_doSize(this.LJLIL, this);
    }

    public VecNLEStringFloatPairSPtr() {
        this(NLEEditorJniJNI.new_VecNLEStringFloatPairSPtr__SWIG_0());
    }

    public VecNLEStringFloatPairSPtr(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEStringFloatPair nLEStringFloatPair = (NLEStringFloatPair) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEStringFloatPairSPtr_doAdd__SWIG_0(this.LJLIL, this, NLEStringFloatPair.LIZ(nLEStringFloatPair), nLEStringFloatPair);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEStringFloatPairSPtr_doGet = NLEEditorJniJNI.VecNLEStringFloatPairSPtr_doGet(this.LJLIL, this, i);
        if (VecNLEStringFloatPairSPtr_doGet == 0) {
            return null;
        }
        return new NLEStringFloatPair(VecNLEStringFloatPairSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEStringFloatPairSPtr_doRemove = NLEEditorJniJNI.VecNLEStringFloatPairSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLEStringFloatPairSPtr_doRemove == 0) {
            return null;
        }
        return new NLEStringFloatPair(VecNLEStringFloatPairSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEStringFloatPair nLEStringFloatPair = (NLEStringFloatPair) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEStringFloatPairSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLEStringFloatPair.LIZ(nLEStringFloatPair), nLEStringFloatPair);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEStringFloatPairSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEStringFloatPair nLEStringFloatPair = (NLEStringFloatPair) obj;
        long VecNLEStringFloatPairSPtr_doSet = NLEEditorJniJNI.VecNLEStringFloatPairSPtr_doSet(this.LJLIL, this, i, NLEStringFloatPair.LIZ(nLEStringFloatPair), nLEStringFloatPair);
        if (VecNLEStringFloatPairSPtr_doSet == 0) {
            return null;
        }
        return new NLEStringFloatPair(VecNLEStringFloatPairSPtr_doSet);
    }
}
