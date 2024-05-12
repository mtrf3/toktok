package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLETimeEffectSPtr extends AbstractList<NLETimeEffect> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLETimeEffectSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLETimeEffectSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETimeEffectSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLETimeEffectSPtr_doSize(this.LJLIL, this);
    }

    public VecNLETimeEffectSPtr() {
        long new_VecNLETimeEffectSPtr__SWIG_0 = NLEEditorJniJNI.new_VecNLETimeEffectSPtr__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLETimeEffectSPtr__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLETimeEffect nLETimeEffect = (NLETimeEffect) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETimeEffectSPtr_doAdd__SWIG_0(this.LJLIL, this, NLETimeEffect.LIZ(nLETimeEffect), nLETimeEffect);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLETimeEffectSPtr_doGet = NLEEditorJniJNI.VecNLETimeEffectSPtr_doGet(this.LJLIL, this, i);
        if (VecNLETimeEffectSPtr_doGet == 0) {
            return null;
        }
        return new NLETimeEffect(VecNLETimeEffectSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLETimeEffectSPtr_doRemove = NLEEditorJniJNI.VecNLETimeEffectSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLETimeEffectSPtr_doRemove == 0) {
            return null;
        }
        return new NLETimeEffect(VecNLETimeEffectSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLETimeEffect nLETimeEffect = (NLETimeEffect) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETimeEffectSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLETimeEffect.LIZ(nLETimeEffect), nLETimeEffect);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETimeEffectSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLETimeEffect nLETimeEffect = (NLETimeEffect) obj;
        long VecNLETimeEffectSPtr_doSet = NLEEditorJniJNI.VecNLETimeEffectSPtr_doSet(this.LJLIL, this, i, NLETimeEffect.LIZ(nLETimeEffect), nLETimeEffect);
        if (VecNLETimeEffectSPtr_doSet == 0) {
            return null;
        }
        return new NLETimeEffect(VecNLETimeEffectSPtr_doSet);
    }
}
