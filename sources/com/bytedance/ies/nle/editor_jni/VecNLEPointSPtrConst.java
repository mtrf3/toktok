package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEPointSPtrConst extends AbstractList<NLEPoint> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEPointSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEPointSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEPointSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEPointSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLEPointSPtrConst() {
        long new_VecNLEPointSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLEPointSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEPointSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEPoint nLEPoint = (NLEPoint) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEPointSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLEPoint.LIZ(nLEPoint), nLEPoint);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEPointSPtrConst_doGet = NLEEditorJniJNI.VecNLEPointSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLEPointSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEPoint(VecNLEPointSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEPointSPtrConst_doRemove = NLEEditorJniJNI.VecNLEPointSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLEPointSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEPoint(VecNLEPointSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEPoint nLEPoint = (NLEPoint) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEPointSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLEPoint.LIZ(nLEPoint), nLEPoint);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEPointSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEPoint nLEPoint = (NLEPoint) obj;
        long VecNLEPointSPtrConst_doSet = NLEEditorJniJNI.VecNLEPointSPtrConst_doSet(this.LJLIL, this, i, NLEPoint.LIZ(nLEPoint), nLEPoint);
        if (VecNLEPointSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEPoint(VecNLEPointSPtrConst_doSet);
    }
}
