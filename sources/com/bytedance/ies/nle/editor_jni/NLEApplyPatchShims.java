package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEApplyPatchShims {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaPublicJniJNI.delete_NLEApplyPatchShims(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEApplyPatchShims(NLEModel nLEModel) {
        long new_NLEApplyPatchShims = NLEMediaPublicJniJNI.new_NLEApplyPatchShims(NLEModel.getCPtr(nLEModel), nLEModel);
        this.LIZIZ = true;
        this.LIZ = new_NLEApplyPatchShims;
    }
}
