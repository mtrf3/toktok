package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes16.dex */
public final class VecNLEWatermarkEntity extends AbstractList<NLEWatermarkEntity> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEMediaJniJNI.delete_VecNLEWatermarkEntity(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEMediaJniJNI.VecNLEWatermarkEntity_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEMediaJniJNI.VecNLEWatermarkEntity_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEMediaJniJNI.VecNLEWatermarkEntity_doSize(this.LJLIL, this);
    }

    public VecNLEWatermarkEntity() {
        long new_VecNLEWatermarkEntity__SWIG_0 = NLEMediaJniJNI.new_VecNLEWatermarkEntity__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEWatermarkEntity__SWIG_0;
    }

    public final void LIZJ(NLEWatermarkEntity nLEWatermarkEntity) {
        long j;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEWatermarkEntity == null) {
            j = 0;
        } else {
            j = nLEWatermarkEntity.LIZ;
        }
        NLEMediaJniJNI.VecNLEWatermarkEntity_doAdd__SWIG_0(j2, this, j, nLEWatermarkEntity);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LIZJ((NLEWatermarkEntity) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return new NLEWatermarkEntity(NLEMediaJniJNI.VecNLEWatermarkEntity_doGet(this.LJLIL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return new NLEWatermarkEntity(NLEMediaJniJNI.VecNLEWatermarkEntity_doRemove(this.LJLIL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        long j;
        NLEWatermarkEntity nLEWatermarkEntity = (NLEWatermarkEntity) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEWatermarkEntity == null) {
            j = 0;
        } else {
            j = nLEWatermarkEntity.LIZ;
        }
        NLEMediaJniJNI.VecNLEWatermarkEntity_doAdd__SWIG_1(j2, this, i, j, nLEWatermarkEntity);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEMediaJniJNI.VecNLEWatermarkEntity_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long j;
        NLEWatermarkEntity nLEWatermarkEntity = (NLEWatermarkEntity) obj;
        long j2 = this.LJLIL;
        if (nLEWatermarkEntity == null) {
            j = 0;
        } else {
            j = nLEWatermarkEntity.LIZ;
        }
        return new NLEWatermarkEntity(NLEMediaJniJNI.VecNLEWatermarkEntity_doSet(j2, this, i, j, nLEWatermarkEntity));
    }
}
