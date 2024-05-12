package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecString extends AbstractList<String> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecString(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecString_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecString_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecString_doSize(this.LJLIL, this);
    }

    public VecString() {
        this(NLEEditorJniJNI.new_VecString__SWIG_0(), true);
    }

    public VecString(String[] strArr) {
        this();
        NLEEditorJniJNI.VecString_reserve(this.LJLIL, this, strArr.length);
        for (String str : strArr) {
            ((AbstractList) this).modCount++;
            NLEEditorJniJNI.VecString_doAdd__SWIG_0(this.LJLIL, this, str);
        }
    }

    public static long LIZJ(VecString vecString) {
        if (vecString == null) {
            return 0L;
        }
        return vecString.LJLIL;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecString_doAdd__SWIG_0(this.LJLIL, this, (String) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return NLEEditorJniJNI.VecString_doGet(this.LJLIL, this, i);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return NLEEditorJniJNI.VecString_doRemove(this.LJLIL, this, i);
    }

    public VecString(long j, boolean z) {
        this.LJLILLLLZI = z;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecString_doAdd__SWIG_1(this.LJLIL, this, i, (String) obj);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecString_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return NLEEditorJniJNI.VecString_doSet(this.LJLIL, this, i, (String) obj);
    }
}
