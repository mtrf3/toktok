package com.bytedance.ies.nle.editor_jni;

import X.EnumC123864ta;
import java.util.AbstractList;
import java.util.RandomAccess;

/* loaded from: classes3.dex */
public final class VecNLETrackType extends AbstractList<EnumC123864ta> implements RandomAccess {
    public static final /* synthetic */ int LJLJI = 0;
    public transient long LJLIL;
    public transient boolean LJLILLLLZI;

    public final void finalize() {
        synchronized (this) {
            long j = this.LJLIL;
            if (j != 0) {
                if (this.LJLILLLLZI) {
                    this.LJLILLLLZI = false;
                    NLEEditorJniJNI.delete_VecNLETrackType(j);
                }
                this.LJLIL = 0L;
            }
        }
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        NLEEditorJniJNI.VecNLETrackType_clear(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return NLEEditorJniJNI.VecNLETrackType_isEmpty(this.LJLIL, this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return NLEEditorJniJNI.VecNLETrackType_doSize(this.LJLIL, this);
    }

    public VecNLETrackType() {
        long new_VecNLETrackType__SWIG_0 = NLEEditorJniJNI.new_VecNLETrackType__SWIG_0();
        this.LJLILLLLZI = true;
        this.LJLIL = new_VecNLETrackType__SWIG_0;
    }

    public VecNLETrackType(EnumC123864ta[] enumC123864taArr) {
        this();
        NLEEditorJniJNI.VecNLETrackType_reserve(this.LJLIL, this, enumC123864taArr.length);
        for (EnumC123864ta enumC123864ta : enumC123864taArr) {
            LIZJ(enumC123864ta);
        }
    }

    public final void LIZJ(EnumC123864ta enumC123864ta) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackType_doAdd__SWIG_0(this.LJLIL, this, enumC123864ta.swigValue());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        LIZJ((EnumC123864ta) obj);
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return EnumC123864ta.swigToEnum(NLEEditorJniJNI.VecNLETrackType_doGet(this.LJLIL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        ((AbstractList) this).modCount++;
        return EnumC123864ta.swigToEnum(NLEEditorJniJNI.VecNLETrackType_doRemove(this.LJLIL, this, i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackType_doAdd__SWIG_1(this.LJLIL, this, i, ((EnumC123864ta) obj).swigValue());
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        ((AbstractList) this).modCount++;
        NLEEditorJniJNI.VecNLETrackType_doRemoveRange(this.LJLIL, this, i, i2);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        return EnumC123864ta.swigToEnum(NLEEditorJniJNI.VecNLETrackType_doSet(this.LJLIL, this, i, ((EnumC123864ta) obj).swigValue()));
    }
}
