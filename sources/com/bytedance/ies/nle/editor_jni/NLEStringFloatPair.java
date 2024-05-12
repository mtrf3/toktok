package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEStringFloatPair extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEStringFloatPair(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEStringFloatPair_clone = NLEEditorJniJNI.NLEStringFloatPair_clone(this.LIZ, this);
        if (NLEStringFloatPair_clone == 0) {
            return null;
        }
        return new NLENode(NLEStringFloatPair_clone, true);
    }

    public NLEStringFloatPair() {
        this(NLEEditorJniJNI.new_NLEStringFloatPair());
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void finalize() {
        delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final /* bridge */ /* synthetic */ Object mo70clone() {
        return mo70clone();
    }

    public NLEStringFloatPair(long j) {
        super(NLEEditorJniJNI.NLEStringFloatPair_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public static long LIZ(NLEStringFloatPair nLEStringFloatPair) {
        if (nLEStringFloatPair == null) {
            return 0L;
        }
        return nLEStringFloatPair.LIZ;
    }

    public final void LIZIZ(float f) {
        NLEEditorJniJNI.NLEStringFloatPair_setSecond(this.LIZ, this, f);
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
