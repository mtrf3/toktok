package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes16.dex */
public final class VecNLEClipAlgorithmParam extends AbstractList<NLEClipAlgorithmParam> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEMediaJniJNI.delete_VecNLEClipAlgorithmParam(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEMediaJniJNI.VecNLEClipAlgorithmParam_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEMediaJniJNI.VecNLEClipAlgorithmParam_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEMediaJniJNI.VecNLEClipAlgorithmParam_doSize(this.LJLIL, this);
    }

    public VecNLEClipAlgorithmParam() {
        this(NLEMediaJniJNI.new_VecNLEClipAlgorithmParam__SWIG_0());
    }

    public VecNLEClipAlgorithmParam(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long j;
        NLEClipAlgorithmParam nLEClipAlgorithmParam = (NLEClipAlgorithmParam) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEClipAlgorithmParam == null) {
            j = 0;
        } else {
            j = nLEClipAlgorithmParam.LIZ;
        }
        NLEMediaJniJNI.VecNLEClipAlgorithmParam_doAdd__SWIG_0(j2, this, j, nLEClipAlgorithmParam);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEClipAlgorithmParam_doGet = NLEMediaJniJNI.VecNLEClipAlgorithmParam_doGet(this.LJLIL, this, i);
        if (VecNLEClipAlgorithmParam_doGet == 0) {
            return null;
        }
        return new NLEClipAlgorithmParam(VecNLEClipAlgorithmParam_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEClipAlgorithmParam_doRemove = NLEMediaJniJNI.VecNLEClipAlgorithmParam_doRemove(this.LJLIL, this, i);
        if (VecNLEClipAlgorithmParam_doRemove == 0) {
            return null;
        }
        return new NLEClipAlgorithmParam(VecNLEClipAlgorithmParam_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        long j;
        NLEClipAlgorithmParam nLEClipAlgorithmParam = (NLEClipAlgorithmParam) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEClipAlgorithmParam == null) {
            j = 0;
        } else {
            j = nLEClipAlgorithmParam.LIZ;
        }
        NLEMediaJniJNI.VecNLEClipAlgorithmParam_doAdd__SWIG_1(j2, this, i, j, nLEClipAlgorithmParam);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEMediaJniJNI.VecNLEClipAlgorithmParam_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long j;
        NLEClipAlgorithmParam nLEClipAlgorithmParam = (NLEClipAlgorithmParam) obj;
        long j2 = this.LJLIL;
        if (nLEClipAlgorithmParam == null) {
            j = 0;
        } else {
            j = nLEClipAlgorithmParam.LIZ;
        }
        long VecNLEClipAlgorithmParam_doSet = NLEMediaJniJNI.VecNLEClipAlgorithmParam_doSet(j2, this, i, j, nLEClipAlgorithmParam);
        if (VecNLEClipAlgorithmParam_doSet == 0) {
            return null;
        }
        return new NLEClipAlgorithmParam(VecNLEClipAlgorithmParam_doSet);
    }
}
