package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLECherEffectSPtr extends AbstractList<NLECherEffect> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLECherEffectSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLECherEffectSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLECherEffectSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLECherEffectSPtr_doSize(this.LJLIL, this);
    }

    public VecNLECherEffectSPtr() {
        long new_VecNLECherEffectSPtr__SWIG_0 = NLEEditorJniJNI.new_VecNLECherEffectSPtr__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLECherEffectSPtr__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLECherEffect nLECherEffect = (NLECherEffect) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLECherEffectSPtr_doAdd__SWIG_0(this.LJLIL, this, NLECherEffect.LIZ(nLECherEffect), nLECherEffect);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLECherEffectSPtr_doGet = NLEEditorJniJNI.VecNLECherEffectSPtr_doGet(this.LJLIL, this, i);
        if (VecNLECherEffectSPtr_doGet == 0) {
            return null;
        }
        return new NLECherEffect(VecNLECherEffectSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLECherEffectSPtr_doRemove = NLEEditorJniJNI.VecNLECherEffectSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLECherEffectSPtr_doRemove == 0) {
            return null;
        }
        return new NLECherEffect(VecNLECherEffectSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLECherEffect nLECherEffect = (NLECherEffect) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLECherEffectSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLECherEffect.LIZ(nLECherEffect), nLECherEffect);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLECherEffectSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLECherEffect nLECherEffect = (NLECherEffect) obj;
        long VecNLECherEffectSPtr_doSet = NLEEditorJniJNI.VecNLECherEffectSPtr_doSet(this.LJLIL, this, i, NLECherEffect.LIZ(nLECherEffect), nLECherEffect);
        if (VecNLECherEffectSPtr_doSet == 0) {
            return null;
        }
        return new NLECherEffect(VecNLECherEffectSPtr_doSet);
    }
}
