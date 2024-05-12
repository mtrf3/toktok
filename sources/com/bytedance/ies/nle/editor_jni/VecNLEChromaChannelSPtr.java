package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEChromaChannelSPtr extends AbstractList<NLEChromaChannel> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEChromaChannelSPtr(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEChromaChannelSPtr_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEChromaChannelSPtr_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEChromaChannelSPtr_doSize(this.LJLIL, this);
    }

    public VecNLEChromaChannelSPtr() {
        this(NLEEditorJniJNI.new_VecNLEChromaChannelSPtr__SWIG_0());
    }

    public VecNLEChromaChannelSPtr(long j) {
        this.LJLILLLLZI = true;
        this.LJLIL = j;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        NLEChromaChannel nLEChromaChannel = (NLEChromaChannel) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEChromaChannelSPtr_doAdd__SWIG_0(this.LJLIL, this, NLEChromaChannel.LIZ(nLEChromaChannel), nLEChromaChannel);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEChromaChannelSPtr_doGet = NLEEditorJniJNI.VecNLEChromaChannelSPtr_doGet(this.LJLIL, this, i);
        if (VecNLEChromaChannelSPtr_doGet == 0) {
            return null;
        }
        return new NLEChromaChannel(VecNLEChromaChannelSPtr_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEChromaChannelSPtr_doRemove = NLEEditorJniJNI.VecNLEChromaChannelSPtr_doRemove(this.LJLIL, this, i);
        if (VecNLEChromaChannelSPtr_doRemove == 0) {
            return null;
        }
        return new NLEChromaChannel(VecNLEChromaChannelSPtr_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        NLEChromaChannel nLEChromaChannel = (NLEChromaChannel) obj;
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEChromaChannelSPtr_doAdd__SWIG_1(this.LJLIL, this, i, NLEChromaChannel.LIZ(nLEChromaChannel), nLEChromaChannel);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEChromaChannelSPtr_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        NLEChromaChannel nLEChromaChannel = (NLEChromaChannel) obj;
        long VecNLEChromaChannelSPtr_doSet = NLEEditorJniJNI.VecNLEChromaChannelSPtr_doSet(this.LJLIL, this, i, NLEChromaChannel.LIZ(nLEChromaChannel), nLEChromaChannel);
        if (VecNLEChromaChannelSPtr_doSet == 0) {
            return null;
        }
        return new NLEChromaChannel(VecNLEChromaChannelSPtr_doSet);
    }
}
