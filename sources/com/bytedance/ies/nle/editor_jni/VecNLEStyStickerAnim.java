package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEStyStickerAnim extends AbstractList<NLEStyStickerAnim> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEStyStickerAnim(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEStyStickerAnim_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEStyStickerAnim_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEStyStickerAnim_doSize(this.LJLIL, this);
    }

    public VecNLEStyStickerAnim() {
        long new_VecNLEStyStickerAnim__SWIG_0 = NLEEditorJniJNI.new_VecNLEStyStickerAnim__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEStyStickerAnim__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long j;
        NLEStyStickerAnim nLEStyStickerAnim = (NLEStyStickerAnim) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEStyStickerAnim == null) {
            j = 0;
        } else {
            j = nLEStyStickerAnim.LIZ;
        }
        NLEEditorJniJNI.VecNLEStyStickerAnim_doAdd__SWIG_0(j2, this, j, nLEStyStickerAnim);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEStyStickerAnim_doGet = NLEEditorJniJNI.VecNLEStyStickerAnim_doGet(this.LJLIL, this, i);
        if (VecNLEStyStickerAnim_doGet == 0) {
            return null;
        }
        return new NLEStyStickerAnim(VecNLEStyStickerAnim_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEStyStickerAnim_doRemove = NLEEditorJniJNI.VecNLEStyStickerAnim_doRemove(this.LJLIL, this, i);
        if (VecNLEStyStickerAnim_doRemove == 0) {
            return null;
        }
        return new NLEStyStickerAnim(VecNLEStyStickerAnim_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        long j;
        NLEStyStickerAnim nLEStyStickerAnim = (NLEStyStickerAnim) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEStyStickerAnim == null) {
            j = 0;
        } else {
            j = nLEStyStickerAnim.LIZ;
        }
        NLEEditorJniJNI.VecNLEStyStickerAnim_doAdd__SWIG_1(j2, this, i, j, nLEStyStickerAnim);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEStyStickerAnim_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long j;
        NLEStyStickerAnim nLEStyStickerAnim = (NLEStyStickerAnim) obj;
        long j2 = this.LJLIL;
        if (nLEStyStickerAnim == null) {
            j = 0;
        } else {
            j = nLEStyStickerAnim.LIZ;
        }
        long VecNLEStyStickerAnim_doSet = NLEEditorJniJNI.VecNLEStyStickerAnim_doSet(j2, this, i, j, nLEStyStickerAnim);
        if (VecNLEStyStickerAnim_doSet == 0) {
            return null;
        }
        return new NLEStyStickerAnim(VecNLEStyStickerAnim_doSet);
    }
}
