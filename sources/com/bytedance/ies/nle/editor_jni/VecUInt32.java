package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes17.dex */
public final class VecUInt32 extends AbstractList<Long> implements RandomAccess {
    public static final /* synthetic */ int LJLJI = 0;
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLETemplateJNI.delete_VecUInt32(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLETemplateJNI.VecUInt32_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLETemplateJNI.VecUInt32_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLETemplateJNI.VecUInt32_doSize(this.LJLIL, this);
    }

    public VecUInt32() {
        this(NLETemplateJNI.new_VecUInt32__SWIG_0());
    }

    public VecUInt32(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        NLETemplateJNI.VecUInt32_doAdd__SWIG_0(this.LJLIL, this, ((Long) obj).longValue());
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(NLETemplateJNI.VecUInt32_doGet(this.LJLIL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return Long.valueOf(NLETemplateJNI.VecUInt32_doRemove(this.LJLIL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ((AbstractList) this).modCount++;
        NLETemplateJNI.VecUInt32_doAdd__SWIG_1(this.LJLIL, this, i, ((Long) obj).longValue());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLETemplateJNI.VecUInt32_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Long.valueOf(NLETemplateJNI.VecUInt32_doSet(this.LJLIL, this, i, ((Long) obj).longValue()));
    }
}
