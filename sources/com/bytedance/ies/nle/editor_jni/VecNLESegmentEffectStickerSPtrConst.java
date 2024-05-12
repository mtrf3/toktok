package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLESegmentEffectStickerSPtrConst extends AbstractList<NLESegmentEffectSticker> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLESegmentEffectStickerSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLESegmentEffectStickerSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLESegmentEffectStickerSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLESegmentEffectStickerSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLESegmentEffectStickerSPtrConst() {
        long new_VecNLESegmentEffectStickerSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLESegmentEffectStickerSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLESegmentEffectStickerSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLESegmentEffectSticker nLESegmentEffectSticker = (NLESegmentEffectSticker) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLESegmentEffectStickerSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLESegmentEffectSticker.LIZLLL(nLESegmentEffectSticker), nLESegmentEffectSticker);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLESegmentEffectStickerSPtrConst_doGet = NLEEditorJniJNI.VecNLESegmentEffectStickerSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLESegmentEffectStickerSPtrConst_doGet == 0) {
            return null;
        }
        return new NLESegmentEffectSticker(VecNLESegmentEffectStickerSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLESegmentEffectStickerSPtrConst_doRemove = NLEEditorJniJNI.VecNLESegmentEffectStickerSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLESegmentEffectStickerSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLESegmentEffectSticker(VecNLESegmentEffectStickerSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLESegmentEffectSticker nLESegmentEffectSticker = (NLESegmentEffectSticker) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLESegmentEffectStickerSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLESegmentEffectSticker.LIZLLL(nLESegmentEffectSticker), nLESegmentEffectSticker);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLESegmentEffectStickerSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLESegmentEffectSticker nLESegmentEffectSticker = (NLESegmentEffectSticker) obj;
        long VecNLESegmentEffectStickerSPtrConst_doSet = NLEEditorJniJNI.VecNLESegmentEffectStickerSPtrConst_doSet(this.LJLIL, this, i, NLESegmentEffectSticker.LIZLLL(nLESegmentEffectSticker), nLESegmentEffectSticker);
        if (VecNLESegmentEffectStickerSPtrConst_doSet == 0) {
            return null;
        }
        return new NLESegmentEffectSticker(VecNLESegmentEffectStickerSPtrConst_doSet);
    }
}
