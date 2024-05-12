package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEVideoEffectSPtrConst extends AbstractList<NLEVideoEffect> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEVideoEffectSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLEVideoEffectSPtrConst() {
        long new_VecNLEVideoEffectSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLEVideoEffectSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEVideoEffectSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEVideoEffect nLEVideoEffect = (NLEVideoEffect) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLEVideoEffect.LIZ(nLEVideoEffect), nLEVideoEffect);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEVideoEffectSPtrConst_doGet = NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLEVideoEffectSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEVideoEffect(VecNLEVideoEffectSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEVideoEffectSPtrConst_doRemove = NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLEVideoEffectSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEVideoEffect(VecNLEVideoEffectSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEVideoEffect nLEVideoEffect = (NLEVideoEffect) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLEVideoEffect.LIZ(nLEVideoEffect), nLEVideoEffect);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEVideoEffect nLEVideoEffect = (NLEVideoEffect) obj;
        long VecNLEVideoEffectSPtrConst_doSet = NLEEditorJniJNI.VecNLEVideoEffectSPtrConst_doSet(this.LJLIL, this, i, NLEVideoEffect.LIZ(nLEVideoEffect), nLEVideoEffect);
        if (VecNLEVideoEffectSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEVideoEffect(VecNLEVideoEffectSPtrConst_doSet);
    }
}
