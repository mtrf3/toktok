package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes16.dex */
public final class VecNLEBeatTrackingInfo extends AbstractList<NLEBeatTrackingInfo> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEMediaJniJNI.delete_VecNLEBeatTrackingInfo(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEMediaJniJNI.VecNLEBeatTrackingInfo_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEMediaJniJNI.VecNLEBeatTrackingInfo_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEMediaJniJNI.VecNLEBeatTrackingInfo_doSize(this.LJLIL, this);
    }

    public VecNLEBeatTrackingInfo() {
        long new_VecNLEBeatTrackingInfo__SWIG_0 = NLEMediaJniJNI.new_VecNLEBeatTrackingInfo__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEBeatTrackingInfo__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long j;
        NLEBeatTrackingInfo nLEBeatTrackingInfo = (NLEBeatTrackingInfo) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEBeatTrackingInfo == null) {
            j = 0;
        } else {
            j = nLEBeatTrackingInfo.LIZ;
        }
        NLEMediaJniJNI.VecNLEBeatTrackingInfo_doAdd__SWIG_0(j2, this, j, nLEBeatTrackingInfo);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return new NLEBeatTrackingInfo(NLEMediaJniJNI.VecNLEBeatTrackingInfo_doGet(this.LJLIL, this, i), false);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return new NLEBeatTrackingInfo(NLEMediaJniJNI.VecNLEBeatTrackingInfo_doRemove(this.LJLIL, this, i), true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        long j;
        NLEBeatTrackingInfo nLEBeatTrackingInfo = (NLEBeatTrackingInfo) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEBeatTrackingInfo == null) {
            j = 0;
        } else {
            j = nLEBeatTrackingInfo.LIZ;
        }
        NLEMediaJniJNI.VecNLEBeatTrackingInfo_doAdd__SWIG_1(j2, this, i, j, nLEBeatTrackingInfo);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEMediaJniJNI.VecNLEBeatTrackingInfo_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long j;
        NLEBeatTrackingInfo nLEBeatTrackingInfo = (NLEBeatTrackingInfo) obj;
        long j2 = this.LJLIL;
        if (nLEBeatTrackingInfo == null) {
            j = 0;
        } else {
            j = nLEBeatTrackingInfo.LIZ;
        }
        return new NLEBeatTrackingInfo(NLEMediaJniJNI.VecNLEBeatTrackingInfo_doSet(j2, this, i, j, nLEBeatTrackingInfo), true);
    }
}
