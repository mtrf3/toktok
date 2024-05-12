package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEPointSPtr extends AbstractList<NLEPoint> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEPointSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEPointSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEPointSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEPointSPtr_doSize(this.LJLIL, this);
    }

    public VecNLEPointSPtr() {
        this(NLEEditorJniJNI.new_VecNLEPointSPtr__SWIG_0());
    }

    public VecNLEPointSPtr(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    public final void LIZJ(NLEPoint nLEPoint) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEPointSPtr_doAdd__SWIG_0(this.LJLIL, this, NLEPoint.LIZ(nLEPoint), nLEPoint);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LIZJ((NLEPoint) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEPointSPtr_doGet = NLEEditorJniJNI.VecNLEPointSPtr_doGet(this.LJLIL, this, i);
        if (VecNLEPointSPtr_doGet == 0) {
            return null;
        }
        return new NLEPoint(VecNLEPointSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEPointSPtr_doRemove = NLEEditorJniJNI.VecNLEPointSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLEPointSPtr_doRemove == 0) {
            return null;
        }
        return new NLEPoint(VecNLEPointSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEPoint nLEPoint = (NLEPoint) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEPointSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLEPoint.LIZ(nLEPoint), nLEPoint);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEPointSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEPoint nLEPoint = (NLEPoint) obj;
        long VecNLEPointSPtr_doSet = NLEEditorJniJNI.VecNLEPointSPtr_doSet(this.LJLIL, this, i, NLEPoint.LIZ(nLEPoint), nLEPoint);
        if (VecNLEPointSPtr_doSet == 0) {
            return null;
        }
        return new NLEPoint(VecNLEPointSPtr_doSet);
    }
}
