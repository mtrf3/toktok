package com.bytedance.ies.nle.editor_jni;

import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLEAudioEffectAdjustParamsInfo extends AbstractList<NLEAudioEffectAdjustParamsInfo> implements RandomAccess {
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLEAudioEffectAdjustParamsInfo(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLEAudioEffectAdjustParamsInfo_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLEAudioEffectAdjustParamsInfo_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLEAudioEffectAdjustParamsInfo_doSize(this.LJLIL, this);
    }

    public VecNLEAudioEffectAdjustParamsInfo() {
        long new_VecNLEAudioEffectAdjustParamsInfo__SWIG_0 = NLEEditorJniJNI.new_VecNLEAudioEffectAdjustParamsInfo__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLEAudioEffectAdjustParamsInfo__SWIG_0;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        long j;
        NLEAudioEffectAdjustParamsInfo nLEAudioEffectAdjustParamsInfo = (NLEAudioEffectAdjustParamsInfo) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEAudioEffectAdjustParamsInfo == null) {
            j = 0;
        } else {
            j = nLEAudioEffectAdjustParamsInfo.LIZ;
        }
        NLEEditorJniJNI.VecNLEAudioEffectAdjustParamsInfo_doAdd__SWIG_0(j2, this, j, nLEAudioEffectAdjustParamsInfo);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        long VecNLEAudioEffectAdjustParamsInfo_doGet = NLEEditorJniJNI.VecNLEAudioEffectAdjustParamsInfo_doGet(this.LJLIL, this, i);
        if (VecNLEAudioEffectAdjustParamsInfo_doGet == 0) {
            return null;
        }
        return new NLEAudioEffectAdjustParamsInfo(VecNLEAudioEffectAdjustParamsInfo_doGet);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        long VecNLEAudioEffectAdjustParamsInfo_doRemove = NLEEditorJniJNI.VecNLEAudioEffectAdjustParamsInfo_doRemove(this.LJLIL, this, i);
        if (VecNLEAudioEffectAdjustParamsInfo_doRemove == 0) {
            return null;
        }
        return new NLEAudioEffectAdjustParamsInfo(VecNLEAudioEffectAdjustParamsInfo_doRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        long j;
        NLEAudioEffectAdjustParamsInfo nLEAudioEffectAdjustParamsInfo = (NLEAudioEffectAdjustParamsInfo) obj;
        ((AbstractList) this).modCount++;
        long j2 = this.LJLIL;
        if (nLEAudioEffectAdjustParamsInfo == null) {
            j = 0;
        } else {
            j = nLEAudioEffectAdjustParamsInfo.LIZ;
        }
        NLEEditorJniJNI.VecNLEAudioEffectAdjustParamsInfo_doAdd__SWIG_1(j2, this, i, j, nLEAudioEffectAdjustParamsInfo);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLEAudioEffectAdjustParamsInfo_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        long j;
        NLEAudioEffectAdjustParamsInfo nLEAudioEffectAdjustParamsInfo = (NLEAudioEffectAdjustParamsInfo) obj;
        long j2 = this.LJLIL;
        if (nLEAudioEffectAdjustParamsInfo == null) {
            j = 0;
        } else {
            j = nLEAudioEffectAdjustParamsInfo.LIZ;
        }
        long VecNLEAudioEffectAdjustParamsInfo_doSet = NLEEditorJniJNI.VecNLEAudioEffectAdjustParamsInfo_doSet(j2, this, i, j, nLEAudioEffectAdjustParamsInfo);
        if (VecNLEAudioEffectAdjustParamsInfo_doSet == 0) {
            return null;
        }
        return new NLEAudioEffectAdjustParamsInfo(VecNLEAudioEffectAdjustParamsInfo_doSet);
    }
}
