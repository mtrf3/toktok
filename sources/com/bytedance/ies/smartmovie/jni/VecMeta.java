package com.bytedance.ies.smartmovie.jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
public final class VecMeta extends AbstractList<Meta> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    SmartMovieJniJNI.delete_VecMeta(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        SmartMovieJniJNI.VecMeta_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return SmartMovieJniJNI.VecMeta_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return SmartMovieJniJNI.VecMeta_doSize(this.LJLIL, this);
    }

    public VecMeta() {
        this(SmartMovieJniJNI.new_VecMeta__SWIG_0());
    }

    public VecMeta(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    public static long LJFF(VecMeta vecMeta) {
        if (vecMeta == null) {
            return 0L;
        }
        return vecMeta.LJLIL;
    }

    public final void LIZJ(Meta meta) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecMeta_doAdd__SWIG_0(this.LJLIL, this, Meta.LIZ(meta), meta);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LIZJ((Meta) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return new Meta(SmartMovieJniJNI.VecMeta_doGet(this.LJLIL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return new Meta(SmartMovieJniJNI.VecMeta_doRemove(this.LJLIL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        Meta meta = (Meta) obj;
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecMeta_doAdd__SWIG_1(this.LJLIL, this, i, Meta.LIZ(meta), meta);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecMeta_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        Meta meta = (Meta) obj;
        return new Meta(SmartMovieJniJNI.VecMeta_doSet(this.LJLIL, this, i, Meta.LIZ(meta), meta));
    }
}
