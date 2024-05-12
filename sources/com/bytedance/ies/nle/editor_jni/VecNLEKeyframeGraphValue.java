package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEKeyframeGraphValue extends AbstractList<NLEKeyframeGraphValue> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEKeyframeGraphValue(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEKeyframeGraphValue_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEKeyframeGraphValue_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEKeyframeGraphValue_doSize(this.LJLIL, this);
    }

    public VecNLEKeyframeGraphValue() {
        long new_VecNLEKeyframeGraphValue__SWIG_0 = NLEEditorJniJNI.new_VecNLEKeyframeGraphValue__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEKeyframeGraphValue__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long j;
        NLEKeyframeGraphValue nLEKeyframeGraphValue = (NLEKeyframeGraphValue) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEKeyframeGraphValue == null) {
            j = 0;
        } else {
            j = nLEKeyframeGraphValue.LIZ;
        }
        NLEEditorJniJNI.VecNLEKeyframeGraphValue_doAdd__SWIG_0(j2, this, j, nLEKeyframeGraphValue);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEKeyframeGraphValue_doGet = NLEEditorJniJNI.VecNLEKeyframeGraphValue_doGet(this.LJLIL, this, i);
        if (VecNLEKeyframeGraphValue_doGet == 0) {
            return null;
        }
        return new NLEKeyframeGraphValue(VecNLEKeyframeGraphValue_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEKeyframeGraphValue_doRemove = NLEEditorJniJNI.VecNLEKeyframeGraphValue_doRemove(this.LJLIL, this, i);
        if (VecNLEKeyframeGraphValue_doRemove == 0) {
            return null;
        }
        return new NLEKeyframeGraphValue(VecNLEKeyframeGraphValue_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        long j;
        NLEKeyframeGraphValue nLEKeyframeGraphValue = (NLEKeyframeGraphValue) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEKeyframeGraphValue == null) {
            j = 0;
        } else {
            j = nLEKeyframeGraphValue.LIZ;
        }
        NLEEditorJniJNI.VecNLEKeyframeGraphValue_doAdd__SWIG_1(j2, this, i, j, nLEKeyframeGraphValue);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEKeyframeGraphValue_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long j;
        NLEKeyframeGraphValue nLEKeyframeGraphValue = (NLEKeyframeGraphValue) obj;
        long j2 = this.LJLIL;
        if (nLEKeyframeGraphValue == null) {
            j = 0;
        } else {
            j = nLEKeyframeGraphValue.LIZ;
        }
        long VecNLEKeyframeGraphValue_doSet = NLEEditorJniJNI.VecNLEKeyframeGraphValue_doSet(j2, this, i, j, nLEKeyframeGraphValue);
        if (VecNLEKeyframeGraphValue_doSet == 0) {
            return null;
        }
        return new NLEKeyframeGraphValue(VecNLEKeyframeGraphValue_doSet);
    }
}
