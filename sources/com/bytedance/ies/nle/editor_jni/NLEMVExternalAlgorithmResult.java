package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEMVExternalAlgorithmResult extends NLENode {
    public transient long LIZ;
    public transient boolean LIZIZ;

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final synchronized void delete() {
        long j = this.LIZ;
        if (j != 0) {
            if (this.LIZIZ) {
                this.LIZIZ = false;
                NLEEditorJniJNI.delete_NLEMVExternalAlgorithmResult(j);
            }
            this.LIZ = 0L;
        }
        super.delete();
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    /* renamed from: clone */
    public final NLENode mo70clone() {
        long NLEMVExternalAlgorithmResult_clone = NLEEditorJniJNI.NLEMVExternalAlgorithmResult_clone(this.LIZ, this);
        if (NLEMVExternalAlgorithmResult_clone == 0) {
            return null;
        }
        return new NLENode(NLEMVExternalAlgorithmResult_clone, true);
    }

    public NLEMVExternalAlgorithmResult() {
        this(NLEEditorJniJNI.new_NLEMVExternalAlgorithmResult());
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

    public NLEMVExternalAlgorithmResult(long j) {
        super(NLEEditorJniJNI.NLEMVExternalAlgorithmResult_SWIGSmartPtrUpcast(j), true);
        this.LIZIZ = true;
        this.LIZ = j;
    }

    public static long LIZ(NLEMVExternalAlgorithmResult nLEMVExternalAlgorithmResult) {
        if (nLEMVExternalAlgorithmResult == null) {
            return 0L;
        }
        return nLEMVExternalAlgorithmResult.LIZ;
    }

    @Override // com.bytedance.ies.nle.editor_jni.NLENode
    public final void swigSetCMemOwn(boolean z) {
        this.LIZIZ = z;
        super.swigSetCMemOwn(z);
    }
}
