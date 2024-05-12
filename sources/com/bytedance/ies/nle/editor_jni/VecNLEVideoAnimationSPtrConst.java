package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEVideoAnimationSPtrConst extends AbstractList<NLEVideoAnimation> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEVideoAnimationSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLEVideoAnimationSPtrConst() {
        long new_VecNLEVideoAnimationSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLEVideoAnimationSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEVideoAnimationSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEVideoAnimation nLEVideoAnimation = (NLEVideoAnimation) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLEVideoAnimation.LIZ(nLEVideoAnimation), nLEVideoAnimation);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEVideoAnimationSPtrConst_doGet = NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLEVideoAnimationSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEVideoAnimation(VecNLEVideoAnimationSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEVideoAnimationSPtrConst_doRemove = NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLEVideoAnimationSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEVideoAnimation(VecNLEVideoAnimationSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEVideoAnimation nLEVideoAnimation = (NLEVideoAnimation) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLEVideoAnimation.LIZ(nLEVideoAnimation), nLEVideoAnimation);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEVideoAnimation nLEVideoAnimation = (NLEVideoAnimation) obj;
        long VecNLEVideoAnimationSPtrConst_doSet = NLEEditorJniJNI.VecNLEVideoAnimationSPtrConst_doSet(this.LJLIL, this, i, NLEVideoAnimation.LIZ(nLEVideoAnimation), nLEVideoAnimation);
        if (VecNLEVideoAnimationSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEVideoAnimation(VecNLEVideoAnimationSPtrConst_doSet);
    }
}
