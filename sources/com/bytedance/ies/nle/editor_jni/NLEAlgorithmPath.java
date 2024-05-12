package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLEAlgorithmPath {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLEAlgorithmPath(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLEAlgorithmPath() {
        long new_NLEAlgorithmPath = NLEMediaJniJNI.new_NLEAlgorithmPath();
        this.LIZIZ = true;
        this.LIZ = new_NLEAlgorithmPath;
    }
}
