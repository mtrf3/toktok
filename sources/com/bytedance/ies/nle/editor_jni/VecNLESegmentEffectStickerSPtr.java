package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLESegmentEffectStickerSPtr extends AbstractList<NLESegmentEffectSticker> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLESegmentEffectStickerSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLESegmentEffectStickerSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLESegmentEffectStickerSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLESegmentEffectStickerSPtr_doSize(this.LJLIL, this);
    }

    public VecNLESegmentEffectStickerSPtr() {
        long new_VecNLESegmentEffectStickerSPtr__SWIG_0 = NLEEditorJniJNI.new_VecNLESegmentEffectStickerSPtr__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLESegmentEffectStickerSPtr__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLESegmentEffectSticker nLESegmentEffectSticker = (NLESegmentEffectSticker) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLESegmentEffectStickerSPtr_doAdd__SWIG_0(this.LJLIL, this, NLESegmentEffectSticker.LIZLLL(nLESegmentEffectSticker), nLESegmentEffectSticker);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLESegmentEffectStickerSPtr_doGet = NLEEditorJniJNI.VecNLESegmentEffectStickerSPtr_doGet(this.LJLIL, this, i);
        if (VecNLESegmentEffectStickerSPtr_doGet == 0) {
            return null;
        }
        return new NLESegmentEffectSticker(VecNLESegmentEffectStickerSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLESegmentEffectStickerSPtr_doRemove = NLEEditorJniJNI.VecNLESegmentEffectStickerSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLESegmentEffectStickerSPtr_doRemove == 0) {
            return null;
        }
        return new NLESegmentEffectSticker(VecNLESegmentEffectStickerSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLESegmentEffectSticker nLESegmentEffectSticker = (NLESegmentEffectSticker) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLESegmentEffectStickerSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLESegmentEffectSticker.LIZLLL(nLESegmentEffectSticker), nLESegmentEffectSticker);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLESegmentEffectStickerSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLESegmentEffectSticker nLESegmentEffectSticker = (NLESegmentEffectSticker) obj;
        long VecNLESegmentEffectStickerSPtr_doSet = NLEEditorJniJNI.VecNLESegmentEffectStickerSPtr_doSet(this.LJLIL, this, i, NLESegmentEffectSticker.LIZLLL(nLESegmentEffectSticker), nLESegmentEffectSticker);
        if (VecNLESegmentEffectStickerSPtr_doSet == 0) {
            return null;
        }
        return new NLESegmentEffectSticker(VecNLESegmentEffectStickerSPtr_doSet);
    }
}
