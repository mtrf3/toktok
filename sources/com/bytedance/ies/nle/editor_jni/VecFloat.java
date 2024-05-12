package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecFloat extends AbstractList<Float> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecFloat(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecFloat_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecFloat_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecFloat_doSize(this.LJLIL, this);
    }

    public VecFloat() {
        this(NLEEditorJniJNI.new_VecFloat__SWIG_0());
    }

    public VecFloat(Iterable<Float> iterable) {
        this();
        Iterator<Float> it = iterable.iterator();
        while (it.hasNext()) {
            LIZJ(Float.valueOf(it.next().floatValue()));
        }
    }

    public final void LIZJ(Float f) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecFloat_doAdd__SWIG_0(this.LJLIL, this, f.floatValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LIZJ((Float) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return Float.valueOf(NLEEditorJniJNI.VecFloat_doGet(this.LJLIL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return Float.valueOf(NLEEditorJniJNI.VecFloat_doRemove(this.LJLIL, this, i));
    }

    public VecFloat(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecFloat_doAdd__SWIG_1(this.LJLIL, this, i, ((Float) obj).floatValue());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecFloat_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return Float.valueOf(NLEEditorJniJNI.VecFloat_doSet(this.LJLIL, this, i, ((Float) obj).floatValue()));
    }
}
