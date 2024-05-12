package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecLongLong extends AbstractList<Long> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecLongLong(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecLongLong_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecLongLong_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecLongLong_doSize(this.LJLIL, this);
    }

    public VecLongLong() {
        long new_VecLongLong__SWIG_0 = NLEEditorJniJNI.new_VecLongLong__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecLongLong__SWIG_0;
    }

    public final void LIZJ(Long l) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecLongLong_doAdd__SWIG_0(this.LJLIL, this, l.longValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LIZJ((Long) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Long.valueOf(NLEEditorJniJNI.VecLongLong_doGet(this.LJLIL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return Long.valueOf(NLEEditorJniJNI.VecLongLong_doRemove(this.LJLIL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecLongLong_doAdd__SWIG_1(this.LJLIL, this, i, ((Long) obj).longValue());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecLongLong_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Long.valueOf(NLEEditorJniJNI.VecLongLong_doSet(this.LJLIL, this, i, ((Long) obj).longValue()));
    }
}
