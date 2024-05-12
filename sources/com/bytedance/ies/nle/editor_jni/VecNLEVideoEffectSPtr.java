package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEVideoEffectSPtr extends AbstractList<NLEVideoEffect> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEVideoEffectSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEVideoEffectSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEVideoEffectSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEVideoEffectSPtr_doSize(this.LJLIL, this);
    }

    public VecNLEVideoEffectSPtr() {
        this(NLEEditorJniJNI.new_VecNLEVideoEffectSPtr__SWIG_0());
    }

    public VecNLEVideoEffectSPtr(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEVideoEffect nLEVideoEffect = (NLEVideoEffect) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEVideoEffectSPtr_doAdd__SWIG_0(this.LJLIL, this, NLEVideoEffect.LIZ(nLEVideoEffect), nLEVideoEffect);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEVideoEffectSPtr_doGet = NLEEditorJniJNI.VecNLEVideoEffectSPtr_doGet(this.LJLIL, this, i);
        if (VecNLEVideoEffectSPtr_doGet == 0) {
            return null;
        }
        return new NLEVideoEffect(VecNLEVideoEffectSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEVideoEffectSPtr_doRemove = NLEEditorJniJNI.VecNLEVideoEffectSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLEVideoEffectSPtr_doRemove == 0) {
            return null;
        }
        return new NLEVideoEffect(VecNLEVideoEffectSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEVideoEffect nLEVideoEffect = (NLEVideoEffect) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEVideoEffectSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLEVideoEffect.LIZ(nLEVideoEffect), nLEVideoEffect);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEVideoEffectSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEVideoEffect nLEVideoEffect = (NLEVideoEffect) obj;
        long VecNLEVideoEffectSPtr_doSet = NLEEditorJniJNI.VecNLEVideoEffectSPtr_doSet(this.LJLIL, this, i, NLEVideoEffect.LIZ(nLEVideoEffect), nLEVideoEffect);
        if (VecNLEVideoEffectSPtr_doSet == 0) {
            return null;
        }
        return new NLEVideoEffect(VecNLEVideoEffectSPtr_doSet);
    }
}
