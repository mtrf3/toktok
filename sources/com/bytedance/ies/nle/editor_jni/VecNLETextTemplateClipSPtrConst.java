package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLETextTemplateClipSPtrConst extends AbstractList<NLETextTemplateClip> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLETextTemplateClipSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLETextTemplateClipSPtrConst() {
        long new_VecNLETextTemplateClipSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLETextTemplateClipSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLETextTemplateClipSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLETextTemplateClip nLETextTemplateClip = (NLETextTemplateClip) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLETextTemplateClip.LIZ(nLETextTemplateClip), nLETextTemplateClip);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLETextTemplateClipSPtrConst_doGet = NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLETextTemplateClipSPtrConst_doGet == 0) {
            return null;
        }
        return new NLETextTemplateClip(VecNLETextTemplateClipSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLETextTemplateClipSPtrConst_doRemove = NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLETextTemplateClipSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLETextTemplateClip(VecNLETextTemplateClipSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLETextTemplateClip nLETextTemplateClip = (NLETextTemplateClip) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLETextTemplateClip.LIZ(nLETextTemplateClip), nLETextTemplateClip);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLETextTemplateClip nLETextTemplateClip = (NLETextTemplateClip) obj;
        long VecNLETextTemplateClipSPtrConst_doSet = NLEEditorJniJNI.VecNLETextTemplateClipSPtrConst_doSet(this.LJLIL, this, i, NLETextTemplateClip.LIZ(nLETextTemplateClip), nLETextTemplateClip);
        if (VecNLETextTemplateClipSPtrConst_doSet == 0) {
            return null;
        }
        return new NLETextTemplateClip(VecNLETextTemplateClipSPtrConst_doSet);
    }
}
