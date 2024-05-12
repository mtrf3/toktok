package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEStringStringPair extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEStringStringPair(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEStringStringPair_clone = NLEEditorJniJNI.NLEStringStringPair_clone(this.LIZ, this);
        if (NLEStringStringPair_clone == 0) {
            return null;
        }
        return new NLENode(NLEStringStringPair_clone, true);
    }

    public NLEStringStringPair() {
        this(NLEEditorJniJNI.new_NLEStringStringPair());
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

    public NLEStringStringPair(long j) {
        super(NLEEditorJniJNI.NLEStringStringPair_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public static long LIZ(NLEStringStringPair nLEStringStringPair) {
        if (nLEStringStringPair == null) {
            return 0L;
        }
        return nLEStringStringPair.LIZ;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
