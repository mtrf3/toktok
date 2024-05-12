package com.bytedance.ies.smartmovie.jni;

import X.EnumC124044ts;
import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes8.dex */
public final class VecBachAlgorithmType extends AbstractList<EnumC124044ts> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    SmartMovieJniJNI.delete_VecBachAlgorithmType(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        SmartMovieJniJNI.VecBachAlgorithmType_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return SmartMovieJniJNI.VecBachAlgorithmType_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return SmartMovieJniJNI.VecBachAlgorithmType_doSize(this.LJLIL, this);
    }

    public VecBachAlgorithmType() {
        long new_VecBachAlgorithmType__SWIG_0 = SmartMovieJniJNI.new_VecBachAlgorithmType__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecBachAlgorithmType__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecBachAlgorithmType_doAdd__SWIG_0(this.LJLIL, this, ((EnumC124044ts) obj).swigValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return EnumC124044ts.swigToEnum(SmartMovieJniJNI.VecBachAlgorithmType_doGet(this.LJLIL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return EnumC124044ts.swigToEnum(SmartMovieJniJNI.VecBachAlgorithmType_doRemove(this.LJLIL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecBachAlgorithmType_doAdd__SWIG_1(this.LJLIL, this, i, ((EnumC124044ts) obj).swigValue());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        SmartMovieJniJNI.VecBachAlgorithmType_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return EnumC124044ts.swigToEnum(SmartMovieJniJNI.VecBachAlgorithmType_doSet(this.LJLIL, this, i, ((EnumC124044ts) obj).swigValue()));
    }
}
