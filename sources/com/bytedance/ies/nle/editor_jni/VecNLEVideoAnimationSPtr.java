package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEVideoAnimationSPtr extends AbstractList<NLEVideoAnimation> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEVideoAnimationSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEVideoAnimationSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEVideoAnimationSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEVideoAnimationSPtr_doSize(this.LJLIL, this);
    }

    public VecNLEVideoAnimationSPtr() {
        this(NLEEditorJniJNI.new_VecNLEVideoAnimationSPtr__SWIG_0());
    }

    public VecNLEVideoAnimationSPtr(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final NLEVideoAnimation get(int i) {
        long VecNLEVideoAnimationSPtr_doGet = NLEEditorJniJNI.VecNLEVideoAnimationSPtr_doGet(this.LJLIL, this, i);
        if (VecNLEVideoAnimationSPtr_doGet == 0) {
            return null;
        }
        return new NLEVideoAnimation(VecNLEVideoAnimationSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEVideoAnimation nLEVideoAnimation = (NLEVideoAnimation) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEVideoAnimationSPtr_doAdd__SWIG_0(this.LJLIL, this, NLEVideoAnimation.LIZ(nLEVideoAnimation), nLEVideoAnimation);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEVideoAnimationSPtr_doRemove = NLEEditorJniJNI.VecNLEVideoAnimationSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLEVideoAnimationSPtr_doRemove == 0) {
            return null;
        }
        return new NLEVideoAnimation(VecNLEVideoAnimationSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEVideoAnimation nLEVideoAnimation = (NLEVideoAnimation) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEVideoAnimationSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLEVideoAnimation.LIZ(nLEVideoAnimation), nLEVideoAnimation);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEVideoAnimationSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEVideoAnimation nLEVideoAnimation = (NLEVideoAnimation) obj;
        long VecNLEVideoAnimationSPtr_doSet = NLEEditorJniJNI.VecNLEVideoAnimationSPtr_doSet(this.LJLIL, this, i, NLEVideoAnimation.LIZ(nLEVideoAnimation), nLEVideoAnimation);
        if (VecNLEVideoAnimationSPtr_doSet == 0) {
            return null;
        }
        return new NLEVideoAnimation(VecNLEVideoAnimationSPtr_doSet);
    }
}
