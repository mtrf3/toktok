package com.bytedance.ies.nle.editor_jni;

/* loaded from: classes3.dex */
public final class NLECompileResult {
    public transient long LIZ;
    public transient boolean LIZIZ;

    public final void finalize() {
        synchronized (this) {
            long j = this.LIZ;
            if (j != 0) {
                if (this.LIZIZ) {
                    this.LIZIZ = false;
                    NLEMediaJniJNI.delete_NLECompileResult(j);
                }
                this.LIZ = 0L;
            }
        }
    }

    public NLECompileResult() {
        this(NLEMediaJniJNI.new_NLECompileResult());
    }

    public NLECompileResult(long j) {
        this.LIZIZ = true;
        this.LIZ = j;
    }
}
