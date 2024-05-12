package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes16.dex */
public final class NLEClipAlgorithmParam {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEClipAlgorithmParam(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEClipAlgorithmParam() {
        this(NLEMediaJniJNI.new_NLEClipAlgorithmParam());
    }

    public NLEClipAlgorithmParam(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
