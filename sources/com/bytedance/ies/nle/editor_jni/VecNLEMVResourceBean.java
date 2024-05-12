package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes16.dex */
public final class VecNLEMVResourceBean extends AbstractList<NLEMVResourceBean> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEMediaJniJNI.delete_VecNLEMVResourceBean(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEMediaJniJNI.VecNLEMVResourceBean_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEMediaJniJNI.VecNLEMVResourceBean_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEMediaJniJNI.VecNLEMVResourceBean_doSize(this.LJLIL, this);
    }

    public VecNLEMVResourceBean() {
        long new_VecNLEMVResourceBean__SWIG_0 = NLEMediaJniJNI.new_VecNLEMVResourceBean__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEMVResourceBean__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long j;
        NLEMVResourceBean nLEMVResourceBean = (NLEMVResourceBean) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEMVResourceBean == null) {
            j = 0;
        } else {
            j = nLEMVResourceBean.LIZ;
        }
        NLEMediaJniJNI.VecNLEMVResourceBean_doAdd__SWIG_0(j2, this, j, nLEMVResourceBean);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEMVResourceBean_doGet = NLEMediaJniJNI.VecNLEMVResourceBean_doGet(this.LJLIL, this, i);
        if (VecNLEMVResourceBean_doGet == 0) {
            return null;
        }
        return new NLEMVResourceBean(VecNLEMVResourceBean_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEMVResourceBean_doRemove = NLEMediaJniJNI.VecNLEMVResourceBean_doRemove(this.LJLIL, this, i);
        if (VecNLEMVResourceBean_doRemove == 0) {
            return null;
        }
        return new NLEMVResourceBean(VecNLEMVResourceBean_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        long j;
        NLEMVResourceBean nLEMVResourceBean = (NLEMVResourceBean) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEMVResourceBean == null) {
            j = 0;
        } else {
            j = nLEMVResourceBean.LIZ;
        }
        NLEMediaJniJNI.VecNLEMVResourceBean_doAdd__SWIG_1(j2, this, i, j, nLEMVResourceBean);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEMediaJniJNI.VecNLEMVResourceBean_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long j;
        NLEMVResourceBean nLEMVResourceBean = (NLEMVResourceBean) obj;
        long j2 = this.LJLIL;
        if (nLEMVResourceBean == null) {
            j = 0;
        } else {
            j = nLEMVResourceBean.LIZ;
        }
        long VecNLEMVResourceBean_doSet = NLEMediaJniJNI.VecNLEMVResourceBean_doSet(j2, this, i, j, nLEMVResourceBean);
        if (VecNLEMVResourceBean_doSet == 0) {
            return null;
        }
        return new NLEMVResourceBean(VecNLEMVResourceBean_doSet);
    }
}
