package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLETextTemplateClipSPtr extends AbstractList<NLETextTemplateClip> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLETextTemplateClipSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLETextTemplateClipSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETextTemplateClipSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLETextTemplateClipSPtr_doSize(this.LJLIL, this);
    }

    public VecNLETextTemplateClipSPtr() {
        this(NLEEditorJniJNI.new_VecNLETextTemplateClipSPtr__SWIG_0());
    }

    public VecNLETextTemplateClipSPtr(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: LIZJ, reason: merged with bridge method [inline-methods] */
    public final NLETextTemplateClip get(int i) {
        long VecNLETextTemplateClipSPtr_doGet = NLEEditorJniJNI.VecNLETextTemplateClipSPtr_doGet(this.LJLIL, this, i);
        if (VecNLETextTemplateClipSPtr_doGet == 0) {
            return null;
        }
        return new NLETextTemplateClip(VecNLETextTemplateClipSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLETextTemplateClip nLETextTemplateClip = (NLETextTemplateClip) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETextTemplateClipSPtr_doAdd__SWIG_0(this.LJLIL, this, NLETextTemplateClip.LIZ(nLETextTemplateClip), nLETextTemplateClip);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLETextTemplateClipSPtr_doRemove = NLEEditorJniJNI.VecNLETextTemplateClipSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLETextTemplateClipSPtr_doRemove == 0) {
            return null;
        }
        return new NLETextTemplateClip(VecNLETextTemplateClipSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLETextTemplateClip nLETextTemplateClip = (NLETextTemplateClip) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETextTemplateClipSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLETextTemplateClip.LIZ(nLETextTemplateClip), nLETextTemplateClip);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETextTemplateClipSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLETextTemplateClip nLETextTemplateClip = (NLETextTemplateClip) obj;
        long VecNLETextTemplateClipSPtr_doSet = NLEEditorJniJNI.VecNLETextTemplateClipSPtr_doSet(this.LJLIL, this, i, NLETextTemplateClip.LIZ(nLETextTemplateClip), nLETextTemplateClip);
        if (VecNLETextTemplateClipSPtr_doSet == 0) {
            return null;
        }
        return new NLETextTemplateClip(VecNLETextTemplateClipSPtr_doSet);
    }
}
