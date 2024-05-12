package com.bytedance.ies.smartmovie.jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
public final class VecStr extends AbstractList<String> implements RandomAccess {
    public static final /* synthetic */ int LJLJI = 0;
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    SmartMovieJniJNI.delete_VecStr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        SmartMovieJniJNI.VecStr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return SmartMovieJniJNI.VecStr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return SmartMovieJniJNI.VecStr_doSize(this.LJLIL, this);
    }

    public VecStr() {
        this(SmartMovieJniJNI.new_VecStr__SWIG_0());
    }

    public VecStr(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    public final void LIZJ(String str) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecStr_doAdd__SWIG_0(this.LJLIL, this, str);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LIZJ((String) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return SmartMovieJniJNI.VecStr_doGet(this.LJLIL, this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return SmartMovieJniJNI.VecStr_doRemove(this.LJLIL, this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecStr_doAdd__SWIG_1(this.LJLIL, this, i, (String) obj);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecStr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return SmartMovieJniJNI.VecStr_doSet(this.LJLIL, this, i, (String) obj);
    }
}
