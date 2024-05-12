package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEChromaChannelSPtrConst extends AbstractList<NLEChromaChannel> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEChromaChannelSPtrConst(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_doSize(this.LJLIL, this);
    }

    public VecNLEChromaChannelSPtrConst() {
        long new_VecNLEChromaChannelSPtrConst__SWIG_0 = NLEEditorJniJNI.new_VecNLEChromaChannelSPtrConst__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEChromaChannelSPtrConst__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEChromaChannel nLEChromaChannel = (NLEChromaChannel) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_doAdd__SWIG_0(this.LJLIL, this, NLEChromaChannel.LIZ(nLEChromaChannel), nLEChromaChannel);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEChromaChannelSPtrConst_doGet = NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_doGet(this.LJLIL, this, i);
        if (VecNLEChromaChannelSPtrConst_doGet == 0) {
            return null;
        }
        return new NLEChromaChannel(VecNLEChromaChannelSPtrConst_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEChromaChannelSPtrConst_doRemove = NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_doRemove(this.LJLIL, this, i);
        if (VecNLEChromaChannelSPtrConst_doRemove == 0) {
            return null;
        }
        return new NLEChromaChannel(VecNLEChromaChannelSPtrConst_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEChromaChannel nLEChromaChannel = (NLEChromaChannel) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_doAdd__SWIG_1(this.LJLIL, this, i, NLEChromaChannel.LIZ(nLEChromaChannel), nLEChromaChannel);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEChromaChannel nLEChromaChannel = (NLEChromaChannel) obj;
        long VecNLEChromaChannelSPtrConst_doSet = NLEEditorJniJNI.VecNLEChromaChannelSPtrConst_doSet(this.LJLIL, this, i, NLEChromaChannel.LIZ(nLEChromaChannel), nLEChromaChannel);
        if (VecNLEChromaChannelSPtrConst_doSet == 0) {
            return null;
        }
        return new NLEChromaChannel(VecNLEChromaChannelSPtrConst_doSet);
    }
}
