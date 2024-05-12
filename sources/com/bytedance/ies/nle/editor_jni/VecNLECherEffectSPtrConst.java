package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLECherEffectSPtrConst extends AbstractList<NLECherEffect> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLECherEffectSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLECherEffectSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLECherEffectSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLECherEffectSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLECherEffectSPtrConst() {
        long new_VecNLECherEffectSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLECherEffectSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLECherEffectSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLECherEffect nLECherEffect = (NLECherEffect) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLECherEffectSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLECherEffect.LIZ(nLECherEffect), nLECherEffect);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLECherEffectSPtrConst_doGet = NLEEditorJniJNI.VecNLECherEffectSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLECherEffectSPtrConst_doGet == 0) {
            return null;
        }
        return new NLECherEffect(VecNLECherEffectSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLECherEffectSPtrConst_doRemove = NLEEditorJniJNI.VecNLECherEffectSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLECherEffectSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLECherEffect(VecNLECherEffectSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLECherEffect nLECherEffect = (NLECherEffect) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLECherEffectSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLECherEffect.LIZ(nLECherEffect), nLECherEffect);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLECherEffectSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLECherEffect nLECherEffect = (NLECherEffect) obj;
        long VecNLECherEffectSPtrConst_doSet = NLEEditorJniJNI.VecNLECherEffectSPtrConst_doSet(this.LJLIL, this, i, NLECherEffect.LIZ(nLECherEffect), nLECherEffect);
        if (VecNLECherEffectSPtrConst_doSet == 0) {
            return null;
        }
        return new NLECherEffect(VecNLECherEffectSPtrConst_doSet);
    }
}
