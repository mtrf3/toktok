package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLETimeEffectSPtrConst extends AbstractList<NLETimeEffect> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLETimeEffectSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLETimeEffectSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETimeEffectSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLETimeEffectSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLETimeEffectSPtrConst() {
        long new_VecNLETimeEffectSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLETimeEffectSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLETimeEffectSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLETimeEffect nLETimeEffect = (NLETimeEffect) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETimeEffectSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLETimeEffect.LIZ(nLETimeEffect), nLETimeEffect);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLETimeEffectSPtrConst_doGet = NLEEditorJniJNI.VecNLETimeEffectSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLETimeEffectSPtrConst_doGet == 0) {
            return null;
        }
        return new NLETimeEffect(VecNLETimeEffectSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLETimeEffectSPtrConst_doRemove = NLEEditorJniJNI.VecNLETimeEffectSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLETimeEffectSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLETimeEffect(VecNLETimeEffectSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLETimeEffect nLETimeEffect = (NLETimeEffect) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETimeEffectSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLETimeEffect.LIZ(nLETimeEffect), nLETimeEffect);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETimeEffectSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLETimeEffect nLETimeEffect = (NLETimeEffect) obj;
        long VecNLETimeEffectSPtrConst_doSet = NLEEditorJniJNI.VecNLETimeEffectSPtrConst_doSet(this.LJLIL, this, i, NLETimeEffect.LIZ(nLETimeEffect), nLETimeEffect);
        if (VecNLETimeEffectSPtrConst_doSet == 0) {
            return null;
        }
        return new NLETimeEffect(VecNLETimeEffectSPtrConst_doSet);
    }
}
