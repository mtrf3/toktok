package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLELoudnessDetectResult {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLELoudnessDetectResult(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLELoudnessDetectResult() {
        long new_NLELoudnessDetectResult = NLEMediaJniJNI.new_NLELoudnessDetectResult();
        this.LIZIZ = true;
        this.LIZ = new_NLELoudnessDetectResult;
    }
}
