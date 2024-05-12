package com.bytedance.ies.smartmovie.jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
public final class VecPairBoolLong extends AbstractList<PairBoolLong> implements RandomAccess {
    public static final /* synthetic */ int LJLJI = 0;
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    SmartMovieJniJNI.delete_VecPairBoolLong(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        SmartMovieJniJNI.VecPairBoolLong_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return SmartMovieJniJNI.VecPairBoolLong_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return SmartMovieJniJNI.VecPairBoolLong_doSize(this.LJLIL, this);
    }

    public VecPairBoolLong() {
        this(SmartMovieJniJNI.new_VecPairBoolLong__SWIG_0());
    }

    public VecPairBoolLong(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    public final void LIZJ(PairBoolLong pairBoolLong) {
        long j;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (pairBoolLong == null) {
            j = 0;
        } else {
            j = pairBoolLong.LIZ;
        }
        SmartMovieJniJNI.VecPairBoolLong_doAdd__SWIG_0(j2, this, j, pairBoolLong);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LIZJ((PairBoolLong) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return new PairBoolLong(SmartMovieJniJNI.VecPairBoolLong_doGet(this.LJLIL, this, i), false);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return new PairBoolLong(SmartMovieJniJNI.VecPairBoolLong_doRemove(this.LJLIL, this, i), true);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        long j;
        PairBoolLong pairBoolLong = (PairBoolLong) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (pairBoolLong == null) {
            j = 0;
        } else {
            j = pairBoolLong.LIZ;
        }
        SmartMovieJniJNI.VecPairBoolLong_doAdd__SWIG_1(j2, this, i, j, pairBoolLong);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecPairBoolLong_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long j;
        PairBoolLong pairBoolLong = (PairBoolLong) obj;
        long j2 = this.LJLIL;
        if (pairBoolLong == null) {
            j = 0;
        } else {
            j = pairBoolLong.LIZ;
        }
        return new PairBoolLong(SmartMovieJniJNI.VecPairBoolLong_doSet(j2, this, i, j, pairBoolLong), true);
    }
}
